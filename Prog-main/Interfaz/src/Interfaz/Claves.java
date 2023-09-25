package Interfaz;

import java.util.HashMap;

public class Claves {
	private HashMap<String, String> list = new HashMap<String, String>();
	/*Esta clase emula una base de datos con un hashmap hardcodeado. Sólo podremos conectarnos si la contraseña y el usuario son correctos*/
	public Claves() {
		// TODO Auto-generated constructor stub
		list.put("Morenito69", "SeatLeonAmarillo");
	    list.put("LadyUsuaria", "Ladypassword");
	    list.put("España", "Españita");
	    list.put("Barak", "Owbamas");
	    list.put("admin", "admin");
	}
	public boolean Coincide(String usuario, String clave) {
		boolean resultado=false;
		if(list.containsKey(usuario) && list.get(usuario).contentEquals(clave) ) {
			resultado = true;		
		}
		return resultado;			
	}
}
