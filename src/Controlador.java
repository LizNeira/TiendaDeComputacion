public class Controlador 
{
    private Duenio duenio = null;

    /**
     * Metodo que es el corazón del programa
     */
    public void ejecutar()
    {
        duenio = new Duenio();
        duenio.menuPrincipal();
       
    }
}