package jameel.com.listviewsimple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toolbar toolbar;
        final ListView listView;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.toolBar);
        listView = (ListView)findViewById(R.id.List);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Menu));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
@Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
{
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("Category Name", listView.getItemAtPosition(i).toString());
            startActivity(intent);
}
        });
        listView.setAdapter(adapter);

        /*String[] FastFood ={"Maemas Special Pizza","Maemas Special Panini","Maemas Special Chicken","Maemas Special Burger","Maemas Special Salad",
                "Maemas Special Fried Rice","Mamaes Special Bryani","Maemas Special Veg","Maemas Special Drink", "Mamaes Hot Deals","Mamaes Layality Cards"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, FastFood);
                listView.setAdapter(adapter);
                */
    }
}
