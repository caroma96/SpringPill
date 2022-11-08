package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
	
	// Creación de campo tipo CreacionInforme (interface)
	private CreacionInformes informeNuevo;
	
	// Creación del constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		// TODO Auto-generated constructor stub
		this.informeNuevo = informeNuevo;
	}
	
	// Video 11 creacion de campos
	private String email;
	
	private String nombreEmpresa;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
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
