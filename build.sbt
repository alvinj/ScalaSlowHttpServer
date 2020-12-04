name := "ScalaSlowSocketServer"
version := "0.1"
scalaVersion := "3.0.0-M2"
useScala3doc := true

fork in run := true

scalacOptions ++= Seq(
    "-deprecation",
    "-explain",
    "-explain-types",
    "-new-syntax",
    "-unchecked",
    "-Xfatal-warnings",
    "-Xmigration"
)