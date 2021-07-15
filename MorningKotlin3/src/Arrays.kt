fun main(args: Array<String>) {
    var names = arrayOf("Jeff","Betty","Wayne","Becky","Sharon","Ibrahim")
    //print for one position(the first)
    println(names[0])

    //print for the whole list
    for (name in names) {
        println(name)
    }

    //print number of items in an array
    println(names.size)

    //print array using while loop
    var array_size = names.size
    var x = 0
    while (x < array_size){
        println(names[x])
        x++
    }

    //arrays of specific amount and data type(String)
    var cars = arrayOfNulls<String>(6)
    cars[0] = "Mercedes"
    cars[1] = "Jeep"
    cars[2] = "Range"
    cars[3] = "Mobius"
    cars[4] = "Bentley"
    cars[5] = "Rolls"

    for (car in cars) {
        println(car)
    }
}