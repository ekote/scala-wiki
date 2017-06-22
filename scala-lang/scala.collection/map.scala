
val map1 = Map(("a", 1.0 ),("b", 2.0))

val map2: Map[String, Double] = Map(("a", 1.0 ),("b", 2.0))

val map3 = Map( 1->2, 1->4, 2->2)

Map('a' -> 1, 'b' -> 2).foreach(println)

Map().isEmpty

.size

Map("abc"->3,"ab"->2,"qw"->2,"w"->1).forall(p => p._1.length == p._2)

Map("abc"->3,"ab"->2,"qw"->2,"w"->1).exists(p => p._1.length != p._2)

Map("abc"->3,"ab"->2,"qw"->2,"w"->1).find(p => p._1.length != p._2)

Map(1->3,2->2,3->2,5->5).filter{ case (k,v) => k == v }

Map("a"->3,"B"->2,"c"->1) filterKeys (k => k == k.toLowerCase)


