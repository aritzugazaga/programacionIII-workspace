package ejemplos;

import java.util.Comparator;

public class ComparadorPersonaApellido implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		return p1.compareTo(p2);
	}
}
