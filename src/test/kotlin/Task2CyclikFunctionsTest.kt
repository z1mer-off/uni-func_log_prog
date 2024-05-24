import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Task2CyclikFunctionsTest {

    @Test
    fun maxDigittest() {
        val cycFunc = Task2CyclikFunctions()
        assertEquals(7, cycFunc.maxDigit(1234567))
        assertEquals(9, cycFunc.maxDigit(987654321))
        assertEquals(5, cycFunc.maxDigit(5050505))
    }

    @Test
    fun minOddDigit() {
        val cycFunc = Task2CyclikFunctions()
        assertEquals(1, cycFunc.minOddDigit(1234567))
        assertEquals(1, cycFunc.minOddDigit(987654321))
        assertNull(cycFunc.minOddDigit(2468))
        assertEquals(5, cycFunc.minOddDigit(5050505))
    }

    @Test
    fun testGcd() {
        val cycFunc = Task2CyclikFunctions()
        assertEquals(6, cycFunc.gcd(54, 24))
        assertEquals(1, cycFunc.gcd(17, 13))
        assertEquals(25, cycFunc.gcd(100, 25))
    }
}