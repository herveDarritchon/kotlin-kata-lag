import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Created by Hervé Darritchon on 20/06/2018.
 *
 */

class OrderShould {
    @Test
    internal fun ReturnAnOrderWhenParsingASingleLineOrderList() {
        val order : Order  = Order.fromString("AF34 0 5 12")
        assertEquals("AF34", order.orderId)
        assertEquals(0, order.departureTime)
        assertEquals(5, order.duration)
        assertEquals(12, order.price)
    }
}