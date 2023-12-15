package files.tutorials

import utils.*
import Bundle.*, Tags.*

object Index extends TutorialPage {

  override def pageSettings = super.pageSettings
    .withTitle("Tutorials")
    .withLabel("Tutorials")

  override def blogSettings =
    super.blogSettings.withSections(firstSection)

  val firstSection = Section(
    "Quickstart",
    s"""
      Hello world!
    """.md,
    List(
      Section(
        "Mill",
        div(
          chl.scala(s"""
          def ivyDeps = super.ivyDeps() ++ Agg(
            ivy"\${Consts.ArtifactOrg}::\${Consts.ArtifactName}:\${Consts.ArtifactVersion}"
          )
          def scalacOptions = super.scalacOptions() ++ Seq("-Yretain-trees")
          """)
        )
      ),
      Section(
        "Sbt",
        div(
          chl.scala(s"""
          libraryDependencies ++= Seq(
            "\${Consts.ArtifactOrg}" %% "\${Consts.ArtifactName}" % "\${Consts.ArtifactVersion}"
          )
          scalacOptions ++= Seq("-Yretain-trees")
          """)
        )
      ),
      Section(
        "Scala CLI",
        div(
          chl.scala(s"""
          //> using dep \${Consts.ArtifactOrg}::\${Consts.ArtifactName}:\${Consts.ArtifactVersion}
          """)
        )
      ),
      Section(
        "Scastie",
        s"""
        You can also use this [Scastie example](https://scastie.scala-lang.org/TODO) to try \${Consts.ProjectName} online.
        """.md
      ),
      Section(
        "Examples",
        div(
          s"""
          ..
          """
        )
      )
    )
  )
}
