package com.simranjit.android.popularmoviesstage2;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Simranjit Singh
 */
public class MovieCursorAdapter extends CursorAdapter {

    public static final String LOG_TAG=MovieCursorAdapter.class.getSimpleName();
    private Context mContext;
    private int loader_id;
    public MovieCursorAdapter(Context context, Cursor c, int flags)
    {
        super(context, c, flags);
        mContext=context;
        loader_id=flags;
        Log.v("MovieCursorAdapter","-------------------Constructor Called");
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent)
    {
        Log.v("MovieCursorAdapter","------------newViewCalled");
        return LayoutInflater.from(context).inflate(R.layout.grid_item_movies,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor)
    {
        Log.v("MovieCursorAdapter"," : Bind View Called");

        String baseImageUrl="http://image.tmdb.org/t/p/w185/";

        String str=baseImageUrl+cursor.getString(MainActivityFragment.COL_POSTER_PATH);
        Log.v("URL MCA :",str);

        ImageView poster= view.findViewById(R.id.grid_item_movies_imageview);
        Picasso.with(context).load(str).placeholder(R.mipmap.img_placeholder).into(poster);
    }

    @Override
    public int getCount() {

        if(getCursor()==null)
            return 0;
        return super.getCount();
    }
}
