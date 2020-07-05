package de.pacheco.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView ingredientsIv = findViewById(R.id.image_iv);
        String path = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Sandwich_de_Medianoche.jpg/800px-Sandwich_de_Medianoche.jpg";
        Picasso.get()
                .load(path)
                .into(ingredientsIv);
    }
}