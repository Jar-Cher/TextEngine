package EnginePrototype

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonParser
import com.google.gson.reflect.TypeToken
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.File
import com.google.gson.JsonElement



data class TestModel(
    val id: Int,
    val description: String
)

data class Person(val name: String, val age: Int, val messages: Map<String, Int>) {
}

data class Message(val time: Int, val text: String){
}

fun main(args: Array<String>) {

    val gson = Gson()
    val jsonString = gson.toJson(TestModel(1,"Test"))
    assertEquals(jsonString, """{"id":1,"description":"Test"}""")

    //val json = """{"name": "Kolineer", "age": "26", "messages" : ["Master Kotlin","At Kolination"]}"""
    //val person1 : Person = gson.fromJson(json, Person::class.java)

    //val json2 = File("input").readText()
    //val person2 : Person = gson.fromJson(json2, Person::class.java)

    val testText = """{
        "data" :
        {
            "field1" : 25,
            "field2" : 42
        }
    }"""

    val some = JsonParser().parse(testText)
    val nope = some.asJsonObject.get("data").asJsonObject.entrySet()
    println(nope)
}

