object Checkout {

  def calculateTotal(items: List[Fruit]): BigDecimal =
    items.map {
      case Apple => BigDecimal(0.60)
      case Orange => BigDecimal(0.25)
    }.sum
}
