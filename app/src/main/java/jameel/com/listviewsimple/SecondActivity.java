package jameel.com.listviewsimple;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        toolbar = (Toolbar)findViewById(R.id.toolBar1);
        imageView = (ImageView)findViewById(R.id.imageView);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            toolbar.setTitle(bundle.getString("Category Name"));
        }
        if (toolbar.getTitle().toString().equalsIgnoreCase("Maemas Special Pizza"))
        {
            imageView.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.mamaes_pizza));
        }
            else if (toolbar.getTitle().toString().equalsIgnoreCase("Maemas Special Panini"))
        {
              imageView.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                      R.drawable.mamaes_panini));
        }
        else if (toolbar.getTitle().toString().equalsIgnoreCase("Maemas Special Chicken"))
        {
            imageView.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.mamaes_chicken));
        }
        else if (toolbar.getTitle().toString().equalsIgnoreCase("Maemas Special Burger"))
        {
            imageView.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.mamaes_burger));
        }
        else if (toolbar.getTitle().toString().equalsIgnoreCase("Maemas Special Salad"))
        {
           imageView.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                   R.drawable.mamaes_salad));
        }
        else if (toolbar.getTitle().toString().equalsIgnoreCase("Maemas Special Fried Rice"))
        {
            imageView.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.mamaes_rice));
        }
        else if (toolbar.getTitle().toString().equalsIgnoreCase("Mamaes Special Bryani"))
        {
            imageView.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.mamaes_baryani));
        }
        else if (toolbar.getTitle().toString().equalsIgnoreCase("Maemas Special Veg"))
        {
            imageView.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.mamaes_veg));
        }
        else if (toolbar.getTitle().toString().equalsIgnoreCase("Maemas Special Drink"))
        {
            imageView.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                    R.drawable.mamaes_drink));
        }
        }
    }
