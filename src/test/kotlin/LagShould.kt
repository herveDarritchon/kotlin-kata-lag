import jdk.nashorn.internal.ir.annotations.Ignore
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

/**
 * Created by Hervé Darritchon on 18/06/2018.
 */
class LagShould {

    companion object {
        @BeforeAll
        @JvmStatic
        fun beforeAllTestCases() {
            println("Runs once before all test cases.")
        }

        @AfterAll
        @JvmStatic
        fun afterAllTestCases() {
            println("Runs once after all test cases.")
        }
    }

    @Test
    fun aOneClientOrderReturnCustomerPriceProposal() {
        assertEquals(12, LagOrder().compute("AF34 0 3 12"))
    }

    @Test
    fun `return Sum Of Values For Two Compatible Orders`() {
        assertEquals(15, LagOrder().compute("AF34 0 3 12", "AT000 10 10 3"))
    }
    @Test @Disabled
    fun `return Max Price Of Values For Two Incompatible Orders`() {
        assertEquals(18, LagOrder().compute("AF34 0 3 12", "AT000 2 10 18"))
    }

    @Test
    fun `return if orders are compatible`() {
        assertEquals(true, LagOrder().areCompatible(listOf(Order("AF34", 0, 3,12))))
    }

    @Test
    fun `return if orders are incompatible`() {
        assertFalse(LagOrder().areCompatible((
                listOf(
                        Order("ABC", 2, 5, 18),
                        Order("AF34", 0, 3,12)
                ))))
    }
}