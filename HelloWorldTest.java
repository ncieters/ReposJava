import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void testAjouter() {
		
		HelloWorld testHelloWorld = new HelloWorld();
		int somme = testHelloWorld.sommeEntier(2, 3);
		assertEquals(5, somme);
	
	}

}
