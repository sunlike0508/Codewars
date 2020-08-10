package codewar.com.StreetFighter;

public class StreetFighter {
	public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
		
		String[] result = new String[moves.length];
		
		for(int i = 0; i < moves.length; i++) {
			
			if("up".equals(moves[i])) {
				position[0] = 0;
			} else if("down".equals(moves[i])) {
				position[0] = 1;
			} else if("right".equals(moves[i])) {
				position[1] = (position[1] + 1) % fighters[0].length;
			} else {
				position[1] = (position[1] + 5) % fighters[0].length;
			}
			
			result[i] = fighters[position[0]][position[1]];
		}
		
		return result;
	}
}
