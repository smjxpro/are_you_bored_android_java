package com.example.areyoubored;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView boringText;
    Button nextBtn;
    BoringClient boringClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        boringText = findViewById(R.id.boringText);
        nextBtn = findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(view -> getBoringText());
    }


    private void getBoringText() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://www.boredapi.com/api/").addConverterFactory(GsonConverterFactory.create()).build();
        boringClient = retrofit.create(BoringClient.class);

        Call<BoringResponse> boringResponseCall = boringClient.getBoring("activity");
        boringResponseCall.enqueue(new Callback<BoringResponse>() {
            @Override
            public void onResponse(Call<BoringResponse> call, Response<BoringResponse> response) {
                boringText.setText(response.body().getActivity());

                nextBtn.setText("Another idea?");
            }

            @Override
            public void onFailure(Call<BoringResponse> call, Throwable t) {

            }

        });
    }
}