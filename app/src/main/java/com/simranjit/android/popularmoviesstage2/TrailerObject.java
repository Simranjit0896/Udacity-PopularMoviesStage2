package com.simranjit.android.popularmoviesstage2;

/**
 * Created by Simranjit Singh
 */
public class TrailerObject
{
    String id;
    String name;
    String key;

    public void TrailerObject()
    {}
    public void TrailerObject(String key)
    {
        this.key=key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
