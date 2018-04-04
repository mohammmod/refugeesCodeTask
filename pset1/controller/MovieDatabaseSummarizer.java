package pset1.controller;

import pset1.modal.Actor;
import pset1.modal.MovieSummarizer;
import pset1.modal.Summary;
import pset1.parser.ParserActors;
import pset1.parser.ParserMovie;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MovieDatabaseSummarizer {
    public Optional <Summary> summarize(){
        List<MovieSummarizer> reviews = ParserMovie.getMovieInfo();
        List<Actor> actorsInfo = ParserActors.getActorsInfo();

        List<String> topRatedmovie = MovieInfoGuy.getRatings(reviews);
        List<String> topMovieGeners = MovieInfoGuy.getMovieGenres(reviews);
        List<String> mostHirdActors = ActorsInfoGuy.getMostHirdActors(actorsInfo);
        String ratio = ActorsInfoGuy.getRatio(actorsInfo);

        Summary summary = new Summary();

        summary.setTopRatedMovie(topRatedmovie);
        summary.setActorName(mostHirdActors);
        summary.setMovieGenres(topMovieGeners);
        summary.setRatio(ratio);
        return Optional.of(summary);

    }
}



