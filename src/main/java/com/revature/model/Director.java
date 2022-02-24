package com.revature.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "director")
public class Director {

    @Id
    @Column(name = "director_id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "director")
    private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", name='" + name + '\'';
    }
}
