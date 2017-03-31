scalaVersion := "2.12.1"

addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M7" cross CrossVersion.full)

scalacOptions += "-Xplugin-require:macroparadise"

libraryDependencies += "org.scalameta" %% "scalameta" % "1.6.0"