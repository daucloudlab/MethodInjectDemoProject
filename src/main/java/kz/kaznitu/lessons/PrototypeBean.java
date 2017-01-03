package kz.kaznitu.lessons;

public class PrototypeBean {
    private String message ;

    public PrototypeBean() {
        System.out.println("Prototype Bean құрылды!!!");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
