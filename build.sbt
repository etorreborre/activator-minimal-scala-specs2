name := "minimal-scala-specs2"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "3.0.1" % "test",
    "org.specs2" %% "specs2-junit" % "3.0.1" % "test"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"


// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.3"
