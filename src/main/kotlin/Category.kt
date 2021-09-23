class Category(
    val name: String,
    val code: String,
    val description: String,
    val studyGuide: String,
    var activity: String,
    val numSequence: Int,
    val imageLink: String,
    val colorCodeHexa: String,
) {
    init {
        if (name.isBlank())
            throw IllegalArgumentException("Error!!! enter a valid name:")
        if (code.isBlank())
            throw IllegalArgumentException("Error!!! Enter a valid code")
//        Não consegui fazer o regex
//        if (code.matches("^[a-z]+[^-]+^[\t]\$".toRegex())){
//            throw IllegalArgumentException("Error! You must writing lowercase letter, without: space, " +
//                    "special caracter(except -)")
    }
    fun toPrint(){
        println("\t Name: $name")
        println("\t Code: $code")
        println("\t Description: $description")
        println("\t Study Guide suggestion: $studyGuide")
        println("\t Activity status: $activity")
        println("\t number/sequence: $numSequence ")
        println("\t link of image: $imageLink")
        println("\t Hexadecimal code of color: $colorCodeHexa")

    }
}