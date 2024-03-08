package org.example.ch6._1

/**
 * Conversions.
 *
 * @author Vitalii Chura
 */
object Conversions {

  def inchesToCentimeters(inches: BigDecimal): BigDecimal = {
    inches * 2.54
  }

  def gallonsToLiters(gallons: BigDecimal): BigDecimal = {
    gallons * 3.785
  }

  def milesToKilometers(miles: BigDecimal): BigDecimal = {
    miles * 1.609
  }
}
