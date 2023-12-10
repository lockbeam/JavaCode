package org.example.week10.movies;

import java.util.List;

import static input.InputUtils.*;

public class MovieList {

    private static final String DB_PATH = "jdbc:sqlite:movie_watchlist.sqlite";
    private  static Database database;
    public static void main(String[] args) {
        database = new Database(DB_PATH);
        //displayAllMovies();
        addNewMovies();
        checkIfWatchedAndRate();
        deleteWatchedMovies();
        searchMovie();
        displayAllMovies();
    }

    public static int getRatingOutOfFive() {
        int rating = positiveIntInput("What is your rating, in stars out of five?");
        while (rating < 0 || rating > 5) {
            System.out.println("Error, enter a number between 0 and 5");
            rating = positiveIntInput("What is your rating, in stars out of five?");
        }
        return rating;
    }

    public static String getNonEmptyMovieName() {
        String name = stringInput("Enter the movie name");
        while (name.isEmpty()) {
            System.out.println("Error - enter a name");
            name = stringInput("Enter the movie name");
        }
        return name;
    }

    //write a method that can add movies
    public static void addNewMovies() {
        do {
            String movieName = getNonEmptyMovieName();
            boolean movieWatched = yesNoInput("Have you seen this movie yet?");
            int movieStars = 0;
            if (movieWatched) {
                movieStars = getRatingOutOfFive();
            }

            Movie movie = new Movie(movieName, movieStars, movieWatched);
            //add to database
            database.addNewMovie(movie);

        } while (yesNoInput("Add a movie to the watchlist?"));
    }
        public static void displayAllMovies() {
            List<Movie> movies = database.getAllMovies();
            if (movies.isEmpty()) {
                System.out.println("No movies");
            } else {
                for (Movie movie: movies) {
                    System.out.println(movie);
                }
            }
        }

        public static void checkIfWatchedAndRate() {
        List<Movie> unwatchedMovies = database.getAllMoviesByWatched(false);

        for (Movie movie : unwatchedMovies) {
            boolean hasWatched = yesNoInput("Have you watched " + movie.getName() + " yet?");
            if (hasWatched) {
                int stars = positiveIntInput("What is your rating for " + movie.getName() +
                        " out of 5 stars?");
                movie.setWatched(true);
                movie.setStars(stars);
                database.updateMovie(movie);
            }
        }
    }

    public static void deleteWatchedMovies() {
        System.out.println("Here are all the movies you have seen");

        List<Movie> watchedMovies = database.getAllMoviesByWatched(true);

        for (Movie movie : watchedMovies) {
            boolean delete = yesNoInput("Delete " + movie.getName() + "?");
            if (delete) {
                database.deleteMovie(movie);
            }
        }
    }

    public static void searchMovie() {
        String movieName = stringInput("Enter movie name");
        List<Movie> movieMatches = database.search(movieName);

        //searching for exact name

        if (movieMatches.isEmpty()) {
            System.out.println("No match");
        } else {
            for (Movie movie : movieMatches) {
                System.out.println(movie);
            }
        }

    }

}

