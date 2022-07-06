public class TestKid {
    public static void main(String[] args) {
        Kid kiddo = new Kid();
        Kid kiddo1 = new Kid("Ben", "Male", 2);
        System.out.println(kiddo.getName());
        System.out.println(kiddo.getAge());
        System.out.println(kiddo.getGender());
        System.out.println(kiddo1.getAge());
        System.out.println(kiddo1.getGender());
        System.out.println(kiddo1.getName());
        System.out.println(kiddo.toString());
        System.out.println(kiddo1.toString());
        System.out.println(kiddo.areTheyTwins(kiddo1));
    }
}
