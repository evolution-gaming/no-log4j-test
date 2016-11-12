# no-log4j-test [![Build Status](https://travis-ci.org/evolution-gaming/no-log4j-test.svg)](https://travis-ci.org/evolution-gaming/no-log4j-test) [![Coverage Status](https://coveralls.io/repos/evolution-gaming/no-log4j-test/badge.svg)](https://coveralls.io/r/evolution-gaming/no-log4j-test) [ ![version](https://api.bintray.com/packages/evolutiongaming/maven/no-log4j-test/images/download.svg) ](https://bintray.com/evolutiongaming/maven/no-log4j-test/_latestVersion)

Test to verify that your project has no log4j dependency

## How to use

Add resolver

    resolvers += Resolver.bintrayRepo("evolutiongaming", "maven")

Add dependency

    libraryDependencies += "com.evolutiongaming" %% "no-log4j-test" % "0.1" % Test

Add the test

```scala
class NoLog4jTest extends com.evolutiongaming.util.NoLog4jSuite
```