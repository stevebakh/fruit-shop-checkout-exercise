import org.scalatest.{FunSpec, Matchers}

class CheckoutTest extends FunSpec with Matchers {

  describe("Calculate the cost of a single piece of fruit") {
    it("An apple costs 60p") {
      Checkout.calculateTotal(List(Apple)) should equal(BigDecimal(0.60))
    }

    it("An orange costs 25p") {
      Checkout.calculateTotal(List(Orange)) should equal(BigDecimal(0.25))
    }
  }

  describe("Calculate the cost for multiple pieces of fruit") {
    it("Calculate the total cost for multiple apples") {
      Checkout.calculateTotal(List(Apple, Apple)) should equal(BigDecimal(1.20))
    }

    it("Calculate the total cost for multiple oranges") {
      Checkout.calculateTotal(List(Orange, Orange)) should equal(BigDecimal(0.50))
    }

    it("Calculate the total cost for a mix of apples and oranges") {
      Checkout.calculateTotal(List(Apple, Apple, Orange, Apple)) should equal(BigDecimal(2.05))
    }
  }
}
