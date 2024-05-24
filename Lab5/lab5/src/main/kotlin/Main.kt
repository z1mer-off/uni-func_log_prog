import java.lang.System.`in`
import java.util.*

class Main {
    //максимум из 3 чисел
    fun max3(x: Int, y: Int, z: Int): Int = if (x > y) if (x > z) x else z else if (y > z) y else z

    //факториал числа вверх
    fun fact_up(n: Int): Int = if (n <= 1) 1 else fact_up(n - 1) * n

    //факториал числа вниз
    tailrec fun fact_d(n: Int, a: Int): Int = if (n <= 1) n * a else fact_d(n - 1, n * a)
    fun fact_down(n: Int): Int = fact_d(n, 1)

    //сумма цифр числа вниз
    fun sumcda(n: Int, a: Int): Int = if (n < 10) n + a else sumcda(n / 10, a + (n % 10))
    fun sumcd(n: Int): Int = sumcda(n, 0)

    //сумма цифр числа вверх
    fun sumc(n: Int): Int = if (n < 10) n else (n % 10) + sumc(n / 10)

    //произведение цифр числа вверх
    fun mulc(n: Int): Int = if (n < 10) n else (n % 10) * mulc(n / 10)

    //функция высшего порядка возвращает функцию
    fun calc(f: Boolean): (Int) -> Int = if (f) ::sumc else ::fact_up

    //функция высшего порядка принимает функцию
    tailrec fun digits(n: Int, a: Int = 0, f: (Int, Int) -> Int): Int =
        if (n == 0) a else digits(n / 10, f(a, n % 10), f)

    //вызов через лямбды
    fun sumd(n: Int): Int = digits(n, 0) { a, b -> (a + b) }
    fun muld(n: Int): Int = digits(n, 1) { a, b -> (a * b) }
    fun maxd(n: Int): Int = digits(n / 10, n % 10) { a, b -> if (a > b) a else b }
    fun mind(n: Int): Int = digits(n / 10, n % 10) { a, b -> if (a < b) a else b }

    fun main() {
        println("Hello World!")
        val scanner = Scanner(`in`)
        val x: Int = scanner.nextInt()
        println(sumd(x))
    }
}

fun main() = Main().main()