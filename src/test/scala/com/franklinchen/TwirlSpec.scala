package com.franklinchen

import org.specs2._
import org.specs2.matcher._

class TwirlSpec extends Specification {
  def is =
    "index text expands correctly" ! e1 ^
  end

  def e1  = {
    txt.index("hello", "world").toString must_== "hello there, world"
  }
}
