package src;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

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

    private Image image;

    public MapPanel() {
        // Charger l'image depuis le fichier (assurez-vous d'ajuster le chemin du fichier)
        ImageIcon imageIcon = new ImageIcon("port/ressources/pack2/beach_sand_woa2_0.png");
        image = imageIcon.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dessiner l'image
        g.drawImage(image, 0, 0, this);  // Affichez l'image à la position (0, 0)

        // Dessiner votre carte ici
        // Par exemple : g.drawRect(50, 50, 100, 100);
    }
}

