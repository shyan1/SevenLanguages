/// High-Order functions
// 高阶函数是一个以其他函数为输入参数或以函数作为返回结果的函数

val list = List("frodo", "samwise", "pippin")
list.foreach(hobbit => println(hobbit))
list foreach println

val animals = Set("lions", "tigers", "bears")
animals.foreach(println)

val ordinals = Map(1 -> "one", 2 -> "two", 3 -> "three")
ordinals.foreach(entry => println(entry._1))



/// More list
list.isEmpty
Nil.isEmpty

list.length
list.size

list.head
list.tail

list.last
list.init

list.reverse
list.drop(1)      // 返回前n个元素被删除后的列表


val words = List("peg", "al", "bud", "kelly")

words.count(w => w.length > 2)

words.filter(w => w.size >2)

words.map(w => w.size)

words.forall(w => w.size > 1)

words.exists(w => w.size == 9)

words.sortWith((s, t) => s.size > t.size)
words.sorted
words.sortBy(w => w.size)

