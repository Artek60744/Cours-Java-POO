package src;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Map extends JFrame {

    public Map() {
        setTitle("Ma Fenêtre");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MapPanel mapPanel = new MapPanel();
        add(mapPanel);

        setVisible(true);
    }
}

class MapPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dessiner votre carte ici
        // Par exemple : g.drawRect(50, 50, 100, 100);
    }
}

