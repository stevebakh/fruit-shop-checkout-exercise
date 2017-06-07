object Checkout {

  def calculateTotal(items: List[Fruit]): BigDecimal = {
    items.groupBy(identity).map {
      case (Apple, apples) => BigDecimal(0.60) * ((apples.size + 1) / 2)
      case (Orange, oranges) => BigDecimal(0.25) * oranges.size
    }.sum
  }
}
