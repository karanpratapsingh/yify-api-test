package com.yify.api.json;

public class Data {
    private String limit;

    private Movies[] movies;

    private String page_number;

    private String movie_count;

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public Movies[] getMovies() {
        return movies;
    }

    public void setMovies(Movies[] movies) {
        this.movies = movies;
    }

    public String getPage_number() {
        return page_number;
    }

    public void setPage_number(String page_number) {
        this.page_number = page_number;
    }

    public String getMovie_count() {
        return movie_count;
    }

    public void setMovie_count(String movie_count) {
        this.movie_count = movie_count;
    }

    @Override
    public String toString() {
        return "ClassPojo [limit = " + limit + ", movies = " + movies + ", page_number = " + page_number + ", movie_count = " + movie_count + "]";
    }
}
