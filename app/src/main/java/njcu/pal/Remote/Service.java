package njcu.pal.Remote;

import njcu.pal.LogInActivity;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

/**
 * Created by Yeury on 7/24/2017.
 */

public interface Service {
    String BASE_URL = "http://104.236.253.140/";



    @GET("api/pal/login/{email}/{password}")
    Call<Email> login(@Path("email")String email, @Path("password")String password);


    class Factory {
        public static Service service;

        public static Service getInstance() {
            if (service == null) {
                Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(BASE_URL).build();
                service = retrofit.create(Service.class);
                return service;
            } else {
                return service;
            }
        }
    }
}
