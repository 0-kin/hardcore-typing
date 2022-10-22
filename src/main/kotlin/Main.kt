fun main(args: Array<String>) {
    println("Hello 0KIN!!")

    for (i in 1..20) {
        println("$i nikolas")
    }

    var go = true
    while(go){
        print("Gib das geheime Wort ein: ")

        val input = readLine()!!
        if (input == "päpä") {
            println("Juhu, du hast gewonnen!!")
            go = false
        } else {
            println("päpäääääääääääääääääää wäre es gewesen ;-)")
        }
    }
}