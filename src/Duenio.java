
public class Duenio 
{
    
     
    public Duenio()
    {
           
    }
    /**
     * Metodo que se encarga de las diferentes opciones que tiene
     * el dueño
     */
    public void menuPrincipal()
    {
        char opcion;
        
        EntradaYSalida.mostrarMensaje("----Bienvevidos----\n");
        EntradaYSalida.mostrarMensaje("[1] Dar de alta producto\n");
        EntradaYSalida.mostrarMensaje("[2] Salir\n");
        EntradaYSalida.mostrarMensaje("Digite una opcion: ");
        
        opcion = EntradaYSalida.leerOpcion().charAt(0);
        

        if('1' == opcion)
            menuAltaProductos();
                
        else
         EntradaYSalida.mostrarMensaje("Sistema Cerrado");

    }

    private void menuAltaProductos()
    {
        char opcion;

      do
      {
        EntradaYSalida.mostrarMensaje("\n----Menu de productos----\n");
        EntradaYSalida.mostrarMensaje("[1] Componentes y perifericos\n");
        EntradaYSalida.mostrarMensaje("[2] Salir\n");

        
        EntradaYSalida.mostrarMensaje("\nDigite una opcion: ");
        opcion = EntradaYSalida.leerOpcion().charAt(0);
        

        if('1' == opcion)
            darDeALtaComponentesPerifericos();

        EntradaYSalida.mostrarMensaje("\nDesea continuar[s/n]?: ");
        opcion = EntradaYSalida.leerOpcion().charAt(0);

        } while('s' == opcion  || 'S' == opcion);  
        
    }

    

    private void darDeALtaComponentesPerifericos()
    {
        char opcion;

      do
      {
        EntradaYSalida.mostrarMensaje("\n----Productos----\n");
        EntradaYSalida.mostrarMensaje("Productos a ingresar\n");
        EntradaYSalida.mostrarMensaje("Teclado, mouse\n");
        EntradaYSalida.mostrarMensaje("Salir:    \n");



        EntradaYSalida.mostrarMensaje("\nDesea continuar[s/n]?: ");
        opcion = EntradaYSalida.leerOpcion().charAt(0);

        } while('s' == opcion  || 'S' == opcion);  
        
    }



    
      
    
    
    
}