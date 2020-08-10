package codewar.com.SecretDetective;

import java.util.HashMap;
import java.util.HashSet;

public class SecretDetective {
	public String recoverSecret(char[][] triplets) {
		StringBuilder builder = new StringBuilder();
		HashMap<Character, HashSet<Character>> map = buildEdgeMap(triplets);

		while (!map.isEmpty()) {
			char last = findLast(map);
			builder.insert(0, last);
			remove(map, last);
		}

		return builder.toString();
	}
	
	private static HashMap<Character, HashSet<Character>> buildEdgeMap(char[][] triplets) {
		HashMap<Character, HashSet<Character>> map = new HashMap<>();
		
		for (char[] cs : triplets) {
			for (char c : cs) {
				if (!map.containsKey(c)) {
					map.put(c, new HashSet<>());
				}
			}
			map.get(cs[0]).add(cs[1]);
			map.get(cs[1]).add(cs[2]);
		}
		
		return map;
	}

	private static char findLast(HashMap<Character, HashSet<Character>> map) {
		
		char getKey = 0;
		
		for (HashMap.Entry<Character, HashSet<Character>> entry : map.entrySet()) {
			if (entry.getValue().isEmpty()) {
				getKey = entry.getKey();
				break;
			}
		}

		return getKey;
	}

	private static void remove(HashMap<Character, HashSet<Character>> map, Character c) {
		map.remove(c);
		
		for (HashSet<Character> cs : map.values()) {
			cs.remove(c);
		}
	}
}
