name := "$name$"

scalaVersion := "$scala_version$"

val akkaVersion = "$akka_version$"
val akkaHttpVersion = "$akka_http_version$"

version := "1.0"

libraryDependencies ++= Seq(
  //  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  //  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  //  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  //  "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion,
  //  "com.typesafe.akka" %% "akka-cluster-metrics" % akkaVersion,
  //  "com.typesafe.akka" %% "akka-persistence" % akkaVersion,
  //  "com.typesafe.akka" %% "akka-contrib" % akkaVersion,
  //  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,

  //  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  //  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,

  //  "de.heikoseeberger" %% "akka-http-json4s" % "1.21.1",
  //  "org.json4s" %% "json4s-native" % "3.6.1",

  //  "org.scalatest" %% "scalatest" % "3.0.5" % Test

  //  "com.typesafe.slick" %% "slick" % "3.2.3",
  //  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.3",

  //  "com.typesafe.play" %% "play-json" % "2.6.9",
  //  "org.postgresql" % "postgresql" % "42.2.4",
  //  "com.chuusai" %% "shapeless" % "2.3.3",
  //  "io.underscore" %% "slickless" % "0.3.3",
  //  "org.scala-lang.modules" %% "scala-java8-compat" % "0.9.0",

  //  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0",
  //  "ch.qos.logback" % "logback-classic" % "1.2.3",
  //  "org.slf4j" % "slf4j-simple" % "1.7.25",
)
