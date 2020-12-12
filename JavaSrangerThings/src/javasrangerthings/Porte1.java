/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasrangerthings;

import java.awt.Graphics2D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author dorin
 */
public class Porte1 extends ObjetNonRamassable{
    public static boolean peutEtreSupprime;
    
    public Porte1( int idObjet, int proprietaire,  Localisation locObjet){
        super(idObjet, proprietaire, locObjet);
        try {
            sprite = ImageIO.read(getClass().getResource("../resources/Porte1.png"));
        } catch (IOException ex) {
            Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.peutEtreSupprime=false;
        
    }
    public void rendu(Graphics2D contexte){
         contexte.drawImage(sprite, locObjet.getX(), locObjet.getY(), null);
    }

    public static boolean isPeutEtreSupprime() {
        return peutEtreSupprime;
    }

    public static void setPeutEtreSupprime(boolean peutEtreSupprime) {
        Porte1.peutEtreSupprime = peutEtreSupprime;
    }

    public Localisation getLocObjet() {
        return locObjet;
    }

    public void setLocObjet(Localisation locObjet) {
        this.locObjet = locObjet;
    }
    
   
    
    
    public boolean ifActionPossible(Joueur joueur){
        peutEtreSupprime=false;
        if(joueur.getLocJoueur().joeurACote(this.getLocObjet())){
            for(int i=0; i<joueur.getInventaire().getObjetJoueur().size();i++){
                if((joueur.getInventaire().getObjetJoueur().get(i)) instanceof BriquetInventaire){
                    peutEtreSupprime=true;
                    
                }
                
            }
        
        }
        return(peutEtreSupprime);
        
    }
    
    public void actionAvecJoueur(ArrayList<Joueur> listeJoueur){
        for(Joueur joueur1: listeJoueur){
            if(this.locObjet.joeurACote(joueur1.getLocJoueur())){
                joueur1.setPorteACote(this);
            }
        }
        
    }
//    public void miseAJourPiege(){
//        
//        
//    }
    
}
