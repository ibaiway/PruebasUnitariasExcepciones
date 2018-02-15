import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		Calculadora casio = new Calculadora();
		try{
			casio.suma();
			fail("Not yet implemented");
		}catch (NumberFormatException e) {
			
		}
	}
	
	@org.junit.Test (expected=Exception.class)
	public void testCalculaDivision() throws Exception {
		Calculadora casio = new Calculadora();
	casio.division();
	}

}
