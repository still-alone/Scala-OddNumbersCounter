import scala.util.Random

object OddNumbersCounter extends App {
  // Генерация списка случайных чисел (от 0 до 100)
  val randomList: List[Int] = List.fill(20)(Random.nextInt(100))
  
  // Функция для подсчета нечетных элементов
  def countOddNumbers(list: List[Int]): Int = {
    list.count(_ % 2 != 0) // Используем count с условием для подсчета нечетных
  }
  
  // Получаем количество нечетных элементов
  val oddCount = countOddNumbers(randomList)
  
  // Выводим результаты
  println(s"Сгенерированный список: $randomList")
  println(s"Количество нечетных чисел: $oddCount")
}
