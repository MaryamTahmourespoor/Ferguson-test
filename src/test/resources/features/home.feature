Feature: Title of your feature


#Background: give url
#Given user login in homepage 

@Test
Scenario: Search in the search bar
Given user login in homepage 
When Search in the search bar
Then expected by checking the product brand and product id

@Test
Scenario: search For Product Lands On Correct Product
Given Go to the Bathroom Sinks category directly 
When click the second product
And the product added to the cart
Then give message and the product that is added to the cart is what is expected

@Test
Scenario: add Multiple Cart Items And Change Quantity
Given user login in homepage 
When Search in the search bar
And Add two different finishes of a product to cart
And change the quantity of each finish on the cart page
Then cart total update as expected when the quantity is changed

@Test
Scenario: facet Narrow Bys Result In Correct Product Counts
Given user login in homepage 
When click on category drop page
And filter Brand and filter finish
And User should see number results for product
And add filter 
Then User should see lower number of results whan adding a layer of filter
