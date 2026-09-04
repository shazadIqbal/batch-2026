package CinemaTicket;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Booking> bookingList;
    private List<Show> showList;

    public Cinema() {
        bookingList = new ArrayList<>();
        showList = new ArrayList<>();
    }

    public Cinema(List<Booking> bookingList, List<Show> showList) {
        this.bookingList = bookingList;
        this.showList = showList;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }

    public static List<Movie> initMovies() {

        List<Movie> movieList = new ArrayList<>();

        movieList.add(
                new Movie(1, "SpiderMan", Genre.ACTION, 120)
        );

        movieList.add(
                new Movie(2, "Batman", Genre.ACTION, 120)
        );

        movieList.add(
                new Movie(3, "Avengers", Genre.FICTION, 120)
        );

        movieList.add(
                new Movie(4, "Nun", Genre.HORROR, 120)
        );

        return movieList;
    }

    public List<Show> initShows() {

        List<Movie> movieList = initMovies();

        List<Show> shows = new ArrayList<>();

        LocalDateTime dateTime =
                LocalDateTime.of(2026, 8, 26, 4, 40);

        shows.add(
                new Show(
                        movieList.get(0),
                        dateTime,
                        1200.0,
                        20
                )
        );

        shows.add(
                new Show(
                        movieList.get(1),
                        dateTime,
                        1200.0,
                        20
                )
        );

        shows.add(
                new Show(
                        movieList.get(2),
                        dateTime,
                        1200.0,
                        20
                )
        );

        shows.add(
                new Show(
                        movieList.get(3),
                        dateTime,
                        1200.0,
                        20
                )
        );

        return shows;
    }

    public Movie getMoviesByID(Integer id) {

        List<Movie> movieList = initMovies();

        for (Movie movie : movieList) {

            if (movie.getId().equals(id)) {
                return movie;
            }
        }

        return null;
    }
}