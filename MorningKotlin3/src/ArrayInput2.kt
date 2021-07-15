import java.util.*

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)
    //declare size of array
    println("How many employees do you have?")
    var number = input.nextInt()
    //determine data types
    var employees = arrayOfNulls<String>(number)
    var salaries  = arrayOfNulls<Double>(number)
    println("Enter the $number employees")
    //to input
    var x = 0
    while (x < number){
        employees[x] = input.next()
        println("Enter "+employees[x]+"'s salary")

        salaries[x] = input.nextDouble()
        x++
    }
    //to print
    var y = 0
    while (y < number){
        println(employees[y]+"......"+salaries[y])
        y++
    }


}