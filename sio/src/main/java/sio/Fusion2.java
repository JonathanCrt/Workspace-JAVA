package sio;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Fusion2 {
	public static void main(String[] args) throws IOException {
		List<Customer> listCustomers;
		listCustomers = new ArrayList<Customer>();

		Reader in = new FileReader("D:\\Travail\\BTS\\Code\\Kpu\\POO-java\\french-client-small.csv");
		Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
		for (CSVRecord record : records) {
			String id = record.get("Number");
			String name = record.get("GivenName");
			Customer co = new Customer(Integer.parseInt(id), name);

			listCustomers.add(co);
		}
		Collections.sort(listCustomers);
		for (int i = 0; i < listCustomers.size(); i++) {

			System.out.println(listCustomers.get(i));
			// Attention au manque du get(i) sinon la liste va s'afficher 3 fois
		}
	}

}
