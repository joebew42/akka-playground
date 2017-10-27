name := "akka-playground"
version := "0.1"
scalaVersion := "2.12.4"

val akkaVersion = "2.5.6"
val scalaTest = "3.0.4"

val dependencies = Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion
)

val testDependencies = Seq(
  "org.scalactic" %% "scalactic" % scalaTest % "test",
  "org.scalatest" %% "scalatest" % scalaTest % "test",
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
)

libraryDependencies ++= dependencies ++ testDependencies