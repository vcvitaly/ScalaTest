package org.example.ch9._9

import java.nio.file.{Files, Paths}

/**
 * Main.
 *
 * @author Vitalii Chura
 */
object Main {

  def main(args: Array[String]): Unit = {
    val dirname = "target"
    val entries = Files.walk(Paths.get(dirname))
    println(entries.map(s => s.toString).filter(s => s.endsWith(".class")).count)
    entries.close()
  }
}
