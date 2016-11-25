package Logic;

import Custom.Observador;
import Custom.SujetoObservable;

public class Student implements Observador {

	private String name;
	private String response;
	
	public Student(String name){
		this.name = name;
	}
	
	public void setResponse(String response){
		this.response = response;
	}
	
	@Override
	public void update(SujetoObservable school) {
		System.out.println("Hola: " + this.name);
		System.out.println( ((Board) school).getMsj() );
		System.out.println(this.name + " dice: " + this.response);
		System.out.println();
	}

}
