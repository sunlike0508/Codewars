package codewar.com.Dubstep;

import java.util.ArrayList;
import java.util.List;

public class Dubstep {
	public static String SongDecoder(String song) {
		String[] songSplit = song.split("WUB");
		List<String> excludNullSongSplit = new ArrayList<String>();
		
		for(String split : songSplit) {
			if(!"".equals(split)) {
				excludNullSongSplit.add(split);
			}
		}
		
		return String.join(" ", excludNullSongSplit);
		
		//return song.replaceAll("(WUB)+", " ").trim();
	}
}
