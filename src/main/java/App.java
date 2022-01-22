import java.io.IOException;

public class App {
    public static void main(String[] args) {
        LetsCrud lc = new LetsCrud();
        try {
            lc.comentarios();
            lc.posts();

            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
