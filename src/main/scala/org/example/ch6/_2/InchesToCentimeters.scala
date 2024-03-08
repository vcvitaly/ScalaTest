package org.example.ch6._2

/**
 * InchesToCentimeters.
 *
 * @author Vitalii Chura
 */
object InchesToCentimeters extends UnitConversion {

  override def convert(unit: BigDecimal): BigDecimal = {
    unit * 2.54
  }
}
