package LogicLayer;

public class Combatiendo implements State {

    @Override
    public void disfrazarse(Heroe heroe){
       System.out.println("Ya estoy disfrazado!");
    }
    
    @Override
    public void quitarDisfraz(Heroe heroe){
        System.out.println("Ahora no por favor... Estoy combatiendo el crimen");
    }
    
    @Override
    public void activarMurcielago(Heroe heroe){
        System.out.println("Ya estoy en modo murciélago!");
    }
    
    @Override
    public void combatir(Heroe heroe){
        System.out.println("Ya estoy combatiendo, no me ves??");
    }
    
    @Override
    public void defender(Heroe heroe){
        heroe.setState(new Defendiendo());
        System.out.println("Bloqueo! Bloqueo! Bloqueo!");
    }
    
    @Override
    public void hacerseMuertito(Heroe heroe){
        System.out.println("Me hago el muertito de mentiras para que se vayan los malos");
    }
    
    @Override
    public void suspender(Heroe heroe){
        heroe.setState(new Vigilando());
        System.out.println("Modo vigilante activado! Hueeele a peliiiigro...");
    }
    
    @Override
    public void informacion(Heroe heroe){
        System.out.println("Estoy combatiendo");
    }

}

