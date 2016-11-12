package com.evolutiongaming.util

import org.scalatest.{FunSuite, Matchers}

class Log4jTest extends FunSuite with Matchers {
  for { (name, clazz) <- Log4jDeps() } {
    test(name) {
      getClass.getClassLoader.loadClass(clazz)
    }
  }
}