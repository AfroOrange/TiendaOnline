package tienda.online;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Tienda tienda = new Tienda();
        tienda.cargarXML("tienda.xml");
    }
}
