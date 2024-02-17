import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try{
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            File file = new File("resources/enunciado1.xml");
            Document document = documentBuilder.parse(file);
            Element elementoRaiz = (Element) document.getElementsByTagName("noticia").item(0);
            System.out.println("Noticia");

            Element elementoTitulo = (Element) elementoRaiz.getElementsByTagName("titulo").item(0);
            System.out.println("Titulo" + elementoTitulo.getTextContent());

            Element elementoCategoria = (Element) elementoRaiz.getElementsByTagName("categoria").item(0);
            System.out.println("Categoria" + elementoCategoria.getTextContent());

            Element elementoDescripcion = (Element) elementoRaiz.getElementsByTagName("descripcion").item(0);
            System.out.println("Descripcion" + elementoDescripcion.getTextContent());

            Element elementoAutor = (Element) elementoRaiz.getElementsByTagName("autor").item(0);
            System.out.println("Autor" + elementoAutor.getTextContent());

            String Twitter = elementoAutor.getAttribute("twitter");
            String email = elementoAutor.getAttribute("email");
            System.out.println("Autor: "+ elementoAutor.getTextContent() + "Twitter: " + Twitter + "|" + "Email: " + email );


        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}