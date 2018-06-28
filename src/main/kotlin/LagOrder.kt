class LagOrder {
    fun compute(vararg ordersAsStrings: String): Int {

        return ordersAsStrings.mapNotNull { Order.from(it) }
                .map { it.price }
                .reduce { acc, next -> acc + next }
    }

    //TODO reprendre la proposition de fibonacci https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines.experimental/build-sequence.html
    fun areCompatible(orders: List<Order>): Boolean {
        return orders.map { Pair(it, true) }
                .reduce { acc, pair -> Pair(pair.first, acc.first.departureTime + acc.first.duration <= pair.first.departureTime && acc.second)  }
                .second
    }

}
