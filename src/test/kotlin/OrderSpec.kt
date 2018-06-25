import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.Assertions

object OrderSpec : Spek({
    given("a parser") {
        on("the reception of a order as a string") {
            val order = Order.from("AF34 0 5 12")
            it("should return an order matching the field") {
                Assertions.assertEquals(Order("AF34",0,5,12), order)
            }
        }
        on("the reception of an empty string") {
            val order = Order.from("")
            it("should return null") {
                Assertions.assertEquals(null, order)
            }
        }
    }
})