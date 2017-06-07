object Checkout {

  def calculateTotal(items: List[Fruit]): BigDecimal = {
    items.groupBy(identity).map {
      case (a @ Apple, apples) => a.price * ((apples.size + 1) / 2)
      case (o @ Orange, oranges) => o.price * ((oranges.size + 1) * 2 / 3)
    }.sum
  }
}
