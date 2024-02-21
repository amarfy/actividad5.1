package enunciado3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class enunciado3 {
        public static void main(String[] args) {

            String archivoXML = "C:\\Users\\acer\\actividad5.1\\actividad5.2\\resources\\enunciado3_actividad_5_2.xml";


            Map<String, String> telefonosUsuarios = new HashMap<>();

            try {

                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(new File(archivoXML));
                NodeList nodeList = doc.getElementsByTagName("usuario");

                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node node = nodeList.item(i);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element elemento = (Element) node;
                        String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                        String telefono = elemento.getElementsByTagName("telefono").item(0).getTextContent();
                        telefonosUsuarios.put(telefono, nombre);
                    }
                }
                Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce un número de teléfono:");
                String numeroTelefono = scanner.nextLine();

                if (telefonosUsuarios.containsKey(numeroTelefono)) {
                    System.out.println("El número de teléfono corresponde al usuario: " + telefonosUsuarios.get(numeroTelefono));
                } else {
                    System.out.println("No se encontró ningún usuario con ese número de teléfono.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

