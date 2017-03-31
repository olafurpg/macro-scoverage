package test

import scala.annotation.StaticAnnotation
import scala.meta._

class MacroAnnotation extends StaticAnnotation {

    inline def apply(defn: Any): Any = meta {
      defn match {
        case q"trait $name extends $something" =>
          println("############################")
          q"trait $name extends $something"
        case _ =>
          abort("@MacroAnnotation must annotate a trait")
      }
    }
}