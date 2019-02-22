package test;

import core.PublicServiceBlock;
import core.Station;
import core.Tile;
import junit.framework.TestCase;

public class StationTest extends TestCase {

	public void testCreateStation() {

		Tile[][] map = new Tile[2][3];	
		
		PublicServiceBlock PSB = new PublicServiceBlock(100, 0, false,null, 800);
		
		map [1][2] =  new Tile(1, 2, 3, PSB);

		assertNull(map[1][2].getBlock().getStation());
		
		assertEquals(false, map[1][2].getBlock().isHaveStation() );
		
		Station S = new Station ("okok", 200);
		
		PSB.setStation(S);
		
		map[1][2].getBlock().setHaveStation(true);	
		
		assertTrue(S instanceof Station);

		assertNotNull(map[1][2].getBlock().getStation());	
		
	    assertEquals(S, map[1][2].getBlock().getStation() );
		
    	assertEquals(true, map[1][2].getBlock().isHaveStation() );


		
		
		

		
	}

}
