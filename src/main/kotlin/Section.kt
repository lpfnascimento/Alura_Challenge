class Section(
    var name: String,
    var code: String,
    var activity: String,
    var type: String,
    var courseBelong: String
) {
    init {
        if (name.isBlank()) {
            throw IllegalArgumentException("you have to declare a value in name")
        }
        if (code.isBlank()) {
            throw IllegalArgumentException("you have to declare a value in code")
        }
//        Não consegui fazer o regex
//        if (code.matches("^[a-z]+[^-]+^[\t]\$".toRegex())){
//            throw IllegalArgumentException("Error! You must writing lowercase letter, without: space, " +
//                    "special caracter(except -)")
    }
    fun printSection(){
        println("$name / $code / $activity / $type / $courseBelong")
    }
}



