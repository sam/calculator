name := "calculator"

scalaVersion := "2.11.7"

version := "1.0-SNAPSHOT"

organization := "com.github.sam"

scalacOptions := Seq("-deprecation", "-unchecked", "-feature", "-language:postfixOps", "-language:implicitConversions")

libraryDependencies ++= Seq(
  "org.scala-lang.modules"       %% "scala-parser-combinators"  % "1.0.4")