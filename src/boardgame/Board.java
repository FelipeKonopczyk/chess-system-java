package boardgame;

public class Board {
	
	int rows;
	int columns;
	private Piece[][] pieces;
	/**
	 * @param rows
	 * @param columns
	 */
	public Board(int rows, int columns) {
		if(rows<1||columns<1) {
			throw new BoardException("There must be at least one row and one column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	public int getRows() {
		return rows;
	}
	public int getColumns() {
		return columns;
	}
	public Piece piece(int row, int column) {
		if(!positionExists(row,column)) {
			throw new BoardException("Piece doesnt exist!");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position doesnt exist!");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
			if(thereIsAPiece(position)) {
				throw new BoardException("There's already a piece in this position");
			}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public boolean positionExists(int row, int column) {
		return row<rows && row>=0 && column >=0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position doesnt exist!");
		}
		return piece(position) != null;
	}
	
	
}
