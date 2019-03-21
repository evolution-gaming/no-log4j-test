# no-log4j-test [![Build Status](https://travis-ci.org/evolution-gaming/no-log4j-test.svg)](https://travis-ci.org/evolution-gaming/no-log4j-test) [![Coverage Status](https://coveralls.io/repos/evolution-gaming/no-log4j-test/badge.svg)](https://coveralls.io/r/evolution-gaming/no-log4j-test) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/0f6269ec24cf4ce7b7169119ec125c51)](https://www.codacy.com/app/evolution-gaming/no-log4j-test?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=evolution-gaming/no-log4j-test&amp;utm_campaign=Badge_Grade)[![Codacy Badge](https://api.codacy.com/project/badge/Grade/0f6269ec24cf4ce7b7169119ec125c51)](https://www.codacy.com/app/evolution-gaming/no-log4j-test?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=evolution-gaming/no-log4j-test&amp;utm_campaign=Badge_Grade) [![version](https://api.bintray.com/packages/evolutiongaming/maven/no-log4j-test/images/download.svg)](https://bintray.com/evolutiongaming/maven/no-log4j-test/_latestVersion)

Test to verify that your project has no log4j dependency

## How to use

Add resolver

    resolvers += Resolver.bintrayRepo("evolutiongaming", "maven")

Add dependency

    libraryDependencies += "com.evolutiongaming" %% "no-log4j-test" % "0.5" % Test

Add the test

```scala
class NoLog4jTest extends com.evolutiongaming.util.NoLog4jSuite
```