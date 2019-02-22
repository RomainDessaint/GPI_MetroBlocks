package test;

import core.Tile;
import junit.framework.TestCase;

public class MapTest extends TestCase {

	
	
	
	public void testCreateBoard() {

		Tile[][] board = new Tile[2][3];	
		
		board[1][2] = new Tile(1, 2, 0,null);

		assertTrue(board instanceof Tile[][] );

		assertNotNull(board[1][2]);	

		assertNull(board[1][2].getBlock());	

		assertTrue(board[1][2] instanceof Tile );

		assertEquals(1, board[1][2].getCoordinateX());

		assertSame(2, board[1][2].getCoordinateY());
		
	}

	

}
