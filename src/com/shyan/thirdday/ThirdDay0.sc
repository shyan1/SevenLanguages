import scala.xml.{PrettyPrinter, XML}
/// XML
// https://github.com/scala/scala-xml

// Scala将XML抬高到语言的一等编程结构，可以像表示字符串那样来表示XML

val movies =
  <movies>
    <movie genre="action">Pirates of the Caribbean</movie>
    <movie genre="fairytale">Edward Scissorhands</movie>
  </movies>

movies.text

// Scala内置了一种与XPath类似的查询语言
// 不过由于在Scala中， 关键字//是注释的修饰符，Scala将使用\和\\

val movieNodes = movies \ "movie"
/**
 * movieNodes: scala.xml.NodeSeq =
 *  Seq(<movie genre="action">Pirates of the Caribbean</movie>,
 *      <movie genre="fairytale">Edward Scissorhands</movie>)
 */

movieNodes(0) \ "@genre"
movieNodes(1) \ "@genre"

val genres = (movies \ "movie").map(m => m \@ "genre").toList
val names = movieNodes.map(m => m.text).toList


// to open XML from file use 'scala.xml.XML'
//val books = scala.xml.XML.loadFile("books.xml")

// to save xml file
//scala.xml.XML.save("books.xml", books)

// to format xml use 'scala.xml.PrettyPrinter' to configure the line length and indentation level
val pp = new PrettyPrinter(24, 4)
pp.format(movies)




val doc = XML.load("C:\\Users\\shyan\\IdeaProjects\\SevenLanguages\\src\\com\\shyan\\thirdday\\po.xml")
var total = BigDecimal(0).setScale(2, scala.math.BigDecimal.RoundingMode.HALF_UP)
for {
  item <- doc \\ "item"
  price <- item \ "USPrice"
} yield {
  println("partnum: " + item \@ "partNum")
  total += price.text.toDouble
}
println(s"Grand total " + total)