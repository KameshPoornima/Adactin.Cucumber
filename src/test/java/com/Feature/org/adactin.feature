Feature: Adactin Hotal Booking

Scenario: Adactin Hotal Login Functionality
Given  Broswer Launched
When URl link opened
When User Enters on "Kameshpoorni" in username field
When User Enters on "B25KWU" in password field
And Click on Login button
Then Verifies the login functionality is successfully logined
And navigate to the Search Hotal page

Scenario: Search Hotal Page Functionality
Given  User enters on Details in Manidatory Field
When User Select a location in location field
When User Select a Hotals in Hotals Field
When User Select a Room Type in Room Type Field
When User select a Number of Rooms in NOR Field
When User enters on check in date in Check in date Field
When User enters on check out date in Check out date Field
When User Select a Adults per Room in Adults per Room Field
When User Select a Children per Room in Children per Room Field
When if any issues Click on Reset button or if ok click on search button 
Then If verifes The Search Hotal Page an move to next page is successful
And navigate to the Select Hotal  page

Scenario: Select Hotal Page Functionality
Given User click to select the Hotal on Select field
When if user Given  any incorrect Details cilck on Cancle Button Or if ok Click on Continue Button
Then Verifies the Select Hotal page is successfully Move to Next page
And navigate to Book a Hotal Page

Scenario: Book a Hotal page Functionality
Given User  check the Details in Manidatory Field 
When User enters on Frist name in frist name field
When User enters on last name in last name field
When User enters on Billing Address in Billing Address field
When User enters on Credit Card No in Credit Card No field
When User Select a Credit Card Type in Credit Card Type field
When User Select a Expiry Date in Expiry Date field
When User enters on CVV Number in CVV Number field
When if ok for user Given details Click on Book Button or if any in corrct details Click on cancel Button
Then if verify the user is Successful hotal booking
And navigate To Booked Itinerary Page

Scenario: Myitinerary page Functionality
Given User select a Orders 
When Click on Cancel Button
Then if verifies the Booking Cancel
And navigate LogOut page

Scenario: Adactin Hotal Logout Functionality
Given Click on LogOut Button 
Then if adactin Hotal Booking page is successfully LogOut
And Broswer will be Closed








