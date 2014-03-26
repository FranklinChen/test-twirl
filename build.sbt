name := "test-twirl"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

description := "Test use of Twirl to generate text"

homepage := Some(url("https://github.com/FranklinChen/test-twirl"))

startYear := Some(2013)

version := "1.0.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.specs2" %% "specs2" % "2.3.10" % "test"

Twirl.settings
