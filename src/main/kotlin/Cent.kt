
fun main() {

    val word = "asdf"

    println("Gib folgendes Wort ein: $word")

    var input =""
    var cent = 0

    while(input != "exit") {

        print("> ")
        input = readLine()!!

        print("Du hast: $input eingegeben. ")
        if (input == word) {
            cent = cent + 1
            print ("Du hast EINEN Cent dazu bekommen. ")
        } else {
            print("Du hast KEINEN Cent dazu bekommen. ")
        }
        println("Du hast jetzt $cent Cent.")
    }
}