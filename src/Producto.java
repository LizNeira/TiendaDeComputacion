public class Producto {
    private int cantidadStock;
    private String descripcion;
    private double precioUnitario;

    public Producto() {

    }

    /**
     * 
     * @param cantidad
     * @param descripcion
     * @param precioUnitario
     */
    public Producto(int cantidad, String descripcion, double precioUnitario) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidad = cantidad;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public Producto getComponentesYperifericos(String descripcion, int cantidadStock, double precioUnitario) {
        
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        try 
        {
             p = factoria.crearProductos(descripcion, cantidadStock, precioUnitario);
        } catch (ReflectiveOperationException e) 
        {
            // TODO Auto-generated catch block
            EntradaYSalida.mostrarMensaje("No se pudo crear el producto");
            e.printStackTrace();
        }

        return p;
    }



    
}