class Alternative (
    val explanation: String,
    val numSequence: Int,
    val answer: Boolean,
    val answerExplain: String,
    val questionBelong:String
)
{
    init {
        if (explanation.isBlank()) {
            throw IllegalArgumentException("Error: Writing a text in explanation ")
        }
        if (answerExplain.isBlank()) {
            throw IllegalArgumentException("Error: Writing a text in explanation of correct answer")
        }

    }
    fun toPrint(){
        println("\t\t explanation: $explanation")
        println("\t\t number/sequence: $numSequence ")
        println("\t\t Correct Answer: $answer")
        println("\t\t Explanation about answer: $answerExplain")
        println("\t\t to Belonging to question : $answerExplain")
    }
}




