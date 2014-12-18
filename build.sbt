name := "minimal-scala-specs2"

version := "1.0"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
	"org.specs2"	%% "specs2"			% "2.4.15" % "test",
	"org.specs2"    %% "specs2-junit"	% "2.4.15" % "test"
)

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.3"
