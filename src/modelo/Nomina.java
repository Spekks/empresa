package modelo;

/**
 * Clase que define al modelo nomina de la base de datos
 * @author Héctor
 * @since 16/10/2020
 */
public class Nomina {
	
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
    public Nomina() {
    }

    /**
     * Constructor con todos los parámetros menos el ID de la nómina.
     * @param dni_empleado String DNI del empleado
     * @param sueldo int sueldo
     */
    public Nomina(String dni_empleado, int sueldo) {
        this.dni_empleado = dni_empleado;
        this.sueldo = sueldo;
    }

    /**
     * Constructor con todos los parámetros.
     * @param nomina_id int ID de la nómina
     * @param dni_empleado String DNI del empleado
     * @param sueldo int sueldo
     */
    public Nomina(int nomina_id, String dni_empleado, int sueldo) {
        this.nomina_id = nomina_id;
        this.dni_empleado = dni_empleado;
        this.sueldo = sueldo;
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

    /**
     * Método toString que devuelve una nómina en forma de cadena.
     * @return Cadena con todas las características de la nómina
     */
	public String toString() {
		return "Nomina [nomina_id=" + nomina_id + ", dni_empleado=" + dni_empleado + ", sueldo=" + sueldo + "]";
	}
    
}
