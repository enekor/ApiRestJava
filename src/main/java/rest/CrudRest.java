package rest;

import model.Comment;
import model.Post;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface CrudRest {

    @GET("/comments")
    Call<List<Comment>> getAllComments();

    @GET("/posts")
    Call<List<Post>> getAllPosts();

    @GET("/comments/{id}")
    Call<Comment> getComment(@Path("id") int id);

    @GET("/posts/{id}")
    Call<Post> getPost(@Path("id") int id);

    @POST("/comments")
    Call<Comment> inserComment(@Body Comment comentario);

    @PUT("comments/{id}")
    Call<Comment> updateComment(@Path("id") int id,@Body Comment comentario);

    @PATCH("/comments/{id}")
    Call<Comment> upgradeComment(@Path("id") int id,@Body Comment comentario);

    @DELETE("/comments/{id}")
    Call<Comment> deleteComment(@Path("id") int id,@Body Comment comentario);

    @POST("/posts")
    Call<Comment> insertPos(@Body Post post);

    @PUT("posts/{id}")
    Call<Comment> updatePost(@Path("id") int id,@Body Post post);

    @PATCH("/posts/{id}")
    Call<Comment> upgradePost(@Path("id") int id,@Body Post post);

    @DELETE("/posts/{id}")
    Call<Comment> deletePost(@Path("id") int id,@Body Post post);

}
