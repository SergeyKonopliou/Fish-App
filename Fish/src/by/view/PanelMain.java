package by.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.apache.log4j.Logger;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.UtilDateModel;

import by.main.FileHelper;
import by.main.Helper;
import by.model.CatalogFish;
import by.model.Region;

public class PanelMain {
	private Container container;
	private Image backgroundImage;
	private CatalogFish<?> catalog;
	private List<Region> regions;
	private final static Logger LOGGER = Logger.getLogger(PanelMain.class);

	public PanelMain() {
		FileHelper helper = new FileHelper();
		helper.createListRegionFile();
		catalog = helper.getCatalog();
		regions = helper.getRegions();
	}

	

	public void createFrame() {
		LOGGER.info("Fish list created");
		JFrame frame = new JFrame("Fish calendar");
		frame.setSize(800, 750);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("images/fishingpole.png");
		frame.setIconImage(icon.getImage());
		container = frame.getContentPane();
		UtilDateModel model = new UtilDateModel();
		Calendar calendarDay = Calendar.getInstance();
		model.setSelected(true);// разрешение выбора даты

//		model.addChangeListener(new ChangeListener() {
//			
//			@Override
//			public void stateChanged(ChangeEvent e) {
//				Date selectedDate = (Date) model.getValue();
//				calendarDay.setTime(selectedDate);
//				if (selectedDate != null ) {
//					StringBuilder str = Helper.findDate(regions, calendarDay.get(Calendar.DATE), (calendarDay.get(Calendar.MONTH) + 1));
//					LOGGER.info("Выбранная дата: " + str);
//					JOptionPane.showMessageDialog(null, str.toString(), "Сообщение", 1);
//				}
//			}
//		});
//		model.setDate(2021, 1, 1);// установить начальную дату для компонента календаря
		Properties p = new Properties();
		p.put("text.today", "Сегодня");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		backgroundImage = new ImageIcon(getClass().getClassLoader().getResource("Letnjajarybalka.jpg")).getImage();
		JPanel panel = new PanelAddBackground(backgroundImage);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JLabel labelChoiceDate = new JLabel("Выберите дату:    ");
		labelChoiceDate.setForeground(new Color(7, 8, 4, 255));
		labelChoiceDate.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(labelChoiceDate);
//		panel.add(Box.createVerticalStrut(50));

		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);

//		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());

		datePanel.setBorder(BorderFactory.createEmptyBorder(10, 100, 100, 100));
		datePanel.setBackground(new Color(25, 50, 250, 0));

		JButton buttonChoice = new JButton("Далее");
		JButton buttonFishCatalog = new JButton("Список рыб");

//		panel.add(datePicker);
		panel.add(datePanel);
		panel.add(Box.createHorizontalStrut(50));
		panel.add(Box.createVerticalStrut(30));
		panel.add(buttonChoice);
		panel.add(Box.createVerticalStrut(10));
		panel.add(buttonFishCatalog);
		panel.add(Box.createVerticalStrut(10));

		container.add(panel);

		buttonChoice.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Date selectedDate = (Date) model.getValue();
				calendarDay.setTime(selectedDate);
				if (selectedDate != null) {
					StringBuilder str = Helper.findDate(regions, calendarDay.get(Calendar.DATE),
							(calendarDay.get(Calendar.MONTH) + 1));
					LOGGER.info("Выбранная дата: " + str);
					JOptionPane.showMessageDialog(null, str.toString(), "Сообщение", 1);
				} else {
					LOGGER.info("Дата не выбрана");
					JOptionPane.showMessageDialog(null, "Дата не выбрына", "Сообщение", 2);
				}
			}
		});

		buttonFishCatalog.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PanelChoiceFish panelChoice = new PanelChoiceFish(catalog);
				panelChoice.createPanelChoiceFish(container);
			}
		});

		frame.setVisible(true);
	}
}
