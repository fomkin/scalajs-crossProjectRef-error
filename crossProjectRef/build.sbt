lazy val crossProjectRef = crossProject.crossType(CrossType.Pure).in(file(".")).
  settings(scalaVersion := "2.11.6") 

lazy val crossProjectRefJS = crossProjectRef.js

lazy val crossProjectRefJVM = crossProjectRef.jvm
