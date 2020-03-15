package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    Retrofit retrofit;
    ScryfallAPI scryfallAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.scryfall.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        scryfallAPI = retrofit.create(ScryfallAPI.class);

        textView = findViewById(R.id.output);
        imageView = findViewById(R.id.cardImage);

        random(retrofit, scryfallAPI, textView,imageView);

        Button submit = (Button) findViewById(R.id.submitBtn);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                random(retrofit, scryfallAPI, textView, imageView);
            }
        });
    }

    public void random(Retrofit retrofit, ScryfallAPI scryfallAPI, TextView textView, ImageView imageView) {
        Call<Card> call = scryfallAPI.getRandomCard();
        call.enqueue(new Callback<Card>() {
            @Override
            public void onResponse(Call<Card> call, Response<Card> response) {
                if (!response.isSuccessful()) {
                    String txt = "Code: " + response.code();
                    textView.setText(txt);
                } else {
                    Card card = response.body();
                    String content = card.getName();
                    textView.setText(content);
                    Picasso.get().load(card.getImageLinks().getPng()).into(imageView);
                }
            }

            @Override
            public void onFailure(Call<Card> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });
    }
}
