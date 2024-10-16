package tienda.online;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@XmlRootElement
public class Pedidos {

    protected List<Productos> productos;
    protected Date fechaPedido;

    public Pedidos() {
        super();
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public List<Productos> getProductosList() {
        return productos;
    }

    public void setProductosList(List<Productos> productosList) {
        this.productos = productosList;
    }
}
