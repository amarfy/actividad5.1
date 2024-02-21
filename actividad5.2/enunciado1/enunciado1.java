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
            File file = new File("C:\\Users\\acer\\actividad5.1\\actividad5.2\\resources\\enunciado1_actividad_5_2.xml");
            Document document = documentBuilder.parse(file);

            Element elementoRaiz = (Element) document.getElementsByTagName("biblioteca").item(0);
            System.out.println("Biblioteca");

            NodeList nodos = elementoRaiz.getElementsByTagName("libro");

            for(int  i= 0; i < nodos.getLength(); i++){
                Element elementoTitulo = (Element) ((Element) nodos.item(i)).getElementsByTagName("titulo").item(0);
                System.out.println("Titulo: " + elementoTitulo.getTextContent());
                System.out.println();
            }
            for(int  i= 0; i < nodos.getLength(); i++){
                Element elementoAutor = (Element) ((Element) nodos.item(i)).getElementsByTagName("autor").item(0);
                System.out.println("Autor: " + elementoAutor.getTextContent());
                System.out.println();
            }
            for(int  i= 0; i < nodos.getLength(); i++){
                Element elementoGenero = (Element) ((Element) nodos.item(i)).getElementsByTagName("genero").item(0);
                System.out.println("Genero: " + elementoGenero.getTextContent());
                System.out.println();
            }
            for(int  i= 0; i < nodos.getLength(); i++){
                Element elementoAnio = (Element) ((Element) nodos.item(i)).getElementsByTagName("anio").item(0);
                System.out.println("AÑO: " + elementoAnio.getTextContent());
                System.out.println();
            }

        }catch( Exception exception){
            System.out.println(exception.getMessage());
        }

    }


}
