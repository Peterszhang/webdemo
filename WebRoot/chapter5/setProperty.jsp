<%@ page pageEncoding = "UTF-8" %>

<%-- 创建MyClass类的对象实例 --%>

<jsp:useBean id="myClass" class = "chapter5.MyClass"/>
<%-- 
也可以这样创建MyClass类的对象实例
<jsp:useBean id="myClass" beanName = "chapter4.MyClass" type = "chapter4.MyClass"/>
--%>

<%-- 直接设置属性值 --%>
<jsp:setProperty property="name" name="myClass" value = "bill"/>
<jsp:setProperty property="age" name="myClass" value = "32"/>

<%-- 使用同名的URL参数设置属性值，也就是说，URL的参数中必须有name和age --%>
<jsp:setProperty property="name" name="myClass" />
<jsp:setProperty property="age" name="myClass" />

<%-- 使用不同名的URL参数设置属性值 --%>
<jsp:setProperty property="name" name="myClass" param = "newName"/>
<jsp:setProperty property="age" name="myClass" param = "newParam"/>

<%-- 使用URL参数自动设置所有的属性 --%>
<jsp:setProperty property="*" name="myClass" />
<%
    String name = ((chapter5.MyClass) pageContext.getAttribute("myClass")).getName();
    int age = ((chapter5.MyClass) pageContext.getAttribute("myClass")).getAge();    
    out.println("name:" + name);
    out.println("<br>age:");
    out.println(age);
%>

