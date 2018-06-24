import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.Assertions

object OrderSpec : Spek({
    given("a number is being translated to roman number.") {
        on("Order from string 'AF34 0 5 12' is Order('AF34', '0', '5', '12')") {
            val order = Order.fromString("AF34 0 5 12")
            it("should return 'AF34' as order id.") {
                Assertions.assertEquals("AF34", order.orderId)
            }
        }
    }
})