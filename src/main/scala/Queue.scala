package oops1

import scala.collection.mutable.ListBuffer
//A trait queue
trait Queue {

  def enqueue(number: Int)

  def dequeue(queue: ListBuffer[Int]): Int = {

    val removedElement = queue(0)
    queue.remove(0)
    removedElement
  }

}
//for SquareQueue
class SquareQueue(queue: ListBuffer[Int]) extends Queue {

  override def enqueue(number: Int): Unit = {

    queue += (number * number)
  }

}
//for DoubleQueue
class DoubleQueue(queue: ListBuffer[Int]) extends Queue {

  override def enqueue(number: Int): Unit = {

    queue += (number * 2)
  }

}