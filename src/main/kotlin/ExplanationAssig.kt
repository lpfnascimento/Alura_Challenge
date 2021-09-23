class ExplanationAssig (
    val text: String
    )
{
    init {
        if (text.isBlank()) {
            throw IllegalArgumentException("you have to declare a value in name")
        }
    }
    fun toPrint(){
        println("\t Explanation: $text")
    }
}