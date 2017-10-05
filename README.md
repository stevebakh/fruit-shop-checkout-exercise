# Pairing exercise: fruit shop
A fruit shop is having a new EPOS developed, and you are tasked with building the checkout system.

## Part 1
Build a checkout system which takes a list of items scanned at the till and outputs the total cost.
* The shop only sells apples and oranges
* Apples cost 60p and oranges cost 25p
* Example: [ Apple, Apple, Orange, Apple ] => £2.05
* The code doesn't need to run in a terminal; the checkout is a piece of library code

## Part 2
Update the existing checkout code to support a "buy one get one free" offer on apples.

## Part 3
Update the existing checkout code to support a "3 for the price of 2" offer on oranges.

## Bonus round
Business is booming! The fruit shop decides to expand. Update the existing checkout code to support the sale of bananas.
* Bananas cost 20p
* Bananas are included in the **same** "buy one get one free" offer as the apples
* When apples and bananas are mixed, the cheapest item in the offer is free
