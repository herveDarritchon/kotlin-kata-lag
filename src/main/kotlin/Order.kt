data class Order
(val orderId: String, val departureTime: Int, val duration: Int, val price: Int) {

    companion object {
        fun fromString(stringOrder: String): Order {
            val orderId: String = stringOrder.split(" ")[0]
            val departureTime: Int = stringOrder.split(" ")[1].toInt()
            val duration: Int = stringOrder.split(" ")[2].toInt()
            val price: Int = stringOrder.split(" ")[3].toInt()
            return Order(orderId, departureTime, duration, price)
        }
    }
}
