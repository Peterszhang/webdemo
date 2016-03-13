<jsp:useBean id="myClass" beanName = "chapter5.MyClass" type = "chapter5.MyClass"/>
<jsp:setProperty property="name" name="myClass" value = "bill"/>
<jsp:setProperty property="age" name="myClass" value = "32"/>
name: <jsp:getProperty property="name" name = "myClass" />
<br>
age: <jsp:getProperty property="age" name = "myClass" />