/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasrangerthings;

 
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javasrangerthings.ObjetInventaire;
import java.sql.Connection;





/**
 *
 * @author dorin
 */
public class Joueur {
    private int idJoueur;
    private Localisation locJoueur;
    private int vitesse;
    private BufferedImage spritePerso;
    private String pseudo;
    //private ArrayList<ObjetInventaire> objInventaire;
    private boolean peutRamasserObjet;
    private Inventaire inventaire;
    private ObjetSol objetSurMemeCase;
    private boolean equipe;
    private int rayon;
    private int score;
    private ObjetSol porteACote;
   

    public Joueur  (int idPerso, String pseudo, boolean eq)  {
        this.idJoueur = idPerso;
        this.locJoueur = new Localisation(0,0,0);
        this.peutRamasserObjet = false;
        this.inventaire = new Inventaire();
        try {
            this.spritePerso = ImageIO.read(getClass().getResource("../resources/JoueurNul.png") );
        } catch (IOException ex) {
            Logger.getLogger(Carte.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.pseudo=pseudo;
        //this.objInventaire = new ObjetInventaire(1,1);
        this.equipe = true;
        this.rayon = 10;
        this.score = 0;
        this.porteACote=new Porte1(200,0,new Localisation(0,0,0));
       
        
    }

    public boolean isPeutRamasserObjet() {
        return peutRamasserObjet;
    }

    public void setPeutRamasserObjet(boolean peutRamasserObjet) {
        this.peutRamasserObjet = peutRamasserObjet;
    }
    


    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

//    public ArrayList<ObjetInventaire> getObjInventaire() {
//        return objInventaire;
//    }
//
//    public void setObjInventaire(ArrayList<ObjetInventaire> objInventaire) {
//        this.objInventaire = objInventaire;
//    }

    public int getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public Localisation getLocJoueur() {
        return locJoueur;
    }

    public void setLocJoueur(Localisation locJoueur) {
        this.locJoueur = locJoueur;
    }



    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public BufferedImage getSpritePerso() {
        return spritePerso;
    }

    public void setSpritePerso(BufferedImage spritePerso) {
        this.spritePerso = spritePerso;
    }

    public ObjetSol getObjetSurMemeCase() {
        return objetSurMemeCase;
    }

    public void setObjetSurMemeCase(ObjetSol objetSurMemeCase) {
        this.objetSurMemeCase = objetSurMemeCase;
    }

    public boolean isEquipe() {
        return equipe;
    }

    public void setEquipe(boolean equipe) {
        this.equipe = equipe;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
      public Inventaire getInventaire() {
        return inventaire;
    }

    public void setInventaire(Inventaire inventaire) {
        this.inventaire = inventaire;
    }

    public ObjetSol getPorteACote() {
        return porteACote;
    }

    public void setPorteACote(ObjetSol porteACote) {
        this.porteACote = porteACote;
    }
    

    
    
    
    
    //__________________________________________________________________________
    
////    public void ramasserObjet(ObjetRamassable obj){
////        objInventaire.add(obj);
////        
////    }
////  
    
    public void uptadeDBJoueur() throws  IOException {
        try{
        Connection connexion = DriverManager.getConnection("jdbc:mysql://nemrod.ens2m.fr:3306/20202021_s1_vs1_tp2_strangerthings?serverTimezone=UTC", "strangerthings", "YTDTvj9TR3CDYCmP");
        PreparedStatement requete = connexion.prepareStatement("UPDATE joueur SET pseudo = ?, salle=?, x = ?, y=?, vitesse=?, score=?, rayon=?, equipe=? WHERE id=?");
        requete.setString(1,this.pseudo);
        requete.setInt(2,this.locJoueur.getSalle());
        requete.setInt(3,this.locJoueur.getX());
        requete.setInt(4,this.locJoueur.getY());
        requete.setDouble(5,this.vitesse);
        requete.setInt(6,this.score);
        requete.setInt( 7,this.rayon);
        requete.setBoolean(8,this.equipe);
        requete.setInt(9,this.idJoueur);
        requete.executeUpdate();
        requete.close();
        connexion.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        }
    
    public void declencher(ObjetNonRamassable obj){
        
    }
    public void aGauche(){
        if(locJoueur.getX()>=32){
            locJoueur.setX(locJoueur.getX()-32);
        }
        
    }
     public void aDroite(){ //PAS ENCORE LA TAILLE MAX
        if(locJoueur.getX()<=500){
            locJoueur.setX(locJoueur.getX()+32);
        }
        
    }
     public void enHaut(){ //PAS ENCORE LA TAILLE MAX
        if(locJoueur.getY()>=32){
            locJoueur.setY(locJoueur.getY()-32);
        }
        
    }
     public void enBas(){ //PAS ENCORE LA TAILLE MAX
        if(locJoueur.getY()<=500){
            locJoueur.setY(locJoueur.getY()+32);
        }
        
    }

    
//    public void deplacement( ){
//       
//        if (locJoueur.getX()>0  )
//        locJoueur.setX(locJoueur.getX()-1);
//        locJoueur.setY(locJoueur.getY());
//        
//    }
    
//    public void objetSousNous(ArrayList<ObjetSol> listeObjSol){
//        peutRamasserObjet=false;
//        for(ObjetSol obj:listeObjSol )
//        if(this.locJoueur.equals(obj.getLocObjet())){
//            if(obj instanceof ObjetRamassable){
//                peutRamasserObjet=true;
//                objetSurMemeCase=obj;
//            }
//        }
//        this.deplacement();
//        
//    }
//    public void porteACoteDeNous(ArrayList<ObjetSol> listeObjSol){
//        for(ObjetSol obj:listeObjSol){
//            if(this.locJoueur.joeurACote(obj.getLocObjet())){
//                if(obj instanceof Porte1){
//                    porteACote=obj;
//                }
//            }
//        }
//    }

  

    
    public void rendu(Graphics2D contexte) {
        contexte.drawImage(this.spritePerso, locJoueur.getX(), locJoueur.getY(), null);
    }
    
    
        
//    public void ramasserObjet(){
//         System.out.println("je ramasse avant ");
//        this.inventaire.ajouter(new ObjetInventaire(objetSurMemeCase.getIdObjet(), objetSurMemeCase.getProprietaire()));
//         System.out.println("je ramasse après");
//    }

    
}
