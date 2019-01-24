package controller;

import javax.xml.parsers.*;
import org.w3c.dom.Document;

/**
 *
 * @author Lonely
 */
public class Document_DOM {

    public static Document getDocumentNew() {
        Document d = null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            d = db.newDocument();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return d;
    }
}