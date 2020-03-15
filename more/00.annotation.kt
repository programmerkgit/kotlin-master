fun main() {
    /* Target: specify which class can be anottated */
    @Target(AnnotationTarget.CLASS,AnnotationTarget.FUNCTION, AnnotationTarget.FIELD, AnnotationTarget.FILE)
    /* @Retention? */
    /* @Repetable: Can Same Annoatation be used twice. */
    /* @MustBeDocumented: Publish Api or not */
    annotation class A {

    }
}

annotation class Fancey(val why: String) {

}

@Fancy("why") class F {}



