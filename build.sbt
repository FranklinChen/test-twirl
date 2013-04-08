organization := "com.franklinchen"

name := "test-twirl"

version := "0.1.0"

scalaVersion := "2.10.1"

libraryDependencies += "org.specs2" %% "specs2" % "1.14" % "test"

seq(lsSettings :_*)

seq(Twirl.settings: _*)
