import java.lang.System.`in`
import java.util.*
class Task3ReccurentFunctions{
    fun maxDigitRecursive(n: Int): Int {
        if (n < 10) return n
        return maxOf(n % 10, maxDigitRecursive(n / 10))
    }

    tailrec fun maxDigitTailRec(n: Int, maxDigit: Int = 0): Int {
        if (n == 0) return maxDigit
        val digit = n % 10
        return maxDigitTailRec(n / 10, maxOf(maxDigit, digit))
    }


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


    fun gcdRecursive(a: Int, b: Int): Int {
        if (b == 0) return a
        return gcdRecursive(b, a % b)
    }

    tailrec fun gcdTailRec(a: Int, b: Int): Int {
        return if (b == 0) a else gcdTailRec(b, a % b)
    }



    fun main(){

    }
}

fun main() = Task3ReccurentFunctions().main()