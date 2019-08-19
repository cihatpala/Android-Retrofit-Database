package com.example.pala.androiddbtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RestInterface restInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restInterface = ApiClient.getClient().create(RestInterface.class);
        Call<List<Repo>> call = restInterface.getRepo();


        call.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                List<Repo> repoList = new ArrayList<>();
                repoList = response.body();

                for (int i=0;i<repoList.size();i++){
                    System.out.println(""+repoList.get(i).rocket.rocketId+"\n");
                }

            }
            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
            }
        });
    }
}
