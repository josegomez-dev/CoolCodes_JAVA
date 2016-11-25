package Logic;
import java.util.Observable;
import java.util.Observer;

public class EquipoIncendio implements Observer{

	private String nom;
	
	public EquipoIncendio(String nom){
		this.nom = nom;
	}
	
	@Override
	public void update(Observable institucion, Object arg) {

		String incidencia = ((Institucion) institucion).getCatastrofe();
		
		switch(  incidencia ){
	
			case "Incendio":
				System.out.println(nom + " reacciona a :"  + incidencia);
				System.out.println("Apaga el fuego");
				break;
			case "Zombies":
				System.out.println(nom + " reacciona a :"  + incidencia);
				System.out.println("No hace nada!");
				break;
			case "Tormenta":
				System.out.println(nom + " reacciona a :"  + incidencia);
				System.out.println("No hace nada!");
				break;
			case "Secuestro":
				System.out.println(nom + " reacciona a :"  + incidencia);
				System.out.println("No hace nada!");
				break;
			case "Drogas":
				System.out.println(nom + " reacciona a :"  + incidencia);
				System.out.println("No hace nada!");
				break;
		}
		
		System.out.println();
	}

}
