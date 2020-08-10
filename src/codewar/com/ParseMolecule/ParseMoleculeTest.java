package codewar.com.ParseMolecule;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Map;

import org.hamcrest.core.IsAnything;
import org.hamcrest.core.IsCollectionContaining;
import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ParseMoleculeTest {
	@Disabled
	@Test
	public void testMolecule() {
		Map<String, Integer> exp = ParseMolecule.getAtoms("H2O");
		assertThat(exp.get("H"), is(2));
		assertThat(exp.get("O"), is(1));
	}
	@Disabled
	@Test
	public void testMolecule2() {
		Map<String, Integer> exp = ParseMolecule.getAtoms("Mg(OH)2");
		assertThat(exp.get("Mg"), is(1));
		assertThat(exp.get("H"), is(2));
		assertThat(exp.get("O"), is(2));
	}
	
	@Test
	public void testMolecule3() {
		Map<String, Integer> exp = ParseMolecule.getAtoms("K4[ON(SO3)2]2");
		assertThat(exp.get("K"), is(4));
		assertThat(exp.get("O"), is(14));
		assertThat(exp.get("N"), is(2));
		assertThat(exp.get("S"), is(4));
	}

}
