package com.symphoris.model;

public class TTTModel {
	private int [] [] tabJeu = new int [3] [3] ;
	private int nbreEssai =0;
	public TTTModel() {
		for(int i=0; i<tabJeu.length; i++){
			for(int j=0; j<tabJeu.length; j++){
				tabJeu[i][j] = 0;
			}
		}
	}
	public int [] [] getTabJeu() {
		return tabJeu;
	}
	public int getNbreEssai() {
		return nbreEssai;
	}
	public void setTabJeu(int abs,int ord,int n) {
		tabJeu [abs] [ord] = n;
	}
	public void setNbreEssai() {
		nbreEssai++;
	}
	
	
	public boolean verifLigne(int abs, int ord) {
		boolean b = true;
		for(int col=0; col<tabJeu.length; col++) {
			b=b && (tabJeu[abs][col] == tabJeu[abs][ord]);
		}
		return b;
	}
	
	public boolean verifColonne(int abs, int ord) {
		boolean b = true;
		for(int lig=0; lig<tabJeu.length; lig++) {
			b=b && (tabJeu[lig][ord] == tabJeu[abs][ord]);
		}
		return b;
	}
	
	public boolean verifDiagonale(int abs, int ord) {
		boolean b = true;
		if(abs!=ord) {
			return false;
		}
		else {
			for(int j=0; j<tabJeu.length; j++) {
				b=b && (tabJeu[j][j] == tabJeu[abs][ord]);
			}
		}
		
		return b;
	}
	
	public boolean verifDiagonale2(int abs, int ord) {
		boolean b = true;
		if(abs+ord+1!= tabJeu.length) {
			return false;
		}
		else {
			for(int j=0; j<tabJeu.length; j++) {
				b=b && (tabJeu[j][tabJeu.length-j-1] == tabJeu[abs][ord]);
			}
		}
		
		return b;
	}
	
	public boolean verif(int abs, int ord) {
		return (verifLigne( abs, ord) || verifColonne(abs, ord) || verifDiagonale(abs, ord) || verifDiagonale2(abs, ord));
	}

}
