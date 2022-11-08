package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Esto fue del video 7
		// Creaci�n de objetos de tipo empleados 
		// JefeEmpleado Empleado1 = new JefeEmpleado(); //  Antes de la abstracci�n  
		// Empleados Empleado1 = new JefeEmpleado(); // Despu�s de la abstracci�n
		// Empleados Empleado1 = new SecretarioEmpleado(); // Despu�s de la abstracci�n
		Empleados Empleado1 = new DirectorEmpleado(); // Despu�s de la abstracci�n
		
		// Uso de los objetos creados
		System.out.println(Empleado1.getTareas());
		*/
		
		
		/*video 8*/
		// Pasos 
		// 1. Crear un contexto y cargar el archivo XML
		// 2. Pedir el Bean
		// 3. Utilizar el Bean
		// 4. Cerrar el XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml"); // 1
		
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class); // 2
		
		System.out.println(Juan.getTareas()); // 3
		
		System.out.println(Juan.getInformes()); // V.9 DI 
		
		contexto.close(); // 4
	}

}
