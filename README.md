# no-log4j-test 
[![Build Status](https://github.com/evolution-gaming/no-log4j-test/workflows/CI/badge.svg)](https://github.com/evolution-gaming/no-log4j-test/actions?query=workflow%3ACI)
[![Coverage Status](https://coveralls.io/repos/evolution-gaming/no-log4j-test/badge.svg)](https://coveralls.io/r/evolution-gaming/no-log4j-test)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/189a08f349834aac87b17f6e3ceac613)](https://www.codacy.com/gh/evolution-gaming/no-log4j-test/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=evolution-gaming/no-log4j-test&amp;utm_campaign=Badge_Grade)
[![Version](https://img.shields.io/badge/version-click-blue)](https://evolution.jfrog.io/artifactory/api/search/latestVersion?g=com.evolutiongaming&a=no-log4j-test_2.13&repos=public)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellowgreen.svg)](https://opensource.org/licenses/MIT)

Test to verify that your project has no log4j dependency

## How to use

Add dependency

```scala
addSbtPlugin("com.evolution" % "sbt-artifactory-plugin" % "0.0.2")

libraryDependencies += "com.evolutiongaming" %% "no-log4j-test" % "0.6" % Test
```

Add the test

```scala
class NoLog4jTest extends com.evolutiongaming.util.NoLog4jSuite
```