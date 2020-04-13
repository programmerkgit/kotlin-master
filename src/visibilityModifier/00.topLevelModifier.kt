package visibilityModifier

fun main() {

}

/* this can be visible to any code. this is default */
public class PublicClassA {

}
/* this is visible to same module */
internal class InternalClassB {

}

/* this is visible to this file. But name space is shared with module. */
private class PrivateClassC {

}