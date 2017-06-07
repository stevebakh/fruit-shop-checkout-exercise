import org.scalatest.{FunSpec, Matchers}

class CheckoutTest extends FunSpec with Matchers {

  describe("Calculate the cost of a single piece of fruit") {
    it("An apple costs 60p") {
      Checkout.calculateTotal(List(Apple)) should equal(0.60)
    }

    it("An orange costs 25p") {
      Checkout.calculateTotal(List(Orange)) should equal(0.25)
    }
  }

  describe("Calculate the cost for multiple pieces of fruit") {
    it("Calculate the total cost for multiple apples") {
      // there's a 'buy one get one free' offer on apples
      Checkout.calculateTotal(List(Apple, Apple)) should equal(0.60)
      Checkout.calculateTotal(List(Apple, Apple, Apple)) should equal(1.20)
      Checkout.calculateTotal(List(Apple, Apple, Apple, Apple)) should equal(1.20)
      Checkout.calculateTotal(List(Apple, Apple, Apple, Apple, Apple)) should equal(1.80)
    }

    it("Calculate the total cost for multiple oranges") {
      // there's a '3 for the price of 2' offer on oranges
      Checkout.calculateTotal(List(Orange, Orange)) should equal(0.50)
      Checkout.calculateTotal(List(Orange, Orange, Orange)) should equal(0.50)
      Checkout.calculateTotal(List(Orange, Orange, Orange, Orange)) should equal(0.75)
    }

    it("Calculate the total cost for one apple and one orange") {
      Checkout.calculateTotal(List(Apple, Orange)) should equal(0.85)
    }

    it("Calculate the total cost for a mix of apples and oranges") {
      Checkout.calculateTotal(List(Apple, Apple, Orange, Apple)) should equal(1.45)
    }
  }
}
