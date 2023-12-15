import \$ivy.`io.chris-kipp::mill-ci-release::0.1.9`
import \$ivy.`ba.sake::mill-hepek::0.0.2`

import mill._, scalalib._, scalajslib._, publish._, scalafmt._
import io.kipp.mill.ci.release.CiReleaseModule
import ba.sake.millhepek.MillHepekModule

import mill._, scalalib._, scalafmt._
import ba.sake.millhepek.MillHepekModule

object $name;format="space,snake,lower"$ extends CommonScalaModule with CiReleaseModule {
  
  def ivyDeps = Agg(
    ivy"com.lihaoyi::pprint:0.8.1"
  )

  def pomSettings = PomSettings(
    organization = "$organization$",
    url = "https://github.com/$github_handle$/$github_repo$",
    licenses = Seq(License.Common.Apache2),
    versionControl = VersionControl.github("$github_handle$", "$github_repo$"),
    description = "$name$",
    developers = Seq(
      Developer("$github_handle$", "$developer_name$", "https://github.com/$github_handle$/$github_repo$")
    )
  )

  object test extends ScalaTests with TestModule.Munit {
    def ivyDeps = Agg(
      ivy"org.scalameta::munit::0.7.29"
    )
  }

}

object docs extends CommonScalaModule with MillHepekModule {

  def ivyDeps = Agg(
    ivy"ba.sake::hepek:0.22.0"
  )
}

trait CommonScalaModule extends ScalaModule with ScalafmtModule {
  def scalaVersion = "3.3.1"
  def scalacOptions = super.scalacOptions() ++ Seq(
    "-Yretain-trees",
    "-deprecation",
    "-Xcheck-macros"
  )
}
