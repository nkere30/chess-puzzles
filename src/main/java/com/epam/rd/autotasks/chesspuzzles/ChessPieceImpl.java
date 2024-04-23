package com.epam.rd.autotasks.chesspuzzles;

public class ChessPieceImpl implements ChessPiece{
    private final char piece;
    private final Cell cell;

    public ChessPieceImpl(char piece, Cell cell) {
        this.piece = piece;
        this.cell = cell;
    }

    @Override
    public Cell getCell() {
        return cell;
    }

    @Override
    public char toChar() {
        return piece;
    }
}
