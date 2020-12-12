/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasrangerthings;

import javasrangerthings.Carte;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javasrangerthings.Localisation;
import javasrangerthings.ObjetSol;
import javasrangerthings.Joueur;

/**
 *
 * @author dorin
 */
public class Jeu {
    private ArrayList<Joueur> listePerso;
    private ArrayList<ObjetSol> listeObjet;
    private Carte map;
    // private map (tilemapping)

    public ArrayList<Joueur> getListePerso() {
        return listePerso;
    }

    public void setListePerso(ArrayList<Joueur> listePerso) {
        this.listePerso = listePerso;
    }

    public ArrayList<ObjetSol> getListeObjet() {
        return listeObjet;
    }

    public void setListeObjet(ArrayList<ObjetSol> listeObjet) {
        this.listeObjet = listeObjet;
    }


    public Carte getMap() {
        return map;
    }

    public void setMap(Carte map) {
        this.map = map;
    }


    
    public Jeu() {
        this.map = new Carte();
        this.listePerso = new ArrayList<Joueur>();
        this.listeObjet = new ArrayList<ObjetSol>();
       Localisation loc= new Localisation(1,1);
    }
    
    public void ajouterPerso(Joueur perso){
        listePerso.add(perso);
    }
    
    public void ajouterObjetSol(ObjetSol objetAuSol){
        listeObjet.add(objetAuSol);
    }
    
    public void supprimerObjetSol(ObjetSol objetAuSol){
        listeObjet.remove(objetAuSol);
    }
    
    
    //D'après les TP un JFRAME doit appeler la méthode objetSousNous toute les 40ms (a modifier si besoin)
    //Dans jeu les attributs sont les joueurs et objets sur la carte
    //la liste objetASupprimer va se vider et se remplir à chaque mise à jour, elle existe car il est 
    //pas possible de supprimer directement les objet dans listeObjet pendant la maj car on travaille dans la boucle 
    // qui parcourt les éléments de listeObjet 
    

    
    public void miseAJourPerso(){
        for (Joueur perso:listePerso){
            perso.setPeutRamasserObjet(false);
        }
    }
    
    
    //Méthodes qui nécessitent d'appuyer sur un bouton pour les activer
    public void ramasser( Joueur perso){
        perso.getObjetSurMemeCase().AjouteInventaire(perso.getInventaire(), perso);
         System.out.println(listeObjet);
        listeObjet.remove(perso.getObjetSurMemeCase());
         perso.getObjetSurMemeCase().setLocObjet(new Localisation(3000,3000));
    
    }
    //différence avec ramasser: l'objet ne va dans aucun inventaire
    public void supprimerDeLaMap(Joueur perso){
        System.out.println("on supp de la map");
//        for(ObjetSol obj:this.listeObjet )
//            System.out.println(perso.getPorteACote()); 
            listeObjet.remove(perso.getPorteACote());
        //on met la localisation de la porte a coté du joueur en dehors de la map
        //car problème lors de la suppression de la porte
        
        perso.getPorteACote().setLocObjet(new Localisation(3000,3000));
    }
    
    ///////////////////////////////////////////////////////////////////////
    
    
    public void interactionObjetJoueur(){
        for(ObjetSol obj: listeObjet){
            obj.actionAvecJoueur(listePerso);
        }
    }
    
    public void miseAJour(){
        this.miseAJourPerso();
        this.interactionObjetJoueur();
        
    }
//    public void miseAJour(){
//        map.miseAJour();
//        this.miseAJourPerso();    
//    }
    
    //affichage gérée par rendu
    public void rendu(Graphics2D contexte) {
        this.map.rendu(contexte);

        if (!listeObjet.isEmpty()){
            for (ObjetSol obj :listeObjet){
                obj.rendu(contexte);
            }
            
        }
        if (!listePerso.isEmpty()){
            for (Joueur perso :listePerso){
                perso.rendu(contexte);
            }
        }
    }

    
}
    
    
    

