package org.example.ch2

import java.time.LocalDate

/**
 * ${NAME}.
 *
 * @author Vitalii Chura
 */
object Main {
  def main(args: Array[String]): Unit = {
    val year = 2022
    val month = 9
    val day = 2
    println(date"$year-$month-$day")
  }

  def pow(x: Long, n: Int): BigDecimal = {
    if (n == 0) 1
    else if (n > 0) {
      if (n % 2 == 0) pow(x, n / 2) * pow(x, n / 2)
      else x * pow(x, n - 1)
    }
    else 1 / pow(x, -n)
  }

  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      if (args.length < 3) throw new IllegalArgumentException("Should be 3 arguments")
      if (sc.parts(1) != "-" || sc.parts(2) != "-") throw new IllegalArgumentException("Arguments should be separated by dashes")
      try {
        val year = s"${args(0)}".toInt
        val month = s"${args(1)}".toInt
        val day = s"${args(2)}".toInt
        LocalDate.of(year, month, day)
      } catch {
        case _: NumberFormatException => throw new IllegalArgumentException("Arguments should be integers")
      }
    }
  }
}
