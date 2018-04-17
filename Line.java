// Erzeugt ein Objekt des Typs Line, jede Linie hat eine Laenge des Typs double
public class Line{
	private double length;
	public Line(double len){
		this.length = len;
	}
	// String Repraesentation einer Line
	public String toString(){
		return String.valueOf(length);
	} 
}