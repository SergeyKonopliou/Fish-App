package by.main;

import javax.swing.SwingUtilities;

import org.apache.log4j.Logger;

import by.view.PanelMain;


public class Main {
	private final static Logger LOGGER = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LOGGER.info("Application started");
				new PanelMain().createFrame();
			}
		});
	}
}
