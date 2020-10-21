package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.EmpleadoBean;
import bean.NominaBean;
import dao.EmpleadoImpl;
import dao.NominaImpl;
import modelo.Empleado;
import modelo.Nomina;
import servicio.ServicioImpl;

/**
 * Clase que implementa el servlet que actuará de controlador entre los modelos Empleado y Nomina y los .jsp.
 * @author hector
 * @since 16/10/2020
 */
@WebServlet("/servlet")
public class Servlet extends HttpServlet {

	/**
	 * Método que recibe las peticiones GET desde el cliente y gestiona la respuesta del servidor en 
	 * función del parámetro "action" que reciba con la petición.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("action") != null) {
			String action = request.getParameter("action");
			switch (action) {
			case "lista":
				listar(request, response);
				break;
			case "devolver":
				devolver(request, response);
				break;
			case "modificar":
				listarYModificar(request, response);
				break;
			case "empleado":
				modificarEmpleado(request, response);
				break;
			}
		} else {
			defaultAction(request, response);
		}
	}

	/**
	 * Método que recibe las peticiones POST desde el cliente y gestiona la respuesta del servidor en
	 * función del parámetro "action" que reciba con la petición.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "salario":
			devolverSalario(request, response);
			break;
		}
	}

	/**
	 * Método que dirige a la vista "empresa.jsp", el índex establecido por defecto si ningún parámetro se 
	 * introduce en la petición. Se carga nada más entrar en el sitio web.
	 * @param request HttpServletRequest petición que recibe del .jsp
	 * @param response HttpServletRequest respuesta que recibe del .jsp
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void defaultAction (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/empresa.jsp").forward(request, response);
	}
	
	/**
	 * Método que dirige a la vista "listar.jsp", una vista que requiere de una lista de empleados que también
	 * son devueltos por el método.
	 * @param request HttpServletRequest petición que recibe del .jsp
	 * @param response HttpServletRequest respuesta que recibe del .jsp
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void listar (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServicioImpl servicio = new ServicioImpl();
		List<EmpleadoBean> eb = servicio.listarEmpleados();
		request.setAttribute("empleados", eb);
		request.getRequestDispatcher("/WEB-INF/paginas/listar.jsp").forward(request, response);
	}
	
	/**
	 * Método que dirige a la vista "devolver.jsp".
	 * @param request HttpServletRequest petición que recibe del .jsp
	 * @param response HttpServletRequest respuesta que recibe del .jsp
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void devolver (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		request.getRequestDispatcher("/WEB-INF/paginas/devolver.jsp").forward(request, response);
	}
	
	/**
	 * Método que dirige a la vista "devolver.jsp", devolviendo el sueldo y el DNI de una nómina.
	 * @param request HttpServletRequest petición que recibe del .jsp
	 * @param response HttpServletRequest respuesta que recibe del .jsp
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void devolverSalario (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String dni = request.getParameter("dni");
		ServicioImpl servicio = new ServicioImpl();
		NominaBean nomina = servicio.devolverSueldo(dni);
		if (nomina == null) {
			request.getRequestDispatcher("/WEB-INF/paginas/devolver.jsp").forward(request, response);
		}
		request.setAttribute("dni", nomina.getDni_empleado());
		request.setAttribute("salario", nomina.getSueldo());
		request.getRequestDispatcher("/WEB-INF/paginas/devolver.jsp").forward(request, response);
	}
	
	/**
	 * Método que dirige a la vista "empleado.jsp", que devuelve una lista de empleados.
	 * @param request HttpServletRequest petición que recibe del .jsp
	 * @param response HttpServletRequest respuesta que recibe del .jsp
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void listarYModificar (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServicioImpl servicio = new ServicioImpl();
		List<EmpleadoBean> eb = servicio.listarEmpleados();
		request.setAttribute("empleados", eb);
		request.getRequestDispatcher("/WEB-INF/paginas/empleado.jsp").forward(request, response);
	}
	
	/**
	 * Método que dirige a la vista "modificar.jsp", llevando consigo a un empleado traído de la anterior
	 * vista.
	 * @param request HttpServletRequest petición que recibe del .jsp
	 * @param response HttpServletRequest respuesta que recibe del .jsp
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void modificarEmpleado (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int empleado_id = Integer.parseInt(request.getParameter("empleado_id"));
		ServicioImpl servicio = new ServicioImpl();
		EmpleadoBean eb = servicio.seleccionarEmpleado(empleado_id);
		request.setAttribute("empleado", eb);
		request.getRequestDispatcher("/WEB-INF/paginas/modificar.jsp").forward(request, response);
	}
}
