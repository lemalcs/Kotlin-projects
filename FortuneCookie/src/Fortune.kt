fun main()
{
    var result: String
    for(i in (0..9))
    {
        result=getFortuneCookie()
        println("Your fortune is: $result")
        if (result.startsWith("Take it easy"))
            break
    }
}

fun getFortuneCookie():String
{
    val messages=listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    println("Enter your birthday")
    var birthday=readLine()
    var birthdayNumber:Int=birthday?.toIntOrNull()?:1

    if (birthdayNumber==0)
        birthdayNumber = 1

    val fortune:Int=birthdayNumber%messages.size
    println(fortune)

    return messages[fortune]
}