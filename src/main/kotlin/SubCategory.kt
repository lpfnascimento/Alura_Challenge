class SubCategory(
    val name: String,
    val code: String,
    val description: String,
    val studyGuide: String,
    var activity: String,
    val numSequence: Int,
    val categoryBelong: String
) {
    init {
        if (name.isBlank())
            throw IllegalArgumentException("Error!!! Writing a name:")
        if (code.isBlank())
            throw IllegalArgumentException("Error!!! Writing a valid code")
//        Não consegui fazer o regex
//        if (code.matches("^[a-z]+[^-]+^[\t]\$".toRegex())){
//            throw IllegalArgumentException("Error! You must writing lowercase letter, without: space, " +
//                    "special caracter(except -)")
    }
    fun toPrint(){
        println("\t\t Name: $name")
        println("\t\t Code: $code")
        println("\t\t Description: $description")
        println("\t\t Study Guide suggestion: $studyGuide")
        println("\t\t Activity status: $activity")
        println("\t\t number/sequence: $numSequence ")
        println("\t\t Belong to Category: $categoryBelong ")


    }
}