name := "HelloWorld"
 
version := "1.0"
 
scalaVersion := "2.11.7"
 
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.4" 
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

EclipseKeys.withSource := true