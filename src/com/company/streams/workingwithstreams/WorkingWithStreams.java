package com.company.streams.workingwithstreams;

import com.company.domain.Movie;
import com.company.util.MovieUtil;

import java.util.List;

//Working with Streams
public class WorkingWithStreams {

	List<Movie> movies = MovieUtil.createMovies();

	private void findMoviesByDirector(String director) {
		/*movies.stream()
		.filter(m-> m.getDirector().equals("Steven Spielberg")? true:false)
		.map(Movie::getName)
		.distinct()
		.limit(3)
		.forEach(System.out::println);*/

		movies.stream()
		.filter(movie -> movie.getDirector().equals(director))
				.map(Movie::getName)
				.distinct()
		.forEach(movie -> System.out.println(movie));

	}

	public static void main(String[] args) {
		new WorkingWithStreams().findMoviesByDirector("Steven Spielberg");
	}

}
