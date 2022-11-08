package es.pildoras.IoC;

public class JefeEmpleado implements Empleados {
	
	// Se hace lo mismo que en DirectoEmpleado V.9
	private CreacionInformes informeNuevo;
	
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}


	
	
	
	
	public String getTareas() {
		return "Gestino las labores relativas a mis empleados de sección";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe creado por el Jefe: " + informeNuevo.getInforme();
	}
	
}
