
package act08SergioMoraisRodriguez;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class LibroHandler extends DefaultHandler {

    private String elementoActual = "";
    private StringBuilder textoLibros = new StringBuilder();

    @Override
    public void startDocument() {
        System.out.println("Inicio del documento");
    }

    @Override
    public void endDocument() {
        System.out.println("Fin del documento");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {

        elementoActual = qName;

        if (qName.equalsIgnoreCase("libro")) {
            System.out.println("Libro: " + attributes.getValue("codigo"));
        }

        textoLibros.setLength(0);
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        textoLibros.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) {

        String texto = textoLibros.toString().trim();

        if (qName.equalsIgnoreCase("titulo")) {
            System.out.println("\t-Titulo: " + texto);
        } else if (qName.equalsIgnoreCase("autor")) {
            System.out.println("\t-Autor: " + texto);
        } else if (qName.equalsIgnoreCase("precio")) {
            System.out.println("\t-Precio: " + texto + " €");
        } else if (qName.equalsIgnoreCase("cantidad")) {
            System.out.println("\t-Cantidad: " + texto);
        }

        elementoActual = "";
    }
}
