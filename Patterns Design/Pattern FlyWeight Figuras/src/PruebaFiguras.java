
public class PruebaFiguras {

	private static final String colores[] = {"Rojo", "Verde", "Amarillo", "Azul", "Negro"};

	public static void main(String[] args){
		
		for(int i = 0; i < 20; i++){
			
			Circulo circulo = (Circulo)FabricaFiguras.getCirculo(getRandomColor());
			
			circulo.setX(getRandomX());
			circulo.setY(getRandomY());
			circulo.setRadio(2);
			circulo.dibujar();
		}
		
	}
	
	private static String getRandomColor(){
		return colores[(int)(Math.random() * colores.length)];
	}
	
	private static int getRandomX(){
		return (int)(Math.random() * 100);
	}
	
	private static int getRandomY(){
		return (int)(Math.random() * 100);
	}
	
}
