package LogicLayer;



public class Muertito implements State {

   @Override
   public void disfrazarse(Heroe heroe){
      System.out.println("Ya estoy disfrazado y muerto!");
   }
   
   @Override
   public void quitarDisfraz(Heroe heroe){
       System.out.println("No porque me descubren y me matan");
   }
   
   @Override
   public void activarMurcielago(Heroe heroe){
       System.out.println("Ya esta activado y estoy muerto");
   }
   
   @Override
   public void combatir(Heroe heroe){
       System.out.println("Ahora no, hasta que se vayan todos");
   }
   
   @Override
   public void defender(Heroe heroe){
       System.out.println("Ahora no, hasta que se vayan todos");
   }
   
   @Override
   public void hacerseMuertito(Heroe heroe){
       System.out.println("Ya estoy muerto!");
   }
   
   @Override
   public void suspender(Heroe heroe){
       heroe.setState(new Vigilando());
       System.out.println("Modo vigilante activado! Hueeele a peliiiigro...");
   }
   
   @Override
   public void informacion(Heroe heroe){
       System.out.println("Me estoy haciendo el muertito, shhhh!!");
   }
}

