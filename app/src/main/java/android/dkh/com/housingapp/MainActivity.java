package android.dkh.com.housingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    //Toolbar toolbar;

    String[] image_name = {"Biệt thự Phú Mỹ Hưng","Căn hộ cao cấp River",
                    "Căn hộ cao cấp Thạnh Mỹ Lợi",
                    "Nhà nguyên căn chung cư Thanh Đa",
                    "Nhà nguyên căn chung cư Ngô Tất Tố"};
    int [] image = {R.drawable.ic_1,
                        R.drawable.ic_2,
                        R.drawable.ic_3,
                        R.drawable.ic_5,
                        R.drawable.ic_6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        //toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = (ListView) findViewById(R.id.lisview);
        MyApdater myApdater = new MyApdater(MainActivity.this, image_name, image);
        listView.setAdapter(myApdater);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Image", image[i]);
                intent.putExtra("ImageName", image_name[i]);
                startActivity(intent);
            }
        });
    }
}
