import java.io.*;
import java.util.Properties;

class Pojo implements Serializable {
    private int a, b, c, d;
    String s;

    public Pojo() {
    }

    public Pojo(int a, int b, int c, int d, String s) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.s = s;
    }

  
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

}

class Test {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
         Pojo pojo = new Pojo(10, 20, 30, 40, "Sohan");

        p.setProperty("a",String.valueOf( pojo.getA()));
        p.setProperty("b", String.valueOf( pojo.getB()));
        p.setProperty("c", String.valueOf( pojo.getC()));
        p.setProperty("d", String.valueOf( pojo.getD()));
        p.setProperty("name", pojo.getS());

        try {

            FileOutputStream fileout = new FileOutputStream("vinod.p", false);
            p.store(fileout, "Sohan ne banya");
        } catch (Exception e) {

        }

    }
}
