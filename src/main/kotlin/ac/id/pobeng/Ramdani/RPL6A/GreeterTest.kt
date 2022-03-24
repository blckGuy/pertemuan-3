package ac.id.pobeng.Ramdani.RPL6A
//berikut adalah beberapa kumpulan kata sambut dengan kodingan sederhana
fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("BUdi")
    greeter.text = "Hello Programmer"
    println(greeter.with_ret_val("Dono"))
}