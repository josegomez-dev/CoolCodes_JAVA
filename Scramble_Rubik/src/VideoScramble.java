import java.util.Random;

public class VideoScramble {

	Random r = new Random(System.currentTimeMillis());
	
	String[] moves = {"Rx", "Lx", "Uy", "Dy", "Fz", "Bz"};
	String[] directions = {" ", "' ", "2 "};
	
	public static void main(String...ereurueru){
		
		VideoScramble kkk = new VideoScramble();
		
		kkk.getScramble();
		
	}
	
	public void getScramble(){
		String scramble = "";
		
		String move1 = "  ";
		String move2 = "  ";
		
		String direction = "";
		
		for(int i = 0; i < 25; i++){
			String currentMove = getMove(move1, move2);
			
			direction = directions[r.nextInt(directions.length)];
			
			scramble += currentMove.charAt(0) + direction;
			
			move1 = move2;
			move2 = currentMove;
		}

		System.out.println(scramble);
	}
	
	public String getMove(String m1, String m2){
		String move = moves[r.nextInt(moves.length)];
		
		if(m2 == move || mesmoEixo(m1, m2, move) == true){
			return getMove(m1, m2);
		}
		
		return move;
	}
	
	public boolean mesmoEixo(String m1, String m2, String m3){
		if(m2.charAt(1) == m1.charAt(1) && m2.charAt(1) == m3.charAt(1)){
			return true;
		}
		return false;
	}
}
