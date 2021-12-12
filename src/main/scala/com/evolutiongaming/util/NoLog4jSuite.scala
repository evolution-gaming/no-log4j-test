package com.evolutiongaming.util

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

trait NoLog4jSuite extends AnyFunSuite with Matchers {
  for { (name, clazz) <- Log4jDeps() } {
    test(s"no $name") {
      the[ClassNotFoundException] thrownBy getClass.getClassLoader.loadClass(clazz)
    }
  }
}

object Log4jDeps {
  def apply(): Map[String, String] = Map(
    ("log4j"          , "org.apache.log4j.Dispatcher"),
    ("commons-logging", "org.apache.commons.logging.LogSource"),
    ("slf4j-log4j12"  , "org.slf4j.impl.Log4jLoggerAdapter"),
    ("log4j2"         , "org.apache.logging.log4j.core.appender.AbstractAppender")
  )
}