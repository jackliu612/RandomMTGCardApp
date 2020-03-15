package com.example.helloworld;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ScryfallAPI {

    @GET("cards/random/")
    Call<Card> getRandomCard();
}
