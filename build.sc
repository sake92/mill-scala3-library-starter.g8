import $ivy.`io.chris-kipp::mill-giter8::0.2.7`

import io.kipp.mill.giter8.G8Module

object g8 extends G8Module {
  override def validationTargets =
    Seq("my_library.reformat", "my_library.compile", "my_library.test", "docs.hepek")
}
