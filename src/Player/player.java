package Player;

import javax.swing.JFrame;
import java.awt.*;

class background extends JFrame {

    public background() {
        setSize(800, 800);
        setVisible(true);
    }

    public void player() {
        player = new Rectangle(800 / 2, 800 / 2 , 20, 20);
    }

    public static void main(String[] args) {
        background t = new background();
    }

    public Rectangle player;
}