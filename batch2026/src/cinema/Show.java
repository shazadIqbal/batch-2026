package cinema;

import java.time.LocalDateTime;
import java.util.Objects;

public class Show {
    private Movie movie;
    private LocalDateTime start;
    private Double price;
    private Integer totalSeat;
    private Integer availableSeat;

    public Show() {
    }

    public Show(Movie movie, LocalDateTime start, Double price, Integer totalSeat, Integer availableSeat) {
        this.movie = movie;
        this.start = start;
        this.price = price;
        this.totalSeat = totalSeat;
        this.availableSeat = totalSeat;
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

    public Integer getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(Integer totalSeat) {
        this.totalSeat = totalSeat;
    }

    public Integer getAvailableSeat() {
        return availableSeat;
    }

    public void setAvailableSeat(Integer availableSeat) {
        this.availableSeat = availableSeat;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return Objects.equals(movie, show.movie) && Objects.equals(start, show.start) && Objects.equals(price, show.price) && Objects.equals(totalSeat, show.totalSeat) && Objects.equals(availableSeat, show.availableSeat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, start, price, totalSeat, availableSeat);
    }

    @Override
    public String toString() {
        return "Show{" +
                "movie='" + movie + '\'' +
                ", start=" + start +
                ", price=" + price +
                ", totalSeat=" + totalSeat +
                ", availableSeat=" + availableSeat +
                '}';
    }
}
