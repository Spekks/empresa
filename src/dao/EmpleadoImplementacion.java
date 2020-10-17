package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexion.Conector;
import modelo.Empleado;

/**
 * Clase que implementa los métodos usados por la clase Empleado para conectarse a la base de datos.
 * @author Héctor
 * @since 16/10/2020
 */
public class EmpleadoImplementacion {

	/**
	 * Sentencia SQL para seleccionar todos los empleados
	 */
	private static final String SQL_SELECT = "SELECT * FROM empleado";
	/**
	 * Sentencia SQL para seleccionar un empleado en función de su ID
	 */
	private static final String SQL_SELECT_BY_ID = "SELECT * FROM empleado WHERE empleado_id = ?";
	/**
	 * Array que contiene todos los sueldos base posible.
	 */
	private static final int SUELDO_BASE[] = { 50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000,
			230000 };

	/**
	 * Método que devuelve una lista de empleados sacados de la base de datos.
	 * @return lista de empleados de la base de datos
	 */
	public List<Empleado> listaEmpl() {
		Empleado empleado;
		List<Empleado> lista = new ArrayList<>();
		Connection conexion = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conexion = Conector.getconnection();
			ps = conexion.prepareStatement(SQL_SELECT);
			rs = ps.executeQuery();
			while (rs.next()) {
				int empleado_id = rs.getInt("empleado_id");
				String nombre = rs.getString("nombre");
				String dni = rs.getString("dni");
				String sexo = rs.getString("sexo");
				int categoria = rs.getInt("categoria");
				int anos = rs.getInt("anos");
				empleado = new Empleado(empleado_id, nombre, dni, sexo, categoria, anos);
				lista.add(empleado);
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (rs != null) {
				Conector.close(rs);
			}
			if (ps != null) {
				Conector.close(ps);
			}
			if (conexion != null) {
				Conector.close(conexion);
			}
		}
		return lista;
	}

	/**
	 * Método que devuelve un empleado de la base de datos, en función de la ID introducida por parámetro.
	 * @param id in ID de un empleado
	 * @return objeto de tipo Empleado
	 */
	public Empleado devolver(int id) {
		Empleado empleado = null;
		Connection conexion = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conexion = Conector.getconnection();
			ps = conexion.prepareStatement(SQL_SELECT_BY_ID);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			rs.absolute(1);
			int empleado_id = rs.getInt("empleado_id");
			String nombre = rs.getString("nombre");
			String dni = rs.getString("dni");
			String sexo = rs.getString("sexo");
			int categoria = rs.getInt("categoria");
			int anos = rs.getInt("anos");
			empleado = new Empleado(empleado_id, nombre, dni, sexo, categoria, anos);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			if (rs != null) {
				Conector.close(rs);
			}
			if (ps != null) {
				Conector.close(ps);
			}
			if (conexion != null) {
				Conector.close(conexion);
			}
		}
		return empleado;
	}

	/**
	 * Método que calcula el sueldo de un empleado en función de su categoría y años trabajados.
	 * @param categoria int categoría profesional de un empleado
	 * @param anos int años trabajados por el empleado
	 * @return sueldo calculado
	 */
	public int Sueldo(int categoria, int anos) {
		int sueldo;
		int sueldoBase = SUELDO_BASE[categoria - 1];

		sueldo = sueldoBase + (5000 * anos);

		return sueldo;
	}

}
