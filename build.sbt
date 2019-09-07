name := "no-log4j-test"

organization := "com.evolutiongaming"

homepage := Some(new URL("http://github.com/evolution-gaming/no-log4j-test"))

startYear := Some(2016)

organizationName := "Evolution Gaming"

organizationHomepage := Some(url("http://evolutiongaming.com"))

bintrayOrganization := Some("evolutiongaming")

scalaVersion := crossScalaVersions.value.head

crossScalaVersions := Seq("2.13.0", "2.12.9")

releaseCrossBuild := true

scalacOptions in(Compile, doc) ++= Seq("-groups", "-implicits", "-no-link-warnings")

val slf4jVersion = "1.7.28"

libraryDependencies ++= Seq(
  "org.scalatest"   %% "scalatest"        % "3.0.8",
  "org.slf4j"        % "slf4j-api"        % slf4jVersion % Test,
  "org.slf4j"        % "jcl-over-slf4j"   % slf4jVersion % Test,
  "org.slf4j"        % "log4j-over-slf4j" % slf4jVersion % Test,
  "org.slf4j"        % "slf4j-log4j12"    % slf4jVersion % Log4jTest,
  "log4j"            % "log4j"            % "1.2.17"     % Log4jTest,
  "commons-logging"  % "commons-logging"  % "1.2"        % Log4jTest)

licenses := Seq(("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0")))

lazy val Log4jTest = config("log4j") extend Test

lazy val root = (project in file(".")).
  configs(Log4jTest).
  settings(inConfig(Log4jTest)(Defaults.testSettings): _*)