package com.decibelinc.OFT;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Reader extends AppCompatActivity {
PDFView pdfView;
    Intent intent;
   /* TextView textView;*/
    private String bookasset;
    ProgressBar progressBar;
    int count = 0;
    public boolean isLoading=false;
    public boolean isDark=false;
    public boolean SettingOn=false;
    SeekBar Brightness;
    ImageView settings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);
        progressBar=(ProgressBar)findViewById(R.id.progresBar);
        progressBar.setMax(100);
        progressBar.setProgress(0);
        intent=getIntent();
        Brightness=(SeekBar)findViewById(R.id.seekBarScrubber);
        /*textView=(TextView)findViewById(R.id.text);*/
       /* progressBar.setProgress(50);*/
        bookasset=getIntent().getStringExtra("booklink");
        pdfView=(PDFView)findViewById(R.id.pdfView);
        new pdfDownlaod().execute(bookasset);
        isLoading=true;
        settings=(ImageView)findViewById(R.id.Settings);
        Brightness.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int sBrighntess=progress*255/255;
                Context contex=getApplicationContext();
                boolean canWrite= Settings.System.canWrite(contex);
                if (canWrite){
                    Settings.System.putInt(contex.getContentResolver()
                            ,Settings.System.SCREEN_BRIGHTNESS_MODE,
                            Settings.System.SCREEN_BRIGHTNESS_MODE_MANUAL);
                    Settings.System.putInt(contex.getContentResolver(),
                            Settings.System.SCREEN_BRIGHTNESS,sBrighntess);
                }else {
                    Intent intent=new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    contex.startActivity(intent);
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (isDark==false)
               {
                   pdfView.setNightMode(true);
                   settings.setImageResource(R.drawable.ic_baseline_wb_sunny_24);
                   pdfView.enableAnnotationRendering(true);
                   isDark=true;
               }else {
                   pdfView.setNightMode(false);
                   settings.setImageResource(R.drawable.ic_baseline_nights_stay_24);
                   isDark=false;
               }
            }
        });

    }
    private class pdfDownlaod extends AsyncTask<String, Void, InputStream>{

        @Override
        protected InputStream doInBackground(String... strings) {
           InputStream inputStream=null;
            try {
                URL url=new URL(strings[0]);
                HttpURLConnection urlConnection=(HttpURLConnection) url.openConnection();
                if (urlConnection.getResponseCode()==200){
                    inputStream=new BufferedInputStream(urlConnection.getInputStream());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return inputStream;

        }


        @Override
        protected void onPostExecute(InputStream inputStream) {
            super.onPostExecute(inputStream);
           if (isLoading==true)
           {
               pdfView.fromStream(inputStream)
                       /* .pages(0, 2, 1, 3, 3, 3) // all pages are displayed by default*/
                       .enableSwipe(true) // allows to block changing pages using swipe
                       .swipeHorizontal(true)
                       .enableDoubletap(true)
                       .defaultPage(0)
                       // allows to draw something on the current page, usually visible in the middle of the screen
                       .pageFitPolicy(FitPolicy.WIDTH) // mode to fit pages in the view
                       .fitEachPage(true) // fit each page to the view, else smaller pages are scaled relative to largest page.
                       .pageSnap(true) // snap pages to screen boundaries
                       .pageFling(true) // make a fling change only a single page like ViewPager
                       .nightMode(false) // toggle night mode
                       .load();
               progressBar.setVisibility(View.INVISIBLE);
               settings.setVisibility(View.VISIBLE);
               /* textView.setVisibility(View.INVISIBLE);*/
           }



        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        isLoading=false;
    }
}