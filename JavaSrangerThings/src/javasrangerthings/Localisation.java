package javasrangerthings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dorin
 */
public class Localisation {
    private int salle;
    private int x;
    private int y;
    
    public Localisation(int salle, int x,int y){
        this.x=x;
        this.y=y;
        this.salle=salle;
    }
        public Localisation( int x,int y){
        this.x=x;
        this.y=y;
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getSalle() {
        return salle;
    }

    public void setSalle(int salle) {
        this.salle = salle;
    }
    
    
    public boolean equals(Localisation loc){
        boolean bool= false;
        if( this.getX()==loc.getX() && this.getY()==loc.getY()){
            bool=true;
        }
        return(bool);
    }
    
    public void affichage(){
        System.out.println("("+x+";"+y+")");
    }
    public boolean ifADroite(Localisation loc){
        boolean aDroite=false;
        if(this.getX()==loc.getX()+32 && this.getY()==loc.getY()){
            aDroite=true;
        }
        return(aDroite);
    }
    
    public boolean ifAGauche(Localisation loc){
        boolean aGauche=false;
        if(this.getX()==loc.getX()-32 && this.getY()==loc.getY()){
            aGauche=true;
        }
        return(aGauche);
    }
    public boolean ifAuDessus(Localisation loc){
        boolean auDessus=false;
        if(this.getY()==loc.getY()-32 && this.getX()==loc.getX()){
            auDessus=true;
        }
        return(auDessus);
    }
        public boolean ifAuDessous(Localisation loc){
        boolean auDessous=false;
        if(this.getY()==loc.getY()+32 && this.getX()==loc.getX()){
            auDessous=true;
        }
        return(auDessous);
    }
    
        //Methode pour savoir si deux joueurs sont a coté
    public boolean joeurACote(Localisation loc ){
        boolean aCote=false;
        if(this.ifADroite(loc)==true || this.ifAGauche(loc)==true || this.ifAuDessous(loc)==true || this.ifAuDessus(loc)==true){
            aCote=true;
        }
        
        return(aCote);
        
    }
    
    
}
