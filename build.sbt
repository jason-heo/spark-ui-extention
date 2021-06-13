ThisBuild / organization := "com.github.skp33"
ThisBuild / version := "0.1"
ThisBuild / scalaVersion := "2.12.11"

val sparkVersion = "3.0.1"

assemblyJarName in assembly := s"${name.value}-${scalaBinaryVersion.value}-${sparkVersion}-${version.value}.jar"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)
