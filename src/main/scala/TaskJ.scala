import scalaj.http._

object TaskJ {
  def run(): Unit = {
    val response = Http("https://api.hh.ru/vacancies?text=junior+data+engineer&page=0")
        .header("User-Agent", "api-test-agent")
        .asString

    println(response.body)
  }
}
