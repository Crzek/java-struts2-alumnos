<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title><s:text name="register.title"/></title>
</head>

<body>
<h1><s:text name="register.title"/></h1>
<s:form theme="simple" id="alumnoBean" name="alumnoBean" action="registerValidate" method="post" validate="true">
  <table>
      <tr>
          <td class="evenRow">
            <s:fielderror fieldName="error.name" />
            <s:text name="alumnoBean.name"/>
            <s:textfield id="name" name="alumnoBean.name"/>
          </td>
      </tr>

      <tr>
          <td class="evenRow">
            <s:fielderror fieldName="error.surname" />
            <s:text name="alumnoBean.surname"/>
            <s:textfield id="surname" name="alumnoBean.surname"/>
          </td>
      </tr>
      <tr>
       <tr>
            <td class="evenRow">
              <s:fielderror fieldName="error.dni" />
              <s:text name="alumnoBean.dni"/>
              <s:textfield id="dni" name="alumnoBean.dni"/>
            </td>
        </tr>
      <tr>
          <td class="evenRow">
            <s:fielderror fieldName="error.date" />
            <s:text name="alumnoBean.date"/>
            <input type="date" id="bornDate" name="alumnoBean.bornDate">
          </td>
      </tr>
      <tr>
        <td class="evenRow">
            <s:submit align="left" value="Enviar"/>
        </td>
      </tr>
  </table>
  <s:a action="hello" >Ir a Home</s:a><br/>
</s:form>

</body>
</html>