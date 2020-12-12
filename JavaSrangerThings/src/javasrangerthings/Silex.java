/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasrangerthings;

import java.awt.Graphics2D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author dorin
 */
public class Silex extends ObjetRamassable{
  
    public Silex(int idObjet, int proprietaire,  Localisation loc){
        super(idObjet, proprietaire, loc);
        
        try {
            sprite = ImageIO.read(getClass().getResource("../resources/Silex.png"));
        } catch (IOException ex) {
            Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void AjouteInventaire(Inventaire inv, Joueur joueur1){
       inv.ajouterSilex(this, joueur1);
        
    }
    
    public void rendu(Graphics2D contexte){
         contexte.drawImage(sprite, locObjet.getX(), locObjet.getY(), null);
    }
    
    
}
    
