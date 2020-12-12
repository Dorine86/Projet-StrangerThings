/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javasrangerthings.Equipe;
import javasrangerthings.FerInventaire;
import javasrangerthings.Joueur;
import javasrangerthings.Localisation;
import javasrangerthings.Objet;
import javasrangerthings.SilexInventaire;

/**
 *
 * @author moi
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedImage img = new BufferedImage(1,1,1);
        Localisation lieu = new Localisation(1,2,3);
        Objet test = new Objet(2, 1);
        
//        //Test methode aCote
//        int x=0;
//        int y=0;
//        Localisation locperso=new Localisation(1,x,y);
//        int x2=32;
//        int y2=0;
//        Localisation loc=new Localisation(1,x2,y2);
//        locperso.joeurACote(loc);
        
        Joueur joueur1=new Joueur(1,"J1",true);
        Localisation loc1= new Localisation(0,200);
        Localisation loc2= new Localisation(0,232);
        System.out.println(loc1.joeurACote(loc2));
        
//        //Test peut fabriquer briquet
//        
//        Joueur joueur2=new Joueur(2,"J2",true);
//        joueur1.setLocJoueur(loc1);
//        joueur2.setLocJoueur(loc2);
//        FerInventaire ferI= new FerInventaire(255,joueur1.getIdJoueur());
//        SilexInventaire silexI= new SilexInventaire(256,joueur2.getIdJoueur());
//        joueur1.getInventaire().getObjetJoueur().add(silexI);
//        joueur2.getInventaire().getObjetJoueur().add(ferI);
//      
//        ArrayList<Joueur> liste= new ArrayList<Joueur>();
//        liste.add(joueur1);
//        liste.add(joueur2);
//        Equipe eq= new Equipe(true,liste);
//        eq.peutCreerBriquet();
//    //Test fabriquer briquet
//        eq.fabriquerBriquet();
        
        
    }
    
}
