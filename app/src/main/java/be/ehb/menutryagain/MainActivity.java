package be.ehb.menutryagain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lvJokes;

    private ArrayAdapter<Joke>jokeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvJokes = findViewById(R.id.lv_jokes);

        jokeAdapter = new ArrayAdapter<Joke>(getApplicationContext(),android.R.layout.simple_list_item_1);
        jokeAdapter.addAll(JokeDataSource.getINSTANCE().getJokeList());

        lvJokes.setAdapter(jokeAdapter);
        lvJokes.setOnItemClickListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.mi_main_add){
            Intent intent = new Intent(getApplicationContext(),AddActivity.class);
            startActivity(intent);

        }
        return super.onOptionsItemSelected(item);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Joke selectedJoke = jokeAdapter.getItem(i);

        Intent mIntent = new Intent(getApplicationContext(),DetailActivity.class);
        mIntent.putExtra("joke",selectedJoke);
        startActivity(mIntent);

    }
}
