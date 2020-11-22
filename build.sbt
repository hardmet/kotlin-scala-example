name := "kotlin-scala"

version := "0.1"

scalaVersion := "2.13.4"

lazy val scalaFirst =
  project
    .in(file("scala-first"))

lazy val kotlinFirst =
  project
    .in(file("kotlin-first"))
    .settings(
      libraryDependencies ++= Seq(
        "org.junit.jupiter" % "junit-jupiter-api" % "5.7.0"
      ).map(_ % Test)
    )

lazy val scalaSecond =
  project
    .in(file("scala-second"))
    .dependsOn(kotlinFirst % "compile->compile;test->test")
    .settings(
      libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "3.2.3"
      ).map(_ % Test)
    )

lazy val kotlinSecond =
  project
    .in(file("kotlin-second"))
    .dependsOn(scalaFirst % "compile->compile;test->test")
    .settings(
      libraryDependencies ++= Seq(
        "org.junit.jupiter" % "junit-jupiter-api" % "5.7.0"
      ).map(_ % Test)
    )

lazy val kotlinScalaSubmodule =
  project
    .in(file("kotlin-scala-submodule"))
    .dependsOn(kotlinFirst % "compile->compile;test->test")
    .dependsOn(scalaFirst % "compile->compile;test->test")
    .settings(
      libraryDependencies ++= Seq(
        "org.junit.jupiter" % "junit-jupiter-api" % "5.7.0"
      ).map(_ % Test)
    )

lazy val scalaKotlinSubmodule =
  project
    .in(file("scala-kotlin-submodule"))
    .dependsOn(scalaFirst % "compile->compile;test->test")
    .dependsOn(kotlinFirst % "compile->compile;test->test")
    .settings(
      libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "3.2.3"
      ).map(_ % Test)
    )
