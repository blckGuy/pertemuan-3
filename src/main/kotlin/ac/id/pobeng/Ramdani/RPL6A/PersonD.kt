package ac.id.pobeng.Ramdani.RPL6A
//Konstruktor tambahan (secondary constructor) didefenisikan didalam tubuh kelas. Jika property
//kelas tidak diinisialisasi pada saat mendeklarasikannya maka property tersebut harus di
//inisialisasi didalam konstruktor tambahan atau blok inisialisasi. Konstruktor tambahan
//memerlukan keyword constructor untuk mendefenisikannya.
class PersonD {
    var firstName: String = ""
    var lastName: String = ""
    var age: Int = 0

    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main() {
    val dani = PersonD("dani", "Gunawan", 20)
    println("Name : ${dani.firstName} ${dani.lastName}")
    println("Age : ${dani.age}")
}