package by.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.log4j.Logger;

import by.model.CatalogFish;
import by.model.Region;
import by.view.PanelMain;

public class FileHelper {
	private List<Region> regions;
	private CatalogFish<?> catalog;
	private FileInputStream fin,fin1;
	private ObjectInputStream oin,oin1;
	private final static Logger LOGGER = Logger.getLogger(PanelMain.class);
	
	public CatalogFish<?> getCatalog() {
		return catalog;
	}

	public void setCatalog(CatalogFish<?> catalog) {
		this.catalog = catalog;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	/**
	 * метод в котором при первом запуске приложения информация о датах запрета по областям и 
	 * информации о разных видах рыб записывается в два файла,при последующих
	 * запусках приложения,информация уже считывается с файла.
	 */
	public void createListRegionFile() {
		File file = new File("resource/listRegion.txt");
		File fileFish = new File("resource/listFishInfo.txt");
		if (!file.exists()) {
			try {
				writeNewFile(file);
				writeNewFileFishInfo(fileFish);
			} catch (IOException e) {
				LOGGER.warn("File didn't create!!!");
			}
		} else {
			File file1 = new File("resource/listRegion.txt");
			File fileFish1 = new File("resource/listFishInfo.txt");
			try {
				fin = new FileInputStream(file1);
				fin1 = new FileInputStream(fileFish1);
			} catch (FileNotFoundException e1) {
				LOGGER.warn("File not found!!!");
			}
			readReadyFile();
			readReadyFileFishInfo();
		}
	}
	
	/**
	 * method of recording information about ban dates when the application is first launched
	 */
	private void writeNewFile(File file) throws IOException, FileNotFoundException {
		file.createNewFile();
		FileOutputStream fout = new FileOutputStream(file, true);
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		regions = Helper.createListRegion();
		oout.writeObject(regions);
		LOGGER.info("First start application.Created new file and recording information about ban dates");
		oout.flush();
		oout.close();
		LOGGER.info("The recording stream is closed");
	}

	/**
	 * method for reading information about ban dates on subsequent launches of the application
	 */
	@SuppressWarnings("unchecked")
	private void readReadyFile() {
		try {
			oin = new ObjectInputStream(fin);
		} catch (IOException e1) {
			LOGGER.warn("Error while creating read stream!!!");
		}
		try {
			regions = (List<Region>) oin.readObject();
			LOGGER.info("Reading information about ban dates on subsequent launches of the application");
		} catch (ClassNotFoundException | IOException e) {
			LOGGER.warn("Error when reading information about ban dates from a file!!!");
		} finally {
			try {
				oin.close();
				LOGGER.info("The writing stream is closed");
			} catch (IOException e) {
				LOGGER.warn("The writing stream isn't closed!!!");
			}
		}
	}
	
	/**
	 * method of recording information about different types of fish when the application is first launched
	 */
	private void writeNewFileFishInfo(File file) throws IOException, FileNotFoundException {
		file.createNewFile();
		FileOutputStream fout = new FileOutputStream(file, true);
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		catalog = Helper.createCatalogFish();
		oout.writeObject(catalog);
		LOGGER.info("First start application.Created new file and recording information about ban dates");
		oout.flush();
		oout.close();
		LOGGER.info("The recording stream is closed");
	}

	/**
	 * method for reading information about different types of fish on subsequent launches of the application
	 */
	private void readReadyFileFishInfo() {
		try {
			oin1 = new ObjectInputStream(fin1);
		} catch (IOException e1) {
			LOGGER.warn("Error while creating read stream!!!");
		}
		try {
			catalog = (CatalogFish<?>) oin1.readObject();
			LOGGER.info("Reading information about ban dates on subsequent launches of the application");
		} catch (ClassNotFoundException | IOException e) {
			LOGGER.warn("Error when reading information about ban dates from a file!!!");
		} finally {
			try {
				oin1.close();
				LOGGER.info("The writing stream is closed");
			} catch (IOException e) {
				LOGGER.warn("The writing stream isn't closed!!!");
			}
		}
	}
}
