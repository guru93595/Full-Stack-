public class sample {
    public static void main(String args[]){
        loop1(1,20);
        System.out.println("&&&&&&&&&&&&&");
        loop1(21,40);
    }
    public static void loop1(int start, int stop){
        for(; start<=stop ; start++){
            System.out.println(start);
        }
    }
}