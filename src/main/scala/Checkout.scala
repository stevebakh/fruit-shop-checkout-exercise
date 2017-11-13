object Checkout {

  def calculateTotal(items: List[Fruit]): BigDecimal = {
    val total = items.map(_.price).sum
    total - bogofDiscount(items) - threeForTwoDiscount(items)
  }

  private def bogofDiscount(items: List[Fruit]): BigDecimal = {
    val applesAndBananas = items.collect {
      case a: Apple.type => a
      case b: Banana.type => b
    }.sortBy(_.price)

    applesAndBananas.take(applesAndBananas.size / 2).map(_.price).sum
  }

  private def threeForTwoDiscount(items: List[Fruit]): BigDecimal = {
    items.collect { case o: Orange.type => o }
      .grouped(3)
      .count(_.size == 3) * Orange.price
  }
}
