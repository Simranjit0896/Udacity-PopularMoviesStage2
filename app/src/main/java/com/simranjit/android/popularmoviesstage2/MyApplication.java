package com.simranjit.android.popularmoviesstage2;
import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by Simranjit Singh
 */
public class MyApplication extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();
        // Create an Initialiser Builder
        Stetho.InitializerBuilder initializerBuilder=Stetho.newInitializerBuilder(this);

        // For Enabling Chrome Dev Tools
        initializerBuilder.enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this));

        // For Enabling command line interface
        initializerBuilder.enableDumpapp(Stetho.defaultDumperPluginsProvider(this));

        // Using initialiseBuilder  to  generate  an initialiser
        Stetho.Initializer initializer=initializerBuilder.build();

        // Initialise stetho with  initialiser

        Stetho.initialize(initializer);

    }
}
