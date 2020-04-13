package basics.packagesAndImports.kt

import thisFunctionIsInDefaultPackageBecausePackageIsNotSpecified

fun main() {
    println("default imports are")
    println("kotlin.*")
    println("kotlin.annotation.*")
    println("kotlin.collections.*")
    println("kotlin.comparisons.+")
    println("kotlin.rages.*")
    println("kotlin.sequences.*")
    println("kotlin.text.*")
    println("Additional packages are imported depending on the target platform")
    println("JVM")
    println("  : java.lang.*")
    println("  : kotlin.jvm.*")
    println("JS")
    println("  : kotlin.js.*")
    thisFunctionIsInDefaultPackageBecausePackageIsNotSpecified()
    println("All name in the same package should be unique.\n" +
            "In convention, package name is directory name, so all file in the same directory\n" +
            "share same namespaces. All identifier should be unique in the directory.")
}