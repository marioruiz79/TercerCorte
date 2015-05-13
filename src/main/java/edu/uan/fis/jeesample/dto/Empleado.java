package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class Empleado implements Serializable {
    
    private Integer empleadoId=0;
    private String name;
    
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Integer empleadoId) {
        this.empleadoId = empleadoId;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Empleado == false)
            return false;
        Empleado that = (Empleado) o;
        return that.empleadoId.equals(this.empleadoId);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 79 * hash + (this.empleadoId != null ? this.empleadoId.hashCode() : 0);
  
        return hash;
    }
}
