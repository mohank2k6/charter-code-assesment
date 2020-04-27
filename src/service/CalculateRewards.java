package service;

import java.text.DateFormatSymbols;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Transaction;

/**
 * 
 * Calculating the rewards points for monthly and quarterly basis
 * 
 * @author Mohan
 *
 */

public class CalculateRewards {
	/**
	 * 
	 * @param transactions
	 *            list of transaction for a customer
	 * @return map of month and the calculated rewards
	 */
	public static Map<Integer, Integer> printMonthlyRewards(List<Transaction> transactions) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		// Loop starting from Jan (0) month to Dec(11)
		for (int i = 0; i < 12; i++) {
			int totalRewards = 0;
			for (Transaction transaction : transactions) {
				Date date = transaction.getDate();
				int amount = transaction.getAmount();
				int m = date.getMonth();
				if (i == m) {
					int rewardPointsAbove100 = 0;
					int rewardPointsAbove50 = 0;
					if (amount / 50 == 1) {
						rewardPointsAbove50 = amount - 50;
					} else if (amount / 50 > 1) {
						rewardPointsAbove50 = 1 * 50;
						rewardPointsAbove100 = 2 * (amount - 100);
					}
					totalRewards = totalRewards + rewardPointsAbove100 + rewardPointsAbove50;
				}
			}
			if (totalRewards > 0) {
				String month = new DateFormatSymbols().getMonths()[i];

				System.out.println("Reward points for month of " + month + " : " + totalRewards);
			}
			map.put(i, totalRewards);
		}
		return map;
	}

	/**
	 * This method will print the rewards for a given quarter
	 * 
	 * @param map
	 *            map of the month and the calculated rewards for month basis
	 */
	public static void printQuarterlyRewards(Map<Integer, Integer> map) {
		int totalRewards = 0;
		int monthCounter = 1;
		String quarter = "";
		for (int j = 0; j < 12; j++) {
			totalRewards = totalRewards + map.get(j);
			quarter = quarter + " " + new DateFormatSymbols().getMonths()[j];
			if (monthCounter == 3) {
				System.out.println("Total reward points for [" + quarter + "] quarter : " + totalRewards);
				totalRewards = 0;
				monthCounter = 0;
				quarter = "";
			}
			monthCounter++;
		}

	}
}
