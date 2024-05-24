import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Task5GroupedT2T3Test {

    @Test
    fun maxDigit() {
        var res = Task5GroupedT2T3()
        assertEquals(7, res.maxDigit(1234567))
        assertEquals(9, res.maxDigit(987654321))
        assertEquals(5, res.maxDigit(5050505))
    }

    @Test
    fun minOddDigit() {
        var res = Task5GroupedT2T3()
        assertEquals(1, res.minOddDigit(1234567))
        assertEquals(1, res.minOddDigit(987654321))
        assertNull(res.minOddDigit(2468))
        assertEquals(5, res.minOddDigit(5050505))
    }

    @Test
    fun gcd() {
        var res = Task5GroupedT2T3()
        assertEquals(6, res.gcd(54, 24))
        assertEquals(1, res.gcd(17, 13))
        assertEquals(25, res.gcd(100, 25))
    }

    @Test
    fun maxDigitRecursive() {
        var res = Task5GroupedT2T3()
        assertEquals(7, res.maxDigitRecursive(1234567))
        assertEquals(9, res.maxDigitRecursive(987654321))
        assertEquals(5, res.maxDigitRecursive(5050505))
    }

    @Test
    fun minOddDigitRecursive() {
        var res = Task5GroupedT2T3()
        assertEquals(1, res.minOddDigitRecursive(1234567))
        assertEquals(1, res.minOddDigitRecursive(987654321))
        assertNull(res.minOddDigitRecursive(2468))
        assertEquals(5, res.minOddDigitRecursive(5050505))
    }

    @Test
    fun gcdRecursive() {
        var res = Task5GroupedT2T3()
        assertEquals(6, res.gcdRecursive(54, 24))
        assertEquals(1, res.gcdRecursive(17, 13))
        assertEquals(25, res.gcdRecursive(100, 25))
    }

    @Test
    fun maxDigitTailRec() {
        var res = Task5GroupedT2T3()
        assertEquals(7, res.maxDigitTailRec(1234567))
        assertEquals(9, res.maxDigitTailRec(987654321))
        assertEquals(5, res.maxDigitTailRec(5050505))
    }

    @Test
    fun minOddDigitTailRec() {
        var res = Task5GroupedT2T3()
        assertEquals(1, res.minOddDigitTailRec(1234567))
        assertEquals(1, res.minOddDigitTailRec(987654321))
        assertNull(res.minOddDigitTailRec(2468))
        assertEquals(3, res.minOddDigitTailRec(5050365))
    }

    @Test
    fun gcdTailRec() {
        var res = Task5GroupedT2T3()
        assertEquals(6, res.gcdRecursive(54, 24))
        assertEquals(1, res.gcdRecursive(17, 13))
        assertEquals(25, res.gcdRecursive(100, 25))
    }
}