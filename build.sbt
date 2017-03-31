scalaVersion := "2.12.1"

addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-183" cross CrossVersion.full)

scalacOptions += "-Xplugin-require:macroparadise"

libraryDependencies += "org.scalameta" %% "scalameta" % "1.7.0-487-13087aaf"

resolvers += Resolver.bintrayIvyRepo("scalameta", "maven")
