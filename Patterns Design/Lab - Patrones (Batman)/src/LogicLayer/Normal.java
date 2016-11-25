package LogicLayer;

public class Normal implements State {

    @Override
    public void disfrazarse(Heroe heroe){
       heroe.setState(new Disfrazado());
       System.out.println("Soy Batman!");
    }
    
    @Override
    public void quitarDisfraz(Heroe heroe){
        System.out.println("Qué me voy a quitar si no estoy disfrazado?");
    }
    
    @Override
    public void activarMurcielago(Heroe heroe){
        System.out.println("Bruce Wayne no es ningún murciélago!");
    }
    
    @Override
    public void combatir(Heroe heroe){
        System.out.println("Bruce Wayne no pelea!");
    }
    
    @Override
    public void defender(Heroe heroe){
        System.out.println("Bruce Wayne no se defiende!");
    }
    
    @Override
    public void hacerseMuertito(Heroe heroe){
        System.out.println("Para qué voy a hacer eso si no estoy en peligro?");
    }
    
    @Override
    public void suspender(Heroe heroe){
        System.out.println("No hay nada que suspender");
    }
    
    @Override
    public void informacion(Heroe heroe){
        System.out.println("Soy Bruce Wayne!");
    }
}

