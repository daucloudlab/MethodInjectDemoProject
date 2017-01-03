package kz.kaznitu.lessons;


public class SingletonBean {
    private PrototypeBean prototypeBean ;

    public SingletonBean(){
        System.out.println("Singleton Bean құрылды!!!");
    }

    public PrototypeBean getPrototypeBean() {
        return prototypeBean;
    }

    public void setPrototypeBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
    }
}
