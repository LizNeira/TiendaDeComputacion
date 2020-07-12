import java.util.ArrayList;

public class Tienda 
{
  private Producto producto = new Producto();
  private ArrayList<Producto> listaProductos;


    
    public void setProducto(String descripcion, int cantidadStock, double precioUnitario)
    {   
       listaProductos.add(producto.getComponentesYperifericos(descripcion, cantidadStock, precioUnitario));   
    }
    
}