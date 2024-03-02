package com.RajSoft.Service;

import com.RajSoft.beans.Movie;

public class MovieServiceImpl implements MovieService{


    @Override
    public void playMovie(Movie movie) {
        System.out.println("Movie Details");
        System.out.println("-------------------");
        System.out.println("Movie Name    : "+movie.getMovieName());
        System.out.println("Show Time     : "+movie.getShowTime());
        System.out.println("Price         : "+movie.getPrice());
        throw new RuntimeException("Power Failure Occurred");


    }
}
