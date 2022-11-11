import javax.xml.parsers.DocumentBuilderFactory

fun main() {
    val doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/main/resources/cataleg.xml")
    val root = doc.documentElement
    //SACAR TODOS LOS PRODUCTOS
    val productes = root.childNodes

    for (i in 0 until productes.length) {
        val producte = productes.item(i)
        println("--------------------" + producte.attributes.item(0).textContent + "--------------------")
        println(producte.childNodes.item(0).nodeName + ":" + producte.childNodes.item(0).textContent)
        println(producte.childNodes.item(2).nodeName + ":" + producte.childNodes.item(2).textContent)
        println(producte.childNodes.item(2).nodeName + ":" + producte.childNodes.item(2).textContent)
        println(producte.childNodes.item(8).nodeName + ":" + producte.childNodes.item(8).textContent)
        val caracteristiques = producte.childNodes.item(8).childNodes
        for (j in 0 until caracteristiques.length) {
            println(caracteristiques.item(j).nodeName + ":" + caracteristiques.item(j).textContent)
        }

    }
}
