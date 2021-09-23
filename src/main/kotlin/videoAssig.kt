class videoAssig(
    var url: String,
    var timevideo: Int,
    var transcription: String
) {
    fun toPrint(){
        println("\t url: $url")
        println("\t Time: $timevideo ")
        println("\t Transcription: $transcription")
    }
}