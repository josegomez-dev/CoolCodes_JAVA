package IU;
import Logic.EquipoIncendio;
import Logic.EquipoPsicologos;
import Logic.EquipoRastreo;
import Logic.Institucion;

public class Main {

	public static void main(String[] args) {

		String[] lstIncidencias = {
				"Incendio","Zombies","Tormenta","Secuestro","Drogas",
		};
		
		Institucion school = new Institucion();
		
		EquipoRastreo eq_1 = new EquipoRastreo("Equipo de rastreo");
		EquipoPsicologos eq_2 = new EquipoPsicologos("Equipo de psicologos");
		EquipoIncendio eq_3 = new EquipoIncendio("Equipo de incendios");
		
		school.suscribirEquipo(eq_1);
		school.suscribirEquipo(eq_2);
		school.suscribirEquipo(eq_3);
		
		for(int i = 0; i < lstIncidencias.length; i++){
			System.out.println("\n*!/*!/*!/*!/*\nOjo: " + lstIncidencias[i] + "\n*!/*!/*!/*!/*!/*\n");
			school.setCatastrofe(lstIncidencias[i]);	
		}
		
	}

}
