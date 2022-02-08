name := "AkkaPractise"

version := "0.1"

scalaVersion := "2.13.8"

//classic Actor::

val AkkaVersion = "2.6.18"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % AkkaVersion % Test
)

//MOdernType::

//val AkkaVersion = "2.6.18"
//libraryDependencies ++= Seq(
//  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
//  "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test
//)


//libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"

