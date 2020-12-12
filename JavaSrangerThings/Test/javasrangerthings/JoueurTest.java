/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasrangerthings;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dorin
 */
public class JoueurTest {
    
    public JoueurTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isPeutRamasserObjet method, of class Joueur.
     */
    @Test
    public void testIsPeutRamasserObjet() {
        System.out.println("isPeutRamasserObjet");
        Joueur instance = null;
        boolean expResult = false;
        boolean result = instance.isPeutRamasserObjet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPeutRamasserObjet method, of class Joueur.
     */
    @Test
    public void testSetPeutRamasserObjet() {
        System.out.println("setPeutRamasserObjet");
        boolean peutRamasserObjet = false;
        Joueur instance = null;
        instance.setPeutRamasserObjet(peutRamasserObjet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPseudo method, of class Joueur.
     */
    @Test
    public void testGetPseudo() {
        System.out.println("getPseudo");
        Joueur instance = null;
        String expResult = "";
        String result = instance.getPseudo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPseudo method, of class Joueur.
     */
    @Test
    public void testSetPseudo() {
        System.out.println("setPseudo");
        String pseudo = "";
        Joueur instance = null;
        instance.setPseudo(pseudo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdJoueur method, of class Joueur.
     */
    @Test
    public void testGetIdJoueur() {
        System.out.println("getIdJoueur");
        Joueur instance = null;
        int expResult = 0;
        int result = instance.getIdJoueur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdJoueur method, of class Joueur.
     */
    @Test
    public void testSetIdJoueur() {
        System.out.println("setIdJoueur");
        int idJoueur = 0;
        Joueur instance = null;
        instance.setIdJoueur(idJoueur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocJoueur method, of class Joueur.
     */
    @Test
    public void testGetLocJoueur() {
        System.out.println("getLocJoueur");
        Joueur instance = null;
        Localisation expResult = null;
        Localisation result = instance.getLocJoueur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocJoueur method, of class Joueur.
     */
    @Test
    public void testSetLocJoueur() {
        System.out.println("setLocJoueur");
        Localisation locJoueur = null;
        Joueur instance = null;
        instance.setLocJoueur(locJoueur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVitesse method, of class Joueur.
     */
    @Test
    public void testGetVitesse() {
        System.out.println("getVitesse");
        Joueur instance = null;
        int expResult = 0;
        int result = instance.getVitesse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVitesse method, of class Joueur.
     */
    @Test
    public void testSetVitesse() {
        System.out.println("setVitesse");
        int vitesse = 0;
        Joueur instance = null;
        instance.setVitesse(vitesse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpritePerso method, of class Joueur.
     */
    @Test
    public void testGetSpritePerso() {
        System.out.println("getSpritePerso");
        Joueur instance = null;
        BufferedImage expResult = null;
        BufferedImage result = instance.getSpritePerso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpritePerso method, of class Joueur.
     */
    @Test
    public void testSetSpritePerso() {
        System.out.println("setSpritePerso");
        BufferedImage spritePerso = null;
        Joueur instance = null;
        instance.setSpritePerso(spritePerso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjetSurMemeCase method, of class Joueur.
     */
    @Test
    public void testGetObjetSurMemeCase() {
        System.out.println("getObjetSurMemeCase");
        Joueur instance = null;
        ObjetSol expResult = null;
        ObjetSol result = instance.getObjetSurMemeCase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjetSurMemeCase method, of class Joueur.
     */
    @Test
    public void testSetObjetSurMemeCase() {
        System.out.println("setObjetSurMemeCase");
        ObjetSol objetSurMemeCase = null;
        Joueur instance = null;
        instance.setObjetSurMemeCase(objetSurMemeCase);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEquipe method, of class Joueur.
     */
    @Test
    public void testIsEquipe() {
        System.out.println("isEquipe");
        Joueur instance = null;
        boolean expResult = false;
        boolean result = instance.isEquipe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipe method, of class Joueur.
     */
    @Test
    public void testSetEquipe() {
        System.out.println("setEquipe");
        boolean equipe = false;
        Joueur instance = null;
        instance.setEquipe(equipe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRayon method, of class Joueur.
     */
    @Test
    public void testGetRayon() {
        System.out.println("getRayon");
        Joueur instance = null;
        int expResult = 0;
        int result = instance.getRayon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRayon method, of class Joueur.
     */
    @Test
    public void testSetRayon() {
        System.out.println("setRayon");
        int rayon = 0;
        Joueur instance = null;
        instance.setRayon(rayon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class Joueur.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        Joueur instance = null;
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScore method, of class Joueur.
     */
    @Test
    public void testSetScore() {
        System.out.println("setScore");
        int score = 0;
        Joueur instance = null;
        instance.setScore(score);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventaire method, of class Joueur.
     */
    @Test
    public void testGetInventaire() {
        System.out.println("getInventaire");
        Joueur instance = null;
        Inventaire expResult = null;
        Inventaire result = instance.getInventaire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInventaire method, of class Joueur.
     */
    @Test
    public void testSetInventaire() {
        System.out.println("setInventaire");
        Inventaire inventaire = null;
        Joueur instance = null;
        instance.setInventaire(inventaire);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPorteACote method, of class Joueur.
     */
    @Test
    public void testGetPorteACote() {
        System.out.println("getPorteACote");
        Joueur instance = null;
        Porte1 expResult = null;
        Porte1 result = instance.getPorteACote();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPorteACote method, of class Joueur.
     */
    @Test
    public void testSetPorteACote() {
        System.out.println("setPorteACote");
        Porte1 porteACote = null;
        Joueur instance = null;
        instance.setPorteACote(porteACote);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of uptadeDBJoueur method, of class Joueur.
     */
    @Test
    public void testUptadeDBJoueur() throws Exception {
        System.out.println("uptadeDBJoueur");
        Joueur instance = null;
        instance.uptadeDBJoueur();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of declencher method, of class Joueur.
     */
    @Test
    public void testDeclencher() {
        System.out.println("declencher");
        ObjetNonRamassable obj = null;
        Joueur instance = null;
        instance.declencher(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deplacement method, of class Joueur.
     */
    @Test
    public void testDeplacement() {
        System.out.println("deplacement");
        Joueur instance = null;
        instance.deplacement();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of objetSousNous method, of class Joueur.
     */
    @Test
    public void testObjetSousNous() {
        System.out.println("objetSousNous");
        ArrayList<ObjetSol> listeObjSol = null;
        Joueur instance = null;
        instance.objetSousNous(listeObjSol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of porteACoteDeNous method, of class Joueur.
     */
    @Test
    public void testPorteACoteDeNous() {
        System.out.println("porteACoteDeNous");
        ArrayList<ObjetSol> listeObjSol = null;
        Joueur instance = null;
        instance.porteACoteDeNous(listeObjSol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rendu method, of class Joueur.
     */
    @Test
    public void testRendu() {
        System.out.println("rendu");
        Graphics2D contexte = null;
        Joueur instance = null;
        instance.rendu(contexte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ramasserObjet method, of class Joueur.
     */
    @Test
    public void testRamasserObjet() {
        System.out.println("ramasserObjet");
        Joueur instance = null;
        instance.ramasserObjet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
