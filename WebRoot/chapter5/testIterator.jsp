<%@ page import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String array[] =
	{ "bill", "王明", "赵阳" };
	pageContext.setAttribute("array", array);

	List<String> list = new LinkedList<String>();
	list.add("计算机");
	list.add("英语");
	pageContext.setAttribute("list", list);
	pageContext.setAttribute("iterator", list.iterator());
    
	Vector<String> vector = new Vector<String>();
	vector.addAll(list);
	pageContext.setAttribute("enumeration", vector.elements());

	Map<String, String> map = new HashMap<String, String>();
	map.put("book", "书");
	map.put("apple", "苹果");
	pageContext.setAttribute("keySet", map.keySet());
	pageContext.setAttribute("entrySet", map.entrySet());
%>

对数组进行循环：
<c:forEach var="s" items="${array}"> [${s}] </c:forEach>
<br>对部分数组进行循环：
<c:forEach begin="1" end="2" varStatus="i" var="s" items="${array}">
{array[${i.index}]=${s}}
</c:forEach>
<br>对实现Collection接口的类的对象实例进行循环：
<c:forEach varStatus="i" var="s" items="${list}">
{list[${i.index}]=${s}}
</c:forEach>
<br>对实现Iterator接口的类的对象实例进行循环：
<c:forEach varStatus="i" var="s" items="${iterator}">
{list[${i.index}]=${s}}
</c:forEach>
<br>对实现Enumeration接口的类的对象实例进行循环：
<c:forEach var="s" items="${enumeration}">
[${s}]
</c:forEach>
<br>对key进行循环：
<c:forEach var="s" items="${keySet}">
[${s}]
</c:forEach>
<br>对entry进行循环：
<c:forEach var="entry" items="${entrySet}">
{${entry.key} = ${entry.value}}
</c:forEach>
<br>用forEach对分割字符串（分割符号为逗号)：
<c:forEach var="s" items="a,b,c,d" >
[${s}]
</c:forEach>
<br>使用forEach循环n次
<c:forEach var = "s" begin="2"  end = "8"  varStatus = "i" step = "2">
[${i.count}](${s})
</c:forEach>
<br>使用forTokens分割字符串：
<c:forTokens var = "s"  items="a&b&c*d"  delims="&*" >
[${s}]
</c:forTokens>
