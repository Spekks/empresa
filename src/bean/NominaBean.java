package bean;

import java.io.Serializable;

/**
 * Clase que define al modelo Bean de la clase Nomina.
 * @author Héctor
 * @since 25/10/2020
 */
public class NominaBean implements Serializable{
	
	/**
	 * ID de la nómina
	 */
	private int nomina_id;
	/**
	 * DNI del empleado
	 */
    private String dni_empleado;
    /**
     * Sueldo del empleado
     */
    private int sueldo;

    /**
     * Constructor sin parámetros de la clase Nomina.
     */
    public NominaBean() {
    	
    }
    
    /**
     * Método que devuelve el ID de la nómina
     * @return ID de la nómina
     */
    public int getNomina_id() {
        return nomina_id;
    }
    /**
     * Método que cambia el ID de la nómina
     * @param nomina_id int ID de la nómina
     */
    public void setNomina_id(int nomina_id) {
        this.nomina_id = nomina_id;
    }

    /**
     * Método que devuelve el DNI del empleado
     * @return DNI del empleado
     */
    public String getDni_empleado() {
        return dni_empleado;
    }
    /**
     * Método que cambia el DNI del empleado
     * @param dni_empleado String DNI del empleado
     */
    public void setDni_empleado(String dni_empleado) {
        this.dni_empleado = dni_empleado;
    }

    /**
     * Método que devuelve el sueldo
     * @return sueldo
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * Método que cambia el sueldo
     * @param sueldo int sueldo
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

}
