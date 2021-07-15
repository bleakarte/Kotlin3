import java.util.*

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    //input number of students
    println("How many students do you have?")
    var number = input.nextInt()
    //input student names
    println("Enter the $number names")
    var students = arrayOfNulls<String>(number)
    //loop to fetch names
    var x = 0
    while (x < number){
        students[x] = input.next()
        x++
    }
    //loop to print
    for (name in students){
        println(name)
    }
}