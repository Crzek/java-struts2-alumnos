<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title><s:text name="hello.message"/></title>
</head>

<body>
    <s:a action="hello" >ir a Home</s:a><br/>
    <h1>Lista Alumnos</h1>
     <c:if test="${empty alumnos}">
            <p>No hay alumnos registrados.</p>
     </c:if>

     <c:if test="${not empty alumnos}">
             <table border="1">
                 <thead>
                     <tr>
                         <th>Clave</th>
                         <th>Nombres</th>
                         <th>Apellido</th>
                         <th>DNI</th>
                         <th>Nacimiento</th>
                     </tr>
                 </thead>
                 <tbody>
                     <c:forEach var="entry" items="${alumnos}">
                         <tr>
                             <td>${entry.key}</td>
                             <td>${entry.value.name}</td>
                             <td>${entry.value.surname}</td>
                             <td>${entry.value.dni}</td>
                             <td>${entry.value.bornDate}</td>
                         </tr>
                     </c:forEach>
                 </tbody>
             </table>
         </c:if>


</body>
</html>
