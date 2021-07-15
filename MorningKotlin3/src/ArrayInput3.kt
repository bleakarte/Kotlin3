import java.util.*

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    println("Enter the number of students")
    var number = input.nextInt()

    var name = arrayOfNulls<String>(number)
    var admin = arrayOfNulls<Int>(number)
    var marks= arrayOfNulls<Int>(number)
    println("Enter the $number students:")

    var x = 0
    while (x < number){
        name[x] = input.next()
        println("Enter "+name[x]+"'s admin:")

        admin[x] = input.nextInt()
        println("Enter "+name[x]+"'s marks:")

        marks[x] = input.nextInt()
        x++
    }

    var y = 0
    while (y < number){
        println("The marks for "+name[y]+" admission number "+admin[y]+" are "+marks[y])
        y++
    }

}