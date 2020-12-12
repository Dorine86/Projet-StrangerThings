package javamenu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javasrangerthings.Joueur;
import javasrangerthings.Jeu;
import javasrangerthings.CleARamasser;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javasrangerthings.BriquetInventaire;
import javasrangerthings.Equipe;
import javasrangerthings.Fer;
import javasrangerthings.FerInventaire;
import javasrangerthings.Localisation;
import javasrangerthings.ObjetSol;
import javasrangerthings.Porte1;
import javasrangerthings.SilexInventaire;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author dorin
 */
public class EcranJoueur extends javax.swing.JFrame implements ActionListener, KeyListener{
    private BufferedImage buffer;
    private Graphics2D contexteBuffer;
    private Jeu jeu;
    private Timer timer;
    private int compteur;
    private Joueur moi;
    private Joueur binome;
    private Equipe monEquipe;
    private boolean enDeplacement;
    /**
     * Creates new form FenetreDeJeuGUI
     */
    public EcranJoueur() {
        initComponents();
        compteur=0;
        
        // Creation du buffer pour l'affichage du jeu et recuperation du contexte graphique
        this.buffer = new BufferedImage(this.jLabel1.getWidth(), this.jLabel1.getHeight(), BufferedImage.TYPE_INT_ARGB);
        jLabel1.setIcon(new ImageIcon(this.buffer));
        this.contexteBuffer = this.buffer.createGraphics();
        jLabel1.setFocusable(true);

        
        //Creation joueur
        moi=new Joueur(1,"moi",true);
        binome=new Joueur(2,"copain",true);
        

        
        //Creation de mon equipe
        ArrayList<Joueur> joueurDansEquipe=new ArrayList<Joueur>();
        joueurDansEquipe.add(moi);
        joueurDansEquipe.add(binome);
        this.monEquipe=new Equipe(true,joueurDansEquipe);

        // Creation du jeu
        this.jeu = new Jeu();
        
       //Ajout de perso dans le jeu
        jeu.ajouterPerso(moi);
        jeu.ajouterPerso(binome);
        
        
        //Ajout d'une cle au sol
        Localisation loc = new Localisation(1,0,160);
        CleARamasser cle = new CleARamasser(0,1,loc);
        jeu.ajouterObjetSol(cle);
        
        //Ajout d'une porte
        Localisation locPorte = new Localisation(0,32,0);
        Porte1 porte = new Porte1(200,0,locPorte);
         jeu.ajouterObjetSol(porte);
        //Ajout Fer au sol
        Localisation locFer=new Localisation(32,64);
        Fer fer=new Fer(255, 1,locFer );
        
        jeu.ajouterObjetSol(fer);
        
        
        
        //Ajout d'objet dans inventaire
//         FerInventaire ferI= new FerInventaire(255,moi.getIdJoueur());
        SilexInventaire silexI= new SilexInventaire(256,binome.getIdJoueur());
//        moi.getInventaire().getObjetJoueur().add(silexI);
        binome.getInventaire().getObjetJoueur().add(silexI);
//        BriquetInventaire briquetinv=new BriquetInventaire(257, moi.getIdJoueur());
//        moi.getInventaire().ajouter(briquetinv);
        


        // Creation du Timer qui appelle this.actionPerformed() tous les 40 ms
        this.timer = new Timer(40, this);
        this.timer.start();
        jLabel1.addKeyListener(this);


     
        //Ajout loc joueur plus utilse lorsqu'on aura une écoute de clavier
        Localisation nouvLoc= new Localisation(0,0,0);
        Localisation nouvLoc2= new Localisation(0,64,96);
        moi.setLocJoueur(nouvLoc);
        binome.setLocJoueur(nouvLoc2);
    }
    
    @Override
     public void actionPerformed(ActionEvent e) {
        jeu.miseAJour();
        compteur+=1;
        if(compteur%10==0){
            enDeplacement=false;
        }
        this.jeu.rendu(contexteBuffer);
        this.jLabel1.repaint();
        jButton1.setVisible(moi.isPeutRamasserObjet());
        jButton2.setVisible(monEquipe.peutCreerBriquet());
        jButton3.setVisible(moi.getPorteACote().ifActionPossible(moi));
        System.out.println(moi.getInventaire().getObjetJoueur());

    }
    
             
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_Z && enDeplacement==false){ 
            this.moi.enHaut();
            enDeplacement=true;
        }
         if(e.getKeyCode()==KeyEvent.VK_S && enDeplacement==false ){ 
            this.moi.enBas();
            enDeplacement=true;
        }
          if(e.getKeyCode()==KeyEvent.VK_Q && enDeplacement==false){ 
            this.moi.aGauche();
            enDeplacement=true;
        }
         if(e.getKeyCode()==KeyEvent.VK_D && enDeplacement==false){ 
            this.moi.aDroite();
            enDeplacement=true;
        }
    }



     

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jButton1.setText("ramasser?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Fabriquer?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Bruler la porte?");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jeu.ramasser(moi);
        
        jLabel1.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.monEquipe.fabriquerBriquet();
       
        jLabel1.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jeu.supprimerDeLaMap(moi);
        Porte1.peutEtreSupprime=false;
        jLabel1.requestFocus();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EcranJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EcranJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EcranJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EcranJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EcranJoueur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables


    



    @Override
    public void keyTyped(KeyEvent e) {

    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        
    }

}
