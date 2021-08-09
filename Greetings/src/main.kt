fun main(args: Array<String>)
{
    if (args.size>0)
    {
        val hour=args[0].toInt()
        println("${if (hour<12) "Good morning, Kotlin" else "Good night, Kotlin"}")
    }
    else
        println("No hour provided.")
}