package LogicLayer;


public class Disfrazado implements State {

   @Override
   public void disfrazarse(Heroe heroe){
      System.out.println("Soy Batman!");
   }
   
   @Override
   public void quitarDisfraz(Heroe heroe){
       heroe.setState(new Normal());
       System.out.println("Soy Bruce Wayne!");
   }
   
   @Override
   public void activarMurcielago(Heroe heroe){
       heroe.setState(new Vigilando());
       System.out.println("Modo vigilante activado! Hueeele a peliiiigro...");
   }
   
   @Override
   public void combatir(Heroe heroe){
       heroe.setState(new Combatiendo());
       System.out.println("BAM! POW! BAM! POOOOOM!!!");
   }
   
   @Override
   public void defender(Heroe heroe){
       heroe.setState(new Defendiendo());
       System.out.println("Esquivando mecos a lo matrix! whoooooshhh");
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
       System.out.println("Estoy disfrazado!");
   }

}

