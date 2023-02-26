import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainKtTest {

    @Test
    fun sumTwoNumbersFirstTesting() {
        assertEquals(7,sumTwoNumbers(2,5))
    }

    @Test
    fun sumTwoNumbersSecondTesting() {
        assertEquals(-7,sumTwoNumbers(-2,-5))
    }

    @Test
    fun sumTwoNumbersThirdTesting() {
        assertEquals(3,sumTwoNumbers(-2,5))
    }
    @Test
    fun should_ReturnTrue_When_TheNumberIsEvent() {
        assertTrue(isEvent(4))
    }
    @Test
    fun should_ReturnFalse_When_TheNumberIsOdd() {
        assertFalse(isEvent(3))
    }

    @Test
    fun isEvent_TheNumberIsEvent_ReturnTrue() {
        assertTrue(isEvent(4))
    }
    @Test
    fun isEvent_TheNumberIsOdd_ReturnFalse() {
        assertFalse(isEvent(3))
    }

}