
public class Duenio 
{
     EntradaYSalida tecladoYconsola = null;
     
    public Duenio()
    {
        tecladoYconsola = new EntradaYSalida();   
    }
    /**
     * Metodo que se encarga de las diferentes opciones que tiene
     * el dueño
     */
    public void menuPrincipal()
    {
        char opcion;
        //String limpiezaBuffer = "";
        tecladoYconsola.mostrarMensaje("----Bienvevidos----\n");
        tecladoYconsola.mostrarMensaje("[1] Stock\n");
        tecladoYconsola.mostrarMensaje("[2] Vender\n");
        tecladoYconsola.mostrarMensaje("[3] Salir\n");
        tecladoYconsola.mostrarMensaje("Digite una opcion: ");
        //int opcion = Character.getNumericValue(tecladoYconsola.leerOpcion());
        opcion = tecladoYconsola.leerOpcion().charAt(0);
        //String limpiezaBuffer = tecladoYconsola.obtenerEntrada();

        if('1' == opcion)
            menuStock();
                
        else
         tecladoYconsola.mostrarMensaje("Sistema Cerrado");

    }

    private void menuStock()
    {
        char opcion;

      do
      {
        tecladoYconsola.mostrarMensaje("\n----Stock----\n");
        tecladoYconsola.mostrarMensaje("[1] Laptop\n");
        tecladoYconsola.mostrarMensaje("[2] Desktop\n");
        tecladoYconsola.mostrarMensaje("[3] Teclado\n");
        tecladoYconsola.mostrarMensaje("[4] Mouse\n");
        //tecladoYconsola.mostrarMensaje("[3] Webcam");
        //tecladoYconsola.mostrarMensaje("[4] Monitor");
        //tecladoYconsola.mostrarMensaje("[5] Procesador");
        //tecladoYconsola.mostrarMensaje("[6] Disco");
        //tecladoYconsola.mostrarMensaje("[7] RAM");
        //tecladoYconsola.mostrarMensaje("[8] Placa de video");
        //tecladoYconsola.mostrarMensaje("[9] Salir");
        tecladoYconsola.mostrarMensaje("Digite una opcion: ");
        opcion = tecladoYconsola.leerOpcion().charAt(0);
        //String limpiezaBuffer = tecladoYconsola.obtenerEntrada();

        if('1' == opcion)
            ingresarDatosLaptop();

        else
          ingresarDatosDeOtrosEquipos();

        tecladoYconsola.mostrarMensaje("\nDesea continuar[s/n]?: ");
        opcion = tecladoYconsola.leerOpcion().charAt(0);

        } while('s' == opcion  || 'S' == opcion);  
        
    }

    /*
    public void menuVender()
    {
        tecladoYconsola.mostrarMensaje("----Vender----");
        tecladoYconsola.mostrarMensaje("[1] Listar productos");
        tecladoYconsola.mostrarMensaje("[2] Salir");
        tecladoYconsola.mostrarMensaje("Digite opción:");

    }
    */
      
    private void ingresarDatosLaptop()
    {
        tecladoYconsola.mostrarMensaje("\nIngresar cantidad: ");
        tecladoYconsola.mostrarMensaje("\nIngresar precio:");
        tecladoYconsola.mostrarMensaje("\nIngresar fecha:");
        tecladoYconsola.mostrarMensaje("\nIngresar marca:");
        tecladoYconsola.mostrarMensaje("\nIngresar modelo:");
        tecladoYconsola.mostrarMensaje("\nIngreso correcto");

    }
    
    private void ingresarDatosDeOtrosEquipos()
    {
        tecladoYconsola.obtenerEntrada();
        tecladoYconsola.mostrarMensaje("\nIngresar cantidad: ");
        int cantidad =  Integer.parseInt(tecladoYconsola.leerCantidadStock());
        //String cantidad =  tecladoYconsola.leerCantidadStock();
        tecladoYconsola.mostrarMensaje("Ingresar precio:");
        double precio = Double.parseDouble(tecladoYconsola.leerPrecioDelProducto());
        //String precio = tecladoYconsola.leerPrecioDelProducto();
        //tecladoYconsola.mostrarMensaje("Ingresar fecha:");
        tecladoYconsola.mostrarMensaje("Ingreso correcto");

    }
    
    
}