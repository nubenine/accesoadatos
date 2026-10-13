package act07SergioMoraisRodriguez;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ej2 {

    public static void main(String[] args) throws Exception {

        File archivo = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\act07SergioMoraisRodriguez\\libreria.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document documento = builder.parse(archivo);
        documento.getDocumentElement().normalize();

        NodeList libros = documento.getElementsByTagName("libro");

        System.out.println("Lista de libros:");

        for (int i = 0; i < libros.getLength(); i++) {

            Element libro = (Element) libros.item(i);

            String codigo = libro.getAttribute("codigo");

            String titulo = libro.getElementsByTagName("titulo").item(0).getTextContent();

            String autor = libro.getElementsByTagName("autor").item(0).getTextContent();

            String precio = libro.getElementsByTagName("precio").item(0).getTextContent();

            String cantidad = libro.getElementsByTagName("cantidad").item(0).getTextContent();

            System.out.println("\n\tLibro:");
            System.out.println("\t\tCodigo: " + codigo);
            System.out.println("\t\tTitulo: " + titulo);
            System.out.println("\t\tAutor: " + autor);
            System.out.println("\t\tPrecio: " + precio + " €");
            System.out.println("\t\tCantidad: " + cantidad);
        }
    }
}