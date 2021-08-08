package chess.piece;

import boardgame.Board;
import chess.ChessPiece;
import chess.Colour;

public class King extends ChessPiece{

	public King(Board board, Colour colour) {
		super(board, colour);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "K";
	}
	
}
