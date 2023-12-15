package utils

object Consts:

  val ProjectName = "$name$"

  val ArtifactOrg = "$organization$"
  val ArtifactName = "$name;format="space,hyphen,lower"$"
  val ArtifactVersion = "0.0.1"

  val GhHandle = "$github_handle$"
  val GhProjectName = "$github_repo$"
  val GhUrl = s"https://github.com/\${GhHandle}/\${GhProjectName}"
