import com.typesafe.sbt.SbtScalariform
import com.typesafe.sbt.SbtScalariform.ScalariformKeys

import scalariform.formatter.preferences._

name := "no-log4j-test"

organization := "com.evolutiongaming"

homepage := Some(new URL("http://github.com/evolution-gaming/no-log4j-test"))

startYear := Some(2016)

organizationName := "Evolution Gaming"

organizationHomepage := Some(url("http://evolutiongaming.com"))

bintrayOrganization := Some("evolutiongaming")

scalaVersion := "2.12.2"

crossScalaVersions := Seq("2.11.11", "2.12.2")

releaseCrossBuild := true

scalacOptions ++= Seq(
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  "-deprecation",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Xfuture")

scalacOptions in(Compile, doc) ++= Seq("-groups", "-implicits", "-no-link-warnings")

val slf4jVersion = "1.7.21"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.0",
  "org.slf4j" % "slf4j-api" % slf4jVersion % Test,
  "org.slf4j" % "jcl-over-slf4j" % slf4jVersion % Test,
  "org.slf4j" % "log4j-over-slf4j" % slf4jVersion % Test,
  "log4j" % "log4j" % "1.2.17" % Log4jTest,
  "commons-logging" % "commons-logging" % "1.2" % Log4jTest,
  "org.slf4j" % "slf4j-log4j12" % slf4jVersion % Log4jTest)

licenses := Seq(("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0")))

lazy val Log4jTest = config("log4j") extend Test

lazy val root = (project in file(".")).
  configs(Log4jTest).
  settings(inConfig(Log4jTest)(Defaults.testSettings): _*)

SbtScalariform.scalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(AlignParameters, true)
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(DoubleIndentClassDeclaration, true)
