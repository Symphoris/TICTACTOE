package com.symphoris.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PncView  extends JPanel  {
	public static final int LARGEUR_PANNEAU = 100;
	public static final int HAUTEUR_PANNEAU = 100;

	private int abs;
	private int ord;
	private JButton boutonJeu = new JButton("cliquer");
	
	public PncView(int i, int j) {
		super();
		abs=i;
		ord=j;
		Dimension dim = new Dimension(LARGEUR_PANNEAU, HAUTEUR_PANNEAU);
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new BorderLayout());
		this.setSize(dim);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		this.add(boutonJeu, BorderLayout.SOUTH);
	}
	public int getAbs() {
		return abs;
	}
	public int getOrd() {
		return ord;
	}
	public JButton getBoutonJeu()  {
		return boutonJeu;
	}
	
	

}
