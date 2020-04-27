package model;

import java.util.Date;

/**
 * POJO class to contain the information of transaction A transaction having a
 * date and the amount on that date
 * 
 * @author Mohan
 *
 */
public class Transaction {
	public Transaction(Date date, int amount) {
		this.date = date;
		this.amount = amount;
	}

	public Date date;
	public int amount;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
