package act08SergioMoraisRodriguez;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class ej1 {
    public static void main(String[] args) {


        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            LibroHandler handler = new LibroHandler();
            saxParser.parse(new File("C:\\Users\\sergio\\IdeaProjects\\acesodatos1\\src\\act07SergioMoraisRodriguez\\libreria.xml"), handler);


        } catch (ParserConfigurationException e) {
            System.out.println("niggaoneniggatwoniggathreeniggafour");
        } catch (SAXException e) {
            System.out.println("aaay");
        } catch (IOException e) {
            System.out.println("aaaaaaaaay");
        }
    }
}
