name := "scalatube"

scalaVersion := "2.12.1"

version := "0.0.1"

libraryDependencies ++= Seq("org.http4s" %% "http4s-dsl" % "0.15.9a",
                            "org.http4s" %% "http4s-circe" % "0.15.9a")

licenses += ("GPL-3.0", url("https://opensource.org/licenses/GPL-3.0"))
