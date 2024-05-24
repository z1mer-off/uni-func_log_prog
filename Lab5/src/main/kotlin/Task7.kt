import java.util.*
class Task7{

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

    //Задача 7: Найти количество делителей числа, не делящихся на 3.
    fun countDivisorsNotDivisibleBy3(number: Int): Int {
        var count = 0
        for (i in 1..number) {
            if (number % i == 0 && i % 3 != 0) {
                count++
            }
        }
        return count
    }

    //Задача 7: Найти сумму всех делителей числа, взаимно простых с суммой цифр числа
    //и не взаимно простых с произведением цифр числа.
    fun sumDivisorsWithConditions(number: Int): Int {
        fun areCoprime(a: Int, b: Int): Boolean {
            return Task7().gcd(a, b) == 1
        }

        fun productOfDigits(n: Int): Int {
            var product = 1
            var temp = n
            while (temp != 0) {
                product *= temp % 10
                temp /= 10
            }
            return product
        }

        val sumOfDigits = number.toString().map { it.toString().toInt() }.sum()
        val productOfDigits = productOfDigits(number)

        var sum = 0
        for (i in 1..number) {
            if (number % i == 0) {
                if (areCoprime(i, sumOfDigits) && !areCoprime(i, productOfDigits)) {
                    sum += i
                }
            }
        }
        return sum
    }
    fun main(){

    }
}
fun main() = Task7().main()