import java.io.BufferedReader
import java.io.DataInputStream
import java.io.FileInputStream
import java.io.FileReader
import java.io.FileWriter

fun main() {
    val ficherText = BufferedReader(FileReader("src/main/resources/dades.txt"))
    val ficherDat = DataInputStream(FileInputStream("src/main/resources/dades.dat"))
    val resum = FileWriter("resum.txt")
    var info=""
    var nom = ficherText.readLine()
    while (nom!=null) {
        val altura = ficherDat.readFloat()
        val peso = ficherDat.readInt()
        info+="$nom: ${altura}m. - ${peso}kg \n"
        nom=ficherText.readLine()
    }
    resum.write(info)
    resum.close()
}