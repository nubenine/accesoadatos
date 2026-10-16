package act07SergioMoraisRodriguez;

import java.io.File;
import java.io.RandomAccessFile;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ej1 {

    private static final int TITULO_LONG = 30;
    private static final int AUTOR_LONG = 50;
    private static final int REGISTRO_SIZE = 176;

    public static void main(String[] args) throws Exception {

        File archivoDat = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\Actividad05SergioMorais\\libros.dat");

        File archivoXml = new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\act07SergioMoraisRodriguez\\libreria.xml");

        RandomAccessFile raf = new RandomAccessFile(archivoDat, "r");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document documento = builder.newDocument();

        Element libreria = documento.createElement("libreria");
        documento.appendChild(libreria);

        while (raf.getFilePointer() < raf.length()) {

            int codigo = raf.readInt();

            char[] tituloChars = new char[TITULO_LONG];
            for (int i = 0; i < TITULO_LONG; i++) {
                tituloChars[i] = raf.readChar();
            }
            String titulo = new String(tituloChars).replace("\u0000", "");

            char[] autorChars = new char[AUTOR_LONG];
            for (int i = 0; i < AUTOR_LONG; i++) {
                autorChars[i] = raf.readChar();
            }
            String autor = new String(autorChars).replace("\u0000", "");

            double precio = raf.readDouble();
            int cantidad = raf.readInt();

            Element libro = documento.createElement("libro");
            libro.setAttribute("codigo", String.valueOf(codigo));

            Element elementoTitulo = documento.createElement("titulo");
            elementoTitulo.setTextContent(titulo);
            libro.appendChild(elementoTitulo);

            Element elementoAutor = documento.createElement("autor");
            elementoAutor.setTextContent(autor);
            libro.appendChild(elementoAutor);

            Element elementoPrecio = documento.createElement("precio");
            elementoPrecio.setTextContent(String.valueOf(precio));
            libro.appendChild(elementoPrecio);

            Element elementoCantidad = documento.createElement("cantidad");
            elementoCantidad.setTextContent(String.valueOf(cantidad));
            libro.appendChild(elementoCantidad);

            libreria.appendChild(libro);
        }

        raf.close();

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

        DOMSource source = new DOMSource(documento);
        StreamResult result = new StreamResult(archivoXml);

        transformer.transform(source, result);

        System.out.println("Fichero libreria.xml creado con exito.");
    }
}
