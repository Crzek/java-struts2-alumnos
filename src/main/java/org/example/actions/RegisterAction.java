package org.example.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.example.actions.beans.AlumnoBean;

import java.util.Map;

public class RegisterAction extends ActionSupport {
    AlumnoBean alumnoBean;

    // validate se ejecuta antes que execute
    @Override
    public String execute() throws Exception {
        System.out.println("registerAction/execute");
        return SUCCESS;
    }

    public void setAlumnoBean(AlumnoBean alumnoBean){
        this.alumnoBean = alumnoBean;
    }
    public AlumnoBean getAlumnoBean(){
        return this.alumnoBean;
    }
}
