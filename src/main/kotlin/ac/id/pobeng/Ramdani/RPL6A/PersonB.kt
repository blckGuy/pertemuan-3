package ac.id.pobeng.Ramdani.RPL6A

class PersonB(_Name: String, _age :Int) {
    var Name: String = _Name
    var age: Int = _age
}
//Untuk lebih meringkas kode program kelas Person diatas maka kita dapat menggabungkan
//proses deklarasi dan menginisialisasi sebuah variabel pada blok inisialisasi kedalam satu
//statement seperti berikut
fun main() {
    val Ramdani = PersonB("Ramdani",20)
    println("Name : ${Ramdani.Name}")
    println("Age : ${Ramdani.age}")
}