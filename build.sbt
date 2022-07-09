
val commonSetting = libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.12" % "test"

lazy val root = (project in file(".")).settings(
  commonSetting,
  voice := "Anna"
)

lazy val second = (project in file("second")).settings(
  commonSetting,
  voice := "Alex"
)

lazy val third = (project in file("third")).settings(
  commonSetting,
  voice := "Fiona"
)

