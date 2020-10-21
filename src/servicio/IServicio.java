package servicio;

import java.util.List;

import bean.EmpleadoBean;
import bean.NominaBean;

public interface IServicio {
	List<EmpleadoBean> listarEmpleados();
	NominaBean devolverSueldo(String dni);
	EmpleadoBean seleccionarEmpleado(int empleado_id);
}
