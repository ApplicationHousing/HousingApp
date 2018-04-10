package android.dkh.com.housingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        init();

        Bundle bundle = getIntent().getExtras();
        if ((bundle != null)) {
            imageView.setImageResource( bundle.getInt("Image"));
        }
    }
    public void init(){
        imageView = findViewById(R.id.imageDetail);
        textView = findViewById(R.id.tvDetail);
    }
}
