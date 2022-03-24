package ac.id.pobeng.Ramdani.RPL6A

class InitOrder(name:String) {
    val firstProperty = "First property: $name".also(::println)
    init {
        println(" First initializer block that prints ${name}")
    }
    val second = "Second property: ${name.length}".also(::println)
    init{
        println("Second initializer block that prints ${name.length}")
    }
}

fun main() {
    val initOrder = InitOrder("RPL")
}