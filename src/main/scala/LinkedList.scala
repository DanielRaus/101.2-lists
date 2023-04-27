import scala.collection.mutable

class LinkedList(var head: Node) {

  def this() {
    this(null)
  }

  def addToStart(s: String): Unit = {
    val n : Node = new Node(s, head)
    head = n
    var tmp : Node = n

    while(tmp != null) {
      tmp = tmp.next
    }
  }

  def getSize(): Int = {
    var size : Int = 0
    var tmp : Node = head

    while(tmp != null) {
      size += 1
      tmp = tmp.next
    }

    return size
  }

  def removeFirstElement(): Unit = {

    if(head == null) {
      return
    }

    head = head.next

  }

  def getLastElement(): Node = {

    if(head == null) {
      return head
    }

    var tmp : Node = head

    while(tmp.next != null) {
      tmp = tmp.next
    }

    return tmp
  }

  def addToEnd(s: String): Unit = {
    if(getLastElement() == null) {
      addToStart(s)
    }

    else {
      val newNode: Node = new Node(s)
      getLastElement().next = newNode
    }
  }

  def isPresent(e: String): Boolean = {
    var currentNode : Node = head

    while(currentNode != null) {
      if(currentNode.item == e) {
        return true
      }
      currentNode = currentNode.next
    }

    return false
  }

  def findElement(s: String) : Node = {
    var currentNode : Node = head

    while(currentNode != null) {
      if(currentNode.item == s) {
        return currentNode
      }
      currentNode = currentNode.next
    }

    return currentNode
  }

  def swapElements(e1: String, e2: String) : Unit = {

    try {
      val node1 = findElement(e1)
      val node2 = findElement(e2)

      val tmpContent: String = node1.item
      node1.item = node2.item
      node2.item = tmpContent

    } catch {
      case e : NullPointerException => println("Erreur : L'un des deux paramètres de la méthode swapElements est nulle, impossible d'échanger les éléments")
    }

  }

  def removeLastElement() : Unit = {
    if(head == null) {
      return
    }

    if(head.next == null) {
      head = null
      return
    }

    var currentNode: Node = head
    while (currentNode.next.next != null) {
      currentNode = currentNode.next
    }

    currentNode.next = null

  }

  def removeElement(e: String): Unit = {
    if(head == null) {
      return
    }

    if(head.item == e) {
      removeFirstElement()
      return
    }

    var currentNode: Node = head

    while (currentNode.next != null && currentNode.next.item != e) {
      currentNode = currentNode.next
    }

    if(currentNode.next != null) {
      currentNode.next = currentNode.next.next
    }
  }

  def insertAfter(before: String, after: String): Unit = {
    val beforeNode = findElement(before)

    if(beforeNode == null) {
      println("The node doesn't exist")
      return
    }

    val newNode : Node = new Node(after)
    val tempHead = beforeNode.next

    beforeNode.next = newNode
    newNode.next = tempHead



  }

  override def toString(): String = {
    val sb: StringBuilder = new StringBuilder()
    var currentNode : Node = head

    sb.append(s"List content (size ${getSize()}) : ")

    while (currentNode != null) {
      sb.append(currentNode.item)
      sb.append(" -> ")
      currentNode = currentNode.next
    }

    if (currentNode == null) {
      sb.append("null")
    }

    return sb.toString()
  }
}
