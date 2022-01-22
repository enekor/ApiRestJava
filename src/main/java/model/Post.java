package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {

    private String userId;
    private String id;
    private String title;
    private String body;

    public String toString(){
        return "Propietario del post -> "+this.userId+"\n"+
                "titulo del post -> "+this.title+"\n"+
                "contenido del post -> "+this.body+"\n"+
                "<--------------------------------->";
    }
}
