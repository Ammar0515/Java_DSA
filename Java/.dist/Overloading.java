public class Overloading {
    public static void main(String[] args) {
    fun("Ammar");
    fun(28);
    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}