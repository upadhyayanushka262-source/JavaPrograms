class Movie {
    String name;
    String genre;
    double rating;
    static String industry = "Bollywood";

    void display() {
        String n = name;
        String g = genre;
        double r = rating;

        System.out.println("Movie: " + n);
        System.out.println("Genre: " + g);
        System.out.println("Rating: " + r);
        System.out.println("Industry: " + industry);
    }

    public static void main(String[] args) {
        Movie m = new Movie();
        m.name = "3 Idiots";
        m.genre = "Comedy";
        m.rating = 8.4;
        m.display();
    }
}
