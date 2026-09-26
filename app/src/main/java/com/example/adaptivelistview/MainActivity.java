package com.example.adaptivelistview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListView listView = findViewById(R.id.listView);
        
        List<ItemModel> items = new ArrayList<>();
        items.add(new ItemModel("Android Pie", "Android 9.0", R.mipmap.ic_launcher));
        items.add(new ItemModel("Android Q", "Android 10.0", R.mipmap.ic_launcher));
        items.add(new ItemModel("Android Red Velvet Cake", "Android 11.0", R.mipmap.ic_launcher));
        items.add(new ItemModel("Android Snow Cone", "Android 12.0", R.mipmap.ic_launcher));
        items.add(new ItemModel("Android Tiramisu", "Android 13.0", R.mipmap.ic_launcher));
        items.add(new ItemModel("Android Upside Down Cake", "Android 14.0", R.mipmap.ic_launcher));
        items.add(new ItemModel("Android Vanilla Ice Cream", "Android 15.0", R.mipmap.ic_launcher));

        CustomAdapter adapter = new CustomAdapter(this, items);
        listView.setAdapter(adapter);
    }
}