package com.interview.example.util;

import com.interview.example.model.ComapnyInfo;
import org.w3c.dom.NodeList;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelperUtil {

    public static String getEnvelope(String response) {
        Pattern pattern = Pattern.compile("(?six)<s:Envelope.*</s:Envelope>");
        Matcher matcher = pattern.matcher(response);
        if (matcher.find()) {
            return matcher.group();
        }
        return "";
    }

    public static SOAPMessage parseToSOAPMessage(String envelope) throws SOAPException, IOException {
        InputStream is = new ByteArrayInputStream(envelope.getBytes());
        return MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL).createMessage(null, is);
    }

    public static ComapnyInfo parseSOAPMessageToCompanyInfoObject(SOAPMessage soapMessage) throws SOAPException, IllegalAccessException {

        ComapnyInfo newComapnyInfo = new ComapnyInfo();

        Class<?> clazz = newComapnyInfo.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            NodeList nodeList = soapMessage.getSOAPBody().getElementsByTagName(field.getName());
            if (nodeList.getLength() > 0) {
                String value = nodeList.item(0).getTextContent();
                if (value.isEmpty()) {
                    field.set(newComapnyInfo, "");
                } else {
                    field.set(newComapnyInfo, value);
                }
            } else {
                field.set(newComapnyInfo, "");
            }
        }

        return newComapnyInfo;
    }

    public static String clearSOAPResponse(String response) {
        String raportEnvelope = response
                .replaceAll("&lt;", "<")
                .replaceAll("&gt;", ">")
                .replaceAll("&#xD;", "");

        return getEnvelope(raportEnvelope);
    }

}
