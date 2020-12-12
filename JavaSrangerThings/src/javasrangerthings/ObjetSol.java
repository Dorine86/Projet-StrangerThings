/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasrangerthings;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author dorin
 */
public class ObjetSol extends Objet {
   protected Localisation locObjet;
   protected BufferedImage sprite;
    
    public ObjetSol( int idObjet, int proprietaire, Localisation loc){
        super( idObjet,  proprietaire);
        locObjet=loc;
    }


    
    public boolean ifActionPossible(Joueur joueur){    
        return true;
    }
    
    
    public Localisation getLocObjet() {
        return locObjet;
    }

    public void setLocObjet(Localisation locObjet) {
        this.locObjet = locObjet;
    }


    
 public void createObjetSolInDB() {
        try {
            Connection connexion = DriverManager.getConnection("jdbc:mysql://nemrod.ens2m.fr:3306/20202021_s1_vs1_tp2_strangerthings?serverTimezone=UTC", "strangerthings", "YTDTvj9TR3CDYCmP");

            PreparedStatement requete = connexion.prepareStatement("INSERT INTO objet VALUES (?,?,?,?,?,?,?,?,?,?)");
            requete.setString(1, "");
            requete.setString(2, "");
            requete.setDouble(3, 0.0);
            requete.setInt(4, this.locObjet.getSalle());
            requete.setInt(5, this.locObjet.getX());
            requete.setInt(6, this.locObjet.getY());
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
    
    public void updateObjetSolInDB(int idObjet) {
        try {
            Connection connexion = DriverManager.getConnection("jdbc:mysql://nemrod.ens2m.fr:3306/20202021_s1_vs1_tp2_strangerthings?serverTimezone=UTC", "strangerthings", "YTDTvj9TR3CDYCmP");

            PreparedStatement requete = connexion.prepareStatement("UPDATE objet SET description = ?, categorie = ?, effet = ?, salle = ?, x = ?, y = ?, ramassable = ?, visible = ?, actif = ?, joueur = ? WHERE id = ?");
            requete.setString(1, "");
            requete.setString(2, "");
            requete.setDouble(3, 0.0);
            requete.setInt(4, this.locObjet.getSalle());
            requete.setInt(5, this.locObjet.getX());
            requete.setInt(6, this.locObjet.getY());
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
    
    public void miseAjourObjetSol(){
        
    }
    public void actionAvecJoueur(ArrayList<Joueur> listejoueur){
        
        
    }
        
    public void AjouteInventaire(Inventaire inv, Joueur joueur1){
       
        
    }
    
    
    
    
    
    
    public void rendu(Graphics2D contexte){
         contexte.drawImage(sprite, locObjet.getX(), locObjet.getY(), null);
    }
    

    
    
}
