data class Order
(val orderId: String, val departureTime: Int, val duration: Int, val price: Int) {

    companion object {
        fun from(stringOrder: String): Order? {
            if (stringOrder.isEmpty()) return null
            val parts = stringOrder.split(" ")
            val orderId: String = parts[0]
            val departureTime: Int = parts[1].toInt()
            val duration: Int = parts[2].toInt()
            val price: Int = parts[3].toInt()
            return Order(orderId, departureTime, duration, price)
        }
    }
}