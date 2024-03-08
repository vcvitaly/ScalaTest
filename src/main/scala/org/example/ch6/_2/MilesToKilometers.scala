package org.example.ch6._2

/**
 * MilesToKilometers.
 *
 * @author Vitalii Chura
 */
object MilesToKilometers extends UnitConversion {

  override def convert(unit: BigDecimal): BigDecimal = {
    unit * 1.609
  }
}
