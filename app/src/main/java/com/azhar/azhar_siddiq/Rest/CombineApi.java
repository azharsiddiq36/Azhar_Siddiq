package com.azhar.azhar_siddiq.Rest;

public class CombineApi {

    public static String BASE_URL = "https://programming-quotes-api.herokuapp.com/";
    public static KutipanInterface getApiService(){
        return ApiClient.getApiClient(BASE_URL).create(KutipanInterface.class);
    }
}