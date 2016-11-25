package LogicLayer; 

public class Heroe {
	
	private String name;
	private String nickName;
	private State state;
	
	public Heroe(){
		setName("Bruce Wayne");
		setNickName("Batman");
		setState(new Normal());
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
     public void disfrazarse(){
    	 state.disfrazarse(this);
     }
     public void quitarDisfraz(){
    	 state.quitarDisfraz(this);
     }
     public void activarMurcielago(){
    	 state.activarMurcielago(this);
     }
     public void  combatir(){
    	 state.combatir(this);
     }
     public void  defender(){
    	 state.defender(this);
     }
     public void  hacerseMuertito(){
    	 state.hacerseMuertito(this);
     }
     public void  suspender(){
    	 state.suspender(this);
     }
     public void  informacion(){
    	 state.informacion(this);
     }
}
