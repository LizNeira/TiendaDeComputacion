
public class Duenio 
{
    private Tienda tienda = null;    
     
    public Duenio()
    {
           
    }
    /**
     * Metodo que se encarga de las diferentes opciones que tiene
     * el dueño
     */
    public void menuPrincipal()
    {
        tienda = new Tienda();
        char opcion;
       do
       { 
        EntradaYSalida.mostrarMensaje("----Bienvevidos----\n");
        EntradaYSalida.mostrarMensaje("[1] Dar de alta producto\n");
        EntradaYSalida.mostrarMensaje("[2] Mostrar Stock de productos\n");
        EntradaYSalida.mostrarMensaje("[3] Salir\n");
        EntradaYSalida.mostrarMensaje("Digite una opcion: ");
        
        opcion = EntradaYSalida.leerOpcion().charAt(0);
        
        } while (opcion < '1' || opcion > '3');
        
       switch (opcion)
       {
          case '1':
    	        menuAltaProductos();
           break;
          case '2':
                 tienda.mostrarStock();
           break;
       
          case '3':
           EntradaYSalida.mostrarMensaje("salir");
           break;
        }

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
        String descripcion = "";
        int cantidadStock = 0;
        double precioUnitario = 0.0;

      do
      {
        EntradaYSalida.mostrarMensaje("\n----Productos----\n");
        EntradaYSalida.mostrarMensaje("Productos a ingresar\n");
        EntradaYSalida.mostrarMensaje("Teclado, mouse\n");
        EntradaYSalida.mostrarMensaje("Salir:    \n");

        EntradaYSalida.mostrarMensaje("Ingresar nombre del producto\n");
        descripcion = EntradaYSalida.leerNombreProducto();
        EntradaYSalida.mostrarMensaje("Ingresar cantidad:  \n");
        cantidadStock = Integer.parseInt(EntradaYSalida.leerCantidadStock());
        EntradaYSalida.mostrarMensaje("Ingresar precio unitario: \n");
        precioUnitario = Double.parseDouble(EntradaYSalida.leerPrecioDelProducto());

        tienda.setProducto(descripcion, cantidadStock, precioUnitario);
        
        EntradaYSalida.mostrarMensaje("\nDesea continuar[s/n]?: ");
        opcion = EntradaYSalida.leerOpcion().charAt(0);

        } while('s' == opcion  || 'S' == opcion);  
        
    }

   
    
      
    
    
    
}