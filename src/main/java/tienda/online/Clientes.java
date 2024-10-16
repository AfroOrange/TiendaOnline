package tienda.online;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Clientes {

    protected String nombre;
    protected String direccion;
    protected List<Pedidos> pedidos;

    // No-argument constructor (required by JAXB)
    public Clientes() {
        this.pedidos = new ArrayList<>();  // Initialize the list to avoid NullPointerException
    }

    // Constructor with arguments
    public Clientes(String nombre, String direccion, List<Pedidos> pedidos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pedidos = pedidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
}