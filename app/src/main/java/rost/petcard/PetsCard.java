package rost.petcard;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PetsCard extends AppCompatActivity {
    TextView informationAboutDog1;
    TextView informationAboutDog2;
    TextView informationAboutDog3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets_card);

        informationAboutDog1 = (TextView)findViewById(R.id.textView);
        informationAboutDog2 = (TextView)findViewById(R.id.textView2);
        informationAboutDog3 = (TextView)findViewById(R.id.textView3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        Drawable nextImageDrawable = menu.findItem(R.id.back).getIcon();
        nextImageDrawable.setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);

        menu.findItem(R.id.update_text);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.back:
                onBackPressed();
                break;
            case R.id.update_text:
                informationAboutDog1.setText(R.string.dog_name);
                informationAboutDog2.setText(R.string.dog_age);
                informationAboutDog3.setText(R.string.dog_food);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override public void onBackPressed()
    {
        super.onBackPressed();
    }
}
