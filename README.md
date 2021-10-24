# The-Retail-Store-Discounts
On a retail website, the following discounts apply:

1.If the user is an employee of the store, he gets a 30% discount

2.If the user is an affiliate of the store, he gets a 10% discount

3.If the user has been a customer for over 2 years, he gets a 5% discount.

4.For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 as a discount).

5.The percentage based discounts do not apply on groceries.

6.A user can get only one of the percentage based discounts on a bill.

# General Information
The project is based on a small java program to simulate the retail discounts which uses the following technologies:

Java 1.8

JUnit for Unit Tests

Spring Tool Suite to run and test the program

Since the program is created in Eclipse it is recommended to also run and test it by importing it into Eclipse though other IDE's can also be used. You can run the program by executing shopping.Main.java file in Eclipse

Furthermore, unit tess are provided that can run by executing shopping.test.TestDiscounts and shopping.test.TestWithoutDiscounts. To get the complete test coverage just run JUnit Tests in IDE.

Comments are provided in the code and test cases for briefly describe the functionality and approach.

In case of any errors make sure that the jars under the lib folder is included in the build path.

# The Solution

Items represent goods/products that can be placed in the cart.

A cart contains a number of items, and can compute the total price of its contents.

Cart items can either be actual products with a fixed unit price, or products with a pricing policy attached for any dicounts that are calculated based on items and not the overall discount policy of current cart.

DiscountPolicy is used to calculate or apply different discounts based on overall cart value of contents.
