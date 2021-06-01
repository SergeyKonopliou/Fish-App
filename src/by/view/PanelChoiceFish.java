package by.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.apache.log4j.Logger;

import by.model.CatalogFish;
import by.model.Fish;


public class PanelChoiceFish {
	@SuppressWarnings("rawtypes")
	CatalogFish<?> catalog = new CatalogFish();
	private final static Logger LOGGER = Logger.getLogger(PanelMain.class);
	
	public PanelChoiceFish() {

	}

	public PanelChoiceFish(CatalogFish<?> catalog) {
		this.catalog = catalog;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void createPanelChoiceFish(Container container) {
		LOGGER.info("The user went to the fish selection section");
		JFrame frame = new JFrame();
		frame.setTitle("Выберите разновидности рыбы");
		frame.setSize(300, 130);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2, 5, 5));
		panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(247, 247, 251, 255));
		
		 DefaultComboBoxModel box = new DefaultComboBoxModel();
		 Map<String, Fish> fishes = catalog.getFishes();
		 Set<String> name = fishes.keySet(); 
		 for (Iterator iterator = name.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			box.addElement(string);
		}
		 JComboBox combo = new JComboBox(box);
		 combo.setMaximumRowCount(5);
		
		JButton ok = new JButton("Подробнее");
		JButton cancel = new JButton("Отмена");
		panel.add(combo);
		panel.add(ok);
		panel.add(cancel);
		frame.add(panel);

		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				container.revalidate();
				container.repaint();
			}
		});

		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Map<String, Fish> fishes = catalog.getFishes();
				//combo.getSelectedItem() - получение выбранного элемента из выпадающего списка
				JOptionPane.showMessageDialog(null, fishes.get(combo.getSelectedItem()), "Полная информация", 1);
				LOGGER.info("The user choose " + fishes.get(combo.getSelectedItem()).getName());
				frame.setVisible(false);
				container.revalidate();
				container.repaint();
			}
		});

		frame.setVisible(true);
	}

}

