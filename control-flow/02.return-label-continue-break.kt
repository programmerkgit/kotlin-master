fun main() {
    label@ for (i in 1..100) {
        println(i)
        if (i > 50) {
            break@label
        }
    }

    label2@ for (i in 1..100) {
        for (i2 in 1..100) {
            for (i3 in 1..100) {
                label3@ for (i 1..100) {
                    break@label2
                    break@label3
                }
            }
        }
    }
}