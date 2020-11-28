lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.7"
    )),
    name := "shopping-cart"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
