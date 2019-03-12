package com.symphoris.app;

import javax.swing.SwingUtilities;

import com.symphoris.controler.TTTController;
import com.symphoris.model.TTTModel;
import com.symphoris.view.TTTView;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run () {
				TTTView view = new TTTView(3,3);
				TTTModel model = new TTTModel();
				TTTController jeu = new TTTController(model, view);
			}
		});
	}

}
