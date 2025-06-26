interface Sub {
    default void fun1() {
        System.out.println("parent print");
    }
}

interface Subb extends Sub {
    default void fun2() {
        System.out.println("subparent print");
    }

    // You can override fun1 here if needed
    @Override
    default void fun1() {
        System.out.println("overridden fun1 in Subb");
    }
}

class MainClass {
    public static void main(String[] args) {
        Subb a1 = new Subb() {}; // Anonymous class implementing Subb
        a1.fun1(); // Calls the overridden fun1
        a1.fun2(); // Calls fun2
    }
}
