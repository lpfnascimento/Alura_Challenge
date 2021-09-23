class Assigment(
    val name: String,
    val code: String,
    val activity: String,
    val position: Int,
    val type: String,
    val sectionbelong: String
) {
    init {
        if (name.isBlank())
            throw IllegalArgumentException("you have to declare a value in name")
        if (code.isBlank())
            throw IllegalArgumentException("you have to declare a value in code")
//        Não consegui fazer o regex
//        if (code.matches("^[a-z]+[^-]+^[\t]\$".toRegex())){
//            throw IllegalArgumentException("Error! You must writing lowercase letter, without: space, " +
//                    "special caracter(except -)")
    }
    fun printAssigment(){
        println("$name - $code - $activity - $position- $type - $sectionbelong")
    }
}