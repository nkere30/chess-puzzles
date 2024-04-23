package com.epam.rd.autotasks.chesspuzzles;

import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class ChessBoardImpl implements ChessBoard{
    private final Collection<ChessPiece> pieces;
    public ChessBoardImpl(Collection<ChessPiece> pieces) {
        this.pieces = pieces;
    }
    @Override
    public String state() {
        StringBuilder sb = new StringBuilder();
        for (ChessPiece piece : pieces) {
            sb.append(piece.getCell());
            System.out.println(piece.toChar());
        }
        pieces.forEach(System.out::println);
        return sb.toString();
    }
}
