package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Comment {

    private int postId;
    private int id;
    private String name;
    private String mail;
    private String body;

    public String toString(){
        return "post padre -> "+this.postId+"\n"+
                "titulo del comentario -> "+this.name+"\n"+
                "contenido del comentario ->"+this.body+"\n"+
                "<--------------------------------->";
    }
}
