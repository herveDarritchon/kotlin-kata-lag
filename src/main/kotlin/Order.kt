class Order constructor(orderLine : String) {

    val orderId : String = orderLine.split(" ")[0]
    val departureTime : Int = orderLine.split(" ")[1].toInt()
    val duration : Int = orderLine.split(" ")[2].toInt()
    val price : Int = orderLine.split(" ")[3].toInt()

}
