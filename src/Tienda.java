import java.util.ArrayList;

public class Tienda 
{
  private Producto producto = new Producto();
  private ArrayList<Producto> listaProductos;


    
    public void setProducto(String descripcion, int cantidadStock, double precioUnitario)
    {   
       listaProductos.add(producto.getComponentesYperifericos(descripcion, cantidadStock, precioUnitario));   
    }
    
    
    public void mostrarStock() {

        String listadoProductos = "";

        for (int x = 0; x < listaProductos.size(); x++) {

            listadoProductos += " stock: "+listaProductos.get(x).getCantidadStock()+listaProductos.get(x).getDescripcion() 
          + listaProductos.get(x).getPrecioUnitario()+ "\n";
        }

        EntradaYSalida.mostrarMensaje(listadoProductos);
    }

    
}