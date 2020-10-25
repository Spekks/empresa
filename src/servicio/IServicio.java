package servicio;

import java.util.List;

import bean.EmpleadoBean;
import bean.NominaBean;

/**
 * Interface que implementa el servicio de nuestra aplicación web.
 * @author hector
 * @since 25/10/2020
 */
public interface IServicio {
	List<EmpleadoBean> listarEmpleados();
	NominaBean devolverSueldo(String dni);
	EmpleadoBean seleccionarEmpleado(int empleado_id);
}
