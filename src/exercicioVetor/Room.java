package exercicioVetor;

public class Room {
	private Student s;
	
	public Room(String name, String email) {
		s = new Student(name, email);
	}
	
	public String toString() {
		return s.toString();
	}
	
	
}
