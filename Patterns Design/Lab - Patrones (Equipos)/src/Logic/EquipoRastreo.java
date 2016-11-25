package Logic;
import java.util.Observable;
import java.util.Observer;

public class EquipoRastreo implements Observer {

	private String nom;
	
	public EquipoRastreo(String nom){
		this.nom = nom;
	}
	
	@Override
	public void update(Observable institucion, Object arg1) {

		String incidencia = ((Institucion) institucion).getCatastrofe();
		
		switch(  incidencia ){
			case "Incendio":
				System.out.println(nom + " reacciona a :"  + incidencia);
				System.out.println("No hace nada!");
				break;
			case "Zombies":
				System.out.println(nom + " reacciona a :"  + incidencia);
				System.out.println("Rastrea la guarida de los zombies");
				break;
			case "Tormenta":
				System.out.println(nom + " reacciona a :"  + incidencia);
				System.out.println("No hace nada!");
				break;
			case "Secuestro":
				System.out.println(nom + " reacciona a :"  + incidencia);
				System.out.println("Rastrea la ubicacion del delicuente");
				break;
			case "Drogas":
				System.out.println(nom + " reacciona a :"  + incidencia);
				System.out.println("Rastrea la ubicacion del diler");
				break;
		}
		
		System.out.println();
	}

}
