package map;

import java.util.HashMap;
import java.util.Iterator;

public class Map {

	public static void main(String[] args) {
		String texto = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium "
				+ "doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore "
				+ "veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim "
				+ "ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia "
				+ "consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque "
				+ "porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, "
				+ "adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et "
				+ "dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum "
				+ "exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi "
				+ "consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse "
				+ "quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";

		// Aplicacion
		HashMap<String, Integer> diccionario = new HashMap<String, Integer>();

		int pos1 = 0;
		int pos2 = 0;
		int i = 1;
		int k = 1;

		pos1 = texto.indexOf(" ");

		diccionario.put(texto.substring(0, pos1), k);
		while (texto.indexOf(" ", pos1 + 1) > 0) {
			pos2 = texto.indexOf(" ", pos1 + 1);

			if (diccionario.containsKey(texto.substring(pos1 + 1, pos2))) {
				i++;
				diccionario.put(texto.substring(pos1 + 1, pos2), i);
			} else {
				diccionario.put(texto.substring(pos1 + 1, pos2), k);
			}
			pos1 = pos2;
		}
		diccionario.put(texto.substring(pos2 + 1), k);

		// mostrando el HashMap
		Iterator<String> it = diccionario.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println("Clave: " + key + " -> Cantidad: " + diccionario.get(key));
		}

		System.out.println("VALOR DE i = " + i);

	}

}
