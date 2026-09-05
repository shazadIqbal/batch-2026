package cinema;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Cinema {
   private List<Booking> bookingList;
   private List<Show> showList;

    public Cinema() {
        this.showList = new ArrayList<>();
        this.bookingList = new ArrayList<>();
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

    public static List<Movie> initMovies(){
        List<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie(1, "SpiderMan", Genre.ACTION, 120));
        movieList.add(new Movie(2, "BATMAN", Genre.ACTION, 220));
        movieList.add(new Movie(3, "AVENGERS", Genre.ACTION, 320));
        movieList.add(new Movie(4, "NUN", Genre.HORROR, 180));

        return movieList;
    }

    public List<Show> initShows(){
        List<Movie> movieList = initMovies();

        List<Show> shows = new ArrayList<>();
        LocalDateTime dateTime = LocalDateTime.of(2026, 8,23, 18, 20);
        shows.add(new Show(getMovieById(1), dateTime, 1400.0, 30, 10));
        shows.add(new Show(getMovieById(2), dateTime.plusMonths(1), 1200.0, 20, 6));
        shows.add(new Show(getMovieById(3), dateTime.plusDays(4), 1400.0, 20, 10));
        shows.add(new Show(getMovieById(4), dateTime.plusDays(5), 1100.0, 25, 15));

        return shows;
    }

    private Movie getMovieById(Integer id){
        List<Movie> movieList = initMovies();
        for (Movie m : movieList){
            if (m.getId().equals(id)){
                return m;
            }
        }
        return null;
    }

    public Show getShowbyMovieName(String movieName){
        for(Show show : this.showList){
            if(movieName.equalsIgnoreCase(show.getMovie().getName())){
                return show;
            }
        }
        return null;
    }


    public void viewAllShows(){
        for(Show show : this.showList){
            System.out.println(show);
        }
    }

    public Customer createCustomer(Scanner scanner){
        System.out.println("Please enter ID ");
        Integer id = scanner.nextInt();

        System.out.println("Please enter name ");
        String name = scanner.next();

        System.out.println("Please enter your phone number");
        String phone = scanner.next();

        return null;
    }

    public void makeBooking(Customer customer, String movieName){
        Show show = getShowbyMovieName(movieName);
        if (show != null){
            bookingList.add(new Booking(show,customer));
            System.out.println("Booking successful");
        }else {
            System.out.println("Show NOT Found");
        }
    }

    public void viewAllBookings(){
        for(Booking booking : this.bookingList){
            System.out.println(booking);
        }
    }

    public void viewBookingByCustomerPhone(String phone) {
        boolean found = false;
        for (Booking booking : this.bookingList) {
            if (phone.equalsIgnoreCase(booking.getCustomer().getPhoneNum())) {
                System.out.println(booking);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Booking not found");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(bookingList, cinema.bookingList) && Objects.equals(showList, cinema.showList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingList, showList);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "showList=" + showList +
                ", bookingList=" + bookingList +
                '}';
    }
}
