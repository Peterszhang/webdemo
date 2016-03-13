<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
 <head>
 <title><s:text name = "registerPage" /></title>
 <script type="text/javascript">
   function requestLocale()
   {

       localeForm.submit();

   }
 
 </script>
 </head>
    <body>
 
  
  
  <s:set name="locale" value="#session['WW_TRANS_I18N_LOCALE']" />

  
        <form name="localeForm" action="<s:url/>" method="post">
  
            <select name="request_locale" onchange="requestLocale()">
                <option value="zh_CN"  >简体中文</option>
                <option value="en_US" <s:if test="#locale.language == 'en'">selected="selected"</s:if>  >美式英语</option>
            </select>
           
        </form>    
        <s:form action = "register" name="form" >
            
                     
            <s:textfield name="username" key = "username"  /> 
            <s:textfield name="password" key = "password" />
            <s:textfield name="age" key = "age" />
            <s:textfield name="birthday" key = "birthday" />
            <s:submit  key="register" />
        </s:form>
    
    </body> 
  </html> 