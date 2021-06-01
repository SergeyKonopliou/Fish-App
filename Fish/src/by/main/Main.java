package by.main;

import javax.swing.SwingUtilities;

import by.view.PanelMain;


public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new PanelMain().createFrame();
			}
		});
	}
}
