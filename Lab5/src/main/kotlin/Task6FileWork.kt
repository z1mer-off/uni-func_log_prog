import java.io.File
import java.io.IOException

object NumberUtils {
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
        var x = a
        var y = b
        while (y != 0) {
            val temp = y
            y = x % y
            x = temp
        }
        return x
    }
}

fun getFunctionByName(name: String): ((List<Int>) -> Any)? {
    val functions: Map<String, (List<Int>) -> Any> = mapOf(
        "maxDigit" to { args: List<Int> -> NumberUtils.maxDigit(args[0]) },
        "minOddDigit" to { args: List<Int> -> NumberUtils.minOddDigit(args[0]) ?: "No odd digits" },
        "gcd" to { args: List<Int> -> NumberUtils.gcd(args[0], args[1]) }
    )
    return functions[name]
}

fun processFile(inputFilePath: String, outputFilePath: String) {
    val inputFile = File(inputFilePath)
    val outputFile = File(outputFilePath)

    try {
        val lines = inputFile.readLines()
        val results = mutableListOf<String>()

        for (line in lines) {
            val parts = line.split(" ")
            if (parts.size !in 2..3) {
                results.add("Error: Invalid input format")
                continue
            }

            val numbers = parts.subList(0, parts.size - 1).mapNotNull { it.toIntOrNull() }
            if (numbers.size != parts.size - 1) {
                results.add("Error: Invalid number format")
                continue
            }

            val functionName = parts.last()
            val function = getFunctionByName(functionName)
            if (function == null) {
                results.add("Error: Unknown function $functionName")
                continue
            }

            val result = function(numbers)
            results.add("${numbers.joinToString(" ")} $functionName $result")
        }

        outputFile.writeText(results.joinToString("\n"))

    } catch (e: IOException) {
        println("An error occurred while processing the file: ${e.message}")
    }
}

fun main(args: Array<String>) {
    println(args[0])
    if (args.size != 1) {
        println("Usage: program <input-file-path>")
        return
    }

    val inputFilePath = args[0]
    val outputFilePath = "output6.txt"
    processFile(inputFilePath, outputFilePath)
    println("Results written to $outputFilePath")
}
