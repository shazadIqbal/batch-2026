package CinemaTicket;

public class Main {

    public static void main(String[] args) {

        Cinema cinema = new Cinema();

        cinema.setShowList(cinema.initShows());

        System.out.println("All Shows:");

        for (Show show : cinema.getShowList()) {
            System.out.println(show);
        }

        System.out.println();

        Movie movie = cinema.getMoviesByID(2);

        System.out.println("Movie with ID 2:");

        if (movie != null) {
            System.out.println(movie);
        } else {
            System.out.println("Movie not found.");
        }
    }
}