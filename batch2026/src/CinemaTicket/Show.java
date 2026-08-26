package CinemaTicket;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Show {

    private Movie movie;
    private LocalDateTime start;
    private Double price;
    private Integer totalSeats;
    private Integer availableSeats;


    public Show() {
    }

    public Show(Movie movie, LocalDateTime start, Double price, Integer totalSeats) {
        this.movie = movie;
        this.start = start;
        this.price = price;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }


    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return Objects.equals(movie, show.movie) && Objects.equals(start, show.start) && Objects.equals(price, show.price) && Objects.equals(totalSeats, show.totalSeats) && Objects.equals(availableSeats, show.availableSeats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, start, price, totalSeats, availableSeats);
    }

    @Override
    public String toString() {
        return "Show{" +
                "movie=" + movie +
                ", start=" + start +
                ", price=" + price +
                ", totalSeats=" + totalSeats +
                ", availableSeats=" + availableSeats +
                '}';
    }
}
