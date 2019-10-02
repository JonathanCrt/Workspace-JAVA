package faceCast;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class TestUnit {

	JsonNode body;
	HttpResponse<JsonNode> response;
	HttpResponse<JsonNode> responseExtra;
	HttpResponse<JsonNode> responseOffer;
	

	@Before
	public void setUp() throws UnirestException {

		response = Unirest.get("http://localhost:3000/rest/candidacy").asJson();
		body = response.getBody();
		responseExtra = Unirest.get("http://localhost:3000/rest/extra").asJson();
		responseOffer = Unirest.get("http://localhost:3000/rest/offer").asJson();
		
	}
	
	
	@Test
	public void testCandidatureAnnullée() {
		try {
			Unirest.get("http://localhost:3000/rest/candidacy").asJson();
			
			assertEquals("Annulée", response.getBody().getArray().getJSONObject(0).get("etat"));
		}
		catch (UnirestException e) {
			fail("Error : Aucune candidature n'a l'état annulée!");
		}
	}
	
	
	@Test
	public void testnbCandidature() {
		assertEquals(6, response.getBody().getArray().length());
		
		
	}
	
	@Test
	public void testIdExtraAndIdOffer() {

		// Test IdExtra
		assertEquals("59f1dbd830e2ea92834cc568", body.getArray().getJSONObject(0).getString("idExtra"));
		// Test IdOffer
		assertEquals("5b00352b1041710047c609ec", body.getArray().getJSONObject(0).getString("idOffer"));

		

	}
	@Test
	public void testEtat() {

		assertNotNull(response);
		
	}
	
	@Test
	public void testGothamOffer() {
		
		assertEquals("Gotham", responseOffer.getBody().getArray().getJSONObject(2).getString("nameEvenement"));
	}
	
	
	/*
	@Test
	public void testUserEmail() {
		try {
			 Unirest.get("http://localhost:3000/rest/checking/Harry.wicket@usMail.com").asJson();
			assertEquals(3, responseExtra.getBody().getArray().length());
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			fail("Error : number of objects in the json is false");
			e.printStackTrace();
		}

	} */
	
	
	
	
	/*
	@Test
	public void myApplications() {
		try {
			HttpResponse<JsonNode> responseCandidacy = Unirest
					.get("http://localhost:3000/rest/candidacy/59f1dbd830e2ea92834cc568").asJson();
			assertEquals(1, responseCandidacy.getBody().getArray().length());
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			fail("Error : number of objects in the json");
			e.printStackTrace();
		}

	}
	*/
	
	
	
	
	
	
}
