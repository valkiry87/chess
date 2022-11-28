package chess;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Schachfigur auf Englisch");
        Scanner scanner1 = new Scanner(System.in);
        String figure = scanner1.nextLine();
        ChessFigur chessFigur = new ChessFigur();
        switch (figure){
            case "King":
                chessFigur = new King();
                break;
            case "Queen":
                chessFigur = new Queen();
                break;
            case "Rook":
                chessFigur = new Rook();
                break;
            case "Bishop":
                chessFigur = new Bishop();
                break;
            case "Knight":
                chessFigur = new Knight();
                break;
            case "Pawn":
                chessFigur = new Pawn();
                break;
            default:
                System.out.println("Es gibt keine " + figure + " als Figur.");
                System.exit(0);
        }
        System.out.println(chessFigur.getClass());

        System.out.println("Position");
        Scanner scanner2 = new Scanner(System.in);
        String position = scanner2.nextLine();
        List<Character> positionChars = convertToChar(position);
        ChessBoard chessBoard = new ChessBoard();
        char[][] positionChar = chessBoard.getChessBoardPosition(positionChars.get(0), positionChars.get(1));
        System.out.println(positionChar);
    }

    public static List<Character> convertToChar(String word)
    {
        List<Character> chars = new ArrayList<>();
        for (char ch : word.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }
}
