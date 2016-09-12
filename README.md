<b>Restful Transaction Web Service</b>

It is a RESTful web service that stores some transactions (in memory) and returns information about those transactions. 
The transactions to be stored have a type and an amount. The service should support returning all transactions of a type. 
Also, transactions can be linked to each other (using a "parent_id") and you can know the total amount involved for all transactions 
linked to a particular transaction.

Some Examples:

Request: PUT /transactionservice/transaction/10  </br>
Body: { "amount": 5000, "type":"cars" } </br>
Response: { "status": "ok" }</br>

Request: PUT /transactionservice/transaction/11 </br>
Body: { "amount": 10000, "type": "shopping", "parent_id": 10 } </br>
Response: { "status": "ok" } </br>

Request: GET /transactionservice/types/cars </br>
Response: [10] </br>

Request: GET /transactionservice/sum/10 </br>
Response: {"sum":15000} </br>
