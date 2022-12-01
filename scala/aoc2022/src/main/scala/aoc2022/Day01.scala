package aoc2022

import scala.io.Source
import java.util.ArrayList
import scala.collection.mutable.ListBuffer

object Day01 extends Greeting with App {
  val bufferedSource = Source.fromResource("day1-input.txt")
  var runningSum = 0
  var calories = new ListBuffer[Int]

  for (line <- bufferedSource.getLines) {
    if(line.nonEmpty) {
      runningSum +=   line.toInt
    } else {
      calories += runningSum
      runningSum = 0
    }
  }

  // Part 1
  println("Max calories " + calories.max)
  // Part 2
  println("Top 3 " + calories.sorted.reverse.take(3).sum)

  bufferedSource.close
}

trait Greeting {
  lazy val greeting: String = "hello"
}
