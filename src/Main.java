import java.text.ParseException;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.CustomerTransaction;
import service.CalculateRewards;

/**
 * 
 * main class to run the program
 * 
 * @author Mohan
 *
 */

public class Main {

	static String DATE_FORMATTER = "dd-MM-yyyy HH:mm:ss";

	/**
	 * main method
	 * 
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		// Initializing ReadInput class to read the input sample
		ReadInput ri = new ReadInput();
		// Reading the json input as string from input file
		String json = ri.readJson();
		// Initializing the gson builder with date format
		Gson gson = new GsonBuilder().setDateFormat(DATE_FORMATTER).create();
		// Converting the json into list of CustomerTransaction object
		CustomerTransaction[] ct = gson.fromJson(json, CustomerTransaction[].class);
		for (CustomerTransaction customerTransaction : ct) {
			System.out.println("\nGetting rewards for customer : " + customerTransaction.getCustomerName());
			// Print monthly rewards and returning all as map for quarte
			Map<Integer, Integer> map = CalculateRewards.printMonthlyRewards(customerTransaction.getTransactions());
			// Print quarterly rewards
			CalculateRewards.printQuarterlyRewards(map);
		}
	}
}
