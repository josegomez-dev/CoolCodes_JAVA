package LogicLayer;


public interface State {
	
	public void disfrazarse(Heroe heroe);
	
	public void quitarDisfraz(Heroe heroe);
	
	public void activarMurcielago(Heroe heroe);
	
	public void combatir(Heroe heroe);
	
	public void defender(Heroe heroe);
	
	public void hacerseMuertito(Heroe heroe);
	
	public void suspender(Heroe heroe);
	
	public void informacion(Heroe heroe);

}

