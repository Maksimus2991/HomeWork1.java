package com.company.a1_traning;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class Kart {
    public static void main(String[] args) {// при использивании ключей нужно переопределять equels и hashcode
        Map map = new HashMap();
        Map map2 = new Hashtable();
        Map map3 = new LinkedHashMap();// гарантируется порядок
        Map map4 = new TreeMap();// отсортированный список сортировка -  red\black tree
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        System.out.println(map.get("2"));
        Set set =map.entrySet();
            for (Object o : set) {
                System.out.println(o);

        }
    }
}
