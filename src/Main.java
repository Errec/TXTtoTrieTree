public class Main {

    public static void main(String[] args) {
        TrieSET set = new TrieSET();
        set.add("palavra1");
        set.add("palavra2");
        set.add("palavra3");
        set.add("palavra4");
        set.add("palavra5");
        set.add("palavra6");

        for (String key : set){
            System.out.println(key);
        }

        for (String s : set.keysThatMatch("palavra3")) {
            System.out.println(s);
        }
    }
}
