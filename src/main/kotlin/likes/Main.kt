package likes

fun main() {
    var likes: UInt = 1211u
    if (likes % 10u == 1u && likes % 100u != 11u) println("Понравилось $likes человеку") else println("Понравилось $likes людям")
}
