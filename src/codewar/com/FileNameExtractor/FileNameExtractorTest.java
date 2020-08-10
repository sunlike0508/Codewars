package codewar.com.FileNameExtractor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FileNameExtractorTest {

	@Test
	public void testSample() {
		assertEquals("FILE_NAME.EXTENSION",
				FileNameExtractor.extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34"));
	}
	
	@Test
	public void testSample2() {
		assertEquals("FILE_NAME.EXTENSION",
				FileNameExtractor.extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION"));
	}

	@Test
	public void testSample3() {
		assertEquals("This_is_an_otherExample.mpg",
				FileNameExtractor.extractFileName("1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34"));
	}
}
