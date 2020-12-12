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

/**
 *
 * @author dorin
 */
public class Objet {
    protected int idObjet;
    private int proprietaire;
    

    
    public Objet(int idObjet, int proprietaire) {
        this.idObjet = idObjet;
        this.proprietaire = proprietaire;
        
    }

   


    public int getIdObjet() {
        return idObjet;
    }

    public void setIdObjet(int idObjet) {
        this.idObjet = idObjet;
    }

    public int getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(int proprietaire) {
        this.proprietaire = proprietaire;
    }

  
    
   //____________________________________________________________________________________________

       public void createObjetInDB() {
        try {
            Connection connexion = DriverManager.getConnection("jdbc:mysql://nemrod.ens2m.fr:3306/20202021_s1_vs1_tp2_strangerthings?serverTimezone=UTC", "strangerthings", "YTDTvj9TR3CDYCmP");

            PreparedStatement requete = connexion.prepareStatement("INSERT INTO objet VALUES (?,?,?,?,?,?,?,?,?,?)");
            requete.setString(1, "");
            requete.setString(2, "");
            requete.setDouble(3, 0.0);
            requete.setInt(4, 0);
            requete.setInt(5, 0);
            requete.setInt(6, 0);
            requete.setBoolean(7, false);
            requete.setBoolean(8, false);
            requete.setBoolean(9, false);
            requete.setInt(10, this.proprietaire);
            requete.executeUpdate();

            requete.close();
            connexion.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void updateObjetInDB(int idObjet) {
        try {
            Connection connexion = DriverManager.getConnection("jdbc:mysql://nemrod.ens2m.fr:3306/20202021_s1_vs1_tp2_strangerthings?serverTimezone=UTC", "strangerthings", "YTDTvj9TR3CDYCmP");

            PreparedStatement requete = connexion.prepareStatement("UPDATE objet SET description = ?, categorie = ?, \"UPDATE objet SET description = ?, categorie = ?, effet = ?, salle = ?, x = ?, y = ?, ramassable = ?, visible = ?, actif = ?, joueur = ? WHERE id = ?\" salle = ?, x = ?, y = ?, ramassable = ?, visible = ?, actif = ?, joueur = ? WHERE id = ?");
            requete.setString(1, "");
            requete.setString(2, "");
            requete.setDouble(3, 0.0);
            requete.setInt(4, 0);
            requete.setInt(5, 0);
            requete.setInt(6, 0);
            requete.setBoolean(7, false);
            requete.setBoolean(8, false);
            requete.setBoolean(9, false);
            requete.setInt(10, this.proprietaire);
            requete.setInt(11, idObjet);
            requete.executeUpdate();

            requete.close();
            connexion.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
}
