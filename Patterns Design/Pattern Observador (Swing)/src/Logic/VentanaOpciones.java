package Logic;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaOpciones extends JFrame implements Observer,ActionListener{
	
	private JLabel titulo;
	private int colorSeleccionado;
	private JComboBox color;
	private String arregloColores[] = { "Seleccione", "Amarillo", "Azul",
			"Rojo", "Verde", "Negro", "Blanco",	"Naranja" };
	private ColorObservable miColorObservable;

	
	public VentanaOpciones(ColorObservable pcolor)
	{
		
		miColorObservable = pcolor;
		
	  titulo= new JLabel();
	  titulo.setText("PATRON OBSERVER");
	  titulo.setBounds(20, 10, 150, 25);
		 
	  color= new JComboBox();
	  color.setBounds(20, 40, 150, 25);
	  color.setModel(new javax.swing.DefaultComboBoxModel(arregloColores));
	  color.addActionListener(this);
	  
	  add(titulo);
	  add(color);
	  
	  setSize(200,110);
	  setTitle("Ventana Color");
	  setLocation(500,150);
	  setLayout(null);
	  setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0)
	{
		miColorObservable.setColor((String) color.getSelectedItem());
		miColorObservable.setColorSeleccionado(color.getSelectedIndex());
	}

	public void update(Observable arg0, Object arg1)
	{
		colorSeleccionado=miColorObservable.getColorSeleccionado();
		switch (colorSeleccionado)
		{
		case 1: color.setSelectedIndex(1);
		break;
		case 2: color.setSelectedIndex(2);
		break;
		case 3: color.setSelectedIndex(3);
		break;
		case 4: color.setSelectedIndex(4);
		break;
		case 5: color.setSelectedIndex(5);
		break;
		case 6: color.setSelectedIndex(6);
		break;
		case 7: color.setSelectedIndex(7);
		break;
		default : color.setSelectedIndex(0);

		}
	}
}