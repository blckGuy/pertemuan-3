package ac.id.pobeng.Ramdani.RPL6A
//Inisialisasi sintaks getter dan setter di Kotlin bersifat opsional, karena secara sefault Kotlin telah
//men-generate method getter dan setter untuk property yang mutable (var) dan hanya getter
//untuk property yang read-only (val).
class Employee(_id: Int, _Name:String, _age: Int){
    val id: Int = _id
        get() = field

    var name: String = _Name
        get() = field
        set(value){
            field = value
        }

    var age: Int = _age
        get() = field
        set(value){
            field = value
        }
}

fun main() {
    val emp = Employee(1101,"Dani",20)
    println("Id : ${emp.id}, Nama : ${emp.name}, umur : ${emp.age}")
}