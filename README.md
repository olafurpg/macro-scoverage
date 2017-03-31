# macro-scoverage
shows buggy interaction between macros and scoverage

When compiled with code coverage turned on (`sbt coverage compile`) a position error is reported:

```
[info] ======= Position error
[info] Overlapping trees (1050,1061)
[info] == Ancestor tree [1062] of type PackageDef at [0:426]MacroAnnotation.scala
[info] 
[info] [L   1        ] #1062   [0:426]         PackageDef // test
[info] 
[info] == First overlapping tree [1050] of type ClassDef at [76:426]MacroAnnotation.scala
[info] 
[info] [L   6        ] #1050   [76:426]        ClassDef   // MacroAnnotation extends StaticAnnotation {
[info] 
[info] == Second overlapping tree [1061] of type ModuleDef at [76:426]MacroAnnotation.scala
[info] 
[info] [L   6        ] #1061   [76:426]        ModuleDef  // MacroAnnotation extends StaticAnnotation {
[info] 
[info] 
[info] While validating #1062
[info] [L   1        ] #1062   [0:426]         PackageDef // test
[info] 
[info] Children:
[info]   [L   1 P# 1062] #23     [8:12]          Ident      // test
[info]   [L   3 P# 1062] #26     [14:54]         Import     // scala.annotation.StaticAnnotation
[info]   [L   4 P# 1062] #29     [55:74]         Import     // scala.meta._
[info]   [L   6 P# 1062] #1050   [76:426]        ClassDef   // MacroAnnotation extends StaticAnnotation {
[info]   [L   6 P# 1062] #1061   [76:426]        ModuleDef  // MacroAnnotation extends StaticAnnotation {
[info] =======
```
