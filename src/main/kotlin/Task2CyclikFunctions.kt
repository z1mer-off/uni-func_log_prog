import java.lang.System.`in`
import java.util.*

class Task2CyclikFunctions{

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

    fun gcd(a: Int, b: Int): Int {
        var x = Math.abs(a)
        var y = Math.abs(b)
        while (y != 0) {
            val temp = y
            y = x % y
            x = temp
        }
        return x
    }


    fun main(){
        println(gcd(56,98))
    }
}

fun main() = Task2CyclikFunctions().main()