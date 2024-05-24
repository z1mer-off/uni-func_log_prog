import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Task7Test {

    @Test
    fun countDivisorsNotDivisibleBy3() {
        val task = Task7()

        assertEquals(2, task.countDivisorsNotDivisibleBy3(6))
        assertEquals(3, task.countDivisorsNotDivisibleBy3(12))
        assertEquals(2, task.countDivisorsNotDivisibleBy3(15))
        assertEquals(1, task.countDivisorsNotDivisibleBy3(3))
        assertEquals(2, task.countDivisorsNotDivisibleBy3(2))
        assertEquals(1, task.countDivisorsNotDivisibleBy3(1))
    }

    @Test
    fun sumDivisorsWithConditions() {
        val task = Task7()
        assertEquals(0, task.sumDivisorsWithConditions(3))
        assertEquals(0, task.sumDivisorsWithConditions(2))
        assertEquals(0, task.sumDivisorsWithConditions(1))
    }
}