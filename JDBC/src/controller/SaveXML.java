package controller;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 *
 * @author Lonely
 */
public class SaveXML {

    public static void saveXMLContent(org.w3c.dom.Document d, String path_to_file) throws TransformerException {
        try {
            TransformerFactory tff = TransformerFactory.newInstance();
            Transformer tf = tff.newTransformer();
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(d);
            StreamResult rs = new StreamResult(path_to_file);
            tf.transform(source, rs);
        } catch (TransformerConfigurationException ex) {
            System.out.println(ex.getMessage());
        }
    }
}