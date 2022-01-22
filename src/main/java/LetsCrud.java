import com.diogonunes.jcolor.AnsiFormat;
import model.Comment;
import model.Post;
import rest.Config;
import rest.CrudRest;
import retrofit2.Response;
import java.io.IOException;
import java.util.List;
import static com.diogonunes.jcolor.Attribute.CYAN_TEXT;

public class LetsCrud {

    CrudRest crud = Config.getService();
    AnsiFormat info = new AnsiFormat(CYAN_TEXT())
;
    public void comentarios() throws IOException {
        getComentarios();
        getComentario1();
    }

    public void posts() throws IOException {
        getPosts();
        getPost1();
    }

    /*----------------------------------------------------------------------------------------------*/

    private void getPost1() throws IOException {
        System.out.println(info.format("post con id 1"));
        Response<Post> resp = crud.getPost(1).execute();
        if(resp.isSuccessful()){
            System.out.println(info.format("Listo, codigo -> "+resp.code()));
            System.out.println(info.format("<--------------------------------->"));
            Post post = resp.body();
            System.out.println(post);
        }else{
            System.err.println("error "+resp.code());
        }
    }

    private void getComentario1() throws IOException {
        System.out.println(info.format("comentario con id 1"));
        Response<Comment> resp = crud.getComment(1).execute();
        if(resp.isSuccessful()){
            System.out.println(info.format("Listo, codigo -> "+resp.code()));
            System.out.println(info.format("<--------------------------------->"));
            Comment comentario = resp.body();
            System.out.println(comentario);
        }else{
            System.err.println("error "+resp.code());
        }
    }

    private void getPosts() {
        System.out.println(info.format("todos los posts"));
        try{
            Response<List<Post>> response = crud.getAllPosts().execute();
            if(response.isSuccessful()){
                System.out.println(info.format("Listo, codigo: "+response.code()));
                System.out.println(info.format("<--------------------------------->"));
                List<Post> posts = response.body();
                posts.forEach(System.out::println);
            }else{
                System.err.println("error "+response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getComentarios() {
        System.out.println(info.format("todos los departamentos:"));
        try{
            Response<List<Comment>> response = crud.getAllComments().execute();
            if(response.isSuccessful()){
                System.out.println(info.format("Listo\ncodigo -> "+response.code()));
                System.out.println(info.format("<--------------------------------->"));
                List<Comment> comments = response.body();
                comments.forEach(System.out::println);
            }
            else{
                System.err.println("error "+response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
