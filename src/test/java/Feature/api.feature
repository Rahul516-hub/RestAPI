Feature: To test the ADDPlaceAPI 

@AddPlaceAPI
Scenario Outline:

Given User calls the api with "<name>" "<language>" "<address>" "<website>" "<phone_number>"
When user hits the "AddPlaceAPI" with "Post" http request
Then status code 200 should get dispayed
And in response "status" should have "OK"
And in response "scope" should have "APP"
And verify place_id created maps to "<name>" using "GetPlaceAPI"

Examples:

|name |language |address |website |phone_number|
|Rahul Raturi |English,Hindi and Garhwali |Rishilok Colony |rahul.raturi13091995@gmail.com |8958216454 |
|Ishita Pandey |English,Hindi |15 Nehru Marg Ashutosh Nagar,Rishikesh |pandeyishita70@gmail.com |9044445685 |

@DeletePlaceAPI
Scenario:

Given user calls the api with providing all details
When user hits the API
Then Message "Successful" should get displayed


