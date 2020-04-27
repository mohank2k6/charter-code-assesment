# Coding Assessment for Charter

**Problem statement:**
A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.

A customer receives 2 points for every doller spend over $100 in each transaction, plus 1 point for every doller spend over 50$ in each transaction.

E.G. a $120 purchase = 2 * $20 + 1 * $50 = 90  points

Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total.

# Solution:

*IT's a core java project. To run the program just run the main method.*

**Input sample:**
[ {
	"customerName" : "Mohan",
	"transactions" : [ {
		"date" : "30-04-2020 23:37:50",
		"amount" : "120"
	}, {
		"date" : "03-03-2020 23:37:50",
		"amount" : "100"
	}, {
		"date" : "10-02-2020 23:37:50",
		"amount" : "60"
	} ]
}, {
	"customerName" : "Shubham",
	"transactions" : [ {
		"date" : "28-05-2020 23:37:50",
		"amount" : "150"
	}, {
		"date" : "03-06-2020 23:37:50",
		"amount" : "70"
	}, {
		"date" : "10-07-2020 23:37:50",
		"amount" : "200"
	} ]
} ]

**Output of the program:**

Getting rewards for customer : Mohan
Reward points for month of February : 10
Reward points for month of March : 50
Reward points for month of April : 90
Total reward points for [ January February March] quarter : 60
Total reward points for [ April May June] quarter : 90
Total reward points for [ July August September] quarter : 0
Total reward points for [ October November December] quarter : 0

Getting rewards for customer : Shubham
Reward points for month of May : 150
Reward points for month of June : 20
Reward points for month of July : 250
Total reward points for [ January February March] quarter : 0
Total reward points for [ April May June] quarter : 170
Total reward points for [ July August September] quarter : 250
Total reward points for [ October November December] quarter : 0