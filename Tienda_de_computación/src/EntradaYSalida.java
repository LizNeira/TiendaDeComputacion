import java.util.Scanner;

public class EntradaYSalida 
{
   private Scanner entrada = null; 

   public EntradaYSalida()
   {
       entrada = new Scanner(System.in);
   }

   /**
    * Muestra un mensaje por consola.
    * @param s is a String type
    */
   public void mostrarMensaje(String s)
   {
       System.out.print(s);
   }

   /**
    * Lee el  nombre del producto que ingresa
    * el usuario por teclado.
    * @return: String
    */
   public String leerNombreProducto()
   {
       return entrada.nextLine();
   }

   /**
    * Lee la cantidad de stock del producto que ingresa
    * el usuario por teclado.
    * @return int
    */
   public String leerCantidadStock()
   {
       return entrada.next();
   }
   

   public String leerPrecioDelProducto()
   {
     return entrada.next();
   }

   /**
    * Lee la opcion elegida por el usuario
    * del teclado devolviendo solo la primera
    * posicisión de la cadena.
    * @return char
    */
   public String leerOpcion()
   {
       return entrada.next();
   }

   public String obtenerEntrada()
   {
       return entrada.nextLine();
   }

}