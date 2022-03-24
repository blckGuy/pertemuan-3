package ac.id.pobeng.Ramdani.RPL6A
//Parameter dari konstruktor utama dapat digunakan dalam blok inisialisasi. Ia juga dapat
//digunakan untuk menginisialisasi property yang dideklarasikan dalam tubuh kelas.
class PersonA (_fisrtName: String, _lastName: String, _age:Int){
    var firstName: String
    var lastName: String
    var age: Int
    init {
        firstName = _fisrtName
        lastName = _lastName
        age = _age
    }
}

fun main() {
    val budi = PersonA("Budi", "gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}