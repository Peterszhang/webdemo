<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import ="java.util.*" %>
  <html>
 <head>
 <title>Java支持的语言和国家</title>
 </head>
    <body>
    <% 
        Locale[] locales = Locale.getAvailableLocales();
        
        
        for(Locale locale: locales)
        {
            String displayLanguage = locale.getDisplayLanguage();
            String language = locale.getLanguage();
            String displayCountry = locale.getDisplayCountry();
            String country = locale.getCountry();
            out.println(displayLanguage + "=" + language + "&nbsp;&nbsp;");
            out.println(displayCountry + "=" + country + "<br/>");
          
        }
     
     %>       
    </body>
  </html> 