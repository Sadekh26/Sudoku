import java.util.*;
import java.io.*;

public class SudokuBoard {
    private char[][] board;

    public SudokuBoard(String name) throws FileNotFoundException {
        board = new char[9][9];
        File file = new File(name);
        Scanner input = new Scanner(file);
        int r = 0;
        
        while (input.hasNextLine()) {
            String line = input.nextLine();
            for (int c = 0; c < 9; c++) {
                board[r][c] = line.charAt(c);
            }
            r++;
        }
    }

    public String toString() {
        String str = "";
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                str += board[r][c] + " ";
            }
            str += "\n";
        }
        return str;
    }
}