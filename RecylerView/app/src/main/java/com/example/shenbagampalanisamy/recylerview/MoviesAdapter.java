package com.example.shenbagampalanisamy.recylerview;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.shenbagampalanisamy.recylerview.Movie;
import java.util.List;

/**
 * Created by Abhi on 23 Sep 2017 023.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.CustomViewHolder> {
    private List<Movie> movies;

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView movieName, year, genre, rating;

        public CustomViewHolder(View view) {
            super(view);
            movieName = (TextView) view.findViewById(R.id.movieName);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
            rating = (TextView) view.findViewById(R.id.rating);
        }
    }

    public MoviesAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list, parent, false);

        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Movie movie = movies.get(position);
        holder.movieName.setText(movie.getMovieName());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(String.valueOf(movie.getYear()));
        holder.rating.setText(String.valueOf(movie.getRating()));
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

}