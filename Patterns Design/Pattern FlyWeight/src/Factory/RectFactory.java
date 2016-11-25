package Factory;
import java.util.HashMap;

import LogicLayer.MyRect;

import java.awt.Color;

public class RectFactory {

	private static final HashMap<Color, MyRect> rectsByColor = new HashMap<Color, MyRect>();
	public static int i = 0;
	
	public static MyRect getRect(Color color){
		
		
		MyRect rect = (MyRect)rectsByColor.get(color);
		
		if(rect == null){
			rect = new MyRect(color);
			rectsByColor.put(color, rect);
			
			System.out.println("Creando un nuevo Rectangulo" + (i++));
		}
		
		return rect;
	}
	
}
