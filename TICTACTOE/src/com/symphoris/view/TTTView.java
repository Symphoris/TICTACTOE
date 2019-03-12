package com.symphoris.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TTTView {

	public static final int LARGEUR = 320;
	public static final int HAUTEUR = 320;
	private PncView [] [] pnc = new PncView[3] [3];
	private int lg;
	private int cl;
	
	
	
	JFrame fenetreJeu = new JFrame ( "la fenetre pour jouer");
	// //////
	
	
	public PncView [] [] getPnc() {
		return pnc;
	}
	
	public PncView getPanneau(JButton b) {
		PncView p = null;
		for(int i = 0; i<lg; i++){
			for(int j = 0; j<cl; j++){
				if(pnc[i][j].getBoutonJeu()==b) {
					p=pnc[i][j];
				}
				
			}
		}
		return p;
		
	}
	
	
	
	
	public TTTView(int lg, int cl) {
		lg=lg;
		cl = cl;
		fenetreJeu.setLayout(new GridLayout(3,3));
		fenetreJeu.setBackground(Color.BLACK);
		Dimension dim0 = new Dimension(HAUTEUR, LARGEUR);
		fenetreJeu.setSize(dim0);
		fenetreJeu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PncView panneau;
		for(int i = 0; i<lg; i++){
			for(int j = 0; j<cl; j++){
				panneau = new PncView(i, j);
				fenetreJeu.getContentPane().add(panneau);
				
			}
		}
		fenetreJeu.setVisible(true);
		
	}
	
	
	

}