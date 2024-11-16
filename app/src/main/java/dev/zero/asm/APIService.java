package dev.zero.asm;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    public String DOMAIN = "http://192.168.1.18:3000/";

    @GET("/api/list")
    Call<List<CarModel>> getCars();

}
