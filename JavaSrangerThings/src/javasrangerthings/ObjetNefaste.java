/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasrangerthings;

import java.util.ArrayList;

/**
 *
 * @author dorin
 */
public class ObjetNefaste extends ObjetNonRamassable{
    public ObjetNefaste( int idObjet, int proprietaire,  Localisation locObjet){
        super(idObjet, proprietaire, locObjet);
        
    }
    
    public void actionAvecJoueur(ArrayList<Joueur> listeJoueur){
        
        
    }
    
    public boolean ifActionPossible(){
        return(true);
    }
    
}
