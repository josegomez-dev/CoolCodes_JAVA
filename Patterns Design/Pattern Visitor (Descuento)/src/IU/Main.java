package IU;
import java.text.DecimalFormat;

import Logic.EsmoquinNuevo;
import Logic.EsmoquinUsado;
import Logic.Visitable;
import Visitor.PromocionAgosto;
import Visitor.PromocionDiciembre;
import Visitor.Visitor;

public class Main {

	static DecimalFormat df = new DecimalFormat("$#.##");
	
	public static void main(String[] args) {		
		
		Visitable e1 = new EsmoquinNuevo(85.00);
		Visitable e2 = new EsmoquinUsado(60.00);
		
		//Visitor promo = new PromocionAgosto();
		Visitor promo = new PromocionDiciembre();

		
		System.out.println();
		System.out.println("   Esmoquin Nuevo:");
		System.out.println("	 Antes = " + df.format(((EsmoquinNuevo)e1).getPrecio()));
		System.out.println("	 Ahora = " + df.format(e1.aceptar(promo)) );
		System.out.println();
		System.out.println("   Esmoquin Usado:");
		System.out.println("	 Antes = " + df.format(((EsmoquinUsado)e2).getPrecio()));
		System.out.println("	 Ahora = " + df.format(e2.aceptar(promo)));
		System.out.println();
		
	}

}
