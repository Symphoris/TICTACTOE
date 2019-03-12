package com.symphoris.controler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.symphoris.model.TTTModel;
import com.symphoris.view.PncView;
import com.symphoris.view.TTTView;

public class TTTController implements ActionListener {
	private TTTModel model;
	private TTTView view;
	
	
	public TTTController(TTTModel m, TTTView v) {
		model = m;
		view= v;
		initB();
		
	}
	public void initB() {
		for(int i = 0; i<view.getPnc().length; i++){
			for(int j = 0; j<view.getPnc().length; j++){
				view.getPnc()[i][j].getBoutonJeu().addActionListener(this);
				
			}
		}
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton but = null ;
		int abs= 0;
		int ord = 0;
		int numJoueur;
		PncView p = null;
		if (e.getSource() instanceof JButton) {
			but = (JButton) e.getSource();
		 p = view.getPanneau(but);
			abs = p.getAbs();
			ord = p.getOrd();
		}
		model.setNbreEssai();
		if(model.getNbreEssai()%2==1) {
			p.setBackground(Color.RED);
			model.getTabJeu()[abs][ord] =1; 
			numJoueur = 1;
		}
		else {
			p.setBackground(Color.BLUE);
			model.getTabJeu()[abs][ord] =2; 
			numJoueur = 2;
		}
		but.setVisible(false);
		if(model.verif(abs, ord)){
			System.out.println("Le joueur"+numJoueur+"a gagné");
			System.exit(0);
		}
		else if(model.getNbreEssai() == 9) {
			System.out.println("Le jeu est fini, il n'y a pas de gagnant");
		}
		
	}
}
