val range = 0 to 100
range.start
range.end
range.step


val range2 = 0 until 100
range2.start
range2.end
range2.step


val range3 = 0 to 100 by 5
range3.start
range3.end
range3.step




val person = ("Elvis", "Presley")
person._1
person._2

val (first_name, last_name) = person
println(first_name)
println(last_name)

val (_, last_name2) = person
println(last_name2)


