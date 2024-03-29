name := "AkkaKittenCollector"

version := "1.0"

scalaVersion := "2.12.8"

lazy val akkaVersion = "2.6.0-RC1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test,
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)
