package android.dkh.com.housingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    public static ArrayList<Product> products = new ArrayList<>();
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
                intent.putExtra("id", i);
                startActivity(intent);
            }
        });
    }

    //hàm add tự động
    public void add(){
        products.add(new Product("Modern 3 bedroom apartment with panoramic river view in Binh Thanh District",
                "Binh Thanh District", 1000, PropertyType.APARTMENT.toString(),
                2, 3, 50,
                R.drawable.ic_1,new android.dkh.com.housingapp.Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 800, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_3,new android.dkh.com.housingapp.Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 560, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_4,new android.dkh.com.housingapp.Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 560, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_5,new android.dkh.com.housingapp.Location(10.2167, 132.6768)));products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 500, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_6,new android.dkh.com.housingapp.Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 700, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_3,new android.dkh.com.housingapp.Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 300, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_1,new android.dkh.com.housingapp.Location(10.2167, 132.6768)));

        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 400, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_4,new android.dkh.com.housingapp.Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 600, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_5,new android.dkh.com.housingapp.Location(10.2167, 132.6768)));products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 3000, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_6,new android.dkh.com.housingapp.Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 460, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_3,new android.dkh.com.housingapp.Location(10.2167, 132.6768)));
        products.add(new Product("Modern Apartment with beatiful view",
                "Binh Thanh District", 890, PropertyType.APARTMENT.toString(),
                3, 3, 75,
                R.drawable.ic_4,new android.dkh.com.housingapp.Location(10.2167, 132.6768)));

    }
}
