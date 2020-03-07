// Has one primary constructor
class Compass {
  val directions = List("north", "east", "south", "west")
  var bearing = 0
  print("Initial bearing: ")
  println(direction)

  def direction() = directions(bearing)

  def inform(turnDirection: String): Unit = {
    println("Turning " + turnDirection + ". Now bearing " + direction)
  }

  def turnRight(): Unit = {
    bearing = (bearing + 1) % directions.size
    inform("right")
  }

  def turnLeft(): Unit = {
    bearing = (bearing + (directions.size - 1)) % directions.size
    inform("left")
  }
}

// Have two constructors
class Person(first_name: String) {
  println("Outer constructor")
  def this(first_name: String, last_name: String) {
    this(first_name)
    println("Inner constructor")
  }

  def talk() = println("HI")
}


// Singleton
object TrueRing {
  def rule = println("To rule them all.")
}

TrueRing.rule


