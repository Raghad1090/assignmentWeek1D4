fun main(args: Array<String>) {
    println("Hello World!")

    var healthPoints = 89
    var auraColor = "green"

    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()

    when(karma){

        in 0..5  ->  auraColor ="red"
        in 6..10 ->  auraColor = "orange"
        in 11..15 -> auraColor = "purple"
        in 16..20 -> auraColor = "green"

    }

    println("player aura color:"+ auraColor)

}