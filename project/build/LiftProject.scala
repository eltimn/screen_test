import sbt._

class LiftProject(info: ProjectInfo) extends DefaultWebProject(info) {
  val liftVersion = "2.3-SNAPSHOT"

  // uncomment the following if you want to use the snapshot repo
  //val scalatoolsSnapshot = ScalaToolsSnapshots
  
  val mavenLocal = "Local Maven Repository" at "file://"+Path.userHome+"/.m2/repository"

  // If you're using JRebel for Lift development, uncomment
  // this line
  // override def scanDirectories = Nil

  override def libraryDependencies = Set(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-record" % liftVersion % "compile->default",
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default",
    "junit" % "junit" % "4.5" % "test->default",
    "ch.qos.logback" % "logback-classic" % "0.9.26",
    "org.scala-tools.testing" %% "specs" % "1.6.6" % "test->default"
  ) ++ super.libraryDependencies
}
