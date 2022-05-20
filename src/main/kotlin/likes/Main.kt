package likes

fun main() {
    var likes: UInt = 11u
    if (likes % 10u == 1u && likes != 11u) println("Понравилось $likes человеку") else println("Понравилось $likes людям")
}
