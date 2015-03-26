lazy val crossProjectRefJS = ProjectRef(file("crossProjectRef"), "crossProjectRefJS")

lazy val crossProjectRefJVM = ProjectRef(file("crossProjectRef"), "crossProjectRefJVM")
 
lazy val root = project.in(file(".")).
  aggregate(crossProjectRefJS, crossProjectRefJVM)

