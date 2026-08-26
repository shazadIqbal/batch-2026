package com.movie_assignment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private  List<Booking> bookingList;
    private  List<Show> showList;

    public Cinema() {
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

    private List<Movie> initMovies() {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(1,"SpiderMan",Genre.ACTION,120));
        movieList.add(new Movie(2,"BATMAN",Genre.ACTION,120));
        movieList.add(new Movie(3,"AVENGERS",Genre.FICTION,120));
        movieList.add(new Movie(4,"NUN",Genre.HORROR,120));

        return movieList;

    }

    public List<Show> initShows(){

        List<Show> shows = new ArrayList<>();
        LocalDateTime dateTime = LocalDateTime
                    .of(2026,8,26,18,0);

        shows.add(new Show(getMovieById(1), dateTime,1200.0,20));
        shows.add(new Show(getMovieById(2), dateTime.plusMonths(1),1200.0,20));
        shows.add(new Show(getMovieById(3), dateTime.plusDays(4),1200.0,20));
        shows.add(new Show(getMovieById(4), dateTime.plusDays(5),1200.0,20));

        return shows;
    }

    private Movie getMovieById(Integer id){
        List<Movie> movieList = initMovies();
        for (Movie m : movieList){
            if(m.getId().equals(id)){
             return m;
            }
        }

        return null;
    }
}
