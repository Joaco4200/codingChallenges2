package Collections;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	
	public static Map<String,Integer> departamentos= new HashMap<>();
	
	public static void agregarDepartamento(String departamento,int habitantes) {
		departamentos.put(departamento, habitantes);
	}
	
	public static void eliminarDepartamento(String departamento,int habitantes) {
		departamentos.remove(departamento, habitantes);
	}
	
	public static void mostrarHabitantes(String departamento) {
		System.out.println(departamentos.get(departamento));
	}
}
