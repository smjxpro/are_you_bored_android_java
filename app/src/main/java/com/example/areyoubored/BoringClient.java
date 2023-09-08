package com.example.areyoubored;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface BoringClient {
    @GET()
    Call<BoringResponse> getBoring(@Url String urlString);
}
