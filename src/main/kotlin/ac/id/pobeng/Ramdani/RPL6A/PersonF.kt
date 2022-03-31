package ac.id.pobeng.Ramdani.RPL6A

class PersonF(val firstName: String, val lastName: String) {
    init{
        println("sedang inisialisasi deik!")
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println()
    }
    constructor(_firstName: String, _lastName: String, _country: String): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName: String, _age: Int, _country: String): this(_firstName,_lastName, _age){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }

}

fun main() {
    val anton = PersonF("Anton", "sejati")
    val budi = PersonF("Budi", "Gunawan", 21)
    val caca = PersonF("Caca", "Andika", "Indonesia")
    val dono = PersonF("Dono", "Putri", 25, "Indonesia")
}