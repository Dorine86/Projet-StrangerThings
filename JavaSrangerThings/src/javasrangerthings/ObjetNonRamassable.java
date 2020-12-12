/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasrangerthings;

import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author dorin
 */
public class ObjetNonRamassable extends ObjetSol {
    // en attribut : dommage, reduction de vitesse, imobilisation, reduction vision...
    
    
    public ObjetNonRamassable( int idObjet, int proprietaire,  Localisation locObjet){
        super( idObjet,  proprietaire,  locObjet);
        
    }
    
    public void createObjetDeclenchableInDB() {
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
    
    public void updateObjetDeclenchableInDB(int idObjet) {
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


//    public void miseAJourObjet(ArrayList<Personnage> listePerso, ArrayList<ObjetSol> objASupprimer){
//        
//       
//        for(Personnage pers:listePerso){
//            if (pers.getLocPerso().equals(this.getLocObjet())){
//                    this.declencher(pers);
//                    objASupprimer.add(this);
//                    System.out.println(objASupprimer);
//                    System.out.println("ok");
//            }    
//        }
//    }
//    
//    public void declencher(Personnage pers){
//        
//    }
    
    public void actionAvecJoueur(ArrayList<Joueur> listeJoueur ){
        
    }
    
    public boolean actionPossible(){
        return(true);
    }
}
