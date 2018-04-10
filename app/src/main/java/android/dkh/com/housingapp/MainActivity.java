package android.dkh.com.housingapp;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Product> products = new ArrayList<>();
    MyApdater myApdater;
    //Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        add();
    }

    public void init(){
        //toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = (ListView) findViewById(R.id.lisview);
        myApdater = new MyApdater(MainActivity.this, R.layout.listview_item, products);
        listView.setAdapter(myApdater);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Products", products);
                startActivity(intent);
            }
        });
    }

    //hàm add tự động
    public void add(){
        products.add(new Product("Modern 3 bedroom apartment with panoramic river view in Binh Thanh District",
                "Binh Thanh District", 1000, PropertyType.APARTMENT.toString(), 2, 3, 50, R.drawable.ic_1,new android.dkh.com.housingapp.Location(10.2167, 132.6768)));


    }
}
