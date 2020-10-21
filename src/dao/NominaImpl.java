package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conexion.Conector;
import modelo.Nomina;

/**
 * Clase que implementa los métodos usados por la clase Nomina para conectarse a la base de datos.
 * @author Héctor
 * @since 16/10/2020
 */
public class NominaImpl {

	/**
	 * Sentencia SQL que devuelve todos los datos de la tabla Nomina de la base de datos
	 */
	private static final String SQL_SELECT = "SELECT * FROM nomina";
	
	/**
	 * Método que recorre devuelve una nómina concreta, en función del DNI introducido por parámetro.
	 * @param dni_empleado String DNI del empleado
	 * @return nómina de un empleado concreto
	 */
	public Nomina devolverDniSueldo(String dni_empleado) {
		Nomina nomina = null;
		Connection conexion = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conexion = Conector.getconnection();
			ps = conexion.prepareStatement(SQL_SELECT);
			rs = ps.executeQuery();
			while (rs.next()) {
				if (dni_empleado.trim().equalsIgnoreCase(rs.getString("dni_empleado"))) {
					int sueldo = rs.getInt("sueldo");
					nomina = new Nomina(dni_empleado, sueldo);
					break;
				}
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
		return nomina;
	}

}
