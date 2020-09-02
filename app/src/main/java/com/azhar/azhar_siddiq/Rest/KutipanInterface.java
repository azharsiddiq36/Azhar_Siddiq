package com.azhar.azhar_siddiq.Rest;




import com.azhar.azhar_siddiq.Model.ResponseKutipan;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface KutipanInterface {
    @GET("quotes")
    Call<List<ResponseKutipan>> getListServices();
    @GET("quotes/lang/{language}")
    Call<ResponseKutipan> getByLanguage(@Path("language") String language);
}
