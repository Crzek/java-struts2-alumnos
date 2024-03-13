<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title><s:text name="register.title"/></title>
</head>

<body>
    <p>
    Registrado, volver al
    <s:a action="hello">Home</s:a>
    </p><br/>
    Nombre: <s:property value="alumnoBean.name" />
    <br/>
    Apellido: <s:property value="alumnoBean.surname" />
    <br/>
    Fecha de nacimiento: <s:property value="alumnoBean.bornDate" />
    <br/>
    DNI: <s:property value="alumnoBean.dni" />

</body>