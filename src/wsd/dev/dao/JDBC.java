package wsd.dev.dao;

public class JDBC {

private  String con ="";
private int port;

    public JDBC() {
    }

    public String getCon() {
        getClassName("Con Class");
        return con;
    }

    public void getClassName(String con_class) {
        printClass(con_class);
    }

    private void printClass(String conClass) {
        System.out.println(conClass);
        System.out.println(conClass);
    }

    public JDBC(String con, int port) {
        this.con = con;
        this.port = port;
    }
    public void setCon(String con) {
        this.con = con;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }



}
