

resolvers ++= Seq(
  "less is" at "http://repo.lessis.me",
  "coda" at "http://repo.codahale.com")

addSbtPlugin("me.lessis" % "ls-sbt" % "0.1.2")

addSbtPlugin("io.spray" % "sbt-twirl" % "0.6.1")
