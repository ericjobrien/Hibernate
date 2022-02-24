package com.revature;

import com.revature.model.Director;
import com.revature.model.Movie;
import com.revature.repository.DirectorRepository;
import com.revature.repository.MovieRepository;
import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.loader.custom.sql.SQLQueryParser;
import com.revature.util.*;

import java.io.IOException;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException {

        DirectorRepository dr = new DirectorRepository();
        MovieRepository mr = new MovieRepository();

        Director d1 = new Director();
        d1.setId(1);
        d1.setName("Tarkovsky");
        Director d2 = new Director();
        d2.setId(2);
        d2.setName("Cronenberg");
        dr.addDirector(d1);
        dr.addDirector(d2);

        List<Director> directors = dr.getAllDirectors();
        for(Director d : directors) {
            System.out.println(d);
        }

        Movie m = new Movie();
        m.setMovie_id(1);
        m.setTitle("Solaris");
        m.setDirector(d1);

        mr.addMovie(m);
    }
}
