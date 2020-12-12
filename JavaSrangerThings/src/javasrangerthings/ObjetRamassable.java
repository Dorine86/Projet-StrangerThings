/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasrangerthings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author dorin
 */
public class ObjetRamassable extends ObjetSol{
    
    public ObjetRamassable( int idObjet, int proprietaire,  Localisation loc){
        super( idObjet,proprietaire, loc);
        
    }
    
  
    public void createObjetRamassableInDB() {
        try {
            Connection connexion = DriverManager.getConnection("jdbc:mysql://nemrod.ens2m.fr:3306/20202021_s1_vs1_tp2_strangerthings?serverTimezone=UTC", "strangerthings", "YTDTvj9TR3CDYCmP");

            PreparedStatement requete = connexion.prepareStatement("INSERT INTO objet VALUES (?,?,?,?,?,?,?,?,?,?)");
            requete.setString(1, "");
            requete.setString(2, "");
            requete.setDouble(3, 0.0);
            requete.setInt(4, this.getLocObjet().getSalle());
            requete.setInt(5, this.getLocObjet().getX());
            requete.setInt(6, this.getLocObjet().getY());
            requete.setBoolean(7, false);
            requete.setBoolean(8, false);
            requete.setBoolean(9, false);
            requete.setInt(10, this.getProprietaire());
            requete.executeUpdate();

            requete.close();
            connexion.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void updateObjetRamassableInDB(int idObjet) {
        try {
            Connection connexion = DriverManager.getConnection("jdbc:mysql://nemrod.ens2m.fr:3306/20202021_s1_vs1_tp2_strangerthings?serverTimezone=UTC", "strangerthings", "YTDTvj9TR3CDYCmP");

            PreparedStatement requete = connexion.prepareStatement("UPDATE objet SET description = ?, categorie = ?, effet = ?, salle = ?, x = ?, y = ?, ramassable = ?, visible = ?, actif = ?, joueur = ? WHERE id = ?");
            requete.setString(1, "");
            requete.setString(2, "");
            requete.setDouble(3, 0.0);
            requete.setInt(4, this.getLocObjet().getSalle());
            requete.setInt(5, this.getLocObjet().getX());
            requete.setInt(6, this.getLocObjet().getY());
            requete.setBoolean(7, false);
            requete.setBoolean(8, false);
            requete.setBoolean(9, false);
            requete.setInt(10, this.getProprietaire());
            requete.setInt(11, idObjet);
            requete.executeUpdate();

            requete.close();
            connexion.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void AjouteInventaire(Inventaire inv, Joueur joueur1){
      
        
    }
    
    public void actionAvecJoueur(ArrayList<Joueur> listeJoueur){
        
        for(Joueur joueur1: listeJoueur){
            
            if(this.getLocObjet().equals(joueur1.getLocJoueur())){
                joueur1.setPeutRamasserObjet(true);
                joueur1.setObjetSurMemeCase(this);
               
            }
        }
        
    }

    
   
    
 
    
    
}
