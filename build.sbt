name := "halselhof"

organization := "org.restfulscala"

version := "0.3.0"

scalaVersion := "2.12.3"
crossScalaVersions := Seq("2.11.8", "2.12.3")

scalacOptions  ++= Seq("-unchecked", "-deprecation", "-feature")

resolvers += "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/"

scalariformSettings

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.3" % "provided"

libraryDependencies += "com.typesafe.play" %% "play" % "2.6.3" % "provided"

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.1" % "test"

bintray.Plugin.bintraySettings

bintray.Keys.bintrayOrganization in bintray.Keys.bintray := Some("restfulscala")

bintray.Keys.packageLabels in bintray.Keys.bintray := Seq("scala", "rest", "play")

licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
