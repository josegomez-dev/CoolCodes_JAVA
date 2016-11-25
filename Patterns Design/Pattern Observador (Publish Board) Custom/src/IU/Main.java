package IU;

import java.util.ArrayList;

import Logic.Board;
import Logic.Student;

public class Main {

	public static void main(String[] args) {

		Board school = new Board();
		
		String[] names = {
				"Astro", "Roberto", "Melany", "Antonio", "Veronica", "Baltazar"
		};
		
		String[] responses = {
				"No me importa", "que bueno", "no lo voy a compartir", "no me gusta la escuela", "este servicio es increible", "ok"
		};
		
		ArrayList<Student> students = new ArrayList<Student>();
		
	
		for(int i = 0; i < names.length; i++){
			students.add(new Student(names[i]));
			students.get(i).setResponse(responses[i]);
			school.addObservador(students.get(i));
		}
		
		school.setMsj("Soy la nueva escuela con interfaces personalizadas para poder extender de otro padre");
		
	}

}
