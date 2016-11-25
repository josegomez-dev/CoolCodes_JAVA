package Logic;
import java.util.Observable;
import java.util.Observer;

public class Student implements Observer{

	private String name;
	private String response;
	
	public Student(String name){
		this.name = name;
		this.response = "Recibdo";
	}
	
	public void setResponse(String response){
		this.response = response;
	}
	
	@Override
	public void update(Observable school, Object arg1) {
		System.out.println("Hola: " + this.name);
		System.out.println( ((Board) school).getMsj() );
		System.out.println(this.name + " dice: " + this.response);
		System.out.println();
	}
	
}
