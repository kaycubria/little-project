package littleproject;

/**
 * Created by kcubria on 1/26/16.
 */
public class User {

    private long id;
    private String talky;

    public String getTalky() {
        return talky;
    }

    public void setTalky(String talky) {
        this.talky = talky;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String sayHello() {
        return "Hello World!";
    }
}
