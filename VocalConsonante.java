public class VocalConsonante {
    public static void main(String[] args) {
        char ch = args[0].charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(c + " es una vocal");
        else 
            System.out.println(c + " es una consonante");
    }
}
