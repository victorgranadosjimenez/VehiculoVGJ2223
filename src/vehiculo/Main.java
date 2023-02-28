
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        operativaVehiculosGranadosJimenezVictor2223(50);
    }

    public static void operativaVehiculosGranadosJimenezVictor2223(int cantidad) {
        VehiculoGranadosJimenezVictor2223 miVehiculoGranadosJimenezVictor2223;
        int stockActual;
        
        miVehiculoGranadosJimenezVictor2223 = new VehiculoGranadosJimenezVictor2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoGranadosJimenezVictor2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoGranadosJimenezVictor2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoGranadosJimenezVictor2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
