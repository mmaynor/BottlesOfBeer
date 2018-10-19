//import org.slf4j.Logger;


public class BottlesOfBeer {
	
	//private static final Logger LOGGER = LoggerFactory.getLogger(BottlesOfBeer.class);
	
	public static void main(String[] args) {

		BottlesOfBeerDelegate bottlesOfBeerDelegate = new BottlesOfBeerDelegate();
		CompanyTypeDTO miller;
		CompanyTypeDTO guinny;
		CompanyTypeDTO corona;
		Gson gson = new Gson();

		// bottlesOfBeerDelegate.determineBottlesOfBeerLeft(99);
		/*
		 * private String color; private String qty; private String size;
		 */
		try {
			miller = new CompanyTypeDTO("light", "24", "12oz.");
			System.out.println("miller: " + miller.toString());
			System.out.println("miller: " + gson.toJson(miller));
			guinny = new CompanyTypeDTO("dark", "12", "12oz.");
			System.out.println("guinny: " + miller.toString());
			corona = new CompanyTypeDTO("light", "1", "40oz.");
			System.out.println("corona: " + miller.toString());
			//LOGGER.info("miller: " + miller.toString());
		} catch (Exception e) {

		}

	}
}
