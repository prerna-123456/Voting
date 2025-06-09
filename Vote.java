public class Vote {
    public String isEligible(int age) {
        if (age >= 18) {
            return "Eligible";
        } else {
            return "Not Eligible";
        }
    } 

    public static void main(String[] args) {
        Vote v = new Vote();
        System.out.println("Age 20: " + v.isEligible(20));
        System.out.println("Age 16: " + v.isEligible(16));
    }
}
