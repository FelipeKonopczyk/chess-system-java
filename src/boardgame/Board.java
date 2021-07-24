package boardgame;

public class Board {
	
	int rows = 8;
	int columns = 8;
	private Piece[][] pieces;
	/**
	 * @param rows
	 * @param columns
	 */
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	

}
