sealed trait Fruit {
  val price: BigDecimal
}

case object Apple extends Fruit {
  override val price: BigDecimal = 0.60
}

case object Orange extends Fruit {
  override val price: BigDecimal = 0.25
}

case object Banana extends Fruit {
  override val price: BigDecimal = 0.20
}