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
public class SilexInventaire extends ObjetInventaire{
    public SilexInventaire(int id, int proprietaire){
        super(id, proprietaire);
    }
    
     public void estRamasse(Joueur j){
        SilexInventaire silex= new SilexInventaire(256,j.getIdJoueur());
        j.getInventaire().getObjetJoueur().add(silex);
        
    }
     
     
}

