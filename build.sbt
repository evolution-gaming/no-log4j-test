import sbt.Resolver
name := "no-log4j-test"

organization := "com.evolutiongaming"

homepage := Some(new URL("http://github.com/evolution-gaming/no-log4j-test"))

startYear := Some(2016)

organizationName := "Evolution"

organizationHomepage := Some(url("http://evolution.com"))

scalaVersion := crossScalaVersions.value.head

crossScalaVersions := Seq("2.13.7", "2.12.15")

publishTo := Some(Resolver.evolutionReleases)

Compile / doc / scalacOptions ++= Seq("-groups", "-implicits", "-no-link-warnings")

ThisBuild / versionScheme := Some("early-semver")

val slf4jVersion = "1.7.32"

libraryDependencies ++= Seq(
  "org.scalatest"            %% "scalatest"        % "3.0.9",
  "org.slf4j"                 % "slf4j-api"        % slf4jVersion % Test,
  "org.slf4j"                 % "jcl-over-slf4j"   % slf4jVersion % Test,
  "org.slf4j"                 % "log4j-over-slf4j" % slf4jVersion % Test,
  "log4j"                     % "log4j"            % "1.2.17"     % Log4jTest,
  "org.apache.logging.log4j"  % "log4j-core"       % "2.15.0"     % Log4jTest,
  "commons-logging"           % "commons-logging"  % "1.2"        % Log4jTest,
  "org.slf4j"                 % "slf4j-log4j12"    % slf4jVersion % Log4jTest)

licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT")))

releaseCrossBuild := true

lazy val Log4jTest = config("log4j") extend Test

lazy val root = (project in file("."))
  .configs(Log4jTest)
  .settings(inConfig(Log4jTest)(Defaults.testSettings): _*)

addCommandAlias("testAll", "test;log4j:test")