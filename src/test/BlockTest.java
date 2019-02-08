package test;

import core.PublicServiceBlock;
import core.Tile;
import junit.framework.TestCase;

public class BlockTest extends TestCase {

	
	public void testCreateBlock() {

		Tile[][] map = new Tile[2][3];	
		
		PublicServiceBlock PSB = new PublicServiceBlock(100, 0, false, 800);
		
		assertTrue(PSB instanceof PublicServiceBlock);

		map [1][2] =  new Tile(1, 2, 3, PSB);
	
		assertTrue(map instanceof Tile[][] );

		assertNotNull(map[1][2]);	

		assertTrue(map[1][2] instanceof Tile );
		
		assertTrue(map[1][2].getBlock() instanceof PublicServiceBlock);

		assertEquals(3, map[1][2].getType());
	
	}

}
