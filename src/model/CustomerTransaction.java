package model;

import java.util.List;

/**
 * POJO class to contain the information of customer and transactions
 * 
 * @author Mohan
 *
 */
public class CustomerTransaction {
	public String customerName;
	public List<Transaction> transactions;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
}
