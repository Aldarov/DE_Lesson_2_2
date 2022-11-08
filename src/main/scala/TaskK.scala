object TaskK {
  def run(): Unit = {
    var emp =  Map[String, Int]()

    emp += ("Иванов И.А." -> 120)
    emp += ("Петров Н.А." -> 100)
    emp += ("Сидоров П.А." -> 270)
    emp += ("Павлов А.А." -> 120)
    emp += ("Семенов О.Н." -> 80)

    println(emp)
  }
}
