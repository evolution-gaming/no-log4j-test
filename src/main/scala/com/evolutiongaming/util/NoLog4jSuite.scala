package com.evolutiongaming.util

import org.scalatest.{ FunSuite, Matchers }

trait NoLog4jSuite extends FunSuite with Matchers {
  for { (name, clazz) <- Log4jDeps() } {
    test(s"no $name") {
      the[ClassNotFoundException] thrownBy getClass.getClassLoader.loadClass(clazz)
    }
  }
}

object Log4jDeps {
  def apply(): Map[String, String] = Map(
    "log4j"           -> "org.apache.log4j.Dispatcher",
    "commons-logging" -> "org.apache.commons.logging.LogSource",
    "slf4j-log4j12"   -> "org.slf4j.impl.Log4jLoggerAdapter"
  )
}