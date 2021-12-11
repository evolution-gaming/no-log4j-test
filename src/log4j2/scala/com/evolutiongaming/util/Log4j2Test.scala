package com.evolutiongaming.util

import org.scalatest.{FunSuite, Matchers}

class Log4j2Test extends FunSuite with Matchers {
  for { (name, clazz) <- Log4jDeps() } {
    test(name) {
      getClass.getClassLoader.loadClass(clazz)
    }
  }
}