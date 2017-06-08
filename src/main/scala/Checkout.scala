object Checkout {

  def calculateTotal(items: List[Fruit]): BigDecimal = {
    val total = items.map(_.price).sum
    total - bogofDiscount(items) - threeForTwoDiscount(items)
  }

  private def bogofDiscount(items: List[Fruit]): BigDecimal = {
    val applesAndBananas = items.filter {
      case (Apple | Banana) => true
      case _ => false
    }.sortBy(_.price)

    applesAndBananas.take(applesAndBananas.size / 2).map(_.price).sum
  }

  private def threeForTwoDiscount(items: List[Fruit]): BigDecimal = {
    val oranges = items.filter {
      case Orange => true
      case _ => false
    }

    if (oranges.size < 3)
      0
    else
      oranges.grouped(3).count(_.size == 3) * Orange.price
  }
}
