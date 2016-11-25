package IU;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Factory.RectFactory;
import LogicLayer.MyRect;

public class FlyWeightTest extends JFrame {
	
	private static final long serialVersionUID = 500L;
	
	JButton startDrawing;
	JLabel lblText;
	
	int windowWidth = 900;
	int windowHeight = 500;
	
	Color[] shapeColor = {Color.GREEN, Color.YELLOW, Color.RED, Color.BLACK};
	
	public static void main(String[] args){
		new FlyWeightTest();
	}
	
	public FlyWeightTest(){
		
		this.setSize(windowWidth, windowHeight);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("FlyWeight Design Pattern");
		
		JPanel contentPane = new JPanel();
		
		contentPane.setLayout(new BorderLayout());
		
		final JPanel drawingPanel = new JPanel();
		
		startDrawing = new JButton("Dibujar");
		lblText = new JLabel("Flyweight Pattern");
		
		contentPane.add(drawingPanel, BorderLayout.CENTER);
		contentPane.add(startDrawing, BorderLayout.SOUTH);
		contentPane.add(lblText, BorderLayout.NORTH);
		
		startDrawing.addActionListener(new ActionListener(){
		
			public void actionPerformed(ActionEvent event){
				
				Graphics g = drawingPanel.getGraphics();
				
				long startTime = System.currentTimeMillis();
				
				for(int i = 0; i < 1000000; ++i){
					
					MyRect rect = RectFactory.getRect(getRandColor());
					rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
				
				}
				
				long endTime = System.currentTimeMillis();
				
				StringBuilder sb = new StringBuilder();
						
				sb.append("Tiempo en milisegundos: " + (endTime - startTime) + "\n\n");
				sb.append(showMemoryUsage());

				JOptionPane.showMessageDialog(null, sb.toString());
			}
			
		});
		
		this.add(contentPane);
		this.setVisible(true);
		
	}
	
	private Color getRandColor(){
		Random randomGenerator = new Random();
		int randInt = randomGenerator.nextInt(4);
		return shapeColor[randInt];
	}
	
	private int getRandX() { return (int)(Math.random() * windowWidth); }
	private int getRandY() { return (int)(Math.random() * windowHeight); }
	
	private String showMemoryUsage(){
		
		Runtime runtime = Runtime.getRuntime();

		NumberFormat format = NumberFormat.getInstance();

		StringBuilder sb = new StringBuilder();
		
		long maxMemory = runtime.maxMemory();
		long allocatedMemory = runtime.totalMemory();
		long freeMemory = runtime.freeMemory();

		sb.append("Memoria libre: " + format.format(freeMemory / 1024) + "\n");
		sb.append("Memoria local: " + format.format(allocatedMemory / 1024) + "\n");
		sb.append("Memoria maxima: " + format.format(maxMemory / 1024) + "\n");
		sb.append("Total de memoria libre: " + format.format((freeMemory + (maxMemory - allocatedMemory)) / 1024) + "\n");
	
		return sb.toString();
	}
	
}
