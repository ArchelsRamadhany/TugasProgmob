package com.project.recyclerviewdatamovie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MovieRecyclerViewAdapter adapter;
    ArrayList<Movies> objMovies = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        objMovies.add(new Movies("Ecanto", "Animation, Comedy, Family", "Jared Bush, Byron Howard, Charise Castro Smith", 7.3, "A Colombian teenage girl has to face the frustration of being the only member of her family without magical powers.", "24 November 2021"));
        objMovies.add(new Movies("Raya and the Last Dragon", "Animation, Action, Adventure", "Don Hall, Carlos López Estrada, Paul Briggs", 7.3, "In a realm known as Kumandra, a re-imagined Earth inhabited by an ancient civilization, a warrior named Raya is determined to find the last dragon.", "5 March 2021"));
        objMovies.add(new Movies("Stranger Things", "Drama, Fantasy, Horror", "Shawn Levy", 8.7, "When a young boy disappears, his mother, a police chief and his friends must confront terrifying supernatural forces in order to get him back.", "15 July 2016"));
        objMovies.add(new Movies("Eternals", "Action, Adventure, Fantasy", "Chloé Zhao", 6.4, "The saga of the Eternals, a race of immortal beings who lived on Earth and shaped its history and civilizations.", "3 November 2021"));
        objMovies.add(new Movies("Spider-Man: No Way Home", "Action, Adventure, Fantasy", "Jon Watts", 8.6, "With Spider-Man's identity now revealed, Peter asks Doctor Strange for help. When a spell goes wrong, dangerous foes from other worlds start to appear, forcing Peter to discover what it truly means to be Spider-Man.", "15 Desember 2021"));

        adapter = new MovieRecyclerViewAdapter(objMovies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }


}
