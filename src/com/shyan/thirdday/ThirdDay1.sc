/// Pattern Matching

def doChore(chore: String): String = chore match {
  case "clean dishes" => "scrub, dry"
  case "cook dinner" => "chop, sizzle"
  case _ => "whine, complain"
}

println(doChore("clean dishes"))
println(doChore("mow lawn"))



// Guards
def factorial(n: Int): Int = n match {
  case 0 => 1
  case x if x > 0 => factorial(x - 1) * n
}

println(factorial(10))
println(factorial(5))



/// Regular Expression

val reg = """^(F|f)\w*""".r
reg.findFirstIn("Fantastic")        // Some(Fantastic)
reg.findFirstIn("not Fantastic")    // None

val reg2 = "the".r
val res = reg2.findAllIn("the way the scissors trim the hair and the shrubs")
res.length


val movies =
  <movies>
    <movie>The Incredibles</movie>
    <movie>WALL E</movie>
    <short>Jack Jack Attack</short>
    <short>Geri's Game</short>
  </movies>

(movies \ "_").foreach { movie =>
  movie match {
    case <movie>{movieName}</movie> => println(movieName)
    case <short>{shortName}</short> => println(shortName + "(short)")
  }
}





