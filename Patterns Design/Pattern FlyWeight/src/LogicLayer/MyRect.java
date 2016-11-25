package LogicLayer;
import java.awt.*;

public class MyRect implements Figure {

	private Color color;
	
	public MyRect(Color color){
		this.color = color;
	}

	public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY){
		g.setColor(color); // Estado Instrinsico
		g.fillRect(upperX, upperY, upperX, upperY); // Estado Extrinsico
	}	
	
}
