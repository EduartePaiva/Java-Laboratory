public class SealedClassesLesson {
    sealed class A permits B, C {
    }

    sealed class B extends A permits D {
    }

    final class C extends A {
    }

    non-sealed class D extends B {
    }

    class E extends D {
    }

    sealed interface X permits Y {
    }

    non-sealed interface Y extends X {
    }
}
