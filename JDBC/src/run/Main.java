package run;

import Import2Xml.CreateXML;

public class Main {

    public static void main(String[] args) {
        //1 Tạo file XML dùng DOM 
        CreateXML c = new CreateXML();
        c.create();
    }
}