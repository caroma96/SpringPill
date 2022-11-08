package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
	
	// Creación de campo tipo CreacionInforme (interface)
	private CreacionInformes informeNuevo;
	
	// Creación del constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		// TODO Auto-generated constructor stub
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe creado por el director: " + informeNuevo.getInforme() ;
	}

}
