package sio;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class Fusion4 {
	public static void main(String[] args) throws IOException {
		List<Customer> listeClients;
		listeClients = new ArrayList<Customer>();

		Reader inFrench = new FileReader("D:\\Travail\\BTS\\Code\\Kpu\\POO-java\\french-client.csv");
		Reader inGerman = new FileReader("D:\\Travail\\BTS\\Code\\Kpu\\POO-java\\german-client.csv");

		CSVParser frenchRecords = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(inFrench);
		CSVParser germanRecords = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(inGerman);
		List<CSVRecord> listFr = frenchRecords.getRecords();
		List<CSVRecord> listGr = germanRecords.getRecords();

		int iFr = 0;
		int iGr = 0;

		boolean french = false;
		Customer client = null;

		while (iFr < listFr.size() || iGr < listGr.size()) {
			if (french && iFr < listFr.size()) {
				String id = listFr.get(iFr).get("Number");
				String name = listFr.get(iFr).get("GivenName");
				client = new Customer(Integer.parseInt(id), name);
				iFr++;
			} else if (iGr < listGr.size()) {
				String id = listGr.get(iGr).get("Number");
				String name = listGr.get(iGr).get("GivenName");
				client = new Customer(Integer.parseInt(id), name);
				iGr++;
			}
			listeClients.add(client);
			french = !french;
		}

		for (int i = 0; i < listeClients.size(); i++) {
			System.out.println(listeClients.get(i));
		}
	}
}