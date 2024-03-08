package org.example.ch6._2

/**
 * GallonsToLiters.
 *
 * @author Vitalii Chura
 */
class GallonsToLiters extends UnitConversion {

  override def convert(unit: BigDecimal): BigDecimal = {
    unit * 3.785
  }
}
