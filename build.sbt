name := "addressapp"
version := "1.0"
scalaVersion := "2.12.7"


libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.192-R14"

libraryDependencies += "org.scalafx" %% "scalafxml-core-sfx8" % "0.5"


addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full) 



fork := true
