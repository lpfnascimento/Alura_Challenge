fun courseOneInstance(){
    println("COURSE:")
    val javacourse = Course(name = "Java",url="www.funcode.com/java-course-begginers", code = "java- 01",time = 7, view = "private", instructor = "Maria",
        content = "Course of Object Orientation, classes an polymorphism", target = "begginers",
        skills = "Object orientation, program logic, sintaxe of java").printCourse()


   println("SECTIONS")
    var section01 = Section(name = "introducao", code = "j-01", activity = "inative", type = "padrao", courseBelong = "Java")
    var section02 = Section(name = "inheritance", code = "j-02", activity = "inative", type = "padrao", courseBelong = "Java")
    var section03 = Section(name = "teste", code = "j-03", activity = "inative", type = "prova", courseBelong = "Java")
    var section04 = Section(name = "Polymorphism", code = "j-04", activity = "inactive", type = "padrao", courseBelong = "Java")
    val arraySection = arrayOf(section01,section02,section03)

    for (i in arraySection){
        i.printSection()
    }

    //Create Assigments for Section 02
    println("ASSIGMENTS")

    var assigment01S02 = Assigment(name = "ass01", code = "j-02-01", activity = "inactive", type = "explanation", position = 1, sectionbelong = "inheritance")
    var assigment02S02 = Assigment(name = "ass02", code = "j-02-01", activity = "inactive", type = "video", position = 2, sectionbelong = "inheritance")

    //Create Assigments for Section 03
    var assigment01S03 = Assigment(name = "ass01", code = "j-03-01", activity = "inative", type = "questao", position = 1, sectionbelong = "teste")
    var assigment02S03 = Assigment(name = "ass01", code = "j-03-01", activity = "inative", type = "questao", position = 1, sectionbelong = "teste")

    val listAssigmentS02 = arrayListOf<Assigment>(assigment01S02, assigment02S02)
    val listAssigmentS03 = arrayListOf<Assigment>(assigment01S03, assigment02S03)

    println("Assigments of Section 02")
    for (i in listAssigmentS02){
        println(i.printAssigment())
    }
    println("Assigments of Section 03")
    for (i in listAssigmentS03){
        println(i.printAssigment())
    }
    println("EXPLANATION")
    var explain01A01S02= ExplanationAssig(text = "Explanation about inheritance").toPrint()

    //video
    println("VIDEO")
    var video01A02S02 = videoAssig(url = "www.funcode.com/java-video01", timevideo = 20, transcription = ".....").toPrint()
    //question
    println("QUESTION")
    var questionA01S03 = Question("Marque a alternativa...", "1").toPrint()
    //alternative
    println("ALTERNATIVE")
    val alternative01Q01A01S03 = Alternative("......", 1,true,"....","questionA01S03").toPrint()
    //Category
    println("CATEGORY")
    val category01= Category("Object Orientation","C-java-01","talking about...",
        "Reading more about Kotlin, Python..", "inative",1,"./aaaa",
        "#FF5733").toPrint()
    println("SUBCATEGORY")
    val SubCategory01 = SubCategory("programming language","sub-01","Linguages talking about.....",
    "Kotlin, Java, JavaScript", "inactive",1,"Object Orientation").toPrint()
}