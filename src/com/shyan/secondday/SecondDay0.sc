def double(x: Int): Int = x * 2


var mutable = "I'm mutable"
mutable = "Hello"

val immutable = "I'm immutable"
//immutable = "hii"         // compilation error


// Scala的主要集合类型包括
// List
// Set
// Map

/// List
val l1: List[Int] = List(1,2,3)
val l2: List[String] = List("One", "two", "three")
val l3: List[Any] = List("one", "two", 3)

// 列表访问是一个函数，所以使用()，而不是[]
l1(0)
// l1(3)   // java.lang.IndexOutOfBoundsException: 3

Nil     // res0: scala.collection.immutable.Nil.type = List()

List(1,2,3) == List(2,1,3)    // false


/// Set
val animals = Set("lions", "tigers", "bears")
animals + "armadillos"
animals - "tigers"

animals ++ Set("armadillos", "raccoons")
animals -- Set("lions", "tigers")
animals & Set("lions", "armadillos", "bears")

Set(1,2,3) == Set(3,1,2)    // true


/// Map
val ordinals = Map(0 -> "zero", 1 -> "one", 2 -> "two")         // Map[Int, String]
ordinals(1)

import scala.collection.mutable
val map = new mutable.HashMap[Int, String]()
map ++= Map(1 -> "one")
map ++= Map(2 -> "two")
map



/// Any
/// Nothing

// Any是Scala类层次体系中的根类
// Nothing是所有类型的子类





