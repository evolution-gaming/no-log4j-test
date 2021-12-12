package com.evolutiongaming.util

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class Log4j2Test extends AnyFunSuite with Matchers {
  for { (name, clazz) <- Log4jDeps() } {
    test(name) {
      getClass.getClassLoader.loadClass(clazz)
    }
  }
}