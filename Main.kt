fun main() {
    println("Welcome to your to do list.")
    println("Pick a number from the following list.")

    var option: String? = null

    while (option != "5") {
        println("1. View\n2. Add\n3. Check item as done\n4. Delete\n5. Quit")
        print("Enter a number: ")
        option = readln()

        when (option) {
            "1" -> println("View list here")
            "2" -> println("Add new item(s)")
            "3" -> println("Marked as complete")
            "4" -> println("Remove item(s)")
            "5" -> {
                println("Saving...\nGoodbye")
                // add functionality to save list as it closes
                break // breaks out of loop
            }
            else -> println("Invalid option. Please select from the list.")
        }
    }
}