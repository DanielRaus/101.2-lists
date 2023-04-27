object Main extends App {

  val node1 : Node = new Node("Tokyo")
  val node2 : Node = new Node("Paris")
  val node3 : Node = new Node("Milan")

  node1.next = node2
  node2.next = node3

  val head : Node = node1
  var tmp : Node = head

  while(tmp != null) {
    println(tmp.item)
    tmp = tmp.next
  }

  var flightList: LinkedList = new LinkedList()
    println(flightList)
    flightList.addToStart("Rome")
    println(flightList)
    flightList.addToStart("Paris")
    println(flightList)
    flightList.addToStart("Tokyo")
    println(flightList)
    flightList.removeFirstElement()
    println(flightList)
    flightList.addToEnd("Manille")
    println(flightList)
    flightList.findElement("Tokyo")
    flightList.swapElements("Rome", "Manille")
    println(flightList)
    flightList.removeLastElement()
    println(flightList)
    flightList.removeElement("Manille")
    println(flightList)
    flightList.addToStart("Geneve")
    flightList.addToEnd("New York")
    println(flightList)
    flightList.insertAfter("Geneve", "Sion")
    println(flightList)
//    flightList.removeLastElement()
//    println(flightList)
    flightList.removeLastElement()
    flightList.removeLastElement()
    flightList.removeLastElement()
    println(flightList)
    flightList.removeElement("Geneve")
    println(flightList)




}
