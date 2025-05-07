package Tp7.Collections;

import java.util.ArrayList;

public class Program {

	public static void main(String[] ags) {
		ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(9);
        numeros.add(20);
        numeros.add(4);
		System.out.println(ArrayLists.sumevenNums(numeros));
		
		ArrayList<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("manzana");
        listaOriginal.add("banana");
        listaOriginal.add("manzana");
        listaOriginal.add("pera");
        listaOriginal.add("banana");
        System.out.println(ArrayLists.norepeateStrings(listaOriginal));
	}
}
