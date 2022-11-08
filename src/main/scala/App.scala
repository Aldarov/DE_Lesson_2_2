import scala.io.StdIn.{readLine}

object App {
  def main(array: Array[String]): Unit = {
    val task: String = readLine("Введите букву задания от 'a' до 'o': ")
    task match {
      case "a" => TaskA.run()
      case "b" => TaskB.run()
      case "c" => TaskC.run()
      case "d" => TaskD.run()
      case "e" => TaskE.run()
      case "f" => TaskF.run()
      case "g" => TaskG.run()
      case "h" => TaskH.run()
      case "i" => TaskI.run()
      case "j" => TaskJ.run()
      case "k" => TaskK.run()
      case "l" => TaskL.run()
      case "m" => TaskM.run()
      case "n" => TaskN.run()
      case "o" => TaskO.run()
      case _ => println("Неверна введена буква задания")
    }
  }
}
