import sbt._
import Keys._

object ApplicationBuild extends Build {

    val appName         = "j"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
       "com.typesafe.play" %% "play-cache" % "2.2.0",
       "org.apache.directory.studio" % "org.apache.commons.io" % "2.4",
       "org.imgscalr" % "imgscalr-lib" % "4.2"
       
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      resolvers += "Typesafe Releases" at "http://typesafe.artifactoryonline.com/typesafe",
      resolvers += "pk11 repo" at "http://pk11-scratch.googlecode.com/svn/trunk"
    )
}