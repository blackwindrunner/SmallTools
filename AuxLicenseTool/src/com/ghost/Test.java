package com.ghost;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.SAXException;

public class Test {

	/**
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws DocumentException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, DocumentException, SAXException, IOException {
		// TODO Auto-generated method stub
		SAXReader saxReader = new SAXReader();

        //Document document = saxReader.read(new File("D:\\workspace\\developerworkspace\\8204\\InternetBankTestWeb\\src\\definitions\\btt.xml"));
		Document document = saxReader.read(new File(System.getProperty("user.dir")+"/btt.xml"));

        // ��ȡ��Ԫ��
        Element root = document.getRootElement();
        System.out.println("Root: " + root.getName());

        // ��ȡ������Ԫ��
        List<Element> childList = root.elements();
        System.out.println("total child count: " + childList.size());

        // ��ȡ�ض����Ƶ���Ԫ��
        List<Element> childList2 = root.elements();
        System.out.println("hello child: " + childList2.size());
/*
        // ��ȡ����Ϊָ�����Ƶĵ�һ����Ԫ��
        Element firstWorldElement = (Element) childList2.get(0).elements("settings");
        // ���������
        System.out.println("first World Attr: "
                + firstWorldElement);
*/
        System.out.println("�������-----------------------");
        // �������
        for (Iterator iter = root.elementIterator(); iter.hasNext();)
        {
            Element e = (Element) iter.next();
            System.out.println(e.attributeValue("id"));

        }
/*
        System.out.println("��DOMReader-----------------------");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        // ע��Ҫ����������
        org.w3c.dom.Document document2 = db.parse(new File("students.xml "));

        DOMReader domReader = new DOMReader();

        // ��JAXP��Documentת��Ϊdom4j��Document
        Document document3 = domReader.read(document2);

        Element rootElement = document3.getRootElement();

        System.out.println("Root: " + rootElement.getName());
        */

    }

	
}
