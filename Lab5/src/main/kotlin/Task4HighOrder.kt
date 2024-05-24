import java.util.*
class Task4HighOrder{
    // Функция для вычисления НОД двух чисел с использованием функции высшего порядка
    fun gcdWithFunction(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    // Функция для обработки цифр числа
    private fun processDigits(n: Int, operation: (List<Int>) -> Int): Int {
        val digits = n.toString().map { it.toString().toInt() }
        return operation(digits)
    }

    // Нахождение максимальной цифры числа с использованием функции высшего порядка
    fun maxDigitWithHigherOrder(n: Int): Int {
        return processDigits(n) { digits -> digits.maxOrNull() ?: 0 }
    }

    // Нахождение минимальной нечетной цифры числа с использованием функции высшего порядка
    fun minOddDigitWithHigherOrder(n: Int): Int {
        return processDigits(n) { digits ->
            digits.filter { it % 2 != 0 }.minOrNull() ?: 0
        }
    }

    // Нахождение НОД двух чисел с использованием функции высшего порядка
    fun gcdWithHigherOrder(a: Int, b: Int): Int {
        return gcdWithFunction(a, b) { x, y -> if (y == 0) x else gcdWithHigherOrder(y, x % y) }
    }
    fun main(){
        println(maxDigitWithHigherOrder(0))
        println(gcdWithHigherOrder(96,54))
        println(minOddDigitWithHigherOrder(97328))
    }
}
fun main() = Task4HighOrder().main()