package basics.packagesAndImports.kt

import basics.*
import basics.packageTest.CanBeImported as A


fun main() {
    println("import basics.* can import all identifier from basics directory, but not basics/subdirectory")
    ShouldBeImportedA()
    println("basics.packageTest.CanBeImportedLine is necessary")
    println("import name can be changed by import * as moreLanguageConstructs.A keyword")
    A()
}
