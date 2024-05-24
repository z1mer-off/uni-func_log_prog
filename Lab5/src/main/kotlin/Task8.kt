class Task8{
    fun findMinimalPair(limit: Int): Int {
        var minDifference = Int.MAX_VALUE
        var result = 0

        for (j in 1 until limit) {
            val pj = getPentagonal(j)

            // Начинаем перебор k с j + 1
            for (k in (j + 1) until limit) {
                val pk = getPentagonal(k)

                // Проверяем, является ли разность пятиугольным числом
                val difference = pk - pj
                if (!isPentagonal(difference)) continue

                // Проверяем, является ли сумма пятиугольным числом
                val sum = pj + pk
                if (!isPentagonal(sum)) continue

                // Если оба числа пятиугольные, обновляем минимальную разность
                if (difference < minDifference) {
                    result = difference
                    return result
                }
            }
        }

        return result
    }

    fun getPentagonal(n: Int): Int {
        return n * (3 * n - 1) / 2
    }

    fun isPentagonal(x: Int): Boolean {
        val n = (Math.sqrt(24 * x.toDouble() + 1) + 1) / 6
        return n.toInt() * (3 * n.toInt() - 1) / 2 == x
    }

    fun main() {
        val limit = 1000000
        val result = findMinimalPair(limit)
        println("Minimal difference: $result")
    }
}
fun main() = Task8().main()