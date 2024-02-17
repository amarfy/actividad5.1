import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class enunciado3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try{
            System.out.println("Email del autor: ");
            String autoremail = sc.nextLine();

            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            File file = new File("resources/enunciado1.xml");
            Document document = documentBuilder.parse(file);

            Element elementoRaiz = (Element) document.getElementsByTagName("noticia").item(0);
            Element elementoAutor = (Element) elementoRaiz.getElementsByTagName("autor").item(0);
            String emailAutor = elementoAutor.getAttribute("email");

            if (emailAutor.equalsIgnoreCase(emailAutor)){
                System.out.println("el nombre del autor: " + emailAutor + "= es el email del autor");
            }else {
                System.out.println("el nombre del autor: " + emailAutor + " no es el email del autor ");
            }

        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }

    }

}