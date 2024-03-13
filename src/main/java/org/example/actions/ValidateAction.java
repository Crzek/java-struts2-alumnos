package org.example.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.example.actions.beans.AlumnoBean;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class ValidateAction extends ActionSupport {
    // obtenemos la clase AlumnoBean, para accedera sus atrubutos
    private AlumnoBean alumnoBean;

    private Map<String, AlumnoBean> alumnos = AlumnoBean.getAlumnos();

    // getters and setters
    public Map<String, AlumnoBean> getAlumnos(){
        return this.alumnos;
    };

    public void setAlumnos(Map<String, AlumnoBean> alumnos){
        this.alumnos = alumnos;
    };
    public void setAlumnoBean(AlumnoBean alumnoBean) {
        this.alumnoBean = alumnoBean;
    }

    public AlumnoBean getAlumnoBean() {
        return this.alumnoBean;
    }

    // methods
    @Override
    public String execute() throws Exception {
        System.out.println("validateAction/execute");

//        // obtener maps alumnos
//        Map<String, AlumnoBean> thisalumnos = Alu
        return SUCCESS;
    }

    @Override
    public void validate() {
        // hacer consulta para ver que no se repita el dni
        if (alumnos.containsKey(alumnoBean.getDni())){
            addFieldError("error.dni","DNI ya Esta registrado, Registra con otro DNi");
        }

        if (alumnoBean.getName().isEmpty()) {
            addFieldError("error.name", "Name is required");
        }
        if (alumnoBean.getSurname().isEmpty()) {
            addFieldError("error.surname", "Surname is required");
        }
        if (alumnoBean.getBornDate() == null) {
            addFieldError("error.date", "Date of birth is required");
        }
        if (alumnoBean.getDni().isEmpty()) {
            addFieldError("error.dni", "DNI is required");
        }
    }

    public String validateForm() throws Exception {
        // Primero, llamamos al método validate()
        this.validate();

        // Verificamos si hay errores de validación
        if (hasErrors()) {
            // Si hay errores de validación, devolvemos el resultado INPUT
            return INPUT;
        }

        // Si no hay errores de validación, llamamos al método execute()
        String resultado = execute();
        if (SUCCESS.equals(resultado)) {
            /*
             Si execute() fue exitoso, aquí puedes colocar tu lógica adicional
             por ejemplo, guardar en la base de datos, enviar un correo electrónico, etc.
             Si necesitas acceso a los datos del formulario, puedes usar los getters
             de tus propiedades de formulario (como getNombre(), getApellido(), etc.).
             Por ejemplo:
             String nombre = getAlumnoBean().getNombre();
             */

            // En Este Coso Guardaremos los datos en memoria de ejecucion,
            // gurdaremos los alumnos en un hashmap

            AlumnoBean.addAlumnosInMap(alumnoBean);
            System.out.println("Alumno gregado");
        }

        // Devolvemos el resultado de execute()
        return resultado;
    }

    @SkipValidation
    public String getAllAlumnos() throws Exception{
        String resultado = execute();
        if (SUCCESS.equals(resultado)) {
            Map<String, AlumnoBean> allAlumnos = AlumnoBean.getAlumnos();
            HttpServletRequest request = ServletActionContext.getRequest();
            request.setAttribute("alumnos", allAlumnos);
        }
        return resultado;
    };


}

