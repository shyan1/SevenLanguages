val list = List(1,2,3,4)

list.foldLeft(0)(_ + _)
list.foldLeft(0){ (x, y) => {
  x + y
}}

// val sum = (0 /: list){(sum, i) => sum + i }
// /: is deprecated, used 'foldLeft' instead

