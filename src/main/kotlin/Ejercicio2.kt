import org.json.JSONArray
import org.json.JSONObject
import org.json.JSONTokener
import java.io.FileReader

fun main() {
val f=FileReader("src/main/resources/VariacioPoblacional.json")
   val root=JSONTokener(f).nextValue() as JSONArray

    val castello=root.getJSONObject(14)

    val nom=castello.get("Nombre")
    val data=castello.getJSONArray("Data")
    println(nom)
    var acumulat=0
    for (i  in data){
        i as JSONObject
        println("${i.get("NombrePeriodo")}->${i.get("Valor")}")
        val valor=Integer.parseInt(i.get("Valor").toString())
        acumulat+=valor
    }
    println("Variacio total -> $acumulat")

}