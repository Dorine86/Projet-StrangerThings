/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasrangerthings;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author dorin
 */
public class Carte {
    private int largeur = 8;
    private int hauteur = 8;
    private int tailleTuile = 32;
    
    private BufferedImage[] listeTuile;
    private int[][] decor = {
{ 165, 150, 150, 150, 150, 165, 165, 165 },
{ 165, 150, 165, 165, 150, 165, 150, 165 },
{ 165, 150, 165, 150, 150, 165, 150, 165 },
{ 165, 150, 165, 150, 150, 165, 150, 165 },
{ 165, 150, 165, 150, 150, 165, 150, 150 },
{ 165, 165, 165, 165, 165, 165, 165, 150 },
{ 165, 150, 150, 150, 150, 150, 165, 165 },
{ 165, 165, 165, 150, 150, 150, 150, 165 }};


    public Carte() {
        listeTuile = new BufferedImage [176];

        try {
            BufferedImage tileset = ImageIO.read(getClass().getResource("../resources/tileSetMinecraft32x32.png"));
            for (int i =0; i < listeTuile.length ; i ++) {
                int x = (i%16)*tailleTuile ;
                int y = (i/16)*tailleTuile ;
                listeTuile[i] = tileset.getSubimage (x , y , tailleTuile , tailleTuile );
            }  
        } catch (IOException ex) {
            Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void miseAJour() {
    }

    public void rendu(Graphics2D contexte) {
        for(int i=0; i<largeur; i++){
            for(int j=0; j<hauteur; j++){
                contexte.drawImage(listeTuile[decor[j][i]], i*tailleTuile, j*tailleTuile, null);
            }
        }
    }
}
