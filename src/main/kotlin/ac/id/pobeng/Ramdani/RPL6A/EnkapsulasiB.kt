package ac.id.pobeng.Ramdani.RPL6A
//pada kodingan dibawah kita menentukan nilai yang seharusnya di masukkan agar tidak terjadi error
//conothnya pada baris terakhir kodingan dan baris ke 17 kjodingan sudah dibuat pengecualian terhadap,
//hasil yang dicetak nanti jika baris 24 masih bernilai -1 maka itu dinyatakan kecil dari 0
//dan jika baris 24 di rubah menjadi 1 maka hasil yang dicetak tidak akan di thred
class EmployeeA(_id : Int, _name: String, _age: Int) {
    val id: Int = _id
        get()=field

    var name: String = _name
        get(){
            return field.toUpperCase()
        }
        set(value){
            field = value
        }
    var age: Int = _age
        get() = field
        set(value) {
            field= if(value >0) value else throw java.lang.IllegalArgumentException("Age must be greater than zero")
        }
}

fun main() {
    val emp = EmployeeA(1101, "Dani", 20)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur: ${emp.age}")
    emp.age = -1
}