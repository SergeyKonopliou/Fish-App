package by.view;

/**
 * создание панели с задним фоном в виде переданного изображения
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PanelAddBackground extends JPanel {
	private static final long serialVersionUID = 1L;
	private Image backgroundImage;

	public PanelAddBackground(Image backgroundImage) {

		this.backgroundImage = backgroundImage;
		setOpaque(true);
		setLayout(new GridLayout(9, 2, 50, 50));
		setBackground(new Color(247, 247, 251, 255));
		setBorder(BorderFactory.createEmptyBorder(12, 20, 10, 20));

	}

	public void paintComponent(Graphics g) {
//		g.drawImage(backgroundImage, 0, 0, null);
		g.drawImage(backgroundImage, 0, 0, 1500, 900, null);
	}
}
