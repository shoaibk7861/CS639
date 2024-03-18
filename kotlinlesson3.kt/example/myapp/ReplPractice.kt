package example.myapp

fun main(){
    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")

    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())

    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}\n")
    println("${equipment2.first.second}")

    val equipment3 = "fish net" to "catching fish"
    val (tool, use) = equipment3
    println("$tool is used for $use")

    val numbers2 = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers2
    println("$n1 $n2 $n3")

    val list = listOf(1, 5, 3, 4)
    println(list.sum())

    val list2 = listOf("a", "bbb", "cc")
    println(list2.sumBy { it.length })

    val list3 = listOf("a", "bbb", "cc")
    for (s in list3.listIterator()) {
        println("$s ")
    }

    val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )
    println (scientific.get("guppy"))
    println(scientific.get("zebra fish"))
    println(scientific.getOrDefault("swordtail", "sorry, I don't know"))
    println(scientific.getOrElse("swordtail") {"sorry, I don't know"})


}