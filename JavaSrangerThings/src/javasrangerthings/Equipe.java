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
public class Equipe {
    private boolean num;

    private ArrayList<Joueur> listeJoueur;
    
    public Equipe(boolean num, ArrayList<Joueur> listeJoueur){
        this.num=num;
        this.listeJoueur= new ArrayList<Joueur>();
        this.listeJoueur=listeJoueur;
    
    }

    public boolean isNum() {
        return num;
    }

    public void setNum(boolean num) {
        this.num = num;
    }




//Methode à faire/modifier  
    
//    public boolean equipePleine(){
//        boolean toutLesJoueurs=false;
//        if(this.listeJoueur.size()==2){
//            toutLesJoueurs=true;
//        }
//        System.out.println(toutLesJoueurs);
//        return(toutLesJoueurs);
//        
//    }
//    
//    public void ajouterJoueur(Joueur joueurSansEquipe){
//        if(this.listeJoueur.size()==0){
//        this.listeJoueur.add(joueurSansEquipe);
//        
//        }
//        if(this.listeJoueur.size()==1){
//            this.listeJoueur.add(joueurSansEquipe);
//           
//        }
//        
    public boolean ifJoueur1ASilex(){
        boolean aSilex=false;
            for(int i=0; i<(listeJoueur.get(0).getInventaire().getObjetJoueur()).size(); i++){
            if(((listeJoueur.get(0).getInventaire()).getObjetJoueur().get(i)) instanceof SilexInventaire){
                aSilex=true;
            }  
        }
        return(aSilex);
    }
    
    public boolean ifJoueur1AFer(){
        boolean aFer=false;
            for(int i=0; i<(listeJoueur.get(0).getInventaire().getObjetJoueur()).size(); i++){
            if(((listeJoueur.get(0).getInventaire()).getObjetJoueur().get(i))instanceof FerInventaire){
                aFer=true;
            }  
        }
        return(aFer);   
    }
    
    public boolean ifJoueur2ASilex(){
        boolean aSilex=false;
            for(int i=0; i<(listeJoueur.get(1).getInventaire().getObjetJoueur()).size(); i++){
            if(((listeJoueur.get(1).getInventaire()).getObjetJoueur().get(i)) instanceof SilexInventaire){
                aSilex=true;
            }  
        }
        return(aSilex);
  
    }
    
    public boolean ifJoueur2AFer(){
        boolean aFer=false;
            for(int i=0; i<(listeJoueur.get(1).getInventaire().getObjetJoueur()).size(); i++){        
            int idObjetJ2=(listeJoueur.get(1).getInventaire()).getObjetJoueur().get(i).getIdObjet();
           
            if(((listeJoueur.get(1).getInventaire()).getObjetJoueur().get(i))instanceof FerInventaire){
                aFer=true;
            }  
        }
        return(aFer);
  
    }
    
    public boolean peutCreerBriquet(){
        boolean creerBriquet=false;
        if(this.listeJoueur.get(0).getInventaire().estPasVide() && this.listeJoueur.get(1).getInventaire().estPasVide() ){
            if((this.ifJoueur1AFer() && this.ifJoueur2ASilex()) || (this.ifJoueur1ASilex() && this.ifJoueur2AFer())){
                if(listeJoueur.get(0).getLocJoueur().joeurACote(listeJoueur.get(1).getLocJoueur())){
                    creerBriquet=true;
                }
            }
        }
                 
        return(creerBriquet);
        
    }
//    public boolean peutCreerBriquet(){
//        boolean fabriquer=false;
//        boolean ferJ1=false;
//        boolean silexJ1=false;
//        boolean ferJ2=false;
//        boolean silexJ2=false;
//        int idFer=255;
//        int idSilex=256;
//        //boucle dans la liste des objets contenus dans l'inventaire du joueur 1
//        for(int i=0; i<(listeJoueur.get(0).getInventaire().getObjetJoueur()).size(); i++){
//            System.out.println("boucle1");
//            int idObjetJ1=(listeJoueur.get(0).getInventaire()).getObjetJoueur().get(i).getIdObjet();
//            if(idObjetJ1== idFer){
//                ferJ1=true;
//            }
//            if(idObjetJ1== idSilex){
//                silexJ1=true;
//            }  
//        }
//         for(int i=0; i<(listeJoueur.get(1).getInventaire().getObjetJoueur()).size(); i++){
//            System.out.println("boucle2");
//            int idObjetJ2=(listeJoueur.get(1).getInventaire()).getObjetJoueur().get(i).getIdObjet();
//            if(idObjetJ2== idFer){
//                ferJ2=true;
//            }
//            if(idObjetJ2== idSilex){
//                silexJ2=true;
//            }  
//        }
//         System.out.println(ferJ1+""+  ferJ2+""+  silexJ1 +""+ silexJ2);
//        //verifie si les 2 joueurs sont à coté
//        boolean joueurACote=false;
//        
//        if(listeJoueur.get(0).getLocJoueur().joeurACote(listeJoueur.get(1).getLocJoueur())){
//            
//            joueurACote=true;
//                         
//        }
        
//        
//        //verifie si les 2 joeurs ont chacun un objet de fusion
//        boolean toutLesObjets=false;
//        if((silexJ1==true && ferJ2==true)||(silexJ2==true && ferJ1==true)){
//            toutLesObjets = true;
//        }
//        //conditions finales de fusion
//       
//        if(joueurACote==true && toutLesObjets==true){
//            fabriquer=true;
//        }
//        System.out.println(fabriquer);
//        return(fabriquer);
//    }
    public void fabriquerBriquet(){
        if(this.peutCreerBriquet()==true){
        //Ajout briquet dans inventaire
        
        listeJoueur.get(1).getInventaire().ajouter(new BriquetInventaire(1,listeJoueur.get(1).getIdJoueur()));
        listeJoueur.get(0).getInventaire().ajouter(new BriquetInventaire(1,listeJoueur.get(0).getIdJoueur()));
        }  
        System.out.println(listeJoueur.get(1).getInventaire().getObjetJoueur());
        
        //Suppression des objets de fusions
        if(this.ifJoueur1AFer()){
            listeJoueur.get(0).getInventaire().suppressionFerInventaire();
        } else {
            listeJoueur.get(0).getInventaire().suppressionSilexInventaire();
        }
        if(this.ifJoueur2AFer()){
            listeJoueur.get(1).getInventaire().suppressionFerInventaire();
        } else {
            listeJoueur.get(1).getInventaire().suppressionSilexInventaire();
        }
        System.out.println(listeJoueur.get(1).getInventaire().getObjetJoueur());
    }
    
   
}
    
    
    

