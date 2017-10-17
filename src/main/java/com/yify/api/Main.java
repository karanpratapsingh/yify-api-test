package com.yify.api;

import com.google.gson.Gson;
import com.yify.api.json.*;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    private static OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) throws NullPointerException, IOException {

        Scanner scanner = new Scanner(System.in);

        printExample();

        System.out.print((char) 27 + "[34m" + "[>] Enter the search query : " + (char) 27 + "[0m");
        String req = scanner.nextLine();

        if (req.toLowerCase().equals("minimum_rating")) {

            System.out.print((char) 27 + "[34m" + "[>] Enter the minimum rating : " + (char) 27 + "[0m");
            String term = scanner.nextLine();

            reqestApiData(req, term);
        } else if (req.toLowerCase().equals("query_term")) {

            System.out.print((char) 27 + "[34m" + "[>] Enter the name of the movie : " + (char) 27 + "[0m");
            String term = scanner.nextLine();
            reqestApiData(req, term);

        } else if (req.toLowerCase().equals("genre")) {

            System.out.print((char) 27 + "[34m" + "[>] Enter the genre : " + (char) 27 + "[0m");
            String term = scanner.nextLine();
            reqestApiData(req, term);

        } else {

            String term = "";
            System.out.println("Fetching your result :");
            reqestApiData(req, term);
        }

    }

    public static void reqestApiData(String req, String term) {

        if (term == null) {

            String request_api = req;
            printApiData(request_api);
        } else {

            String request_api = req + "=" + term;
            printApiData(request_api);
        }


    }

    public static void printApiData(String request_api) {

        for (Movies movies : getData(request_api)) {

            System.out.println(movies.toString());
        }
    }

    public static String getJSON(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static Movies[] getData(String request) {


        String json = null;

        try {

            json = getJSON("https://yts.pe/api/v2/list_movies.json?" + request + "&sort_by=year");
        } catch (Exception e) {

            e.printStackTrace();
        }

        Gson gson = new Gson();
        YifyApi yifyApi = gson.fromJson(json, YifyApi.class);

        return yifyApi.getData().getMovies();
    }

    private static void printExample() {

        System.out.println((char) 27 + "[35m" + "[?] Example :  -->> query_term \n" +
                "               -->> \"Movie name\" " + (char) 27 + "[0m" +
                (char) 27 + "[32m" + "\nRead the official API Documentation at :" + (char) 27 + "[0m" + (char) 27 +
                "[31m" + " https://yts.ag/api" + (char) 27 + "[0m");
    }
}
