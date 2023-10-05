package pieces;

import main.Board;

import java.awt.image.BufferedImage;

public class Knight extends Piece {
    public Knight(Board board, int col, int row, boolean isWhite){
        super(board);
         this.col=col;
    this.row=row;
         this.xPos=col*board.tileSize;
         this.yPos=row*board.tileSize;

         this.isWhite=isWhite;
         this.name="Knight";

         this.sprite=sheet.getSubImage(3*sheetScale,isWhite?0:sheetScale,sheetScale,sheetScale).

    getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH);

}
}