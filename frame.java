import java.io.*;
import javax.swing.*;
import java.awt.*;

public class frame {
    static final int window_width = 900;
    static final int window_height = 800;
    static final int squareSize = 100;
    public static void main(String[] args) {
        JFrame frame = new JFrame("ChessML");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(window_width, window_height);
        frame.setVisible(true);
        frame.add(panel());
        frame.show();
    }   
    public static JPanel panel() {
        System.out.println("working: 1");
        JPanel chessBoard = new JPanel();
        chessBoard.setLayout(new GridLayout(8, 8));
        chessBoard.setBounds(0, 0, squareSize * 8, squareSize * 8);
        boolean isWhite = true;
        int n = 1;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel square = new JPanel();
                if (isWhite) {
                    square.setBackground(Color.WHITE);
                } else {
                    square.setBackground(Color.BLACK);
                }
                chessBoard.add(square);
                isWhite = !isWhite;
                System.out.println("working:" + n);
                n++;
            }
            isWhite = !isWhite;
        };
        return chessBoard;
    }         
}