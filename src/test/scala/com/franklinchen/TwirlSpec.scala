package com.franklinchen

import org.specs2._
import org.specs2.matcher._

class TwirlSpec extends Specification {
  def is = s2"""
    Test Twirl

      index text expands correctly $e1
    """

  def e1  = {
    txt.index("hello", "world").toString must_== "hello there, world"
  }
}
