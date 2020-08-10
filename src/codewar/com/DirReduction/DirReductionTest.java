package codewar.com.DirReduction;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class DirReductionTest {

	@Test
	public void Tests() {
        assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
                new String[]{"WEST"},
                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
		assertArrayEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"", new String[] {},
				DirReduction.dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH" }));
		assertArrayEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\",\"NORTH\"",
				new String[] { "NORTH" },
				DirReduction.dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "NORTH" }));
		assertArrayEquals(
				"\"EAST\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\", \"EAST\", \"EAST\", \"SOUTH\", \"NORTH\", \"WEST\"",
				new String[] { "EAST", "NORTH" }, DirReduction.dirReduc(new String[] { "EAST", "EAST", "WEST", "NORTH",
						"WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST" }));
		assertArrayEquals(
				"\"NORTH\", \"EAST\", \"NORTH\", \"EAST\", \"WEST\", \"WEST\", \"EAST\", \"EAST\", \"WEST\", \"SOUTH\"",
				new String[] { "NORTH", "EAST" }, DirReduction.dirReduc(new String[] { "NORTH", "EAST", "NORTH", "EAST",
						"WEST", "WEST", "EAST", "EAST", "WEST", "SOUTH" }));
		assertArrayEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"", new String[] { "NORTH", "WEST", "SOUTH", "EAST" },
				DirReduction.dirReduc(new String[] { "NORTH", "WEST", "SOUTH", "EAST" }));
	}
}
