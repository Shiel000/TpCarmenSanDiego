package modelo;

import java.util.ArrayList;
import java.util.List;

public class Pista {
	private List<String> pistasAdar=new ArrayList<String>();

	public List<String> getPistasAdar() { return pistasAdar; }
	
	public void setPistasAdar(List<String> pistasAdar) { this.pistasAdar = pistasAdar; }
	
	public void agregarPista(String caracteristica) { pistasAdar.add(caracteristica); }
}
