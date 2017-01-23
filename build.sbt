name := "classy-example"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "com.fortysevendeg" %% "classy-core" % "0.2.0",
  "com.fortysevendeg" %% "classy-config-typesafe" % "0.2.0",
  "com.fortysevendeg" %% "classy-generic" % "0.2.0",
  "com.typesafe" % "config" % "1.3.1",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)