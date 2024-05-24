import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Task3ReccurentFunctionsTest {

    @Test
    fun testMaxDigitRecursive() {
        var reccFun = Task3ReccurentFunctions();
        assertEquals(7, reccFun.maxDigitRecursive(1234567))
        assertEquals(9, reccFun.maxDigitRecursive(987654321))
        assertEquals(5, reccFun.maxDigitRecursive(5050505))
    }

    @Test
    fun testMinOddDigitRecursive() {
        var reccFun = Task3ReccurentFunctions();
        assertEquals(1, reccFun.minOddDigitRecursive(1234567))
        assertEquals(1, reccFun.minOddDigitRecursive(987654321))
        assertNull(reccFun.minOddDigitRecursive(2468))
        assertEquals(5, reccFun.minOddDigitRecursive(5050505))
    }

    @Test
    fun testGcdRecursive() {
        var reccFun = Task3ReccurentFunctions();
        assertEquals(6, reccFun.gcdRecursive(54, 24))
        assertEquals(1, reccFun.gcdRecursive(17, 13))
        assertEquals(25, reccFun.gcdRecursive(100, 25))
    }

    @Test
    fun testMaxDigitTailRec() {
        var reccFun = Task3ReccurentFunctions();
        assertEquals(7, reccFun.maxDigitTailRec(1234567))
        assertEquals(9, reccFun.maxDigitTailRec(987654321))
        assertEquals(5, reccFun.maxDigitTailRec(5050505))
    }

    @Test
    fun testMinOddDigitTailRec() {
        var reccFun = Task3ReccurentFunctions();
        assertEquals(1, reccFun.minOddDigitTailRec(1234567))
        assertEquals(1, reccFun.minOddDigitTailRec(987654321))
        assertNull(reccFun.minOddDigitTailRec(2468))
        assertEquals(5, reccFun.minOddDigitTailRec(5050505))
    }

    @Test
    fun testGcdTailRec() {
        var reccFun = Task3ReccurentFunctions();
        assertEquals(6, reccFun.gcdTailRec(54, 24))
        assertEquals(1, reccFun.gcdTailRec(17, 13))
        assertEquals(25, reccFun.gcdTailRec(50, 25))
    }
}