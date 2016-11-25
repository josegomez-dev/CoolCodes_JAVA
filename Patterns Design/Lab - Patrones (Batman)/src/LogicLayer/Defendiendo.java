package LogicLayer;



public class Defendiendo implements State {

   @Override
   public void disfrazarse(Heroe heroe){
      System.out.println("Ya estoy disfrazado!");
   }
   
   @Override
   public void quitarDisfraz(Heroe heroe){
       System.out.println("Ahora no que me estoy defendiendo!");
   }
   
   @Override
   public void activarMurcielago(Heroe heroe){
       System.out.println("Ya estoy en modo murciélago!");
   }
   
   @Override
   public void combatir(Heroe heroe){
       System.out.println("No porque me pegan más...");
   }
   
   @Override
   public void defender(Heroe heroe){
       System.out.println("Ya me estoy defendiendo");
   }
   
   @Override
   public void hacerseMuertito(Heroe heroe){
       heroe.setState(new Muertito());
       System.out.println("Me hago el muertito de mentiras para que se vayan los malos");
   }
   
   @Override
   public void suspender(Heroe heroe){
       System.out.println("Ahora no puedo vigilar que me estan pegando!");
   }
   
   @Override
   public void informacion(Heroe heroe){
       System.out.println("Me estoy defendiendo!");
   }
}

