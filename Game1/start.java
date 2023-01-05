package Game1;

public class start{
    public static void main(String[] args){
        paneMap m1 = new paneMap();
        paneMap m2 = new paneMap();
        m1.set(0,0,0);
        m1.set(0,1,0);
        m1.set(1,0,2);
        m1.set(1,1,2);
        m2.set(0,0,"abc");
        m2.set(0,1,"def");
        m2.set(1,0,"试试");
        m2.set(1,1,"汉字");
        display.out(6,m1,m2,2,2);
    }
}
