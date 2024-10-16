package tienda.online;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Productos {

    protected String nombreProducto;
    protected int precioProducto;
    protected List<String> categoriaProducto;

    public Productos() {
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public List<String> getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(List<String> categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }
}
