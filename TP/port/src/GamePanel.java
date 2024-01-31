package src;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    final int originalTilesize = 32;
    int scale = 3;
    int tileSize = originalTilesize * scale;
    int maxScreenCol = 16;
    int maxScreenRow = 12;
    int screenWidth = tileSize * maxScreenCol;
    int screenHeight = tileSize * maxScreenRow;

    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.red);
        this.setDoubleBuffered(true);

    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        while (gameThread != null){


        }

    }


}
