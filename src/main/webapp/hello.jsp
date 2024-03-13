<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title><s:text name="hello.message"/></title>
</head>

<body>
<h2><s:property value="message"/></h2>
<h2>Opciones</h2>
<s:a action="registerAction" >Registrarse</s:a><br/>
<s:a action="list" >Lista alumnos</s:a>


<h3>Languages</h3>
<ul>
    <li>
        <s:url var="url" action="hello">
            <s:param name="request_locale">en</s:param>
        </s:url>
        <s:a href="%{url}">English</s:a>
    </li>
    <li>
        <s:url var="url" action="hello">
            <s:param name="request_locale">es</s:param>
        </s:url>
        <s:a href="%{url}">Espanol</s:a>
    </li>

</ul>

</body>
</html>
