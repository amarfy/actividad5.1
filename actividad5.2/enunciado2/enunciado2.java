package enunciado2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
    public class enunciado2 {
        public static void main(String[] args) {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            try{
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                File file = new File("C:\\Users\\acer\\actividad5.1\\actividad5.2\\resources\\enunciado3_actividad_5_2.xml");
                Document document = documentBuilder.parse(file);

                Element elementoRaiz = (Element) document.getElementsByTagName("Usuarios").item(0);
                System.out.println("Usuarios");

                NodeList nodos = elementoRaiz.getElementsByTagName("Usuario");

                for(int  i= 0; i < nodos.getLength(); i++){
                    Element elementoUsuario = (Element) ((Element) nodos.item(i)).getElementsByTagName("Usuario").item(0);
                    System.out.println("Usuario: " + elementoUsuario.getTextContent());
                    System.out.println();
                }

            }catch( Exception exception){
                System.out.println(exception.getMessage());
            }

        }


    }



