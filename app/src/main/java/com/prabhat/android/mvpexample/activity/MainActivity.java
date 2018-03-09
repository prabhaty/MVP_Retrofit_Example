package com.prabhat.android.mvpexample.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.prabhat.android.mvpexample.R;
import com.prabhat.android.mvpexample.adapter.CityAdapter;
import com.prabhat.android.mvpexample.bean.City;
import com.prabhat.android.mvpexample.presenters.PreseneterImpl;
import com.prabhat.android.mvpexample.model.LoginModel;
import com.prabhat.android.mvpexample.view.LoginView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements LoginView {

    LoginModel loginModel;
    ListView listView;
    private CityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        loginModel = new PreseneterImpl(MainActivity.this);
        loginModel.showCityList();

    }


    @Override
    public void showList(ArrayList<City> list) {

        adapter = new CityAdapter(MainActivity.this, list);
        listView.setAdapter(adapter);

    }

    @Override
    public void listSuccess() {
        Toast.makeText(this, "City List", Toast.LENGTH_SHORT).show();

    }


}
