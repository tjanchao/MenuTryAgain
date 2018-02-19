package be.ehb.menutryagain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView tvJoke,tvPunchline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvJoke = findViewById(R.id.tv_detail_joke);
        tvPunchline = findViewById(R.id.tv_detail_punchline);

        Joke passedJoke = (Joke) getIntent().getSerializableExtra("joke");

        tvJoke.setText(passedJoke.getJoke());
        tvPunchline.setText(passedJoke.getPunchline());


    }
}
