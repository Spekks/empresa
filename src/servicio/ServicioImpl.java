package servicio;

import java.util.ArrayList;
import java.util.List;

import bean.EmpleadoBean;
import bean.NominaBean;
import dao.EmpleadoImpl;
import dao.NominaImpl;
import modelo.Empleado;
import modelo.Nomina;

public class ServicioImpl implements IServicio{
	
	public List<EmpleadoBean> listarEmpleados() {
		List<EmpleadoBean> listaEmpBean = new ArrayList();
		
		EmpleadoImpl emplImp = new EmpleadoImpl();
		
		List<Empleado> listEmpleado = emplImp.listaEmpl();
		
		for (Empleado empleado : listEmpleado) {
			EmpleadoBean empleadoBean = new EmpleadoBean();
			
			empleadoBean.setEmpleado_id(empleado.getEmpleado_id());
			empleadoBean.setNombre(empleado.getNombre());
			empleadoBean.setDni(empleado.getDni());
			empleadoBean.setSexo(empleado.getSexo());
			empleadoBean.setCategoria(empleado.getCategoria());
			empleadoBean.setAnos(empleado.getAnos());
			
			listaEmpBean.add(empleadoBean);
		}
		return listaEmpBean;
	}
	/**
	 * Devuelve el dni y el sueldo de la nómina.
	 * @param dni
	 * @return
	 */
	public NominaBean devolverSueldo(String dni) {
		Nomina nomina = new Nomina();
		NominaImpl nominaImpl = new NominaImpl();
		nomina = nominaImpl.devolverDniSueldo(dni);
		
		NominaBean nominaB = new NominaBean();
		
		nominaB.setDni_empleado(nomina.getDni_empleado());
		nominaB.setNomina_id(nomina.getNomina_id());
		nominaB.setSueldo(nomina.getSueldo());
		
		return nominaB;
	}
	
	public EmpleadoBean seleccionarEmpleado(int empleado_id) {
		Empleado empleado = new Empleado();
		EmpleadoImpl ei = new EmpleadoImpl();
		empleado = ei.devolver(empleado_id);
		
		EmpleadoBean empleadoB = new EmpleadoBean();
		
		empleadoB.setEmpleado_id(empleado.getEmpleado_id());
		empleadoB.setNombre(empleado.getNombre());
		empleadoB.setDni(empleado.getDni());
		empleadoB.setSexo(empleado.getSexo());
		empleadoB.setCategoria(empleado.getCategoria());
		empleadoB.setAnos(empleado.getAnos());
		
		return empleadoB;
	}
	
}
