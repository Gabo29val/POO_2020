package exercise_02;

import java.util.ArrayList;

public class ArregloPersonas {
	private ArrayList<Persona> personas;

	public ArregloPersonas() {
		this.personas = new ArrayList<Persona>();
	}

	public boolean addPersona(Persona persona) {
		boolean agregado = false;
		if (!buscar(persona.getId())) {
			this.personas.add(persona);
			agregado = true;
		}
		return agregado;
	}

	public boolean buscar(String dni) {
		boolean esta = false;
		for (Persona p : this.personas) {
			if (dni.equals(p.getId())) {
				esta = true;
				break;
			}
		}
		return esta;
	}

	public String[] getTitulos() {
		String[] titulos = { "ID", "NOMBRE", "APELLIDOS", "EDAD" };
		return titulos;
	}

	public String[][] getPersonas() {
		String[][] per = new String[this.personas.size()][4];
		int i = 0;
		for (Persona p : this.personas) {
			per[i][0] = p.getId();
			per[i][1] = p.getNombre();
			per[i][2] = p.getApellido();
			per[i][3] = String.valueOf(p.getEdad());
			i++;
		}
		return per;
	}
}
