package com.example.shenbagampalanisamy.recylerview;


import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.shenbagampalanisamy.recylerview.Movie;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Movie> movies = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new MoviesAdapter(movies);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        populateMovieDetails();
        mAdapter.notifyDataSetChanged();

    }

    private void populateMovieDetails() {
        movies.add(new Movie("The Shawshank Redemption", "Crime, Drama", 1994, 9.2));
        movies.add(new Movie("The Godfather", "Crime, Drama", 1972, 9.2));
        movies.add(new Movie("The Godfather: Part II", "Crime, Drama", 1974, 9.0));
        movies.add(new Movie("The Dark Knight", "Action, Crime, Drama", 2008, 9.0));
        movies.add(new Movie("12 Angry Men", "Crime, Drama", 1974, 8.9));
        movies.add(new Movie("Schindler's List", "Biography, Drama, History", 1993, 8.9));
        movies.add(new Movie("Pulp Fiction", "Crime, Drama", 1994, 8.9));
        movies.add(new Movie("The Lord of the Rings", "Adventure, Drama, Fantasy", 2003, 8.9));
        movies.add(new Movie("The Good, the Bad and the Ugly", "Western", 1967, 8.9));
        movies.add(new Movie("Fight Club", "Drama", 1999, 8.8));
    }

}