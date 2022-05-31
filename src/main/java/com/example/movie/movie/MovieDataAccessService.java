package com.example.movie.movie;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MovieDataAccessService implements MovieDao {

    @Override
    public List<Movie> selectMovies() {
        throw new UnsupportedOperationException("not implement");
    }

    @Override
    public int insertMovie(Movie movie) {
        throw new UnsupportedOperationException("not implement");
    }

    @Override
    public int deleteMovie(int id) {
        throw new UnsupportedOperationException("not implement");
    }

    @Override
    public Optional<Movie> selectMovieById(int id) {
        throw new UnsupportedOperationException("not implement");
    }
}
