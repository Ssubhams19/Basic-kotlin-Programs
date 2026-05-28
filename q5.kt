fun main() {
    var num = 121
    val original = num
    var reverse = 0

    while (num != 0) {
        val digit = num % 10
        reverse = reverse * 10 + digit
        num /= 10
    }

    if (original == reverse) {
        println("Palindrome")
    } else {
        println("Not Palindrome")
    }
}
