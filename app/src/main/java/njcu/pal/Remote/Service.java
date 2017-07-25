package njcu.pal.Remote;

import njcu.pal.LogInActivity;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yeury on 7/24/2017.
 */

public interface Service {
    String BASE_URL = "http://104.236.253.140/";



    @GET("api/pal/login/{email}/{password}")
    Call<Email> login(@Path("email")String email, @Path("password")String password);


    @FormUrlEncoded
    @POST("api/pal/signup")
    Call <Email> signup(@Field("name") String name, @Field("email") String email, @Field("password") String password, @Field("school_code") String school_code, @Field("role") String role );

    class Factory {
        public static Service service;

        public static Service getInstance() {
            if (service == null) {
                OkHttpClient client = new OkHttpClient.Builder()
                        .connectTimeout(100, TimeUnit.SECONDS)
                        .readTimeout(100, TimeUnit.SECONDS).build();

                Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(BASE_URL).client(client).build();
                service = retrofit.create(Service.class);
                return service;
            } else {
                return service;
            }
        }
    }
}
