package ac.id.pobeng.Ramdani.RPL6A

class Greeter {
    lateinit var text: String
    fun greet(){
        println("Hello object world!")
    }
    fun greet(name:String){
        println("$text $name")
    }
    fun with_ret_val(name: String):String{
        return "$text $name"
    }
}