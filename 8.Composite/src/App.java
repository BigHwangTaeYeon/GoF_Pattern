public class App {
    public static void main(String[] args) throws Exception {

        Folder root = new Folder("root");
        root.add(new File("a.txt", 1000));
        root.add(new File("b.txt", 2000));

        Folder sub1 = new Folder("sub1");
        root.add(sub1);
        sub1.add(new File("sa.txt", 100));
        sub1.add(new File("sb.txt", 4000));

        Folder sub2 = new Folder("sub2");
        root.add(sub2);
        sub1.add(new File("SA.txt", 250));
        sub1.add(new File("SB.txt", 340));

        root.list();

        
    }
}
