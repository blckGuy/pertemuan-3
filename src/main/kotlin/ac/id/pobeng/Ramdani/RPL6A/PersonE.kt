package ac.id.pobeng.Ramdani.RPL6A
//konstruktor tambahan bisa didefinisikan lebih dari satu, berikut contoh konsturktor tambahan dibawah ini

class PersonE {
    var firstaName: String
    var lastName: String
    var age: Int = 20
    constructor(_firstName: String, _lastName: String){
        firstaName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstaName} ${lastName}")
        println("Age : ${age}")
    }
}

fun main() {
    val anton = PersonE("Frank", "Lampard")
    anton.cetakInfo()
    println()
    val budi = PersonE("Budi", "Gunawan", 20)
    budi.cetakInfo()
}