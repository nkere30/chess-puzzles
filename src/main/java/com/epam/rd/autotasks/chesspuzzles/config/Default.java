package com.epam.rd.autotasks.chesspuzzles.config;

import com.epam.rd.autotasks.chesspuzzles.Cell;
import com.epam.rd.autotasks.chesspuzzles.ChessBoardImpl;
import com.epam.rd.autotasks.chesspuzzles.ChessPiece;
import com.epam.rd.autotasks.chesspuzzles.ChessPieceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

@Configuration
public class Default {

    public Collection<ChessPiece> addPieces() {
        Collection<ChessPiece> pieces = new ArrayList<>();
        String filePath = "src/test/resources/boards/Default.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            for (int i = 0; i < line.length(); i++) {
                for (int row = 'A'; row < 'H'; row++) {
                    for (int col = 1; col < 8; col++) {
                        pieces.add(new ChessPieceImpl(line.charAt(i), Cell.cell((char)row, col) ));
                    }
                }
            }
        } catch (IOException e) {

        }
        return pieces;
    }
    @Bean
    public ChessBoardImpl chessBoard() {
        return new ChessBoardImpl(addPieces());
    }
}
