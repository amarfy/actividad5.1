package enunciado1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class enunciado1 {
    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            File file = new File("resources/enunciado1_actividad_5_2.xml");
            Document document = documentBuilder.parse(file);

            Element elementoRaiz = (Element) document.getElementsByTagName("biblioteca").item(0);
            System.out.println("Biblioteca");

            NodeList nodos = elementoRaiz.getElementsByTagName("libro");

            for(int  i= 0; i < nodos.getLength(); i++){
                Element elementoTitulo = (Element) ((Element) nodos.item(i)).getElementsByTagName("titulo").item(0);
                System.out.println("Titulo: " + elementoTitulo.getTextContent());
                System.out.println();
            }

            //ahora lo quye hya arriba se repite





        }catch( Exception exception){
            System.out.println(exception.getMessage());
        }

    }


}
