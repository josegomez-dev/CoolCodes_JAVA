
public class TestClone implements Cloneable{

	public String nombre;
	
	public TestClone(String pnombre) {
		nombre = pnombre;
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		TestClone t1 = new TestClone("Astro");
		
		TestClone t2 = (TestClone) t1.clone();
		
		System.out.println(t1.nombre);
		System.out.println(t2.nombre);
	}
	
	protected Object clone() throws CloneNotSupportedException {
        return super.clone();
	}

}
