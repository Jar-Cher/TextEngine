package EnginePrototype

import com.google.gson.*
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.File
import tornadofx.*
import groovy.util.*
//import javafx.


data class Quest(val save: GameState, val starting: GameState, val finishingId: Int, val slides: Array<Slide>)

data class GameState(val slideId: Int)

data class Slide(val slideId: Int, val text: String, val options: Array<Option>)

data class Option(val optionId: Int, val optionText: String, val moveToSlide: Int)

//class MyApp: App(MyView::class)

/*class MyView: View() {
    override val root = vbox {
        button("Press me")
        label("Waiting")
    }
}*/

fun main(args: Array<String>) {

    println(Eval.x(4, "2*x"))


    val gson = Gson()

    val json2 = File("input").readText()
    val testingQuest : Quest = gson.fromJson(json2, Quest::class.java)

    val testText = """{
        "data" :
        {
            "field1" : 25,
            "field2" : 42
        }
    }"""

    val some = JsonParser().parse(testText)
    val nope = some.asJsonObject.get("data")
    println(testingQuest)
}

