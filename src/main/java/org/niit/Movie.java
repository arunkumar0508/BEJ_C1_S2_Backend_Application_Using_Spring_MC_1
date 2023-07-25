package org.niit;

public class Movie {

    String movieName;
    String movieDirector;
    int movieRating;

    public Movie(String movieName, String movieDirector, int movieRating) {
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieDirector='" + movieDirector + '\'' +
                ", movieRating=" + movieRating +
                '}';
    }
}
