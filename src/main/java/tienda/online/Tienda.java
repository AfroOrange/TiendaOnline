package tienda.online;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.util.List;

@XmlRootElement
public class Tienda {

    private List<Clientes> clientesList;
    private List<Productos> productosList;
    private List<Pedidos> pedidosList;

    public void cargarXML(String filePath) throws JAXBException {
        File xmlFile = new File(filePath);

        if (!xmlFile.exists() || xmlFile.length() == 0) {
            System.out.println("Error: The XML file is missing or empty: " + xmlFile.getAbsolutePath());
            return;
        }

        JAXBContext jc = JAXBContext.newInstance(Tienda.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();

        Tienda tiendaFromXML = (Tienda) unmarshaller.unmarshal(xmlFile);

        this.clientesList = tiendaFromXML.getClientesList();
        this.productosList = tiendaFromXML.getProductosList();
        this.pedidosList = tiendaFromXML.getPedidosList();

        System.out.println("Tienda cargada desde XML: " + filePath);
        System.out.println("Número de Clientes: " + this.clientesList.size());
    }

    public void guardarXML(Tienda tienda, String filePath) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Tienda.class);
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(tienda, new File(filePath));
    }

    public List<Pedidos> getPedidosList() {
        return pedidosList;
    }

    public void setPedidosList(List<Pedidos> pedidosList) {
        this.pedidosList = pedidosList;
    }

    public List<Productos> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<Productos> productosList) {
        this.productosList = productosList;
    }

    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }
}