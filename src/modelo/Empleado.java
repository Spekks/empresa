package modelo;

/**
 * Clase que define al modelo empleado de la base de datos.
 * @author Héctor
 * @since 16/10/2020
 */
public class Empleado {

	/**
	 * Id del empleado.
	 */
	private int empleado_id;
	/**
	 * Nombre del empleado.
	 */
    private String nombre;
    /**
     * DNI del empleado.
     */
    private String dni;
    /**
     * Sexo del empleado.
     */
    private String sexo;
    /**
     * Categoría profesional del empleado.
     */
    private int categoria;
    /**
     * Años trabajados por el empleado.
     */
    private int anos;

    /**
     * Constructor sin parámetros de la clase Empleado.
     */
    public Empleado() {

    }

    /**
     * Constructor con todos los parámetro menos la ID.
     * @param nombre String nombre del empleado
     * @param dni String DNI del empleado
     * @param sexo String sexo del empleado
     * @param categoria int Categoría profesional del empleado
     * @param anos int años trabajados por el empleado
     */
    public Empleado(String nombre, String dni, String sexo, int categoria, int anos) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
        this.categoria = categoria;
        this.anos = anos;
    }

    /**
     * Constructor con todos los parámetro.
     * @param empleado_id int ID del empleado
     * @param nombre String nombre del empleado
     * @param dni String DNI del empleado
     * @param sexo String sexo del empleado
     * @param categoria int Categoría profesional del empleado
     * @param anos int años trabajados por el empleado
     */
    public Empleado(int empleado_id, String nombre, String dni, String sexo, int categoria, int anos) {
        this.empleado_id = empleado_id;
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
        this.categoria = categoria;
        this.anos = anos;
    }

    /**
     * Método que devuelve el ID del empleado
     * @return ID del empleado
     */
    public int getEmpleado_id() {
        return empleado_id;
    }
    /**
     * Método que cambia el ID del empleado
     * @param empleado_id int ID del empleado
     */
    public void setEmpleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }

    /**
     * Método que devuelve el nombre del empleado
     * @return Nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que cambia el nombre del empleado
     * @param nombre String nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el DNI del empleado
     * @return DNI del empleado
     */
    public String getDni() {
        return dni;
    }
    /**
     * Método que cambia el DNI del empleado
     * @param dni String DNI del empleado
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Método que devuelve el sexo del empleado
     * @return Sexo del empleado
     */
    public String getSexo() {
        return sexo;
    }
    /**
     * Método que cambia el sexo del empleado
     * @param sexo String sexo del empleado
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Método que devuelve la categoría profesional del empleado
     * @return Categoría profesional del empleado
     */
    public int getCategoria() {
        return categoria;
    }
    /**
     * Método que cambia la categoría profesional del empleado
     * @param categoria int categoría profesional del empleado
     */
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    /**
     * Método que devuelve los años trabajados por el empleado
     * @return Años trabajados por el empleado
     */
    public int getAnos() {
        return anos;
    }
    /**
     * Método que cambia los años trabajados por el empleado
     * @param anos int años trabajados por el empleado
     */
    public void setAnos(int anos) {
        this.anos = anos;
    } 

    /**
     * Método toString que devuelve un empleado en forma de cadena.
     * @return Cadena con todas las características del empleado
     */
	public String toString() {
		return "Empleado [empleado_id=" + empleado_id + ", nombre=" + nombre + ", dni=" + dni + ", sexo=" + sexo
				+ ", categoria=" + categoria + ", anos=" + anos + "]";
	}
	
}
