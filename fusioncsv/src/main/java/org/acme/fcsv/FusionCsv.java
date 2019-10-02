package org.acme.fcsv;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class FusionCsv {

	private String fileName1;
	private String fileName2;
	private List<Client> clients;

	public FusionCsv(String fileName1, String fileName2) throws IOException {
		this.fileName1 = fileName1;
		this.fileName2 = fileName2;
		this.clients = new ArrayList<Client>();

		Reader inFrench = new FileReader(fileName1);
		Reader inGerman = new FileReader(fileName2);

		CSVParser frenchRecords = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(inFrench);
		CSVParser germanRecords = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(inGerman);
	

		Client client;
		for (CSVRecord record : frenchRecords) {

			String id = record.get("Number");
			String name = record.get("GivenName");
			String gender = record.get("Gender");
			String email = record.get("EmailAddress");
			String title = record.get("Title");
			String surname = record.get("Surname");
			LocalDate birthday = LocalDate.parse(record.get("Birthday"));
			String country = record.get("NameSet");
			String creditCard = record.get("CCNumber");
			String height = record.get("Centimeters");

			client = new Client(Integer.parseInt(id), gender, birthday, title, name, surname, email, country,
					creditCard, height);
			clients.add(client);

		}

		for (CSVRecord record : germanRecords) {

			String id = record.get("Number");
			String name = record.get("GivenName");
			String gender = record.get("Gender");
			String email = record.get("EmailAddress");
			String title = record.get("Title");
			String surname = record.get("Surname");
			LocalDate birthday = LocalDate.parse(record.get("Birthday"));
			String country = record.get("NameSet");
			String creditCard = record.get("CCNumber");
			String height = record.get("Centimeters");

			client = new Client(Integer.parseInt(id), gender, birthday, title, name, surname, email, country,
					creditCard, height);
			clients.add(client);

		}

	}

	void exportTo(String fileName) throws IOException {
		FileWriter fw = new FileWriter(fileName);
		List<Client>  clients = null;
		Client test = new Client(0, "ttt", null, null, null, null, null, null, null, null);
		
		for (int i = 0; i < clients.size(); i++) {
			fw.write(test.toCsv());

		}
		fw.close();
	}

	public boolean checkHeight(String strFeetInches, String strCentimeters) {
		String feetInchesCut = strFeetInches.charAt(0) + "" + strFeetInches.charAt(2);
		int feetInCm = Integer.parseInt(feetInchesCut)* 3048;
				

		if (Integer.toString(feetInCm).substring(0, 3).equals(strCentimeters)) {

			return true;

		} else {
			return false;

		}

	}

	public ArrayList<Client> getClientBadCC(List<Client> clients) {
	  ArrayList<Client> clientsBadCC = new ArrayList<Client>();
	  int ct = 0;
	int checkClient = Integer.parseInt(clients.get(ct).getCreditCard());
	  for(int i = 0; i < clients.size(); i++) {
		  if(checkClient == Integer.parseInt(clients.get(i).getCreditCard())) {
			  clientsBadCC.add(clients.get(i));
			  
		  }
		  
		  
	  }
	  ct++;  
	  return clientsBadCC;
		  
		  
		  
	  }

	public ArrayList<Client> getClientsBadHeight() {
		return null;

	}

	public int getAvgHeight(List<Client> clients) {
		int avgHeight = 0;
		for (int i = 0; i < clients.size(); i++) {
			avgHeight += Integer.parseInt(clients.get(i).getHeight());
			
		}
		System.out.println(avgHeight / clients.size());
		return avgHeight / clients.size();
	}
	
	public int getAvgHeightMale() {
		int avgHeightMale = 0;
		int ctMale = 0;
		for (int i = 0; i < clients.size(); i++) {
			avgHeightMale += Integer.parseInt(clients.get(i).getHeight());
			ctMale++;
		}
		
		return Math.round(avgHeightMale/ctMale);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}