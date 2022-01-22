package rest;

public class Config {

    private static String url = "https://jsonplaceholder.typicode.com";

    public static CrudRest getService(){

        return Client.getClient(url).create(CrudRest.class);
    }
}