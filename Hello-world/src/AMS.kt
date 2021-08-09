import java.util.*

fun main(args:Array<String>)
{
    dayOfWeek()
}

fun dayOfWeek()
{
    println("What day is today?")
    val day=Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var dayName=""
    when (day)
    {
        2->dayName = "Monday"
        3 -> dayName ="Tuesday"
        4 -> dayName ="Wednesday"
        5 -> dayName ="Thursday"
        6 -> dayName ="Friday"
        7 -> dayName ="Saturday"
        0 -> dayName ="Sunday"
    }

    // A way to assign variables using expressions
    dayName = when (day)
    {
        2-> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        0 -> "Sunday"
        else -> "Time ended"
    }

    println("Today is $dayName");
}