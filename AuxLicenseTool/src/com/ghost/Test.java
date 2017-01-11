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

        // 获取根元素
        Element root = document.getRootElement();
        System.out.println("Root: " + root.getName());

        // 获取所有子元素
        List<Element> childList = root.elements();
        System.out.println("total child count: " + childList.size());

        // 获取特定名称的子元素
        List<Element> childList2 = root.elements();
        System.out.println("hello child: " + childList2.size());
/*
        // 获取名字为指定名称的第一个子元素
        Element firstWorldElement = (Element) childList2.get(0).elements("settings");
        // 输出其属性
        System.out.println("first World Attr: "
                + firstWorldElement);
*/
        System.out.println("迭代输出-----------------------");
        // 迭代输出
        for (Iterator iter = root.elementIterator(); iter.hasNext();)
        {
            Element e = (Element) iter.next();
            System.out.println(e.attributeValue("id"));

        }
/*
        System.out.println("用DOMReader-----------------------");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        // 注意要用完整类名
        org.w3c.dom.Document document2 = db.parse(new File("students.xml "));

        DOMReader domReader = new DOMReader();

        // 将JAXP的Document转换为dom4j的Document
        Document document3 = domReader.read(document2);

        Element rootElement = document3.getRootElement();

        System.out.println("Root: " + rootElement.getName());
        */

    }

	
}
