import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainTest {

    @Test
    fun max3() {
        val main = Main()
        val expected = 10
        assertEquals(expected, main.max3(3,10,5))
    }

    @Test
    fun fact_up() {
        val main = Main()
        val expected = 120
        assertEquals(expected, main.fact_up(5))
    }

    @Test
    fun fact_down() {
        val main = Main()
        val expected = 720
        assertEquals(expected, main.fact_down(6))
    }

    @Test
    fun calc() {
        val main = Main()
        val expected = 10
        assertEquals(expected, main.calc(true)(1234))
    }

    @Test
    fun digits() {
        val main = Main()
        val expected = 10
        assertEquals(expected, main.digits(1234){a,b ->a + b})
    }

    @Test
    fun sumd() {
        val main = Main()
        val expected = 15
        assertEquals(expected, main.sumd(12345))
    }

    @Test
    fun muld() {
        val main = Main()
        val expected = 126
        assertEquals(expected, main.muld(367))
    }

    @Test
    fun maxd() {
        val main = Main()
        val expected = 7
        assertEquals(expected, main.maxd(123745))
    }

    @Test
    fun mind() {
        val main = Main()
        val expected = 2
        assertEquals(expected, main.mind(923745))
    }
}