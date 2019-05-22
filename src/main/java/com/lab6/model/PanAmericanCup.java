/**
 * 
 */
package com.lab6.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author ASUS
 *
 */
public class PanAmericanCup {

	private SpectatorManager spectatorManager;
	
	private ParticipantManager participantManager;
	
	private ArrayList<Person> auxList;
	
	/**
	 * 
	 */
	public PanAmericanCup() {
		spectatorManager = new SpectatorManager();
		auxList = new ArrayList<>();
	}


	public void loadData(File file) throws IOException {	
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		try {
			String line = bufferedReader.readLine();
			while (line != null) {
					String[] data = line.split(",");
					int id = Integer.parseInt(data[0]);
					String firstName = data[1];
					String lastName = data[2];
					String email = data[3];
					String gender = data[4];
					String country = data[5];
					String photo = data[6];
					@SuppressWarnings("deprecation")
					Date birthday = new Date(data[7]);
					auxList.add(new Spectator(id, firstName, lastName, email, gender, country, photo, birthday));
					line = bufferedReader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		 }
	}

}
