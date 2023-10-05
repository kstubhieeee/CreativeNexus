package pieces;

import main.Board;

import java.awt.image.BufferedImage;

public class Knight extends Piece {
    public Knight(Board board, int col, int row, boolean isWhite){
        super(board);
         this.col=col;
         this.row=row;
         this.xPos=col*board.tilesize;
         this.yPos=row*board.tilesize;

         this.isWhite=isWhite;
         this.name="Knight";

         this.sprite=sheet.getSubimage(3*sheetScale,isWhite?0:sheetScale,sheetScale,sheetScale).

    getScaledInstance(board.tilesize, board.tilesize, BufferedImage.SCALE_SMOOTH);

}
}
