package com.azhar.azhar_siddiq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemSelected;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;
import android.widget.Spinner;
import android.widget.Toast;

import com.azhar.azhar_siddiq.Adapter.KutipanAdapter;
import com.azhar.azhar_siddiq.Model.ResponseKutipan;
import com.azhar.azhar_siddiq.Rest.CombineApi;
import com.azhar.azhar_siddiq.Rest.KutipanInterface;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    KutipanAdapter kutipanAdapter;
    KutipanInterface kutipanInterface;
    @BindView(R.id.rvKutipan)
    RecyclerView rvKutipan;
    RecyclerView.LayoutManager layoutManager;
    List<ResponseKutipan> kutipans;
    @BindView(R.id.spLanguage)
    Spinner spLanguage;
    String language;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        kutipanInterface = CombineApi.getApiService();
        layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        rvKutipan.setLayoutManager(layoutManager);
        loadKutipan();
    }
    @OnItemSelected(R.id.spLanguage)
    void onItemSelected(int position){
        if (position == 0){
            language = "english";
        }
        else{
            language = "bosnia";
        }
        loadKutipan();
    }

    private void loadKutipan() {
        Call<List<ResponseKutipan>> responseKutipanCall = kutipanInterface.getListServices();
        responseKutipanCall.enqueue(new Callback<List<ResponseKutipan>>() {
            @Override
            public void onResponse(Call<List<ResponseKutipan>> call, Response<List<ResponseKutipan>> response) {
                kutipans = response.body();
                kutipanAdapter = new KutipanAdapter(MainActivity.this, kutipans,language);
                rvKutipan.setAdapter(kutipanAdapter);
                kutipanAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<ResponseKutipan>> call, Throwable t) {

            }
        });
    }
}