class Question(
    val enunciate: String,
    val typeAnswer: String
) {
    init {
        if (typeAnswer == "1") {
            println("standard value")
        }
        if (typeAnswer == "2") {
            println("several answer")
        }
        if (typeAnswer == "3") {
            typeAnswer.toBoolean()
            println("True or False")
        }

    }
    fun toPrint(){
        println("\t Enunciate: $enunciate")
        println("\t Type of question: $typeAnswer ")
    }
}