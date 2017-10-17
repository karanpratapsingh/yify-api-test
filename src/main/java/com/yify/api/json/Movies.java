package com.yify.api.json;

public class Movies {
    private String small_cover_image;

    private String[] genres;

    private String medium_cover_image;

    private String state;

    private String runtime;

    private String mpa_rating;

    private String url;

    private String date_uploaded;

    private Torrents[] torrents;

    private String background_image;

    private String id;

    private String title;

    private String date_uploaded_unix;

    private String title_long;

    private String slug;

    private String year;

    private String imdb_code;

    private String rating;

    private String language;

    public String getSmall_cover_image() {
        return small_cover_image;
    }

    public void setSmall_cover_image(String small_cover_image) {
        this.small_cover_image = small_cover_image;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public String getMedium_cover_image() {
        return medium_cover_image;
    }

    public void setMedium_cover_image(String medium_cover_image) {
        this.medium_cover_image = medium_cover_image;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getMpa_rating() {
        return mpa_rating;
    }

    public void setMpa_rating(String mpa_rating) {
        this.mpa_rating = mpa_rating;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate_uploaded() {
        return date_uploaded;
    }

    public void setDate_uploaded(String date_uploaded) {
        this.date_uploaded = date_uploaded;
    }

    public Torrents[] getTorrents() {
        return torrents;
    }

    public void setTorrents(Torrents[] torrents) {
        this.torrents = torrents;
    }

    public String getBackground_image() {
        return background_image;
    }

    public void setBackground_image(String background_image) {
        this.background_image = background_image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate_uploaded_unix() {
        return date_uploaded_unix;
    }

    public void setDate_uploaded_unix(String date_uploaded_unix) {
        this.date_uploaded_unix = date_uploaded_unix;
    }

    public String getTitle_long() {
        return title_long;
    }

    public void setTitle_long(String title_long) {
        this.title_long = title_long;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImdb_code() {
        return imdb_code;
    }

    public void setImdb_code(String imdb_code) {
        this.imdb_code = imdb_code;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return
                //"Api return status : " + state+
                (char)27+"[34m"+"\n[>] Movie title : "+(char)27+"[0m" + title +" ::Url:: " + url
                        + "\n\t\t\t\t-> year = " + year
                        + "\n\t\t\t\t-> rating = " + rating
                        + "\n\t\t\t\t-> mpa_rating = " + mpa_rating
                        + "\n\t\t\t\t-> runtime = " + runtime + " minutes"
                        + "\n\t\t\t\t-> date_uploaded = " + date_uploaded
                        //+ "\n\t\t\t\t-> background_image = " + background_image
                        //+ "\n\t\t\t\t-> id = " + id
                        //+ "\n\t\t\t\t-> date_uploaded_unix = " + date_uploaded_unix
                        //+ "\n\t\t\t\t-> title_long = " + title_long
                        //+ "\n\t\t\t\t-> slug = " + slug
                        + "\n\t\t\t\t-> imdb_code = " + imdb_code
                        + "\n\t\t\t\t-> language = " + language + "\n";
    }
}
