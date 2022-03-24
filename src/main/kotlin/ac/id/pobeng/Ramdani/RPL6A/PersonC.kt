package ac.id.pobeng.Ramdani.RPL6A
//Untuk lebih ringkasnya lagi, deklarasi dan inisialisasi property dapat dilakukan hanya didalam
//parameter konstruktor utama, seperti contoh kode program berikut:
class PersonC(var firstName: String, var lastName: String, var age : Int){
}

fun main() {
    val Ramdani =PersonC("Ramdani", "Ricardo", 20)
    println("Name : ${Ramdani.firstName} ${Ramdani.lastName}")
    println("Age : ${Ramdani.age}")
}