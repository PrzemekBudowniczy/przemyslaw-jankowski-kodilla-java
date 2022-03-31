package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challanges.MovieStar;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class main {

    public static void main(String[] args) {

        MovieStar movieStar = new MovieStar();
        String movieList = movieStar.getMovies().entrySet().stream()
                .map(e -> e.getKey() + e.getValue().toString())
                .collect(Collectors.joining("!"));

        try {
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new InternalError("Machine does not support mandatory encoding UTF-8");
        }

        System.out.println(movieList);
    }
}