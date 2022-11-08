package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {

	// Video 10
	private CreacionInformes informeNuevo;
	
	
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

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los Jefes";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario: " + informeNuevo.getInforme();
	}

}
