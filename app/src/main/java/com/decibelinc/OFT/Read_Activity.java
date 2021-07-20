package com.decibelinc.OFT;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Read_Activity extends AppCompatActivity implements View.OnClickListener{
    ImageView bookimage;
    ImageView authorimage;
    TextView link;
    public boolean firstart=false;

    @Override
    protected void onStart() {
        super.onStart();
        ConnectivityManager manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info=manager.getActiveNetworkInfo();
        if (null!=info)
        {
            if (info.getType()==ConnectivityManager.TYPE_MOBILE)
            {
                //Toast.makeText(this, "Data Enabled!", Toast.LENGTH_SHORT).show();
            }
            else if (info.getType()==ConnectivityManager.TYPE_WIFI)
            {
                // Toast.makeText(this, "Wifi Enabled!", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            startActivity(new Intent(this,no_internet_activity.class));
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_);
        bookimage=(ImageView)findViewById(R.id.bookimage);
        link=(TextView)findViewById(R.id.ansb2);
        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        firstart = prefs.getBoolean("firstStart", true);
        if (firstart){
            ShowMessage();
        }
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.emilymandel.com"));
                startActivity(browserIntent);
            }
        });
        bookimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo info=manager.getActiveNetworkInfo();
                if (null!=info){
                    ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2Fstation-eleven.pdf?alt=media&token=f08df4a1-45c5-4226-b949-d9f810367794");
                }else {
                    startActivity(new Intent(Read_Activity.this,no_internet_activity.class));
                }

            }

            private void ReaderActvity(String s) {
                Intent bookintent=new Intent(Read_Activity.this,Reader.class);
                bookintent.putExtra("booklink",s);
                startActivity(bookintent);
            }
        });
        authorimage=(ImageView)findViewById(R.id.AuthorImage);
        Glide.with(Read_Activity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/BookofTheupdate%2Fbookimage.jfif?alt=media&token=8cb44b92-0d47-4599-99b8-8abef7095ca3")
                .into(bookimage);
        Glide.with(Read_Activity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/BookofTheupdate%2Fauthorimage.jfif?alt=media&token=07c668a9-c6ee-4bf3-a016-e2fd1f2dd13f")
                .into(authorimage);
    }

    private void ShowMessage() {
        final AlertDialog.Builder alert= new AlertDialog.Builder(Read_Activity.this);
        View mview=getLayoutInflater().inflate(R.layout.book_of_the_update_start_message,null);
        alert.setView(mview);
        final AlertDialog alertDialog=alert.create();
        alertDialog.setCanceledOnTouchOutside(true);
        alertDialog.show();
        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart", false);
        editor.apply();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
           /* case R.id.Menu:
                Intent i = new Intent(getBaseContext(), Setting_Page.class);
                i.putExtra("my_boolean_Read", true);
                startActivity(i);
                break;*/
        }
    }
}