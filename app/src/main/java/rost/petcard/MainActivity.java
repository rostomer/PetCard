package rost.petcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView dogsImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dogsImage = (ImageView) findViewById(R.id.dogsImageView);
        dogsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            showCard();
            }
        });
    }
    public void showCard()
    {
        Intent intent = new Intent(this, PetsCard.class);
        startActivity(intent);
    }
}
