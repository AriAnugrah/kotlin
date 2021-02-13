fun main() {
    val nilai = 80

    val huruf = "A"

//    if(nilai > 98){
//        println("A")
//    }else{
//        println("B")
//    }
//

    when (nilai) {
        in 70..90 -> {
            println("A")
        }
        68 -> {
            println("B")
        }
    }

    when(huruf){
        "A" , "B" , "C" -> println("lulus")
        else -> print("Tidak lulus")
    }

    when {
        nilai in 70..90 -> println("A")
        else -> println("B")
    }




}