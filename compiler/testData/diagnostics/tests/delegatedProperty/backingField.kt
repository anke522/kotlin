// !DIAGNOSTICS: -UNUSED_PARAMETER

import kotlin.reflect.KProperty

class B {
    val a: Int by Delegate()

    fun foo() = <!NO_BACKING_FIELD_CUSTOM_ACCESSORS!>$a<!>
}

class Delegate {
  operator fun getValue(t: Any?, p: KProperty<*>): Int {
    return 1
  }
}
