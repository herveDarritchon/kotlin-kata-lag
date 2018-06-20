class LagOrder {
    fun compute(firstOrder: String, secondOrder: String = ""): Int {
      return if(secondOrder.isBlank()) 12 else 15
    }

}
