package com.example.mvplistview.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mvplistview.Model.Developer;
import com.example.mvplistview.Presenter.PresenterToModel;
import com.example.mvplistview.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewMain {

    ListView listView;

    PresenterToModel presenterToModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lv);
        presenterToModel = new PresenterToModel(this);
        presenterToModel.loadData();


    }

    @Override
    public void LoadListView(final List<String> developers) {
        listView.setAdapter(new  ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,developers));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, developers.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
