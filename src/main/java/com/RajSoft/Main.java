package com.RajSoft;

import com.RajSoft.Service.MovieService;
import com.RajSoft.beans.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Config.xml");
            Movie movie = (Movie) applicationContext.getBean("movie");
            MovieService movieService = (MovieService) applicationContext.getBean("proxy");
            movieService.playMovie(movie);
        }catch (Exception exception){


        }

    }
}