package com.simranjit.android.popularmoviesstage2.Data;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Simranjit Singh
 */
public class MovieContract
{
    public static final String CONTENT_AUTHORITY="com.simranjit.android.popularmoviesstage2.app";
    //Add the BASE_CONTENT_URI

    public static final Uri BASE_CONTENT_URI= Uri.parse("content://"+CONTENT_AUTHORITY);

    //Path For Movies, Reviews and Trailers...
    public static final String PATH_MOVIE="movie";
    public static final String PATH_TRAILER="trailer";
    public static final String PATH_REVIEW="review";



    public static final class MovieEntry implements BaseColumns
    {
        //Table
        public static final String TABLE_MOVIE="movie";

        // Column names
        public static final String COLUMN_ID="_id";
        public static final String COLUMN_TITLE= "title";
        public static final String COLUMN_OVERVIEW="overview";
        public static final String COLUMN_RELEASE_DATE="release_date";
        public static final String COLUMN_VOTE_AVERAGE="vote_average";
        public static final String COLUMN_POSTER_PATH="poster_path";
        public static final String COLUMN_BACKDROP_PATH="backdrop_path";
        public static final String COLUMN_MOVIE_ID="movie_id";

        public static final Uri CONTENT_URI=BASE_CONTENT_URI.buildUpon()
                                .appendPath(TABLE_MOVIE).build();
        public static final String CONTENT_DIR_TYPE="vnd.android.cursor.dir/"
                                +CONTENT_AUTHORITY+"/"+PATH_MOVIE;
        public static final String CONTENT_ITEM_TYPE="vnd.android.cursor.item/"
                                +CONTENT_AUTHORITY+"/"+PATH_MOVIE;

        // May change as per need
        public static Uri buildMoviesUri(long id)
        {
//            return CONTENT_URI.buildUpon().appendPath(id).build();
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }
    }
}
