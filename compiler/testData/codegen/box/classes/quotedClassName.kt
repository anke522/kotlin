// IGNORE_BACKEND: JS

class `Foo Bar`() {
    val ok = "OK"
}

fun box(): String {
    return `Foo Bar`().ok
}