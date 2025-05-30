package Collections;

import java.util.ArrayList;

public class Program {

	public static void main(String[] ags) {
		Dictionary.agregarDepartamento("Maldonado", 8000);
		Dictionary.agregarDepartamento("San carlos", 2000);
		Dictionary.eliminarDepartamento("Maldonado", 8000);
		Dictionary.mostrarHabitantes("Maldonado");
	}
}
