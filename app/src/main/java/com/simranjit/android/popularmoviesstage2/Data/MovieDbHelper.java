package com.simranjit.android.popularmoviesstage2.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Simranjit Singh
 */
public class MovieDbHelper extends SQLiteOpenHelper {
    public static final String LOG_TAG=MovieDbHelper.class.getSimpleName();

    // Database name and version
    // Version should change everytime you update the database structure
    public static final String DATABASE_NAME="movies.db";
    public static final int DATABASE_VERSION=4;



    public MovieDbHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    // Creating the database
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String SQL_CREATE_MOVIE_TABLE="CREATE TABLE "+ MovieContract.MovieEntry.TABLE_MOVIE+"("
                +MovieContract.MovieEntry._ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"
                +MovieContract.MovieEntry.COLUMN_TITLE+" TEXT NOT NULL,"
                +MovieContract.MovieEntry.COLUMN_OVERVIEW+" TEXT NOT NULL,"
                +MovieContract.MovieEntry.COLUMN_RELEASE_DATE+" TEXT NOT NULL,"
                +MovieContract.MovieEntry.COLUMN_VOTE_AVERAGE+" TEXT NOT NULL,"
                +MovieContract.MovieEntry.COLUMN_POSTER_PATH+" TEXT NOT NULL,"
                +MovieContract.MovieEntry.COLUMN_BACKDROP_PATH+" TEXT NOT NULL, "
                +MovieContract.MovieEntry.COLUMN_MOVIE_ID +" INTEGER UNIQUE );";
        //Executing the query.
        sqLiteDatabase.execSQL(SQL_CREATE_MOVIE_TABLE);
    }

    //Updating the Database
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // Drop the Table
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ MovieContract.MovieEntry.TABLE_MOVIE);
        // Recreate the Table
        onCreate(sqLiteDatabase);
    }
}
