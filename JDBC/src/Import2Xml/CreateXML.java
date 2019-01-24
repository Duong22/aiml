package Import2Xml;

import controller.SaveXML;
import java.util.List;
import org.w3c.dom.*;

/**
 *
 * @author Lonely
 */
public class CreateXML {

    List<aiml> list = new GetAimlData().getList();

    public void create() {
        try {
            Document doc = controller.Document_DOM.getDocumentNew();
            // root element
            Element rootElement = doc.createElement("aiml");
            doc.appendChild(rootElement);

            for (int i = 0; i < list.size(); i++) {
                //  product element
                Element category = doc.createElement("category");
                rootElement.appendChild(category);

                // setting attribute to element
                Attr attr = doc.createAttribute("id");
                attr.setValue(Integer.toString(list.get(i).getId()));
                category.setAttributeNode(attr);

                // product element
                Element pattern = doc.createElement("pattern");
                pattern.appendChild(doc.createTextNode(list.get(i).getPattern()));
                category.appendChild(pattern);

                // product element
                Element template = doc.createElement("template");
                template.appendChild(doc.createTextNode(list.get(i).getTemplate()));
                category.appendChild(template);

                // write the content into xml file
                SaveXML.saveXMLContent(doc, "src\\Data\\aiml.xml");
            }
            System.out.println("===QUESTION [1] Create aiml thanh cong!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}