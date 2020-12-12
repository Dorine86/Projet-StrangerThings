package javasrangerthings;

import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author moi
 */
public class Inventaire {
    
    private BufferedImage sprite;
    private ArrayList<ObjetInventaire> objetJoueur;
    
    public Inventaire(){
        
        this.objetJoueur = new ArrayList();
        
    }

  

    public BufferedImage getSprite() {
        return sprite;
    }



    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
    }

    public ArrayList<ObjetInventaire> getObjetJoueur() {
        return objetJoueur;
    }

    public void setObjetJoueur(ArrayList<ObjetInventaire> objetJoueur) {
        this.objetJoueur = objetJoueur;
    }
    
    
    public ArrayList<ObjetInventaire> getInventaireFromDB() {
        try {
            Connection connexion = DriverManager.getConnection("jdbc:mysql://nemrod.ens2m.fr:3306/20202021_s1_vs1_tp2_strangerthings?serverTimezone=UTC", "strangerthings", "YTDTvj9TR3CDYCmP");

            PreparedStatement requete = connexion.prepareStatement("SELECT categorie FROM OBJET WHERE joueur = ?");
//            requete.setInt(1, this.proprietaire);
            ResultSet resultat = requete.executeQuery();
            while (resultat.next()) {
                String categorie = resultat.getString("categorie");
                //this.objetJoueur.add(categorie);
            }

            requete.close();
            connexion.close();

        } catch (SQLException ex) {
        }
        return this.objetJoueur;
    }
    public void ajouter(ObjetInventaire obj){
        objetJoueur.add(obj);
    }
    
//    public void suppressionMemeId(int idASup){
//        //boolean permet de supprimer un seul objet avec cet id et non tous les objets avec cet id
//        boolean dejaSup=false;
//        for(int i=0;i< this.objetJoueur.size(); i++){
//            if(!dejaSup){
//                if(this.objetJoueur.get(i).getIdObjet()==idASup){
//                    dejaSup=true;
//                    this.objetJoueur.remove(i);
//                }
//               
//            }
//
//        }
//    }
    
    public boolean estPasVide(){
        return(!this.objetJoueur.isEmpty());
    }
    public void suppressionSilexInventaire(){
         for(ObjetInventaire obj: objetJoueur){
             if(obj instanceof SilexInventaire){
                 this.objetJoueur.remove(obj);
             }
             
         }
     }
    
    public void suppressionFerInventaire(){
         for(ObjetInventaire obj: objetJoueur){
             if(obj instanceof FerInventaire){
                 this.objetJoueur.remove(obj);
             }
             
         }
     }
    public void suppressionBriquetInventaire(){
         for(ObjetInventaire obj: this.objetJoueur){
             if(obj instanceof BriquetInventaire){
                 this.objetJoueur.remove(obj);
             }
             
         }
     }
    
    public void ajouterFer(Fer fer, Joueur joueur1){
        this.objetJoueur.add(new FerInventaire(fer.getIdObjet(),joueur1.getIdJoueur()));
    }
    public void ajouterSilex(Silex silex, Joueur joueur1){
        this.objetJoueur.add(new SilexInventaire(silex.getIdObjet(),joueur1.getIdJoueur()));
    }
    public void ajouterBriquet(Briquet briquet, Joueur joueur1){
        this.objetJoueur.add(new BriquetInventaire(briquet.getIdObjet(),joueur1.getIdJoueur()));
    }
    

  
    
}
