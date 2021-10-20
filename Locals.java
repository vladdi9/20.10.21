package org.itstep;

import java.util.Locale;
import java.util.Map;
import java.util.Properties;

public class Locals {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale.getLanguage()+" "+locale.getCountry());  //Языковые настройки windows
        System.out.println(locale.getDisplayLanguage()); //Язык по умолчанию windows
        System.out.println(locale.getDisplayCountry());  //Страна по умолчанию windows
        double d=5.5;
        String s=String.format("%5.5f",d);
        System.out.println(s);

        Locale locale2 = new Locale("us", "US");   //Указываем языковые настройки любой страны
        s = String.format(locale2,"%5.5f",d);
        System.out.println(s);

        Properties properties = System.getProperties();
        for (Object key:properties.keySet()) {
            //System.out.println(key+" "+properties.getProperty((String)key));
            if (key.equals("user.country"))
                System.out.println(key+": "+properties.getProperty((String) key));
        }
        Map<String, String> map = System.getenv();
        for (String key:map.keySet())
            if (key.equals("JAVA_HOME"))
            System.out.println(key+" "+map.get(key));
    }
}
