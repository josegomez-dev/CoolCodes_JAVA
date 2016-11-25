package LogicLayer;



public class Vigilando implements State{

	@Override
   public void disfrazarse(Heroe heroe){
      System.out.println("Ya estoy disfrazado!");
   }
   
   @Override
   public void quitarDisfraz(Heroe heroe){
       heroe.setState(new Normal());
       System.out.println("Soy Bruce Wayne!");
   }
   
   @Override
   public void activarMurcielago(Heroe heroe){
       System.out.println("Ya estoy en modo murciélago!");
   }
   
   @Override
   public void combatir(Heroe heroe){
       heroe.setState(new Combatiendo());
       System.out.println("BAM! POW! BAM! POOOOOM!!!");
   }
   
   @Override
   public void defender(Heroe heroe){
       System.out.println("No porque no estoy combatiendo");
   }
   
   @Override
   public void hacerseMuertito(Heroe heroe){
       System.out.println("No me encuentro en peligro como para hacer tal cosa");
   }
   
   @Override
   public void suspender(Heroe heroe){
       heroe.setState(new Normal());
       System.out.println("Soy Bruce Wayne!");
   }
   
   @Override
   public void informacion(Heroe heroe){
       System.out.println("Modo vigilante activado! Hueeele a peliiiigro...");
   }

}

