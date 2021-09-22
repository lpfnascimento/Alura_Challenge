class Course(
    var name: String,
    val code: String,
    val time: Int,
    val view: String,
    val target: String,
    val instructor: String,
    val content: String,
    val skills: String
){
    init {
        if(name.isBlank()){
            throw NullPointerException("you have to declare a value in name")
        }
        if(code.isBlank()){
            throw IllegalArgumentException("you have to declare a value in code")
        }
//        if (!code.matches("^(?:[a-z]-?)+[^-]\$".toRegex())){
//            throw IllegalArgumentException("Error! You must writing lowercase letter, without: space, " +
//                    "special caracter(except -)")
//        }
        if (time !in 1..20){
            throw IllegalArgumentException("Writing a number valid of hours: 1 to 20")}
        if (instructor.isBlank()){
            throw IllegalArgumentException("Inform the name of Instructor")}
    }



}
