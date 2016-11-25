import java.util.HashMap;

public class FabricaFiguras {

	private static final HashMap<String, Figura> MapaCirculo = new HashMap<String, Figura>();

	public static Figura getCirculo(String color){
		
		Circulo circulo = (Circulo)MapaCirculo.get(color); 
		
		if(circulo == null){
			circulo = new Circulo(color);
			MapaCirculo.put(color, circulo);
			
			System.out.println("Creando circulo de color: " + color);
		}
		
		return circulo;
	}
}
