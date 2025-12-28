import java.awt.*;
import javax.swing.*;

public class frame {
    static final int SQUARESIZE = 100;
    static final int WINDOW_WIDTH = SQUARESIZE * 10;
    static final int WINDOW_HEIGHT = (SQUARESIZE * 8)+39;
    
    public static void main(String[] args) {
        // frame.setIconImage(Toolkit.getDefaultToolkit().getImage("imgs\chess-icon.png"));
        JFrame frame = new JFrame("ChessML");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Image iconImg = Toolkit.getDefaultToolkit().getImage("imgs/chess-icon.png");
        frame.setIconImage(iconImg);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(chessboard());
        frame.add(graveBackground());
        frame.show();
    }   

    public static JPanel chessboard() {
        JPanel chessBoard = new JPanel();
        chessBoard.setLayout(new GridLayout(8, 8));
        chessBoard.setBounds(0, 0, SQUARESIZE * 8, SQUARESIZE * 8);
        boolean isWhite = true;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel square = new JPanel();
                if (isWhite) {
                    square.setBackground(new Color(126, 74, 59));
                } else {
                    square.setBackground(new Color(85, 51, 49));
                }
                chessBoard.add(square);
                isWhite = !isWhite;
            }
            isWhite = !isWhite;
        }
        return chessBoard;
    }       
    public static JPanel graveBackground(){
        JPanel grave = new JPanel();
        grave.setBounds(SQUARESIZE*8, 0, SQUARESIZE*2, SQUARESIZE*8);
        grave.setBackground(new Color(128, 90, 60));
        return grave;
    }
}