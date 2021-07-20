package com.decibelinc.OFT;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{
    Button category1;
    Button category2;
    Button category3;
    Button category4;
    Button category5;
    Button category6;
    Button category7;
    Button category8;
    Button category9;
    Button category10;
    Button category11;
    Button category12;
    Button AudioButton;
    ImageView Menu;
    ImageView bestSeller1;
    ImageView bestSeller2;
    ImageView bestSeller3;
    ImageView bestSeller4;
    ImageView bestSeller5;
    ImageView Author1;
    ImageView Author2;
    ImageView Author3;
    ImageView Author4;
    ImageView Recomended1;
    ImageView Recomended2;
    ImageView Recomended3;
    ImageView Recomended4;
    ImageView Series1;
    ImageView Series2;
    ImageView Series3;
    ImageView Series4;
    ImageView Series5;
    TextView bestSellerTitle1;
    TextView bestSellerTitle2;
    TextView bestSellerTitle3;
    TextView bestSellerTitle4;
    TextView bestSellerTitle5;
    TextView AuthorTitle1;
    TextView AuthorTitle2;
    TextView AuthorTitle3;
    TextView AuthorTitle4;
    TextView RecomendedTitle1;
    TextView RecomendedTitle2;
    TextView RecomendedTitle3;
    TextView RecomendedTitle4;
    TextView bestSellerAuthor1;
    TextView bestSellerAuthor2;
    TextView bestSellerAuthor3;
    TextView bestSellerAuthor4;
    TextView bestSellerAuthor5;
    TextView authorAuthor1;
    TextView authorAuthor2;
    TextView authorAuthor3;
    TextView authorAuthor4;
    TextView RecomendedAuthor1;
    TextView RecomendedAuthor2;
    TextView RecomendedAuthor3;
    TextView RecomendedAuthor4;
    ImageView read;

       BottomNavigationView bottomNavigationView;
    Toolbar toolbar;
    public boolean isRomance=true;
    public boolean isAction=false;
    public boolean isMystery=false;
    public boolean isBiography=false;
    public boolean isChildred=false;
    public boolean isYouth=false;
    public boolean isFantasy=false;
    public boolean isTaboo=false;
    public boolean isHistorical=false;
    public boolean isHorror=false;
    public boolean isLitrerary=false;
    public boolean isScience=false;
    public boolean firstart=false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        category1=(Button)findViewById(R.id.Category1);
        /*Menu=(ImageView)findViewById(R.id.Menu);*/
        bestSeller1=(ImageView)findViewById(R.id.BestSellers1);
        bestSeller2=(ImageView)findViewById(R.id.BestSellers2);
        bestSeller3=(ImageView)findViewById(R.id.BestSellers3);
        bestSeller4=(ImageView)findViewById(R.id.BestSellers4);
        bestSeller5=(ImageView)findViewById(R.id.BestSellers5);
        Series1=(ImageView)findViewById(R.id.seriescardimage1);
        Series2=(ImageView)findViewById(R.id.seriescardimage2);
        Series3=(ImageView)findViewById(R.id.seriescardimage3);
        Series4=(ImageView)findViewById(R.id.seriescardimage4);
        Series5=(ImageView)findViewById(R.id.seriescardimage5);
        Author1=(ImageView)findViewById(R.id.LatestRelease1);
        Author2=(ImageView)findViewById(R.id.LatestRelease2);
        Author3=(ImageView)findViewById(R.id.LatestRelease3);
        Author4=(ImageView)findViewById(R.id.LatestRelease4);
        Recomended1=(ImageView)findViewById(R.id.Recomended1);
        Recomended2=(ImageView)findViewById(R.id.Recomended2);
        Recomended3=(ImageView)findViewById(R.id.Recomended3);
        Recomended4=(ImageView)findViewById(R.id.Recomended4);
        bottomNavigationView=findViewById(R.id.nav_view);
       setSupportActionBar(toolbar);
        category2=(Button)findViewById(R.id.Category2);
        category3=(Button)findViewById(R.id.Category3);
        bestSellerTitle1=(TextView)findViewById(R.id.BestSellersTile1);
        bestSellerTitle2=(TextView)findViewById(R.id.BestSellersTile2);
        bestSellerTitle3=(TextView)findViewById(R.id.BestSellersTile3);
        bestSellerTitle4=(TextView)findViewById(R.id.BestSellersTile4);
        bestSellerTitle5=(TextView)findViewById(R.id.BestSellersTile5);
        AuthorTitle1=(TextView)findViewById(R.id.LatestReleaseTile1);
        AuthorTitle2=(TextView)findViewById(R.id.LatestReleaseTile2);
        AuthorTitle3=(TextView)findViewById(R.id.LatestReleaseTile3);
        AuthorTitle4=(TextView)findViewById(R.id.LatestReleaseTitle4);
        authorAuthor1=(TextView)findViewById(R.id.LatestReleaseAuthor1);
        authorAuthor2=(TextView)findViewById(R.id.LatestReleaseAuthor2);
        authorAuthor3=(TextView)findViewById(R.id.LatestReleasAuthor3);
        authorAuthor4=(TextView)findViewById(R.id.LatestReleaseAuthor4);
        RecomendedTitle1=(TextView)findViewById(R.id.RecomendedTile1);
        RecomendedTitle2=(TextView)findViewById(R.id.RecomendedTile2);
        RecomendedTitle3=(TextView)findViewById(R.id.RecomendedTile3);
        RecomendedTitle4=(TextView)findViewById(R.id.RecomendedTitle4);
        RecomendedAuthor1=(TextView)findViewById(R.id.RecomendedAuthor1);
        RecomendedAuthor2=(TextView)findViewById(R.id.RecomendedAuthor2);
        RecomendedAuthor3=(TextView)findViewById(R.id.RecomendedAuthor3);
        RecomendedAuthor4=(TextView)findViewById(R.id.RecomendedAuthor4);
        bestSellerAuthor1=(TextView)findViewById(R.id.BestSellersAuthor1);
        bestSellerAuthor2=(TextView)findViewById(R.id.BestSellersAuthor2);
        bestSellerAuthor3=(TextView)findViewById(R.id.BestSellersAuthor3);
        bestSellerAuthor4=(TextView)findViewById(R.id.BestSellersAuthor4);
        bestSellerAuthor5=(TextView)findViewById(R.id.BestSellersAuthor5);
        category4=(Button)findViewById(R.id.Category4);
        category5=(Button)findViewById(R.id.Category5);
        category6=(Button)findViewById(R.id.Category6);
        category7=(Button)findViewById(R.id.Category7);
        category8=(Button)findViewById(R.id.Category8);
        category9=(Button)findViewById(R.id.Category9);
        category10=(Button)findViewById(R.id.Category10);
        category11=(Button)findViewById(R.id.Category11);
        category12=(Button)findViewById(R.id.Category12);
        read=(ImageView)findViewById(R.id.readid);
        AudioButton=(Button)findViewById(R.id.Audio);
        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        firstart = prefs.getBoolean("firstStart", true);
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,Read_Activity.class));
            }
        });
        AudioButton.setOnClickListener(this);
        Recomended1.setOnClickListener(this);
        Recomended2.setOnClickListener(this);
        Recomended3.setOnClickListener(this);
        Recomended4.setOnClickListener(this);
        Author1.setOnClickListener(this);
        Author2.setOnClickListener(this);
        Author3.setOnClickListener(this);
        Author4.setOnClickListener(this);
        bestSeller1.setOnClickListener(this);
        bestSeller2.setOnClickListener(this);
        bestSeller3.setOnClickListener(this);
        bestSeller4.setOnClickListener(this);
        bestSeller5.setOnClickListener(this);
        category1.setOnClickListener(this);
        category2.setOnClickListener(this);
        category3.setOnClickListener(this);
        category4.setOnClickListener(this);
        category5.setOnClickListener(this);
        category6.setOnClickListener(this);
        category7.setOnClickListener(this);
        category8.setOnClickListener(this);
        category9.setOnClickListener(this);
        category10.setOnClickListener(this);
        category11.setOnClickListener(this);
        category12.setOnClickListener(this);
        Series1.setOnClickListener(this);
        Series2.setOnClickListener(this);
        Series3.setOnClickListener(this);
        Series4.setOnClickListener(this);
        Series5.setOnClickListener(this);
        bottomNavigationView.setSelectedItemId(R.id.Home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.Home: {
                        startActivity(new Intent(HomeActivity.this, HomeActivity.class));
                        break;
                    }
                    case R.id.Read: {
                        startActivity(new Intent(HomeActivity.this, Read_Activity.class));
                        break;
                    }
                }
                return false;
            }
        });
        Button1Clicked();
        if (firstart){
            ShowMessage();
        }
       /* LoadRomaceImages();
        LoaChilrenImage();
        LoadActionImages();
        LoadBiographyBook();
        LoadFantasyImage();
        LoadHistoricalBook();
        LoadHorrorBooks();
        LoadMysteryImages();
        LoadSciencebook();
        LoadTabooBook();
        LoadYouthBook();*/

        }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Audio:
               /* final AlertDialog.Builder alert= new AlertDialog.Builder(HomeActivity.this);
                View mview=getLayoutInflater().inflate(R.layout.update_message_temporary,null);
                alert.setView(mview);
                final AlertDialog alertDialog=alert.create();
                alertDialog.setCanceledOnTouchOutside(true);
                alertDialog.show();*/
                startActivity(new Intent(HomeActivity.this,Podcast_Activity.class));
                break;
            case R.id.Category1:
                ConnectivityManager manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    Button1Clicked();
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
               /* Toast.makeText(this, "1st Clicked", Toast.LENGTH_SHORT).show();*/
                break;
            case R.id.Category2:
                 manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                 info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    Button2Clicked();
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                /*Toast.makeText(this, "2nd Clicked", Toast.LENGTH_SHORT).show();*/
                break;
            case R.id.Category3:
                 manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    Button3Clicked();
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                /*Toast.makeText(this,"3rd Clicked",Toast.LENGTH_SHORT).show();*/
                break;
            case R.id.Category4:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    Button4Clicked();
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
              /*  Toast.makeText(this, "4th Clicked", Toast.LENGTH_SHORT).show();*/
                break;
            case R.id.Category5:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    Button5Clicked();
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
              /*  Toast.makeText(this, "5th Clicked", Toast.LENGTH_SHORT).show();*/
                break;
            case R.id.Category6:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    Button6Clicked();
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                /* Toast.makeText(this, "1st Clicked", Toast.LENGTH_SHORT).show();*/
                break;
            case R.id.Category7:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    Button7Clicked();
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                /*Toast.makeText(this, "2nd Clicked", Toast.LENGTH_SHORT).show();*/
                break;
            case R.id.Category8:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    Button8Clicked();
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                /*Toast.makeText(this,"3rd Clicked",Toast.LENGTH_SHORT).show();*/
                break;
            case R.id.Category9:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    Button9Clicked();
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                /*  Toast.makeText(this, "4th Clicked", Toast.LENGTH_SHORT).show();*/
                break;
            case R.id.Category10:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    Button10Clicked();
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                /*  Toast.makeText(this, "5th Clicked", Toast.LENGTH_SHORT).show();*/
                break;
            case R.id.Category11:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    Button11Clicked();
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                /*Toast.makeText(this,"3rd Clicked",Toast.LENGTH_SHORT).show();*/
                break;
            case R.id.Category12:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    Button12Clicked();
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                /*  Toast.makeText(this, "4th Clicked", Toast.LENGTH_SHORT).show();*/
                break;
            /*case R.id.Category13:
                Button13Clicked();
                *//*  Toast.makeText(this, "5th Clicked", Toast.LENGTH_SHORT).show();*//*
                break;*/
           /* case R.id.Menu:
                startActivity(new Intent(HomeActivity.this,Setting_Page.class));
                break;*/
            case R.id.BestSellers1:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    if (isRomance==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FPride-and-Prejudice.pdf?alt=media&token=d4f93c45-31df-4442-8d74-652d003d947f");
                    }else if (isAction==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2F20000LeaguesUndertheSea.pdf?alt=media&token=d513d4d1-d97f-488a-8b2f-53b5a8ed669a");
                    }else if (isMystery==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FTheAdventuresofSherlockHolmes.pdf?alt=media&token=b7ce10fa-342b-43b2-9345-69d1eb737b01");
                    }else if (isBiography==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FTheArtofWar.pdf?alt=media&token=ddfa715f-c8ec-46bb-b060-0c3025faa293");
                    }else if (isChildred==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FA-Little-Princess.pdf?alt=media&token=f2c4cff3-c20a-4538-8aca-54044a71e6e0");
                    }else if (isYouth==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-%2430000-Bequest.pdf?alt=media&token=2af2d595-3031-47e1-8bae-04e8d937c34e");
                    }else if (isFantasy==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Arabian-Nights.pdf?alt=media&token=f2e8458a-580f-4a55-ac9e-f9ad9d77a780");
                    }else if (isTaboo==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Age-of-Reason.pdf?alt=media&token=74aba35f-144b-4f0f-8734-dbe09e457ec2");
                    }else if (isHistorical==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FMacbeth.pdf?alt=media&token=d7bace74-38f4-4531-aaec-3f9a6d9f8700");
                    }else if (isHorror==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Call-of-Cthulhu.pdf?alt=media&token=814a47c5-a598-432c-be2c-d84d8b8d6303");
                    }else if (isLitrerary==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Art-of-Public-Speaking.pdf?alt=media&token=646e030c-4c4e-4501-a04c-bdb046c1fe32");
                    }else if (isScience==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Invisble-man.pdf?alt=media&token=23f311c8-508f-47c1-94a9-72a412ed0332");
                    }
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                /*  Toast.makeText(this, "4th Clicked", Toast.LENGTH_SHORT).show();*/
                break;
            case R.id.BestSellers2:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    if (isRomance==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FHealing-Her-Heart.pdf?alt=media&token=4752b48e-b78f-429d-9338-fd5ff777fcbd");
                    }else if (isAction==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe%20Count%20of%20Monte%20Cristo.pdf?alt=media&token=f5f5ed14-7b15-4ad2-b964-cd6d08fc1970");
                    }else if (isMystery==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FCrime-and-Punishment-.pdf?alt=media&token=ae28c6af-625d-49fa-86e9-1a006b3d31bd");
                    }else if (isBiography==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FAutobiography-of-a-Yogi.pdf?alt=media&token=4087fd71-ad95-44c2-8852-1f6c2eb7b81b");
                    }else if (isChildred==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FAlice-in-Wonderland.pdf?alt=media&token=4a5ce6ba-18d7-4d63-966c-e8b6fce85b42");
                    }else if (isYouth==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Communist-Manifesto.pdf?alt=media&token=f38b55c5-11fe-498d-9578-6f90869c71a1");
                    }else if (isFantasy==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Time-Machine.pdf?alt=media&token=20ec3f3f-23e3-42c9-b9d2-cf0480df8790");
                    }else if (isTaboo==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FUlysses.pdf?alt=media&token=dbe2d0f0-21f4-4533-a828-8f8790bc8661");
                    }else if (isHistorical==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FAll-For-Love.pdf?alt=media&token=a8cc1757-478b-4950-80cb-d372984239fb");
                    }else if (isHorror==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FAt-the-Mountains-of-Madness.pdf?alt=media&token=8a860488-9cff-414c-b50f-ae57ba6a2ae1");
                    }else if (isLitrerary==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Grammar-of-English-Grammars.pdf?alt=media&token=fb4cd4fa-def3-4581-9168-1aaa0a7d453e");
                    }else if (isScience==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-War-of-the-Worlds.pdf?alt=media&token=3649a7ab-a066-404d-9fc3-d82674563264");
                    }
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.BestSellers3:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    if (isRomance==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FPersuasion.pdf?alt=media&token=d681a723-23a0-4066-a5a4-8c0ba761ce6e");
                    }else if (isAction==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2Fthe-adventures-of-huckleberry-finn.pdf?alt=media&token=171014fb-ffc3-4b74-b09e-e9756a34658a");
                    }else if (isMystery==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe%20Secret%20Adversary.pdf?alt=media&token=46b4697f-877c-4d9c-815b-1d6ebf488248");
                    }else if (isBiography==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FA-Tale-of-Two-Cities.pdf?alt=media&token=7cedc221-eca6-4543-abcc-bc0fc279fca5");
                    }else if (isChildred==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2Fthe-adventures-of-huckleberry-finn.pdf?alt=media&token=171014fb-ffc3-4b74-b09e-e9756a34658a");
                    }else if (isYouth==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FHamlet.pdf?alt=media&token=0d2224ac-60df-4aa3-8c93-afcdd8ce8fe1");
                    }else if (isFantasy==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Demon-Girl.pdf?alt=media&token=128181d8-328c-47cf-b854-2fb451a3c587");
                    }else if (isTaboo==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Analects-of-Confucius.pdf?alt=media&token=e02b9511-d25e-4efb-8c93-5afa4279cae1");
                    }else if (isHistorical==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FRiders-to-the-Sea.pdf?alt=media&token=6261c358-ee7b-423c-9a30-35d501faafa8");
                    }else if (isHorror==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Best-Ghost-Stories.pdf?alt=media&token=7bf3a247-48f0-4ece-94f6-7d76a780a84b");
                    }else if (isLitrerary==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FLes-Mis%C3%A9rables.pdf?alt=media&token=8120a43b-853d-4bee-bbc3-e71fdda16cc3");
                    }else if (isScience==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Mysterious-Island.pdf?alt=media&token=ae0929f0-a394-4269-adac-2194159eba48");
                    }
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.BestSellers4:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    if (isRomance==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FJane-Eyre.pdf?alt=media&token=6e96a9f8-4dcf-43e0-acba-5cfd6967650a");
                    }else if (isAction==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Call-of-the-Wild.pdf?alt=media&token=55589200-dfe8-4d0a-bf03-12d84c4d2237");
                    }else if (isMystery==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FCollected-Works-of-Poe.pdf?alt=media&token=303492a2-5d13-4721-9455-542633519ed3");
                    }else if (isBiography==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FWalden.pdf?alt=media&token=143063bc-6d2a-44fb-86dc-1044addfe2d8");
                    }else if (isChildred==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FA-Pair-of-Schoolgirls.pdf?alt=media&token=3b2876d5-3167-46bc-a1a9-9b24933903ff");
                    }else if (isYouth==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-''Genius''.pdf?alt=media&token=7ad52575-9f51-4d60-87c0-15e425d53a02");
                    }else if (isFantasy==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FAladdin-and-the-Magic-Lamp.pdf?alt=media&token=595e95b2-301d-4b63-9072-42bc08a57e28");
                    }else if (isTaboo==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FTen-Days-That-Shook-the-World.pdf?alt=media&token=771cb7f0-1aa5-41a0-a558-8ad00a2b57c3");
                    }else if (isHistorical==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FKing-Lear.pdf?alt=media&token=f6e6edf5-5bf8-4a4e-8c0b-565ab1e79a50");
                    }else if (isHorror==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FDracula.pdf?alt=media&token=1d293ae9-0e2c-4320-bcbd-3d03f39a7446");
                    }else if (isLitrerary==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FWuthering-Heights.pdf?alt=media&token=0f9aab8d-7060-418d-8134-2cbf62757829");
                    }else if (isScience==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FAnthem.pdf?alt=media&token=357fbbb9-bda7-4a54-bc43-700a1c536d6a");
                    }
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.BestSellers5:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    if (isRomance==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FAnna-Karenina.pdf?alt=media&token=21a03bbd-8994-4875-bc03-68df4f1774d2");
                    }else if (isAction==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2F'Tween-Snow-and-Fire.pdf?alt=media&token=e519729b-c08c-461b-a30e-44171e4ad4e7");
                    }else if (isMystery==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FMysteriousAffairAtStyles.pdf?alt=media&token=4969498a-fa65-42c6-ac5b-0f3995fa9c83");
                    }else if (isBiography==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FAnne-of-Green-Gables.pdf?alt=media&token=52e4f953-e61c-4992-9dff-7fcbd8300401");
                    }else if (isChildred==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FLittle-Women.pdf?alt=media&token=87a0d7cf-928a-4711-bed6-9b32ab853c12");
                    }else if (isYouth==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Bhagavad-Gita.pdf?alt=media&token=d2bad3fc-eed6-45ce-ae9d-9558978ff9ac");
                    }else if (isFantasy==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FGulliver's-Travels.pdf?alt=media&token=1a4067f7-c866-4405-bc6a-e2fae81f545c");
                    }else if (isTaboo==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FCandide.pdf?alt=media&token=cb6732a5-a35c-496c-ad76-875c46bfca0d");
                    }else if (isHistorical==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FRiders-to-the-Sea.pdf?alt=media&token=6261c358-ee7b-423c-9a30-35d501faafa8");
                    }else if (isHorror==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Phantom-of-the-Opera.pdf?alt=media&token=de7b8c29-df40-4db1-964e-505f33c939ef");
                    }else if (isLitrerary==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FSamlede-V%C3%A6rker.pdf?alt=media&token=19611602-3523-4c72-b84a-2696ec9509be");
                    }else if (isScience==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FA-Princess-of-Mars.pdf?alt=media&token=9c01bac6-c685-42bb-a36a-72468289994d");
                    }
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.LatestRelease1:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    if (isRomance==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FHappy-House.pdf?alt=media&token=28ebc80b-847d-4658-a870-9625c1f69d11");
                    }else if (isAction==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FRadio-Boys-Cronies.pdf?alt=media&token=4bfc7074-c040-462b-876b-b0b4c3cd6adf");
                    }else if (isMystery==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FApache-Dawn.pdf?alt=media&token=9d60d891-8c94-4ffb-9299-e3fb5ab668f9");
                    }else if (isBiography==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FCatalogo-de-los-Objetos-Etnologicos-y-Arqueologicos-Exhibidos-por-la-Expedici%C3%B3n-Hemenway.pdf?alt=media&token=b2ba1b98-0254-49c3-8782-f087be05421a");
                    }else if (isChildred==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FLisbeth-Longfrock.pdf?alt=media&token=83555544-6d4e-4b33-934f-071a577b11e2");
                    }else if (isYouth==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FCato.pdf?alt=media&token=9428ccc9-82b8-4205-b3ab-f7b9c7cb0b62");
                    }else if (isFantasy==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Candy-Country.pdf?alt=media&token=4b60f893-8631-4a08-a7a0-cc81f0dd7009");
                    }else if (isTaboo==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Confessions.pdf?alt=media&token=204771c1-b0b1-430e-8b61-2ec78405572e");
                    }else if (isHistorical==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2F%CE%A0%CE%AD%CF%81%CF%83%CE%B1%CE%B9.pdf?alt=media&token=16f3bb2a-231c-4c95-bd4d-150efcd55039");
                    }else if (isHorror==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FAuriol.pdf?alt=media&token=e9924b1c-f1fa-47ee-a8c1-51a5b4462e41");
                    }else if (isLitrerary==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FLe-rive-della-Bormida-nel-1794.pdf?alt=media&token=0274f40f-2def-4249-a7f8-4038386935a5");
                    }else if (isScience==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FFreudian-Slip.pdf?alt=media&token=7274698f-5d87-4410-aad0-9a78663d7368");
                    }
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.LatestRelease2:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    if (isRomance==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FJohn-Henry-Smith.pdf?alt=media&token=a83ef417-2a2f-4cbb-aed9-f5cea736869a");
                    }else if (isAction==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FKeineth.pdf?alt=media&token=d72b1077-1265-44ad-8b2a-95096c8b5c95");
                    }else if (isMystery==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FBlind-Angel-of-Wrath.pdf?alt=media&token=74dce69c-fbc4-4faa-9e73-51f73daecd9d");
                    }else if (isBiography==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FHymns-and-Hymnwriters-of-Denmark.pdf?alt=media&token=b77fce36-3b8b-4ffa-b0d2-6fbc2fff594c");
                    }else if (isChildred==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FRadio-Boys-Cronies.pdf?alt=media&token=4bfc7074-c040-462b-876b-b0b4c3cd6adf");
                    }else if (isYouth==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FSuppliant-Maidens-and-Other-Plays.pdf?alt=media&token=610e46e8-c90d-492e-aa87-58835c1b835b");
                    }else if (isFantasy==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FFlower-Fables.pdf?alt=media&token=39423d84-798a-4fc4-ba89-c522b1a04d87");
                    }else if (isTaboo==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Kingdom-of-God-Is-Within-You.pdf?alt=media&token=49c87830-a6ec-4818-b3d2-f12d06e55ef5");
                    }else if (isHistorical==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-'Mind-the-Paint'-Girl.pdf?alt=media&token=ea1a7008-d764-41b7-aebb-3b318d92939d");
                    }else if (isHorror==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FPauline's-Passion-and-Punishment.pdf?alt=media&token=6ba0588b-7d55-44fd-a8a7-a03c6ca143f5");
                    }else if (isLitrerary==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FStories-in-Verse.pdf?alt=media&token=b14005f8-02b1-435d-804e-1df2408241c2");
                    }else if (isScience==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FWorld-of-the-Drone.pdf?alt=media&token=1cf2e2f7-3cb0-4aa8-b7de-874afa8462ef");
                    }
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.LatestRelease3:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    if (isRomance==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Unspeakable-Perk.pdf?alt=media&token=1e42d81a-4e92-4f65-bc0e-ba252e8ca0a3");
                    }else if (isAction==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FRollo-in-Switzerland.pdf?alt=media&token=2bce8d98-6c64-4533-a24e-6ea3541e598b");
                    }else if (isMystery==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FBrazilian-Gold-Mine-Mystery.pdf?alt=media&token=6918ea51-b436-4703-89c6-c3940dd1d735");
                    }else if (isBiography==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FWith-the-Turks-in-Palestine.pdf?alt=media&token=2c1cc9a2-0b9f-42cc-bb4c-b624e8955c71");
                    }else if (isChildred==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FRollo-on-the-Atlantic.pdf?alt=media&token=9d43f9d0-556c-41df-a1ed-caeba51410e1");
                    }else if (isYouth==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Comedies-of-Terence.pdf?alt=media&token=af2a2312-56be-46fb-bc52-317d44c0924d");
                    }else if (isFantasy==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FGallowglass.pdf?alt=media&token=82b2c202-8b70-4b44-acfe-fe481aa14f32");
                    }else if (isTaboo==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Decameron-of-Giovanni-Boccaccio.pdf?alt=media&token=ffb024eb-c16c-46c6-aba0-5ebfe39624a2");
                    }else if (isHistorical==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FArms-and-the-Man.pdf?alt=media&token=8472afd0-ab27-4e7c-a0a2-026955bc4a60");
                    }else if (isHorror==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Beckoning-Hand-and-Other-Stories.pdf?alt=media&token=f8a7b443-a3a7-4aa8-8d0b-7c59f0b5bb17");
                    }else if (isLitrerary==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FLaicus.pdf?alt=media&token=157d5477-09b8-41f7-a77b-e37761a22f6b");
                    }else if (isScience==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Rotifers.pdf?alt=media&token=300fd88a-02be-4c6d-83e6-cf007f2b835e");
                    }
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.LatestRelease4:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    if (isRomance==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FMiss-Cayley's-Adventures.pdf?alt=media&token=542e130a-531c-48aa-9d1b-c0bf4c84e8f1 ");
                    }else if (isAction==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FDavid-Crockett.pdf?alt=media&token=e2e6b1f2-eaf0-407c-94be-b470b108f190");
                    }else if (isMystery==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FAverage-Jones.pdf?alt=media&token=6523ebfc-c7b2-43c4-aeb3-5044712f8974");
                    }else if (isBiography==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FGesammelte-Abhandlungen-III.pdf?alt=media&token=0830f057-e0df-4e9c-98b6-8ddbaf4687e0");
                    }else if (isChildred==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FHighacres.pdf?alt=media&token=d818106e-4bad-4d01-997d-a9923a424750");
                    }else if (isYouth==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-British-Barbarians.pdf?alt=media&token=c1867146-8805-4b10-87b0-436e0fe24c12");
                    }else if (isFantasy==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FHis-Robot-Girlfriend.pdf?alt=media&token=405b9e73-cf04-4325-b679-1a43ab9c799e");
                    }else if (isTaboo==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FMoll-Flanders.pdf?alt=media&token=b9454e32-31e8-43c0-b04a-4463747cff6e");
                    }else if (isHistorical==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FThe-Duchess-of-Malfi.pdf?alt=media&token=93b94404-07b1-4829-8883-8dc2e6cfde19");
                    }else if (isHorror==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FRing-Once-for-Death.pdf?alt=media&token=f56fa3ec-5d09-4376-8140-4357062700b9");
                    }else if (isLitrerary==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FPhilochristus.pdf?alt=media&token=c70b3e9d-0159-40cd-bce6-9ad086056d51");
                    }else if (isScience==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Books%2FWhen-the-Mountain-Shook.pdf?alt=media&token=f9136317-c709-4d27-8f2f-a8c77ddd45dc");
                    }
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.Recomended1:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    if (isRomance==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FRomance%2FPatricia-Brent-Spinster.pdf?alt=media&token=a2fd768e-5f25-4bdf-9bab-25e775953215");
                    }else if (isAction==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FAction%2FTom-Swift-and-His-Motor-Cycle.pdf?alt=media&token=bef53b2f-6817-49f4-8871-bce325da4337");
                    }else if (isMystery==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FMystery%2FFrom-an-Unseen-Censor.pdf?alt=media&token=1d7daafd-45d8-4d39-8199-2a69306b484f");
                    }else if (isBiography==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FBiography%2FDeath-Valley-in-'49.pdf?alt=media&token=2fa17858-4bb3-4f4d-9aac-3994f463ba09");
                    }else if (isChildred==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FChildrens%2FThe-Singing-Mouse-Stories.pdf?alt=media&token=8a8363f6-5bf6-4942-84d0-59e9c952b991");
                    }else if (isYouth==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FYouth%2FGinx's-Baby.pdf?alt=media&token=489640ae-1e37-4241-82a3-9af8de97cd01");
                    }else if (isFantasy==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FFantasy%2FThe-Five-Jars.pdf?alt=media&token=3a57b87a-66b2-4d12-a384-4274903383a6");
                    }else if (isTaboo==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FTaboo%2FOn-the-Duty-of-Civil-Disobedience.pdf?alt=media&token=59796d1c-7b06-4147-821f-350a93e0090b");
                    }else if (isHistorical==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FHistorical%2FThe-Taming-of-the-Shrew.pdf?alt=media&token=58812d6c-e24b-49c8-9472-1753a77ed9b1");
                    }else if (isHorror==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FHorror%2FUnspecialist.pdf?alt=media&token=bcdac826-c974-4e93-b075-ab4baacaa006");
                    }else if (isLitrerary==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FLiterraure%2FOnesimus.pdf?alt=media&token=0f2690b0-b1a0-4f31-8b88-d5ae79b2d4c6");
                    }else if (isScience==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FScience%2FThe-Mind-Like-A-Strange-Balloon.pdf?alt=media&token=ddb3904f-0de4-4639-8803-db1df154bf9b");
                    }
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.Recomended2:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    if (isRomance==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FRomance%2FThe-Grand-Babylon-Hotel.pdf?alt=media&token=2d30973b-6737-491a-ac76-d9f1297dec70");
                    }else if (isAction==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FAction%2FIsmailia.pdf?alt=media&token=cc31b39d-ae96-4285-b18b-15850b093913");
                    }else if (isMystery==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FMystery%2FJusticia-Nang-Dios.pdf?alt=media&token=c1b2c2e1-a7e6-441f-a9fe-f6d3b9492e78");
                    }else if (isBiography==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FBiography%2FThe-Right-of-American-Slavery.pdf?alt=media&token=dc0403cc-62d5-4a7d-be9b-79453969e81f");
                    }else if (isChildred==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FChildrens%2FWhat-Katy-Did-At-School.pdf?alt=media&token=1c5b9418-661f-4ba0-a4d5-90608aed3fd3");
                    }else if (isYouth==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FYouth%2FSavva-and-The-Life-of-Man.pdf?alt=media&token=7ab406de-a1fe-4ade-b9ff-982810636d41");
                    }else if (isFantasy==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FFantasy%2FThe-House-Of-Arden.pdf?alt=media&token=032e899b-27f9-4917-bf38-82be5e1665a9");
                    }else if (isTaboo==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FTaboo%2FLeaves-of-Grass.pdf?alt=media&token=78a61cda-3af4-449b-92d9-46496bd5395e");
                    }else if (isHistorical==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FHistorical%2FFaust.pdf?alt=media&token=33a1da7e-2fba-421e-bfc7-402b13aaad1c");
                    }else if (isHorror==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FHorror%2FKnock-Knock-Knock-and-Other-Stories-.pdf?alt=media&token=1a124ebe-cc76-4a9e-8aa8-15f205750812");
                    }else if (isLitrerary==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FLiterraure%2FSamantha-Among-the-Brethren.pdf?alt=media&token=29c5df4b-230c-4003-959c-b75e5946124c");
                    }else if (isScience==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FScience%2FChildren-of-the-Betsy-B.pdf?alt=media&token=aae44d96-5b3c-48f3-9e95-60c59540386c");
                    }
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.Recomended3:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    if (isRomance==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FRomance%2FA-Connecticut-Yankee-in-King-Arthur's-Court.pdf?alt=media&token=df6d2157-5d44-494f-ae30-fa28b0a7306e");
                    }else if (isAction==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FAction%2FThe-Moon-Endureth.pdf?alt=media&token=eaba0a71-89c0-4cb1-b66c-08ee03d67740");
                    }else if (isMystery==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FMystery%2FThe-Outlaws.pdf?alt=media&token=bac05685-d95c-4250-95dc-33438a9065f8");
                    }else if (isBiography==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FBiography%2FRecords-of-a-Girlhood.pdf?alt=media&token=0f05269a-8ccb-407a-9f90-ba0d472d0611");
                    }else if (isChildred==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FChildrens%2FComing-Home.pdf?alt=media&token=f6169e99-dee4-4cf8-a32b-14c984bdfcaf");
                    }else if (isYouth==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FYouth%2FDanny's-Own-Story.pdf?alt=media&token=cffc49be-73b2-44a2-b108-63423cd01ad2");
                    }else if (isFantasy==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FFantasy%2FBeauty-and-the-Beast.pdf?alt=media&token=4b3cb7fd-be1c-4f0a-a595-3238ff9ac0f0");
                    }else if (isTaboo==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FTaboo%2FSilas-Marner.pdf?alt=media&token=c9893afd-597a-4607-8aec-3bab2df4067a");
                    }else if (isHistorical==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FHistorical%2FA-Doll's-House.pdf?alt=media&token=29cce35c-937b-42c7-b37b-98ea9522dd83");
                    }else if (isHorror==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FHorror%2FThe-Return-of-the-Soul.pdf?alt=media&token=ff65f963-3a07-4a11-93ae-52bdad46d404");
                    }else if (isLitrerary==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FLiterraure%2FKeziah-Coffin.pdf?alt=media&token=74f0cb64-a4e8-4927-aa2f-97dbf0467048");
                    }else if (isScience==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FScience%2FLife-Sentence.pdf?alt=media&token=02c15631-b7f3-41cf-9ad7-dbf41c3e1731");
                    }
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.Recomended4:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    if (isRomance==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FRomance%2FThe-Black-Moth.pdf?alt=media&token=99457d49-b79d-41a8-8ea2-799e3be42077");
                    }else if (isAction==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FAction%2FCappy-Ricks.pdf?alt=media&token=84c0da2f-5f04-4b35-92e2-38e184cc06c6");
                    }else if (isMystery==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FMystery%2FHalf-hours-with-the-Highwaymen---Vol-1.pdf?alt=media&token=ce186593-9553-497b-a2e7-a840162d37d2");
                    }else if (isBiography==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FBiography%2FSmeaton-and-Lighthouses.pdf?alt=media&token=e1862c76-4ca0-4e2d-9849-1b7af6b509d3");
                    }else if (isChildred==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FChildrens%2FThe-Camp-Fire-Girls-at-School.pdf?alt=media&token=f6e4673e-dcf3-49c1-b16f-519943099bb8");
                    }else if (isYouth==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FYouth%2FAugustus-Carp-Esq..pdf?alt=media&token=90ffadba-92a9-4f5a-9130-b90453687038");
                    }else if (isFantasy==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FFantasy%2FThe-Phoenix-and-the-Carpet.pdf?alt=media&token=b5ef6a00-f32d-4a32-9c27-b1b81ff94b13");
                    }else if (isTaboo==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FTaboo%2FEve's-Diary.pdf?alt=media&token=3b8bf4d0-b310-4a83-8343-d24c7709e857");
                    }else if (isHistorical==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FHistorical%2FThe-Admirable-Crichton.pdf?alt=media&token=1cfc7957-bbd9-4aa8-a05f-56bd2b83a5e2");
                    }else if (isHorror==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FHorror%2FThe-Lame-Priest.pdf?alt=media&token=24b0bd3a-1405-4e7c-9431-6e3175edfb82");
                    }else if (isLitrerary==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FLiterraure%2FHermione-and-her-Little-Group-of-Serious-Thinkers.pdf?alt=media&token=8c19b2a4-a0a3-4a0e-b679-96eca85b80c9");
                    }else if (isScience==true){
                        ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FScience%2FWatchbird.pdf?alt=media&token=030b2609-9d6b-4546-b62a-917728e8a058");
                    }
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.seriescardimage1:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Series%2FHarry-potter-sorcerers-stone.pdf?alt=media&token=59d67827-801a-45ef-94c7-4e6908c3e67c");
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.seriescardimage2:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Series%2Fbook-2-j-k-rowling-harry-potter-and-the-chamber-of-secrets.pdf?alt=media&token=1d4562e8-0845-45c5-94e9-6a0b8e945b57");
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.seriescardimage3:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Series%2FHP_Book3_Chapter_Excerpt.pdf?alt=media&token=6c16130d-77d2-43c7-8f2f-3c391d679cd9");
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.seriescardimage4:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Series%2Fharry-potter-and-the-goblet-of-fire.pdf?alt=media&token=2ac7859a-7b20-421a-940e-1b5bdb5e95b5");
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
            case R.id.seriescardimage5:
                manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                info=manager.getActiveNetworkInfo();
                if (null!=info)
                {
                    ReaderActvity("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Series%2F5_-_harry_potter_and_the_order_of_the_phoenix_chapter_37.pdf?alt=media&token=f8cb3f29-2bf6-4ecf-8a9b-9d2788cb22b2");
                }else {
                    startActivity(new Intent(HomeActivity.this,no_internet_activity.class));
                }
                break;
        }

    }

    private void ReaderActvity(String loaction) {
        Intent bookintent=new Intent(HomeActivity.this,Reader.class);
        bookintent.putExtra("booklink",loaction);
        startActivity(bookintent);
    }

    /*private void Button13Clicked() {
        category1.setBackgroundColor(Color.parseColor("#E6E4E4"));
        category2.setBackgroundColor(Color.parseColor("#E6E4E4"));
        category3.setBackgroundColor(Color.parseColor("#E6E4E4"));
        category4.setBackgroundColor(Color.parseColor("#E6E4E4"));
        category5.setBackgroundColor(Color.parseColor("#E6E4E4"));
        category6.setBackgroundColor(Color.parseColor("#E6E4E4"));
        category7.setBackgroundColor(Color.parseColor("#E6E4E4"));
        category8.setBackgroundColor(Color.parseColor("#E6E4E4"));
        category9.setBackgroundColor(Color.parseColor("#E6E4E4"));
        category10.setBackgroundColor(Color.parseColor("#E6E4E4"));
        category11.setBackgroundColor(Color.parseColor("#E6E4E4"));
        category12.setBackgroundColor(Color.parseColor("#E6E4E4"));
        category13.setBackgroundColor(Color.parseColor("#5F9EA0"));
    }*/

    private void Button12Clicked() {
        category1.setBackgroundColor(Color.parseColor("#383838"));
        category2.setBackgroundColor(Color.parseColor("#383838"));
        category3.setBackgroundColor(Color.parseColor("#383838"));
        category4.setBackgroundColor(Color.parseColor("#383838"));
        category5.setBackgroundColor(Color.parseColor("#383838"));
        category6.setBackgroundColor(Color.parseColor("#383838"));
        category7.setBackgroundColor(Color.parseColor("#383838"));
        category8.setBackgroundColor(Color.parseColor("#383838"));
        category9.setBackgroundColor(Color.parseColor("#383838"));
        category10.setBackgroundColor(Color.parseColor("#383838"));
        category11.setBackgroundColor(Color.parseColor("#383838"));
        category12.setBackgroundColor(Color.parseColor("#000000"));
        isScience=true;
        isLitrerary=false;
        isHorror=false;
        isHistorical=false;
        isTaboo=false;
        isFantasy=false;
        isYouth=false;
        isChildred=false;
        isBiography=false;
        isMystery=false;
        isAction=false;
        isRomance=false;
        LoadSciencebook();
    }

    private void LoadSciencebook() {
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Science%2FBestSeller%2FThe%20Invisible%20Man.jpg?alt=media&token=ceb1fd59-c5ca-4e25-b703-110c96554a43")
                .into(bestSeller1);
        bestSellerTitle1.setText("The Invisible Man");
        bestSellerAuthor1.setText("H. G. Wells");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Science%2FBestSeller%2FThe%20War%20of%20the%20Worlds.jfif?alt=media&token=bf12810d-d514-4b2b-a313-2af3b84a0593")
                .into(bestSeller2);
        bestSellerTitle2.setText("The War of the Worlds");
        bestSellerAuthor2.setText("H. G. Wells");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Science%2FBestSeller%2FThe%20Mysterious%20Island.jpg?alt=media&token=a1c1888f-37f6-4806-afc9-13f56c862083")
                .into(bestSeller3);
        bestSellerTitle3.setText("The Mysterious Island");
        bestSellerAuthor3.setText("Jules Verne");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Science%2FBestSeller%2FAnthem.jfif?alt=media&token=d437cdd1-9581-4485-8089-715ea7b9b52b")
                .into(bestSeller4);
        bestSellerTitle4.setText("Anthem");
        bestSellerAuthor4.setText("Ayn Rand");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Science%2FBestSeller%2FA%20Princess%20of%20Mars.jfif?alt=media&token=9cf8824a-a62d-4397-80b0-9b42d785d712")
                .into(bestSeller5);
        bestSellerTitle5.setText("A Princess of Mars");
        bestSellerAuthor5.setText("Edgar Rice Burroughs");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Science%2FAuthor%2FFranklin%20Abel.jpg?alt=media&token=02d888b3-6461-40e9-a8bf-8991a35e1c64")
                .into(Author1);
        AuthorTitle1.setText("Freudian Slip");
        authorAuthor1.setText("Franklin Abel");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Science%2FAuthor%2FRobert%20Abernathy.jpg?alt=media&token=53c255a1-961e-42b6-9fb2-92f37a7d8ddd")
                .into(Author2);
        AuthorTitle2.setText("World of the Drone");
        authorAuthor2.setText("Robert Abernathy");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Science%2FAuthor%2FThe%20Rotifers.jpg?alt=media&token=c2ba3291-3db4-4b20-baea-f192742524e7")
                .into(Author3);
        AuthorTitle3.setText("The Rotifers");
        authorAuthor3.setText("Robert Abernathy");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Science%2FAuthor%2FWhen%20the%20Mountain%20Shook.jfif?alt=media&token=b513e30d-d22d-4ebd-8a27-d54d8d1e3304")
                .into(Author4);
        AuthorTitle4.setText("When the Mountain Shook");
        authorAuthor4.setText("Robert Abernathy");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Science%2FRecomended%2FThe%20Mind%20Like%20A%20Strange%20Balloon.jfif?alt=media&token=f42c881c-efc4-4110-a6b8-c61bd9c233a6")
                .into(Recomended1);
        RecomendedTitle1.setText("The Mind Like A Strange Balloon");
        RecomendedAuthor1.setText("Tom Maddox");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Science%2FRecomended%2FChildren%20of%20the%20Betsy%20B.jfif?alt=media&token=c36e35b3-f9a1-4d5b-adcf-7983c3115322")
                .into(Recomended2);
        RecomendedTitle2.setText("Children of the Betsy B");
        RecomendedAuthor2.setText("Malcolm Jameson");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Science%2FRecomended%2FLife%20Sentence.jpg?alt=media&token=e6bd3d29-a76c-4a7d-8bcf-0017df917bb8")
                .into(Recomended3);
        RecomendedTitle3.setText("Life Sentence");
        RecomendedAuthor3.setText("James V. McConnell");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Science%2FRecomended%2FWatchbird.jpg?alt=media&token=d7b9c9a4-6d35-4fcd-acf6-9405cd80e568")
                .into(Recomended4);
        RecomendedTitle4.setText("Watchbird");
        RecomendedAuthor4.setText("Robert Sheckley");
    }

    private void Button11Clicked() {
        category1.setBackgroundColor(Color.parseColor("#383838"));
        category2.setBackgroundColor(Color.parseColor("#383838"));
        category3.setBackgroundColor(Color.parseColor("#383838"));
        category4.setBackgroundColor(Color.parseColor("#383838"));
        category5.setBackgroundColor(Color.parseColor("#383838"));
        category6.setBackgroundColor(Color.parseColor("#383838"));
        category7.setBackgroundColor(Color.parseColor("#383838"));
        category8.setBackgroundColor(Color.parseColor("#383838"));
        category9.setBackgroundColor(Color.parseColor("#383838"));
        category10.setBackgroundColor(Color.parseColor("#383838"));
        category11.setBackgroundColor(Color.parseColor("#000000"));
        category12.setBackgroundColor(Color.parseColor("#383838"));
        isLitrerary=true;
        isHorror=false;
        isHistorical=false;
        isTaboo=false;
        isFantasy=false;
        isYouth=false;
        isChildred=false;
        isBiography=false;
        isMystery=false;
        isAction=false;
        isRomance=false;
        isScience=false;
         LiterraryBook();
    }

    private void LiterraryBook() {
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Literrary%2FBestSeller%2FThe%20Art%20of%20Public%20Speaking.jfif?alt=media&token=3ca50b17-6c4c-4f07-af21-a65e3637fd36")
                .into(bestSeller1);
        bestSellerTitle1.setText("The Art of Public Speaking");
        bestSellerAuthor1.setText("J. Berg Esenwein & Dale Carnegie");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Literrary%2FBestSeller%2FThe%20Grammar%20of%20English%20Grammars.jfif?alt=media&token=de2efc8b-a1c3-48a2-8a40-db8160fd4acf")
                .into(bestSeller2);
        bestSellerTitle2.setText("The Grammar of English Grammars");
        bestSellerAuthor2.setText("Goold Brown");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Literrary%2FBestSeller%2FLes%20Mis%C3%A9rables.jfif?alt=media&token=5a0a23c9-37e5-450b-9c63-36bce9b1173a")
                .into(bestSeller3);
        bestSellerTitle3.setText("Les Misérables");
        bestSellerAuthor3.setText("Victor Hugo");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Literrary%2FBestSeller%2FWuthering%20Heights.jfif?alt=media&token=54d144e7-7350-41a2-8171-e1c322ae2a99")
                .into(bestSeller4);
        bestSellerTitle4.setText("Wuthering Heights");
        bestSellerAuthor4.setText("Emily Brontë");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Literrary%2FBestSeller%2FSamlede%20V%C3%A6rker%2C%20Tredie%20Bind.jfif?alt=media&token=4c5c5575-ac1e-4a2d-a870-b083660c21f9")
                .into(bestSeller5);
        bestSellerTitle5.setText("Samlede Værker, Tredie Bind");
        bestSellerAuthor5.setText("Jeppe Aakjær");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Literrary%2FRecomended%2FLe%20rive%20della%20Bormida%20nel%201794.jfif?alt=media&token=eab8cc99-77ad-44f1-9544-445c39d6460c")
                .into(Author1);
        AuthorTitle1.setText("Le rive della Bormida nel 1794");
        authorAuthor1.setText("Giuseppe Cesare Abba");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Literrary%2FRecomended%2FStories%20in%20Verse.jfif?alt=media&token=25459346-8e91-4e57-b868-529cb0035a9d")
                .into(Author2);
        AuthorTitle2.setText("Stories in Verse");
        authorAuthor2.setText("Henry Abbey");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Literrary%2FRecomended%2FLaicus.jfif?alt=media&token=21757bdc-2b25-4baf-8ccc-88b056d057b6")
                .into(Author3);
        AuthorTitle3.setText("Laicus");
        authorAuthor3.setText("Lyman Abbott");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Literrary%2FRecomended%2FPhilochristus.jfif?alt=media&token=bc640668-8067-463b-ac0e-492e16cfac82")
                .into(Author4);
        AuthorTitle4.setText("Philochristus");
        authorAuthor4.setText("Edwin A. Abbott");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Literrary%2FAuthor%2FOnesimus.jpg?alt=media&token=6e328ab5-450b-4191-873d-4e64ae19afa7")
                .into(Recomended1);
        RecomendedTitle1.setText("Onesimus");
        RecomendedAuthor1.setText("Edwin A. Abbott");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Literrary%2FAuthor%2FSamantha%20Among%20the%20Brethren.jpeg?alt=media&token=2f072044-2f9a-4dc8-87d6-a8c718636efc")
                .into(Recomended2);
        RecomendedTitle2.setText("Samantha Among the Brethren");
        RecomendedAuthor2.setText("Marietta Holley");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Literrary%2FAuthor%2FKeziah%20Coffin.jpg?alt=media&token=ef1f16af-8de9-498b-9349-02720da7cf8e")
                .into(Recomended3);
        RecomendedTitle3.setText("Keziah Coffin");
        RecomendedAuthor3.setText("Joseph Crosby Lincoln");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Literrary%2FAuthor%2FHermione%20and%20her%20Little%20Group%20of%20Serious%20Thinkers.jpg?alt=media&token=772142e7-3b7b-4bdd-a487-273f630f2ca3")
                .into(Recomended4);
        RecomendedTitle4.setText("Hermione and her Little Group of Serious Thinkers");
        RecomendedAuthor4.setText("Don Marquis");
    }

    private void Button10Clicked() {
        category1.setBackgroundColor(Color.parseColor("#383838"));
        category2.setBackgroundColor(Color.parseColor("#383838"));
        category3.setBackgroundColor(Color.parseColor("#383838"));
        category4.setBackgroundColor(Color.parseColor("#383838"));
        category5.setBackgroundColor(Color.parseColor("#383838"));
        category6.setBackgroundColor(Color.parseColor("#383838"));
        category7.setBackgroundColor(Color.parseColor("#383838"));
        category8.setBackgroundColor(Color.parseColor("#383838"));
        category9.setBackgroundColor(Color.parseColor("#383838"));
        category10.setBackgroundColor(Color.parseColor("#000000"));
        category11.setBackgroundColor(Color.parseColor("#383838"));
        category12.setBackgroundColor(Color.parseColor("#383838"));
        isHorror=true;
        isHistorical=false;
        isTaboo=false;
        isFantasy=false;
        isYouth=false;
        isChildred=false;
        isBiography=false;
        isMystery=false;
        isAction=false;
        isRomance=false;
        isLitrerary=false;
        isScience=false;
        LoadHorrorBooks();
    }

    private void LoadHorrorBooks() {
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Horror%2FBestSeller%2FThe%20Call%20of%20Cthulhu.jpg?alt=media&token=fa26b808-4aa1-4819-87ef-80d780376ef9")
                .into(bestSeller1);
        bestSellerTitle1.setText("The Call of Cthulhu");
        bestSellerAuthor1.setText("H. P. Lovecraft");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Horror%2FBestSeller%2FAt%20the%20Mountains%20of%20Madness.jfif?alt=media&token=2b3688ed-966d-4617-a17e-5d3ac43c9347")
                .into(bestSeller2);
        bestSellerTitle2.setText("At the Mountains of Madness");
        bestSellerAuthor2.setText("H. P. Lovecraft");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Horror%2FBestSeller%2FThe%20Best%20Ghost%20Stories.jpg?alt=media&token=b204a7bb-020c-4cdc-9802-9d9cdd69f947")
                .into(bestSeller3);
        bestSellerTitle3.setText("The Best Ghost Stories");
        bestSellerAuthor3.setText("Many Authors");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Horror%2FBestSeller%2FDracula.jfif?alt=media&token=9e7494c9-f668-4101-a906-86510884942e")
                .into(bestSeller4);
        bestSellerTitle4.setText("Dracula");
        bestSellerAuthor4.setText("Bram Stoker");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Horror%2FBestSeller%2FThe%20Phantom%20of%20the%20Opera.jpg?alt=media&token=f8516457-20ab-48e5-a371-6fb44ca82c77")
                .into(bestSeller5);
        bestSellerTitle5.setText("The Phantom of the Opera");
        bestSellerAuthor5.setText("Gaston Leroux");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Horror%2FAuthor%2FAuriol.jpg?alt=media&token=990c7edd-00eb-4514-bae9-78d2dc16f63e")
                .into(Author1);
        AuthorTitle1.setText("Auriol");
        authorAuthor1.setText("William Harrison Ainsworth");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Horror%2FAuthor%2FPauline's%20Passion%20and%20Punishment.jpg?alt=media&token=a6d51094-3e46-4d1a-9ae5-cb38937d0331")
                .into(Author2);
        AuthorTitle2.setText("Pauline's Passion and Punishment");
        authorAuthor2.setText("Louisa May Alcott");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Horror%2FAuthor%2FThe%20Beckoning%20Hand%20and%20Other%20Stories.jfif?alt=media&token=1a0bbfad-3653-488b-acfd-86840df90627")
                .into(Author3);
        AuthorTitle3.setText("The Beckoning Hand and Other Stories");
        authorAuthor3.setText("Grant Allen");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Horror%2FAuthor%2FRing%20Once%20for%20Death.jpg?alt=media&token=0d7ff3d3-8ccd-4804-85b9-18805a2d77a0")
                .into(Author4);
        AuthorTitle4.setText("Ring Once for Death");
        authorAuthor4.setText("Robert Arthur");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Horror%2FRecomended%2FUnspecialist.jpg?alt=media&token=3441ba36-1017-47ab-bc8a-22988bc27cb9")
                .into(Recomended1);
        RecomendedTitle1.setText("Unspecialist");
        RecomendedAuthor1.setText("Murray F. Yaco");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Horror%2FRecomended%2FKnock%2C%20Knock%2C%20Knock%20and%20Other%20Stories.jpg?alt=media&token=244d8cc2-4779-4492-ac19-d1507aab52da")
                .into(Recomended2);
        RecomendedTitle2.setText("Knock, Knock, Knock and Other Stories");
        RecomendedAuthor2.setText("Ivan Sergeevich Turgenev");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Horror%2FRecomended%2FThe%20Return%20of%20the%20Soul.jpg?alt=media&token=5e5b9ff5-b334-41ce-8235-48e32f6bc927")
                .into(Recomended3);
        RecomendedTitle3.setText("The Return of the Soul");
        RecomendedAuthor3.setText("Robert Smythe Hichens");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Horror%2FRecomended%2FThe%20Lame%20Priest.jfif?alt=media&token=76ba1fca-b8bc-453b-8363-5fcdbec007d6")
                .into(Recomended4);
        RecomendedTitle4.setText("The Lame Priest");
        RecomendedAuthor4.setText("Susan Morrow Jones");
    }

    private void Button9Clicked() {
        category1.setBackgroundColor(Color.parseColor("#383838"));
        category2.setBackgroundColor(Color.parseColor("#383838"));
        category3.setBackgroundColor(Color.parseColor("#383838"));
        category4.setBackgroundColor(Color.parseColor("#383838"));
        category5.setBackgroundColor(Color.parseColor("#383838"));
        category6.setBackgroundColor(Color.parseColor("#383838"));
        category7.setBackgroundColor(Color.parseColor("#383838"));
        category8.setBackgroundColor(Color.parseColor("#383838"));
        category9.setBackgroundColor(Color.parseColor("#000000"));
        category10.setBackgroundColor(Color.parseColor("#383838"));
        category11.setBackgroundColor(Color.parseColor("#383838"));
        category12.setBackgroundColor(Color.parseColor("#383838"));
        isHistorical=true;
        isTaboo=false;
        isFantasy=false;
        isYouth=false;
        isChildred=false;
        isBiography=false;
        isMystery=false;
        isAction=false;
        isRomance=false;
        isHorror=false;
        isLitrerary=false;
        isScience=false;
        LoadHistoricalBook();
    }

    private void LoadHistoricalBook() {
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Historical%2FBestSeller%2FMacbeth.jfif?alt=media&token=d92305d9-d2fc-4a86-90ba-2b4bb89dcabe")
                .into(bestSeller1);
        bestSellerTitle1.setText("Macbeth");
        bestSellerAuthor1.setText("William Shakespeare");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Historical%2FBestSeller%2FAll%20For%20Love.jpg?alt=media&token=7a90f65f-e464-474c-89c9-3a54ec528437")
                .into(bestSeller2);
        bestSellerTitle2.setText("All For Love");
        bestSellerAuthor2.setText("John Dryden");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Historical%2FBestSeller%2FPygmalion.jfif?alt=media&token=b5dd2a70-8663-4e02-9bef-62f89b72bcd9")
                .into(bestSeller3);
        bestSellerTitle3.setText("Pygmalion");
        bestSellerAuthor3.setText("George Bernard Shaw");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Historical%2FBestSeller%2FKing%20Lear.jfif?alt=media&token=5168ea2b-0137-45c9-8350-43b10637a690")
                .into(bestSeller4);
        bestSellerTitle4.setText("King Lear");
        bestSellerAuthor4.setText("William Shakespeare");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Historical%2FBestSeller%2FRiders%20to%20the%20Sea.jfif?alt=media&token=d20befef-87c7-4285-8e3c-773042056865")
                .into(bestSeller5);
        bestSellerTitle5.setText("Riders to the Sea");
        bestSellerAuthor5.setText("J. M. Synge");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Historical%2FAuthor%2F%CE%A0%CE%AD%CF%81%CF%83%CE%B1%CE%B9.jfif?alt=media&token=065d8067-8d5c-4256-a50e-368b399e6aba")
                .into(Author1);
        AuthorTitle1.setText("Πέρσαι");
        authorAuthor1.setText("Aeschylus");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Historical%2FAuthor%2FThe%20'Mind%20the%20Paint'%20Girl.jfif?alt=media&token=9529e97d-1bb6-4dc0-be2e-173eb82132bd")
                .into(Author2);
        AuthorTitle2.setText("The 'Mind the Paint' Girl");
        authorAuthor2.setText("Arthur Wing Pinero");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Historical%2FAuthor%2FArms%20and%20the%20Man.jfif?alt=media&token=07511adb-9257-4e8b-8c5f-d3779e19a21b")
                .into(Author3);
        AuthorTitle3.setText("Arms and the Man");
        authorAuthor3.setText("George Bernard Shaw");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Historical%2FAuthor%2FThe%20Duchess%20of%20Malfi.jfif?alt=media&token=b2f1dc95-69a6-4900-bedb-64904340c634")
                .into(Author4);
        AuthorTitle4.setText("The Duchess of Malfi");
        authorAuthor4.setText("John Webster");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Historical%2FRecomended%2FThe%20Taming%20of%20the%20Shrew.jfif?alt=media&token=b4142489-1667-4afa-9e32-3a3a34f632ef")
                .into(Recomended1);
        RecomendedTitle1.setText("The Taming of the Shrew");
        RecomendedAuthor1.setText("William Shakespeare");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Historical%2FRecomended%2FFaust.jfif?alt=media&token=8e7517b5-725d-44e8-95f3-91742b7fff3a")
                .into(Recomended2);
        RecomendedTitle2.setText("Faust");
        RecomendedAuthor2.setText("Johann Wolfgang von Goethe");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Historical%2FRecomended%2FA%20Doll's%20House.jfif?alt=media&token=8a572495-ad4d-405a-981a-187e6d9ef0f1")
                .into(Recomended3);
        RecomendedTitle3.setText("A Doll's House");
        RecomendedAuthor3.setText("Henrik Ibsen");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Historical%2FRecomended%2FThe%20Admirable%20Crichton.jfif?alt=media&token=5d3c9d5f-f153-4a63-89b9-91bf378b926a")
                .into(Recomended4);
        RecomendedTitle4.setText("The Admirable Crichton");
        RecomendedAuthor4.setText("J. M. Barrie");

    }

    private void Button8Clicked() {
        category1.setBackgroundColor(Color.parseColor("#383838"));
        category2.setBackgroundColor(Color.parseColor("#383838"));
        category3.setBackgroundColor(Color.parseColor("#383838"));
        category4.setBackgroundColor(Color.parseColor("#383838"));
        category5.setBackgroundColor(Color.parseColor("#383838"));
        category6.setBackgroundColor(Color.parseColor("#383838"));
        category7.setBackgroundColor(Color.parseColor("#383838"));
        category8.setBackgroundColor(Color.parseColor("#000000"));
        category9.setBackgroundColor(Color.parseColor("#383838"));
        category10.setBackgroundColor(Color.parseColor("#383838"));
        category11.setBackgroundColor(Color.parseColor("#383838"));
        category12.setBackgroundColor(Color.parseColor("#383838"));
        isTaboo=true;
        isFantasy=false;
        isYouth=false;
        isChildred=false;
        isBiography=false;
        isMystery=false;
        isAction=false;
        isRomance=false;
         isHistorical=false;
        isHorror=false;
         isLitrerary=false;
         isScience=false;
        LoadTabooBook();
    }

    private void LoadTabooBook() {
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Taboo%2FBestSeller%2FThe%20Age%20of%20Reason.jfif?alt=media&token=f427acf6-1006-4072-9513-fbd3f82bee67")
                .into(bestSeller1);
        bestSellerTitle1.setText("The Age of Reason");
        bestSellerAuthor1.setText("D. J. Medley");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Taboo%2FBestSeller%2FUlysses.jfif?alt=media&token=f8f850ad-a2cf-4f41-8a5b-b095c9e66e0b")
                .into(bestSeller2);
        bestSellerTitle2.setText("Ulysses");
        bestSellerAuthor2.setText("James Joyce");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Taboo%2FBestSeller%2FThe%20Analects%20of%20Confucius.jfif?alt=media&token=d795812d-0c73-4ee1-9eb4-def89fbe4c7b")
                .into(bestSeller3);
        bestSellerTitle3.setText("The Analects of Confucius");
        bestSellerAuthor3.setText("Confucius");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Taboo%2FBestSeller%2FTen%20Days%20That%20Shook%20the%20World.jfif?alt=media&token=bd9c8576-a9e1-4a0e-94e9-a06bc1aa2942")
                .into(bestSeller4);
        bestSellerTitle4.setText("Ten Days That Shook the World");
        bestSellerAuthor4.setText("John Reed");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Taboo%2FBestSeller%2FCandide.jfif?alt=media&token=cfe7dcf3-22d4-4092-8f01-03dd438548a0")
                .into(bestSeller5);
        bestSellerTitle5.setText("Candide");
        bestSellerAuthor5.setText("Voltaire");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Taboo%2FAuthor%2FThe%20Confessions.jpg?alt=media&token=ba0747a3-f0bd-480f-92b6-9c115b4c1329")
                .into(Author1);
        AuthorTitle1.setText("The Confessions");
        authorAuthor1.setText("Jean-Jacques Rousseau");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Taboo%2FAuthor%2FThe%20Kingdom%20of%20God%20Is%20Within%20You.jpg?alt=media&token=1f67d122-52a3-4fd8-a36f-cc0e671fbcbc")
                .into(Author2);
        AuthorTitle2.setText("The Kingdom of God Is Within You");
        authorAuthor2.setText("Leo Nikoleyevich Tolstoy");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Taboo%2FAuthor%2FThe%20Decameron%20of%20Giovanni%20Boccaccio.jpg?alt=media&token=24d8b1a9-6551-492d-bbc2-149cc919af81")
                .into(Author3);
        AuthorTitle3.setText("The Decameron of Giovanni Boccaccio");
        authorAuthor3.setText("Giovanni Boccaccio");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Taboo%2FAuthor%2FMoll%20Flanders.jpg?alt=media&token=64899931-440d-41fa-bb3c-beadd4d2ffe0")
                .into(Author4);
        AuthorTitle4.setText("Moll Flanders");
        authorAuthor4.setText("Daniel Defoe");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Taboo%2FRecomended%2FOn%20the%20Duty%20of%20Civil%20Disobedience.jfif?alt=media&token=d5beb645-c9b5-4ab1-922b-4d22a2719b50")
                .into(Recomended1);
        RecomendedTitle1.setText("On the Duty of Civil Disobedience");
        RecomendedAuthor1.setText("Henry David Thoreau");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Taboo%2FRecomended%2FLeaves%20of%20Grass.jpg?alt=media&token=9e1401c4-ed31-43d7-9ebc-0caf307192e6")
                .into(Recomended2);
        RecomendedTitle2.setText("Leaves of Grass");
        RecomendedAuthor2.setText("Walt Whitman");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Taboo%2FRecomended%2FSilas%20Marner.jpg?alt=media&token=84b1e094-e8ba-4bc5-acbc-7b60b33f8e9b")
                .into(Recomended3);
        RecomendedTitle3.setText("Silas Marner");
        RecomendedAuthor3.setText("George Eliot");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Taboo%2FRecomended%2FEve's%20Diary.jfif?alt=media&token=54f94970-9a68-4911-8073-87ec0bc576aa")
                .into(Recomended4);
        RecomendedTitle4.setText("Eve's Diary");
        RecomendedAuthor4.setText("Mark Twain");
    }

    private void Button7Clicked() {
        category1.setBackgroundColor(Color.parseColor("#383838"));
        category2.setBackgroundColor(Color.parseColor("#383838"));
        category3.setBackgroundColor(Color.parseColor("#383838"));
        category4.setBackgroundColor(Color.parseColor("#383838"));
        category5.setBackgroundColor(Color.parseColor("#383838"));
        category6.setBackgroundColor(Color.parseColor("#383838"));
        category7.setBackgroundColor(Color.parseColor("#000000"));
        category8.setBackgroundColor(Color.parseColor("#383838"));
        category9.setBackgroundColor(Color.parseColor("#383838"));
        category10.setBackgroundColor(Color.parseColor("#383838"));
        category11.setBackgroundColor(Color.parseColor("#383838"));
        category12.setBackgroundColor(Color.parseColor("#383838"));
        isFantasy=true;
        isYouth=false;
        isChildred=false;
        isBiography=false;
        isMystery=false;
        isAction=false;
        isRomance=false;
        isTaboo=false;
        isHistorical=false;
        isHorror=false;
        isLitrerary=false;
        isScience=false;
        LoadFantasyImage();
    }

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

    private void LoadFantasyImage() {
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Fantasy%2FBestSeller%2Fthe%20arabian%20nights.jfif?alt=media&token=eafb6d67-3567-4933-b2c4-cf934b356a4a")
                .into(bestSeller1);
        bestSellerTitle1.setText("the arabian nights");
        bestSellerAuthor1.setText("andrew lang");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Fantasy%2FBestSeller%2Fthe%20time%20machine.jfif?alt=media&token=a315396c-ad67-4d4e-b3ec-fef988114b1f")
                .into(bestSeller2);
        bestSellerTitle2.setText("The Time Machine");
        bestSellerAuthor2.setText("H. G. Wells");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Fantasy%2FBestSeller%2FThe%20Demon%20Girl.jfif?alt=media&token=09393584-c737-4738-8f99-50f6dab8c489")
                .into(bestSeller3);
        bestSellerTitle3.setText("The Demon Girl");
        bestSellerAuthor3.setText("Penelope Fletcher");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Fantasy%2FBestSeller%2FAladdin%20and%20the%20Magic%20Lamp.jfif?alt=media&token=bc8b8760-44ba-48fa-823a-5411b8e3b9b8")
                .into(bestSeller4);
        bestSellerTitle4.setText("Aladdin and the Magic Lamp");
        bestSellerAuthor4.setText("Unknown");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Fantasy%2FBestSeller%2FGulliver's%20Travels.jfif?alt=media&token=4eadadb5-6602-4c98-bc7a-c037895c0d66")
                .into(bestSeller5);
        bestSellerTitle5.setText("Gulliver's Travels");
        bestSellerAuthor5.setText("Jonathan Swift");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Fantasy%2FAuthor%2FThe%20Candy%20Country.jpg?alt=media&token=e01dd7cb-b5f5-414c-9000-7214ebe91d05")
                .into(Author1);
        AuthorTitle1.setText("The Candy Country");
        authorAuthor1.setText("Louisa May Alcott");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Fantasy%2FAuthor%2FFlower%20Fables.jpg?alt=media&token=9c3748cc-b61d-438d-8ea9-c7a36d8f9086")
                .into(Author2);
        AuthorTitle2.setText("Flower Fables");
        authorAuthor2.setText("Louisa May Alcott");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Fantasy%2FAuthor%2Fgallowglass.jpg?alt=media&token=23da6644-8f93-4a1c-9d44-cf7801dc2986")
                .into(Author3);
        AuthorTitle3.setText("Gallowglass");
        authorAuthor3.setText("Jennifer Allis Provost");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Fantasy%2FAuthor%2FHis%20Robot%20Girlfriend.jpg?alt=media&token=ca2659b6-995c-4420-872c-21a74624c7ff")
                .into(Author4);
        AuthorTitle4.setText("His Robot Girlfriend");
        authorAuthor4.setText("Wesley Allison");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Fantasy%2FRecomended%2FThe%20Five%20Jars.jpg?alt=media&token=dcae11e6-a817-43cf-9f9a-0dc7c354ddc9")
                .into(Recomended1);
        RecomendedTitle1.setText("The Five Jars");
        RecomendedAuthor1.setText("Montague Rhodes James");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Fantasy%2FRecomended%2FThe%20House%20Of%20Arden.jpg?alt=media&token=5b0866a8-80b4-4b72-83b4-a95f9a1a29fb")
                .into(Recomended2);
        RecomendedTitle2.setText("The House Of Arden");
        RecomendedAuthor2.setText("E. Nesbit");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Fantasy%2FRecomended%2FBeauty%20and%20the%20Beast.jpg?alt=media&token=7a0e20d3-e7f6-4bd7-a765-33675e6abcb0")
                .into(Recomended3);
        RecomendedTitle3.setText("Beauty and the Beast");
        RecomendedAuthor3.setText("Unknown");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Fantasy%2FRecomended%2FThe%20Phoenix%20and%20the%20Carpet.jpg?alt=media&token=5aa20a97-60e3-4657-b77a-31daec2860c9")
                .into(Recomended4);
        RecomendedTitle4.setText("The Phoenix and the Carpet");
        RecomendedAuthor4.setText("E. Nesbit");
    }

    private void Button6Clicked() {
        category1.setBackgroundColor(Color.parseColor("#383838"));
        category2.setBackgroundColor(Color.parseColor("#383838"));
        category3.setBackgroundColor(Color.parseColor("#383838"));
        category4.setBackgroundColor(Color.parseColor("#383838"));
        category5.setBackgroundColor(Color.parseColor("#383838"));
        category6.setBackgroundColor(Color.parseColor("#000000"));
        category7.setBackgroundColor(Color.parseColor("#383838"));
        category8.setBackgroundColor(Color.parseColor("#383838"));
        category9.setBackgroundColor(Color.parseColor("#383838"));
        category10.setBackgroundColor(Color.parseColor("#383838"));
        category11.setBackgroundColor(Color.parseColor("#383838"));
        category12.setBackgroundColor(Color.parseColor("#383838"));
        isYouth=true;
        isChildred=false;
        isBiography=false;
        isMystery=false;
        isAction=false;
        isRomance=false;
        isFantasy=false;
        isTaboo=false;
        isHistorical=false;
        isHorror=false;
        isLitrerary=false;
        isScience=false;
        LoadYouthBook();
    }

    private void LoadYouthBook() {
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Youth%2FBestSeller%2FThe%20%2430%2C000%20Bequest.jpg?alt=media&token=76b0455e-2ef8-4755-b04d-fafefd558212")
                .into(bestSeller1);
        bestSellerTitle1.setText("The $30,000 Bequest");
        bestSellerAuthor1.setText("Mark Twain");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Youth%2FBestSeller%2FThe%20Communist%20Manifesto.jpg?alt=media&token=a6faa77c-3227-4297-9ba3-4b4b1107f6cb")
                .into(bestSeller2);
        bestSellerTitle2.setText("The Communist Manifesto");
        bestSellerAuthor2.setText("Karl Marx & Frederick Engels");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Youth%2FBestSeller%2FHamlet.jpg?alt=media&token=68fb5e6a-8401-4c7f-9dc8-668e10d32a96")
                .into(bestSeller3);
        bestSellerTitle3.setText("Hamlet");
        bestSellerAuthor3.setText("William Shakespeare");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Youth%2FBestSeller%2FThe%20''Genius''.jpg?alt=media&token=bbe901bf-c673-473e-9f02-ce032c3a6a88")
                .into(bestSeller4);
        bestSellerTitle4.setText("The ''Genius'' ");
        bestSellerAuthor4.setText("Theodore Dreiser");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Youth%2FBestSeller%2FThe%20Bhagavad-Gita.jpg?alt=media&token=547b4916-387b-4bd8-b715-42ff71bd138d")
                .into(bestSeller5);
        bestSellerTitle5.setText("The Bhagavad-Gita");
        bestSellerAuthor5.setText("Lord Krishna");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Youth%2FAuthor%2FCato.jpg?alt=media&token=ace34242-0f91-4714-8145-0ada7a72e683")
                .into(Author1);
        AuthorTitle1.setText("Cato");
        authorAuthor1.setText("Joseph Addison");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Youth%2FAuthor%2FSuppliant%20Maidens%20and%20Other%20Plays.jpg?alt=media&token=9136105e-54ff-4bcb-9c9a-d41c2804dfe6")
                .into(Author2);
        AuthorTitle2.setText("Suppliant Maidens and Other Plays");
        authorAuthor2.setText("Aeschylus");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Youth%2FAuthor%2FThe%20Comedies%20of%20Terence.jpg?alt=media&token=bf1079ae-ca25-4232-903e-763e7d113dcc")
                .into(Author3);
        AuthorTitle3.setText("The Comedies of Terence");
        authorAuthor3.setText("Publius Terentius Afer");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Youth%2FAuthor%2FThe%20British%20Barbarians.jpg?alt=media&token=ecde6f3c-17ba-4e6f-9e5a-15afd63a4795")
                .into(Author4);
        AuthorTitle4.setText("The British Barbarians");
        authorAuthor4.setText("Grant Allen");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Youth%2FRecomended%2FGinx's%20Baby.jpg?alt=media&token=d84c3478-7672-41b9-92df-40feacc0e230")
                .into(Recomended1);
        RecomendedTitle1.setText("Ginx's Baby");
        RecomendedAuthor1.setText("Edward Jenkins");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Youth%2FRecomended%2FSavva%20and%20The%20Life%20of%20Man.jpg?alt=media&token=69b778ac-6f32-49d3-83f6-b383bf30977e")
                .into(Recomended2);
        RecomendedTitle2.setText("Savva and The Life of Man");
        RecomendedAuthor2.setText("Leonid Andreyev");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Youth%2FRecomended%2FDanny's%20Own%20Story.jpg?alt=media&token=d5f95b08-1620-4519-9ba0-8711f4492036")
                .into(Recomended3);
        RecomendedTitle3.setText("Danny's Own Story");
        RecomendedAuthor3.setText("Don Marquis");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Youth%2FRecomended%2FAugustus%20Carp%2C%20Esq..jpg?alt=media&token=22b2432d-051b-42ae-ac0f-145d0f2da73f")
                .into(Recomended4);
        RecomendedTitle4.setText("Augustus Carp, Esq.");
        RecomendedAuthor4.setText("Henry Howarth Bashford");
    }


    private void Button1Clicked() {
        category1.setBackgroundColor(Color.parseColor("#000000"));
        category2.setBackgroundColor(Color.parseColor("#383838"));
        category3.setBackgroundColor(Color.parseColor("#383838"));
        category4.setBackgroundColor(Color.parseColor("#383838"));
        category5.setBackgroundColor(Color.parseColor("#383838"));
        category6.setBackgroundColor(Color.parseColor("#383838"));
        category7.setBackgroundColor(Color.parseColor("#383838"));
        category8.setBackgroundColor(Color.parseColor("#383838"));
        category9.setBackgroundColor(Color.parseColor("#383838"));
        category10.setBackgroundColor(Color.parseColor("#383838"));
        category11.setBackgroundColor(Color.parseColor("#383838"));
        category12.setBackgroundColor(Color.parseColor("#383838"));
        isRomance=true;
        isAction=false;
        isMystery=false;
        isBiography=false;
         isChildred=false;
        isFantasy=false;
        isTaboo=false;
        isHistorical=false;
        isHorror=false;
        isLitrerary=false;
        isScience=false;
        LoadRomaceImages();
    }

    private void ShowMessage() {
        final AlertDialog.Builder alert= new AlertDialog.Builder(HomeActivity.this);
        View mview=getLayoutInflater().inflate(R.layout.start_message,null);
        alert.setView(mview);
        final AlertDialog alertDialog=alert.create();
        alertDialog.setCanceledOnTouchOutside(true);
        alertDialog.show();
        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart", false);
        editor.apply();
    }

    private void LoadRomaceImages() {
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FPride%26Prejudice.jpg?alt=media&token=1bc41a85-38c4-4ca3-a463-698e2b70f5a5")
                .into(bestSeller1);
        bestSellerTitle1.setText("Pride & Prejudice");
        bestSellerAuthor1.setText("Jane Austen");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FHealingHerHeart.jpg?alt=media&token=128254b0-26aa-4a64-bf72-4e587a40320a")
                .into(bestSeller2);
        bestSellerTitle2.setText("Healing Her Heart");
        bestSellerAuthor2.setText("Laura Scott");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FPersuasion.jpg?alt=media&token=c5742f59-f577-47e3-86d0-19b20e465566")
                .into(bestSeller3);
        bestSellerTitle3.setText("Persuasion");
        bestSellerAuthor3.setText("Jane Austen");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FJane%20Eyre.jpg?alt=media&token=a729d6ac-ef0c-4343-baff-ed2d8588ed78")
                .into(bestSeller4);
        bestSellerTitle4.setText("Jane Eyre");
        bestSellerAuthor4.setText("Charlotte Brontë");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FAnna%20Karenina.jpg?alt=media&token=045553da-90b9-4d46-96a3-8ae76111f782")
                .into(bestSeller5);
        bestSellerTitle5.setText("Anna Karenina");
        bestSellerAuthor5.setText("graf Tolstoy Leo");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FAuthor%2FHappy%20House.jpg?alt=media&token=9ad5145b-f5dc-436d-8508-3fc81d65f459")
                .into(Author1);
        AuthorTitle1.setText("Happy House");
        authorAuthor1.setText("Jane Abbott");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FAuthor%2FJohn.jpg?alt=media&token=5b25e101-0fdf-4f16-9709-c02d7d8bbe1b")
                .into(Author2);
        AuthorTitle2.setText("John Henry Smith");
        authorAuthor2.setText("Frederick Upham Adams");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FAuthor%2FThe%20Unspeakable%20Perk.jpg?alt=media&token=07228310-8c93-4bfc-a637-305004566c33")
                .into(Author3);
        AuthorTitle3.setText("The Unspeakable Perk");
        authorAuthor3.setText("Samuel Hopkins Adams");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FAuthor%2FMiss%20Cayley's%20Adventures.jpg?alt=media&token=c355af39-28ed-41df-89c0-13213838277e")
                .into(Author4);
        AuthorTitle4.setText("Miss Cayley's Adventure");
        authorAuthor4.setText("Grant Allen");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FRecomended%2FPatricia%20Brent%2C%20Spinster.jpg?alt=media&token=b03c26b5-bbcc-44ec-bfc5-ee4fef1f08ed")
                .into(Recomended1);
        RecomendedTitle1.setText("Patricia Brent, Spinster");
        RecomendedAuthor1.setText("Helbert George Jenkins");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FRecomended%2FThe%20Grand%20Babylon%20Hotel.jpg?alt=media&token=a9f43095-326e-4289-bb61-c0c74ad6ff0f")
                .into(Recomended2);
        RecomendedTitle2.setText("The Grand Babylon Hotel");
        RecomendedAuthor2.setText("Arnold Bennett");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FRecomended%2FA%20Connecticut%20Yankee%20in%20King%20Arthur's%20Court.jpg?alt=media&token=8de28eb0-b4b6-464e-894b-0c399f2ebab6")
                .into(Recomended3);
        RecomendedTitle3.setText("A Connecticut Yankke in King Arthur's Court");
        RecomendedAuthor3.setText("Mark Twain");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FRecomended%2FThe%20Black%20Moth.jpg?alt=media&token=1d73c017-b5e8-4aa5-8fd8-b9e683cb1028")
                .into(Recomended4);
        RecomendedTitle4.setText("The Black Moth");
        RecomendedAuthor4.setText("Georgette Heyer");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Series%2Fhp1.jpg?alt=media&token=81c61ec8-36b3-431b-a92d-c6d74f702b03")
                .into(Series1);
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Series%2Fhp2.jpg?alt=media&token=6b9584f8-e9c4-42b0-b4b2-beda956b0931")
                .into(Series2);
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Series%2Fhp3.jfif?alt=media&token=18a8c43c-1ebb-4b22-a608-98af267bd1ab")
                .into(Series3);
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Series%2Fhp4.jpg?alt=media&token=8b58f55f-6925-473b-b617-17ac6c27f191")
                .into(Series4);
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Series%2Fhp5.jpg?alt=media&token=8cabfc28-b92f-40d2-b8b3-3115af5c4a8a")
                .into(Series5);
    }


    private void Button2Clicked() {
        category1.setBackgroundColor(Color.parseColor("#383838"));
        category2.setBackgroundColor(Color.parseColor("#000000"));
        category3.setBackgroundColor(Color.parseColor("#383838"));
        category4.setBackgroundColor(Color.parseColor("#383838"));
        category5.setBackgroundColor(Color.parseColor("#383838"));
        category6.setBackgroundColor(Color.parseColor("#383838"));
        category7.setBackgroundColor(Color.parseColor("#383838"));
        category8.setBackgroundColor(Color.parseColor("#383838"));
        category9.setBackgroundColor(Color.parseColor("#383838"));
        category10.setBackgroundColor(Color.parseColor("#383838"));
        category11.setBackgroundColor(Color.parseColor("#383838"));
        category12.setBackgroundColor(Color.parseColor("#383838"));
        LoadActionImages();
        isAction=true;
        isRomance=false;
        isMystery=false;
        isBiography=false;
        isChildred=false;
        isYouth=false;
        isFantasy=false;
        isHistorical=false;
        isHorror=false;
        isLitrerary=false;
        isScience=false;
    }

    private void LoadActionImages() {
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Action%2F20%2C000%20Leagues%20Under%20the%20Sea.jpg?alt=media&token=b3cc22d9-1b69-45e9-b0ba-ac9740129ea8")
                .into(bestSeller1);
        bestSellerTitle1.setText("20,000 Leagues Under the Sea");
        bestSellerAuthor1.setText("Jules Verne");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Action%2FThe%20Count%20of%20Monte%20Cristo.jpg?alt=media&token=5ac6eb11-1a6f-470d-b8a7-48d474cca7b1")
                .into(bestSeller2);
        bestSellerTitle2.setText("The Count of Monte Cristo");
        bestSellerAuthor2.setText("Alexandre Dumas");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Action%2FAdventures%20of%20Huckleberry%20Finn.jpg?alt=media&token=df280bd3-de05-4ef2-b991-45620614c8eb")
                .into(bestSeller3);
        bestSellerTitle3.setText("Adventures of Huckleberry Finn");
        bestSellerAuthor3.setText("Mark Twain");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Action%2FThe%20Call%20of%20the%20Wild.jpg?alt=media&token=1e6499e2-87c2-4bbd-8f47-589a94160453")
                .into(bestSeller4);
        bestSellerTitle4.setText("The Call of the Wild ");
        bestSellerAuthor4.setText("Jack London");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Action%2FTween%20Snow%20and%20Fire.jpg?alt=media&token=01d198df-ff93-45bd-a6a3-57f8d72b7832")
                .into(bestSeller5);
        bestSellerTitle5.setText("Tween Snow and Fire");
        bestSellerAuthor5.setText("Bertram Mitford");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Action%2FAuthor%2FRadio%20Boys%20Cronies.jpg?alt=media&token=166420d5-5219-4e75-9ec4-551f3ed72e6d")
                .into(Author1);
        AuthorTitle1.setText("Radio Boys Cronies");
        authorAuthor1.setText("Wayne Whipple");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Action%2FAuthor%2FKeineth.jpg?alt=media&token=50a53d8c-5845-4364-aede-eb0b0692fbf3")
                .into(Author2);
        AuthorTitle2.setText("Keineth");
        authorAuthor2.setText("Jane Abbott");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Action%2FAuthor%2FRollo%20in%20Switzerland.jpg?alt=media&token=adf36b5d-1c9b-433a-9d62-e9f0a52bf094")
                .into(Author3);
        AuthorTitle3.setText("Rollo in Switzerland");
        authorAuthor3.setText("Jacob Abbott");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Action%2FAuthor%2FDavid%20Crockett.jpg?alt=media&token=6634ab0d-e5f4-4a47-a721-07761398f3c5")
                .into(Author4);
        AuthorTitle4.setText("David Crockett");
        authorAuthor4.setText("John S. C. Abbott");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Action%2FRecomended%2FTom%20Swift%20and%20His%20Motor-Cycle.jpg?alt=media&token=1499cd38-16d2-4047-b33d-959300fae7be")
                .into(Recomended1);
        RecomendedTitle1.setText("Tom Swift and His Motor-Cycle");
        RecomendedAuthor1.setText("Howard R. Garis");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Action%2FRecomended%2FIsmailia.jpg?alt=media&token=26c0ff05-e389-4d82-b601-31d0eedff59a")
                .into(Recomended2);
        RecomendedTitle2.setText("Ismailia");
        RecomendedAuthor2.setText("Samuel White Baker");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Romance%2FRecomended%2FA%20Connecticut%20Yankee%20in%20King%20Arthur's%20Court.jpg?alt=media&token=8de28eb0-b4b6-464e-894b-0c399f2ebab6")
                .into(Recomended3);
        RecomendedTitle3.setText("The Moon Endureth");
        RecomendedAuthor3.setText("John Buchan");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Action%2FRecomended%2FCappy%20Ricks.jpg?alt=media&token=386cd6a2-5407-4b8e-9743-9b56f402a9c7")
                .into(Recomended4);
        RecomendedTitle4.setText("Cappy Ricks");
        RecomendedAuthor4.setText("Peter B. Kyne");

    }

    private void Button3Clicked() {
        category1.setBackgroundColor(Color.parseColor("#383838"));
        category2.setBackgroundColor(Color.parseColor("#383838"));
        category3.setBackgroundColor(Color.parseColor("#000000"));
        category4.setBackgroundColor(Color.parseColor("#383838"));
        category5.setBackgroundColor(Color.parseColor("#383838"));
        category6.setBackgroundColor(Color.parseColor("#383838"));
        category7.setBackgroundColor(Color.parseColor("#383838"));
        category8.setBackgroundColor(Color.parseColor("#383838"));
        category9.setBackgroundColor(Color.parseColor("#383838"));
        category10.setBackgroundColor(Color.parseColor("#383838"));
        category11.setBackgroundColor(Color.parseColor("#383838"));
        category12.setBackgroundColor(Color.parseColor("#383838"));
        LoadMysteryImages();
        isMystery=true;
        isAction=false;
        isRomance=false;
        isBiography=false;
        isChildred=false;
        isYouth=false;
        isTaboo=false;
        isFantasy=false;
        isHistorical=false;
        isHorror=false;
        isLitrerary=false;
        isScience=false;
    }

    private void LoadMysteryImages() {
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Mystery%2FBestSeller%2FAdventures_of_sherlock_holmes.jpg?alt=media&token=fbd9e982-64f6-4b1d-9837-9cb123145bf3")
                .into(bestSeller1);
        bestSellerTitle1.setText("The Adventures of Sherlock Holmes");
        bestSellerAuthor1.setText("Arthur Conan Doyle");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Mystery%2FBestSeller%2FCrime%20and%20Punishment.jpg?alt=media&token=2ffa2b4e-3551-45cd-be59-2ae128e1acf1")
                .into(bestSeller2);
        bestSellerTitle2.setText("Crime and Punishment");
        bestSellerAuthor2.setText("Fyodor Dostoyevsky");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Mystery%2FBestSeller%2FThe%20Secret%20Adversary.jpg?alt=media&token=2a4a045e-ed68-45da-8e00-8a85734ace14")
                .into(bestSeller3);
        bestSellerTitle3.setText("The Secret Adversary");
        bestSellerAuthor3.setText("Agatha Christie");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Mystery%2FBestSeller%2FCollected%20Works%20of%20Poe.jpg?alt=media&token=cd64c779-1e13-4c7c-9eb2-c2def3cea0dd")
                .into(bestSeller4);
        bestSellerTitle4.setText("Collected Works of Poe");
        bestSellerAuthor4.setText("Edgar Allan Poe");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Mystery%2FBestSeller%2FThe%20Mysterious%20Affair%20at%20Styles.jpg?alt=media&token=0a436212-a61a-4d92-a457-b8b0b0a3efeb")
                .into(bestSeller5);
        bestSellerTitle5.setText("The Mysterious Affair at Styles");
        bestSellerAuthor5.setText("Agatha Christie");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Mystery%2FAuthor%2FApache%20Dawn.jpg?alt=media&token=08e1455d-e6a6-44e6-b61d-ca0e184a2381")
                .into(Author1);
        AuthorTitle1.setText("Apache Dawn");
        authorAuthor1.setText("Marcus Richardson");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Mystery%2FAuthor%2FBlind%20Angel%20of%20Wrath.jpg?alt=media&token=c7e77d83-ee7f-4ce7-8308-de398bd69c50")
                .into(Author2);
        AuthorTitle2.setText("Blind Angel of Wrath");
        authorAuthor2.setText("Nick Aaron");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Mystery%2FAuthor%2FBrazilian%20Gold%20Mine%20Mystery.jpg?alt=media&token=1d84d160-5244-48c2-9d82-abec0a389dc9")
                .into(Author3);
        AuthorTitle3.setText("Brazilian Gold Mine Mystery");
        authorAuthor3.setText("Andy Adams");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Mystery%2FAuthor%2FAverage%20Jones.jpg?alt=media&token=9a80e3af-7bbc-409e-a44a-8a6a6c666258")
                .into(Author4);
        AuthorTitle4.setText("Average Jones");
        authorAuthor4.setText("Samuel Hopkins Adams");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Mystery%2FRecomended%2FFrom%20an%20Unseen%20Censor.jpg?alt=media&token=be8bf97a-89a2-4958-a566-f38731190e04")
                .into(Recomended1);
        RecomendedTitle1.setText("From an Unseen Censor");
        RecomendedAuthor1.setText("Rosel George Brown");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Mystery%2FRecomended%2FJusticia%20Nang%20Dios.jpg?alt=media&token=c9be0c53-171f-444e-8bc0-b3d0fb122d04")
                .into(Recomended2);
        RecomendedTitle2.setText("Justicia Nang Dios");
        RecomendedAuthor2.setText("Mariano Sequera");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Mystery%2FRecomended%2FThe%20Outlaws.jpg?alt=media&token=4ff28ce2-11e8-43d6-aaba-f1aa2786e60b")
                .into(Recomended3);
        RecomendedTitle3.setText("The Outlaws");
        RecomendedAuthor3.setText("Selma Lagerlöf");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Mystery%2FRecomended%2FHalf-hours%20with%20the%20Highwaymen%20-%20Vol%201.jpg?alt=media&token=6a137426-db0a-4703-981c-2b7fde5ce61e")
                .into(Recomended4);
        RecomendedTitle4.setText("Half-hours with the Highwaymen - Vol 1");
        RecomendedAuthor4.setText("Charles G. Harper");
    }

    private void Button4Clicked() {
        category1.setBackgroundColor(Color.parseColor("#383838"));
        category2.setBackgroundColor(Color.parseColor("#383838"));
        category3.setBackgroundColor(Color.parseColor("#383838"));
        category4.setBackgroundColor(Color.parseColor("#000000"));
        category5.setBackgroundColor(Color.parseColor("#383838"));
        category6.setBackgroundColor(Color.parseColor("#383838"));
        category7.setBackgroundColor(Color.parseColor("#383838"));
        category8.setBackgroundColor(Color.parseColor("#383838"));
        category9.setBackgroundColor(Color.parseColor("#383838"));
        category10.setBackgroundColor(Color.parseColor("#383838"));
        category11.setBackgroundColor(Color.parseColor("#383838"));
        category12.setBackgroundColor(Color.parseColor("#383838"));
        LoadBiographyBook();
        isBiography=true;
        isMystery=false;
        isAction=false;
        isRomance=false;
        isChildred=false;
        isYouth=false;
        isTaboo=false;
        isFantasy=false;
        isHistorical=false;
        isHorror=false;
        isLitrerary=false;
        isScience=false;
    }

    private void LoadBiographyBook() {
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Biography%2Fbest%20Selelr%2FThe%20Art%20of%20War.jpg?alt=media&token=f90daf61-c4bc-4beb-a90a-f02e0ed72df5")
                .into(bestSeller1);
        bestSellerTitle1.setText("The Art of War");
        bestSellerAuthor1.setText("Zi Sun");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Biography%2Fbest%20Selelr%2FAutobiography%20of%20a%20Yogi.jpg?alt=media&token=00b652ce-dd62-40a8-bb00-01afd4322a04")
                .into(bestSeller2);
        bestSellerTitle2.setText("Autobiography of a Yogi");
        bestSellerAuthor2.setText("Paramahansa Yogananda");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Biography%2Fbest%20Selelr%2FA%20Tale%20of%20Two%20Cities.jpg?alt=media&token=2c4f1212-1713-4e9c-bced-6e516f77808a")
                .into(bestSeller3);
        bestSellerTitle3.setText("A Tale of Two Cities");
        bestSellerAuthor3.setText("Charles Dickens");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Biography%2Fbest%20Selelr%2FWalden.jpg?alt=media&token=00b526ab-34d5-42f0-82fb-fecfa9c1b22b")
                .into(bestSeller4);
        bestSellerTitle4.setText("Walden");
        bestSellerAuthor4.setText("Henry David Thoreau");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Biography%2Fbest%20Selelr%2FAnne%20of%20Green%20Gables.jpg?alt=media&token=f0f1bd4d-b9f8-4838-ac6d-545e5baafb6b")
                .into(bestSeller5);
        bestSellerTitle5.setText("Anne of Green Gables");
        bestSellerAuthor5.setText("Lucy Maud Montgomery");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Biography%2FAuthor%2FCatalogo%20de%20los%20Objetos%20Etnologicos%20y%20Arqueologicos%20Exhibidos%20por%20la%20Expedici%C3%B3n%20Hemenway.jpg?alt=media&token=ac14e676-e007-4eee-918a-99b5660586a2")
                .into(Author1);
        AuthorTitle1.setText("Catalogo de los Objetos Etnologicos y Arqueologicos Exhibidos por la Expedición Hemenway");
        authorAuthor1.setText("Anonymous");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Biography%2FAuthor%2FHymns%20and%20Hymnwriters%20of%20Denmark.jpg?alt=media&token=2502d6c3-da71-4762-a02c-8ac5c72b8c77")
                .into(Author2);
        AuthorTitle2.setText("Hymns and Hymnwriters of Denmark");
        authorAuthor2.setText("Jens Christian Aaberg");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Biography%2FAuthor%2FWith%20the%20Turks%20in%20Palestine.jpg?alt=media&token=5a7b1862-5620-4228-ac36-87d48456a3dc")
                .into(Author3);
        AuthorTitle3.setText("With the Turks in Palestine");
        authorAuthor3.setText("Alexander Aaronsohn");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Biography%2FAuthor%2FGesammelte%20Abhandlungen%20III.jpg?alt=media&token=aed0b40e-f54b-48a7-8a8f-cf1516b22bc6")
                .into(Author4);
        AuthorTitle4.setText("Gesammelte Abhandlungen III");
        authorAuthor4.setText("Ernst Abbe");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Biography%2FRecome%2Fimage1.jfif?alt=media&token=f50d56bb-c1e6-4fea-a831-9682adf0fe8a")
                .into(Recomended1);
        RecomendedTitle1.setText("Death Valley in '49");
        RecomendedAuthor1.setText("William Lewis Manly");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Biography%2FRecome%2FThe%20Right%20of%20American%20Slavery.jfif?alt=media&token=cd8a49b3-c8d1-4b27-87f3-8a59fdeddbce")
                .into(Recomended2);
        RecomendedTitle2.setText("The Right of American Slavery");
        RecomendedAuthor2.setText("True Worthy Hoit");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Biography%2FRecome%2Fimage2.jpg?alt=media&token=329f8162-52c3-4df0-9e60-40a515ff01a3")
                .into(Recomended3);
        RecomendedTitle3.setText("Records of a Girlhood");
        RecomendedAuthor3.setText("Frances Anne Kemble");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Biography%2FRecome%2Fimage3.jfif?alt=media&token=50a02bb6-0199-4acc-ad44-da6c01b02dcc")
                .into(Recomended4);
        RecomendedTitle4.setText("Smeaton and Lighthouses");
        RecomendedAuthor4.setText("Anonymous");
    }

    private void Button5Clicked() {
        category1.setBackgroundColor(Color.parseColor("#383838"));
        category2.setBackgroundColor(Color.parseColor("#383838"));
        category3.setBackgroundColor(Color.parseColor("#383838"));
        category4.setBackgroundColor(Color.parseColor("#383838"));
        category5.setBackgroundColor(Color.parseColor("#000000"));
        category6.setBackgroundColor(Color.parseColor("#383838"));
        category7.setBackgroundColor(Color.parseColor("#383838"));
        category8.setBackgroundColor(Color.parseColor("#383838"));
        category9.setBackgroundColor(Color.parseColor("#383838"));
        category10.setBackgroundColor(Color.parseColor("#383838"));
        category11.setBackgroundColor(Color.parseColor("#383838"));
        category12.setBackgroundColor(Color.parseColor("#383838"));
        isChildred=true;
        isBiography=false;
        isMystery=false;
        isAction=false;
        isRomance=false;
        isYouth=false;
        isFantasy=false;
        isTaboo=false;
        isHistorical=false;
        isHorror=false;
        isLitrerary=false;
        isScience=false;
        LoaChilrenImage();
    }

    private void LoaChilrenImage() {
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Children%2FBestSeller%2FA%20Little%20Princess.jpg?alt=media&token=90ac3159-caaf-4634-8761-1453e21f8af6")
                .into(bestSeller1);
        bestSellerTitle1.setText("A Little Princess");
        bestSellerAuthor1.setText("Frances Hodgson Burnett");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Children%2FBestSeller%2FAlice%20in%20Wonderland.jpg?alt=media&token=e72585b0-88d5-4527-ab4c-bd9f2e858957")
                .into(bestSeller2);
        bestSellerTitle2.setText("Alice in Wonderland");
        bestSellerAuthor2.setText("Lewis Carroll");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Children%2FBestSeller%2FAdventures%20of%20Huckleberry%20Finn.jpg?alt=media&token=1bef051b-2ece-4f8d-abde-786b255e0308")
                .into(bestSeller3);
        bestSellerTitle3.setText("Adventures of Huckleberry Finn");
        bestSellerAuthor3.setText("Mark Twain");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Children%2FBestSeller%2FA%20Pair%20of%20Schoolgirls.jpg?alt=media&token=b4352077-cc36-4786-82c7-65b6c8e8d9e1")
                .into(bestSeller4);
        bestSellerTitle4.setText("A Pair of Schoolgirls");
        bestSellerAuthor4.setText("Angela Brazil");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Children%2FBestSeller%2FLittle%20Women.jpg?alt=media&token=e7881fb6-cce3-46aa-b6c4-bd1a5a235ecd")
                .into(bestSeller5);
        bestSellerTitle5.setText("Little Women");
        bestSellerAuthor5.setText("Louisa May Alcott");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Children%2FAuthor%2FLisbeth%20Longfrock.jpg?alt=media&token=9ab23b8c-1839-453c-a2ca-6de8dce12026")
                .into(Author1);
        AuthorTitle1.setText("Lisbeth Longfrock");
        authorAuthor1.setText("Hans Aanrud");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Children%2FAuthor%2FRadio%20Boys%20Cronies.jpg?alt=media&token=576c23f0-aed5-4820-a958-32e7dcae63d9")
                .into(Author2);
        AuthorTitle2.setText("Radio Boys Cronies");
        authorAuthor2.setText("S. F. Aaron  Wayne Whipple");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Children%2FAuthor%2FRollo%20on%20the%20Atlantic.jpg?alt=media&token=4924fda0-391c-4270-899f-744948aa5648")
                .into(Author3);
        AuthorTitle3.setText("Rollo on the Atlantic");
        authorAuthor3.setText("Jacob Abbott");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Children%2FAuthor%2FHighacres.jpg?alt=media&token=fee7041b-2155-4432-8adb-d8a42505c07b")
                .into(Author4);
        AuthorTitle4.setText("Highacres");
        authorAuthor4.setText("Jane Abbott");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Children%2FRecomended%2FThe%20Singing%20Mouse%20Stories.jpg?alt=media&token=f913f631-5588-4e18-81fd-4c6f0f74facd")
                .into(Recomended1);
        RecomendedTitle1.setText("The Singing Mouse Stories");
        RecomendedAuthor1.setText("Emerson Hough");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Children%2FRecomended%2FWhat%20Katy%20Did%20At%20School.jpg?alt=media&token=56af6431-7a26-4630-81e2-e1244c081bc4")
                .into(Recomended2);
        RecomendedTitle2.setText("What Katy Did At School");
        RecomendedAuthor2.setText("Susan Coolidge");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/RecomendedBook%2FChildrens%2Fedith.jpg?alt=media&token=c5a00d76-11f1-4c41-ba73-2e4096f371c8")
                .into(Recomended3);
        RecomendedTitle3.setText("Coming Home");
        RecomendedAuthor3.setText("Edith Wharton");
        Glide.with(HomeActivity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Children%2FRecomended%2FThe%20Camp%20Fire%20Girls%20at%20School.jpg?alt=media&token=d54bcfcc-b295-4673-93fe-7a7068cd4649")
                .into(Recomended4);
        RecomendedTitle4.setText("The Camp Fire Girls at School");
        RecomendedAuthor4.setText("Hildegard G. Frey");
    }

}
