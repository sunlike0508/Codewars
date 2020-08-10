package codewar.com.FileNameExtractor;

public class FileNameExtractor {
	
	private static final String DATE = "^\\d*_";
	private static final String END = "\\.\\w*$";

	public static String extractFileName(String dirtyFileName) {
			
		return dirtyFileName.replaceAll(DATE, "").replaceAll(END, "");
	}
}
