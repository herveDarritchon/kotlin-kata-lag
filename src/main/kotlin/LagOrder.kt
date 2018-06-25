class LagOrder {
    fun compute(vararg ordersAsStrings: String): Int {

        return ordersAsStrings.mapNotNull { Order.from(it) }
                .map { it.price }
                .reduce { acc, next -> acc + next }
    }

}
