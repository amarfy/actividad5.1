import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class enunciado2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try{
            System.out.println("Nombre del autor: ");
            String nombreAutor = sc.nextLine();

            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            File file = new File("resources/enunciado1.xml");
            Document document = documentBuilder.parse(file);

            Element elementoRaiz = (Element) document.getElementsByTagName("noticia").item(0);
            Element elementoAutor = (Element) elementoRaiz.getElementsByTagName("autor").item(0);
            String autorname = elementoAutor.getAttribute("nombre");

            if (nombreAutor.equalsIgnoreCase(nombreAutor)){
                System.out.println("el nombre del autor: " + nombreAutor + "= es nombre del autor");
            }else {
                System.out.println("el nombre del autor: " + nombreAutor + " no es el nombre del autor ");
            }

        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }

    }

}
