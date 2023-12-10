package org.example.week10.movies;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private String databasePath;

    Database(String databasePath) {
        //constructor

        this.databasePath = databasePath;

        // create table, or make sure it's it created

        try (Connection connection = DriverManager.getConnection(databasePath);
        //Statement is something that can execute sql statements
        Statement statement = connection.createStatement();) {

            statement.execute("CREATE TABLE IF NOT EXISTS " +
                    "movies (id INTEGER PRIMARY KEY, " +
                    "name text unique check (length(name) >= 1), " +
                    "stars INTEGER check(stars >= 0 and stars <= 5), " +
                    "watched BOOLEAN)");

        } catch (SQLException e) {
            System.out.println("Error creating movie DB table because "  + e);
        }

    }

    public void addNewMovie(Movie movie) {

        String insertSQL = "INSERT INTO movies (name, stars, watched) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(databasePath);
             // replaced this with the prepared statement below :Statement statement = connection.createStatement()) {

            // need to insert into movie values but need to know the values to insert
            // use a prepared statement!
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {


            //insert movie values into ? placeohlders
            preparedStatement.setString(1, movie.getName()); //set the first ? to movie name
            preparedStatement.setInt(2, movie.getStars());
            preparedStatement.setBoolean(3, movie.isWatched());

            preparedStatement.execute(); // actually run the above

        } catch (SQLException e) {
            System.out.println("Error adding movie " + movie + " because " + e);
        }
    }

    public List<Movie> getAllMovies() {

        try (Connection connection = DriverManager.getConnection(databasePath);
        Statement statement = connection.createStatement()) {

            //get all movies
            ResultSet movieResult = statement.executeQuery("SELECT * FROM movies ORDER BY name");

            List<Movie> movies = new ArrayList<>();

            //next returns true while there is more data to read
            while (movieResult.next()) {
                int id = movieResult.getInt("id");
                String name = movieResult.getString("name");
                int stars = movieResult.getInt("stars");
                boolean watched = movieResult.getBoolean("watched");

                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }
            return movies;

        } catch (SQLException e) {
            System.out.println("Error fetching all movies because " + e);
            return null;
        }
    }

    public List<Movie> getAllMoviesByWatched(boolean watchedStatus) {

        try (Connection connection = DriverManager.getConnection(databasePath);
        //using a prepared statement because we have a SQL statement being set from a variable
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM movies WHERE watched = ?")) {

            preparedStatement.setBoolean(1, watchedStatus);
            ResultSet movieResults = preparedStatement.executeQuery();

            List<Movie> movies = new ArrayList<>();

            while (movieResults.next()) {
                int id = movieResults.getInt("id");
                String name = movieResults.getString("name");
                int stars = movieResults.getInt("stars");
                boolean watched = movieResults.getBoolean("watched");
                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }

            return movies;

        } catch (SQLException e) {
            System.out.println("Error getting all movies because " + e);
            return null;
        }
    }

    public void updateMovie(Movie movie) {

        String sql = "UPDATE movies SET stars = ?, watched = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(databasePath);
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, movie.getStars());
            preparedStatement.setBoolean(2, movie.isWatched());
            preparedStatement.setInt(3, movie.getID());

            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println("Error updating movie " + movie + " because " + e);
        }

    }

    public void deleteMovie(Movie movie) {
        try (Connection connection = DriverManager.getConnection(databasePath);
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM movies WHERE id = ?")) {

            preparedStatement.setInt(1, movie.getID());
            preparedStatement.execute();

        } catch (SQLException e ) {
            System.out.println("Error deleting movie " + movie + " because " + e);
        }
    }

    public List<Movie> search(String searchTerm) {

        String sql = "SELECT * FROM movies WHERE UPPER(name) LIKE UPPER(?)";

        try (Connection connection = DriverManager.getConnection(databasePath);
        PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, "%" + searchTerm + "%");
            ResultSet moviesResults = preparedStatement.executeQuery();

            List<Movie> movies = new ArrayList<>();

            while (moviesResults.next()) {
                int id = moviesResults.getInt("id");
                String name = moviesResults.getString("name");
                int stars = moviesResults.getInt("stars");
                boolean watched = moviesResults.getBoolean("watched");

                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }

            return movies;

        } catch (SQLException e) {
            System.out.println("Error searching for " + searchTerm + " because " + e);
            return null;
        }

    }

}
