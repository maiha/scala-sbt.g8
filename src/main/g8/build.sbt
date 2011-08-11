organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

retrieveManaged := true

testFrameworks += new TestFramework("org.specs2.runner.SpecsFramework")

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.6-SNAPSHOT" % "test"
)

resolvers += ScalaToolsSnapshots
