import java.util.*
class Task5GroupedT2T3{
    //Задача 2: Найти максимальную цифру числа.
    fun maxDigit(n: Int): Int {
        var maxDigit = 0
        var number = n
        while (number > 0) {
            val digit = number % 10
            if (digit > maxDigit) {
                maxDigit = digit
            }
            number /= 10
        }
        return maxDigit
    }

    //Задача 2: Найти минимальную нечетную цифру числа.
    fun minOddDigit(n: Int): Int? {
        var minOddDigit: Int? = null
        var number = n
        while (number > 0) {
            val digit = number % 10
            if (digit % 2 != 0) {
                if (minOddDigit == null || digit < minOddDigit) {
                    minOddDigit = digit
                }
            }
            number /= 10
        }
        return minOddDigit
    }

    //Задача 2: Найти НОД двух чисел.
    fun gcd(a: Int, b: Int): Int {
        var x = a
        var y = b
        while (y != 0) {
            val temp = y
            y = x % y
            x = temp
        }
        return x
    }

    //Задача 3: Найти максимальную цифру числа (рекурсия).
    fun maxDigitRecursive(n: Int): Int {
        if (n < 10) return n
        return maxOf(n % 10, maxDigitRecursive(n / 10))
    }

    //Задача 3: Найти минимальную нечетную цифру числа (рекурсия).
    fun minOddDigitRecursive(n: Int): Int? {
        if (n == 0) return null
        val digit = n % 10
        val minRest = minOddDigitRecursive(n / 10)
        return if (digit % 2 != 0) {
            if (minRest == null) digit else minOf(digit, minRest)
        } else {
            minRest
        }
    }

    //Задача 3: Найти НОД двух чисел (рекурсия).
    fun gcdRecursive(a: Int, b: Int): Int {
        if (b == 0) return a
        return gcdRecursive(b, a % b)
    }

    //Задача 3: Найти максимальную цифру числа (хвостовая рекурсия).
    tailrec fun maxDigitTailRec(n: Int, maxDigit: Int = 0): Int {
        if (n == 0) return maxDigit
        val digit = n % 10
        return maxDigitTailRec(n / 10, maxOf(maxDigit, digit))
    }

    //Задача 3: Найти минимальную нечетную цифру числа (хвостовая рекурсия).
    tailrec fun minOddDigitTailRec(n: Int, minOddDigit: Int? = null): Int? {
        if (n == 0) return minOddDigit
        val digit = n % 10
        val newMinOddDigit = if (digit % 2 != 0) {
            if (minOddDigit == null || digit < minOddDigit) digit else minOddDigit
        } else {
            minOddDigit
        }
        return minOddDigitTailRec(n / 10, newMinOddDigit)
    }

    //Задача 3: Найти НОД двух чисел (хвостовая рекурсия).
    tailrec fun gcdTailRec(a: Int, b: Int): Int {
        return if (b == 0) a else gcdTailRec(b, a % b)
    }
    fun main(){

    }
}
fun main() = Task5GroupedT2T3().main()