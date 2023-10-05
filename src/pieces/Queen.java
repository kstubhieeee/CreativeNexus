package pieces;

import main.Board;

import java.awt.image.BufferedImage;

public class Queen extends Piece {
    public Queen(Board board, int col, int row, boolean isWhite){
        super(board);
         this.col=col;
         this.row=row;
         this.xPos=col*board.tilesize;
         this.yPos=row*board.tilesize;

         this.isWhite=isWhite;
         this.name="Queen";

         this.sprite=sheet.getSubimage(1*sheetScale,isWhite?0:sheetScale,sheetScale,sheetScale).

    getScaledInstance(board.tilesize, board.tilesize, BufferedImage.SCALE_SMOOTH);

}
}
