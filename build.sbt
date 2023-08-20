ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

// Define versions of used dependencies
val scalaTestVersion: String = "3.2.16"

// Add dependencies
libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % scalaTestVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion % "test"
)

lazy val root = (project in file("."))
  .settings(
    name := "testRepoCompileTimeFail"
  )
