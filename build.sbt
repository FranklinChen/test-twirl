name := "test-twirl"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

description := "Test use of Twirl to generate text"

homepage := Some(url("https://github.com/FranklinChen/test-twirl"))

startYear := Some(2013)

version := "1.0.0"

scalaVersion := "2.13.1"

libraryDependencies += "org.specs2" %% "specs2-core" % "4.8.3" % Test

lazy val root = (project in file(".")).enablePlugins(SbtTwirl)
