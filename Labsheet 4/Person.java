class Person {
    String name;
    int age;
    static String country = "India";

    void checkVoting() {
        int votingAge = 18;

        System.out.println("Name: " + name);
        System.out.println("Country: " + country);

        if (age >= votingAge) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Anu";
        p.age = 19;
        p.checkVoting();
    }
}
