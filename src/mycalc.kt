fun main(args: Array<String>) {
    println("Eng. Suhail Simple Calculator")
    println("Enter the first number:")
    var firstNum:Double = readLine()!!.toDouble()

    println("Enter the second number:")
    var secondNum:Double = readLine()!!.toDouble()

    println("Enter the operation type(+,-,*,/):")
    var op:Char = readLine()!![0]

    var opResult:Double

    when (op) {
        '+' -> {opResult = firstNum + secondNum
            print("The sum of two numbers= $opResult")}
        '-' -> {opResult = firstNum - secondNum
            print("The subtraction of two numbers= $opResult")}
        '*' -> {opResult = firstNum * secondNum
            print("The multiplication of two numbers= $opResult")}
        '/' -> {opResult = firstNum / secondNum
            print("The division of two numbers= $opResult")}
        else -> { // Note the block
            print("Error: not valid operation")}
    }
}