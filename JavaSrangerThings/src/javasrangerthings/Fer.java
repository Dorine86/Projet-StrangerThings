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
public class Fer extends ObjetRamassable{
  
    public Fer(int idObjet, int proprietaire,  Localisation loc){
        super(idObjet, proprietaire, loc);
        try {
            sprite = ImageIO.read(getClass().getResource("../resources/Fer.png"));
        } catch (IOException ex) {
            Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
        public void rendu(Graphics2D contexte) {
        contexte.drawImage(this.sprite, this.locObjet.getX(), this.locObjet.getY(), null);
    }
        
    public void AjouteInventaire(Inventaire inv, Joueur joueur1){
       inv.ajouterFer(this, joueur1);
        
    }
    
    
}
