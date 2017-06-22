val list = List(1,2,3,4)

list.foreach(println(_))
list.foreach(x => println(x))
list.foreach(println)
list.map(x => x + 2)
list.map(_ + 2)
list.filter(x => x % 2 == 1)
list.filter(_ % 2 == 1)
list.reduce((x, y) => x + y)
list.reduce(_ + _)

val list2 = List[Int](4,5,6)
val list3: List[Int] = List()

List().isEmpty
List(1,2,3).isEmpty
List().nonEmpty
List(1,2,3).nonEmpty
List(1,2,3,4,5,6,7).count(_ % 2 == 0)
List(1,2,3,4,5,6,7,8).filter(_ % 2 == 0)
List[Int]().foldLeft(0)(_ + _)
List(1).foldLeft(0)(_ + _)
List(1,2).foldLeft(0)(_ + _)
List(1,2,3).foldLeft(0)(_ + _)
List(1,2,3,4).foldLeft(0)(_ + _)
List(1,2,3,4).foldRight(0)(_ + _)
List("a","b","c","d").foldLeft("*")(_ + _)
List("a","b","c","d").foldRight("*")(_ + _)
List("a","b","c","d").foldLeft("*")((acc,elem) => acc + elem*acc.length)
List("a","b","c","d").foldRight("*")((elem,acc) => elem*acc.length + acc)
List(4,5,6).head
//List().head // exception
List(4,5,6).tail
//List().tail // exception
List(4,5,6).last
List(4,5,6).init
List(1,2,3,4,5).take(2)
List(1,2,3,4,5).drop(2)
List(1,2,3,4,5).splitAt(2)
List(1,2,3,4,5,1,2,3,4).takeWhile(_ < 4)
List(1,2,3,4,5,1,2,3,4).dropWhile(_ < 4)
List(1,2,3,4,5,1,2,3,4).span(_ < 4)
List(1,2,3).flatMap(a => List(a,a))

# PL
    List() lub Nil - pusta lista
    List(435454L, 34546534L, 24345448548495L) - tworzenie listy z elementami (tutaj typu Long)
    List(1, 2) ::: List(3, 4) - łączenie list i tworzenie nowej (lub ++)
    lista(2) - zwraca 3 element listy (liczone od zera)
    lista.drop(2) - porzuca wszystkie elementy z przodu włącznie z 2 (NIE liczone od zera)
    lista.take(2) - bierze dwie pierwsze elementy listy
    lista.dropRight(2) - podobna do drop tylko porzuca elementy z tyłu
    lista.last - ostatni element listy
    lista.head - pierwszy element listy
    lista.init - wszystkie elementy oprócz ostatniego
    lista.tail - zwraca wszystkie elementy oprócz pierwszego
    val pierwszy :: lista2 = lista - przypisuje pierwszy element listy do zmiennej pierwszy, a resztę do lista2
    lista.reverse - odwraca kolejność elementów w liście
    lista.isEmpty - zwraca prawdę lub fałsz w zależności czy lista jest pusta
    lista.length - zwraca ilość elementów listy
    lista.map(elem => s * 2) - używa funkcji anonimowej do przetworzenia elementów, w tym przypadku zwiększa każdy element 2 krotnie
    lista.mkString(", ") - łączy elementy tworząc napis oddzielony podanym parametrem
    lista.forall(x => x > 3) - zwraca prawdę jeśli wszystkie elementy są większe od 3
    lista.exists(x => x > 3) - zwraca prawdę jeśli chociaż jeden element jest większy od 3
    lista.filter(x => x > 3) - zwraca listę wszystkich elementów większych od 3
    lista.filterNot(x => x > 3) - przeciwny do filter
    lista.foreach(x => printnln(x.toString + " wartość")) - iteruje po wszystkich elementach (niczego nie zwraca)
    lista.sort((x, y) => x > y) - zwraca listę posortowaną w porządku malejącym 
