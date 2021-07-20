package com.decibelinc.OFT;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ComponentActivity;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.Task;

import java.io.IOException;

public class Podcast_Activity extends AppCompatActivity implements View.OnClickListener {
    ImageView podcast1;
    ImageView podcast2;
    ImageView podcast3;
    ImageView podcast4;
    ImageView podcast5;
    CardView mainView1;
    CardView mainView2;
    CardView mainView3;
    CardView mainView4;
    CardView mainView5;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast_);
        podcast1=(ImageView)findViewById(R.id.bookimage);
        podcast2=(ImageView)findViewById(R.id.bookimage2);
        podcast3=(ImageView)findViewById(R.id.bookimage3);
        podcast4=(ImageView)findViewById(R.id.bookimage4);
        podcast5=(ImageView)findViewById(R.id.bookimage5);
        mainView1=(CardView)findViewById(R.id.main_View);
        mainView2=(CardView)findViewById(R.id.main_View2);
        mainView3=(CardView)findViewById(R.id.main_View3);
        mainView4=(CardView)findViewById(R.id.main_View4);
        mainView5=(CardView)findViewById(R.id.main_View5);
        mainView1.setOnClickListener(this);
        mainView2.setOnClickListener(this);
        mainView3.setOnClickListener(this);
        mainView4.setOnClickListener(this);
        mainView5.setOnClickListener(this);
        mediaPlayer=new MediaPlayer();
        LoadPodCastImage();
    }


    private void LoadPodCastImage() {
        Glide.with(Podcast_Activity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Podcast%2Frogan-experience-juice-lili.jpg?alt=media&token=c1aa39e4-d78e-4c04-a00b-0451dcf30b4d")
                .into(podcast1);
        Glide.with(Podcast_Activity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Podcast%2Fcasefile_icon_1.jpg?alt=media&token=2f3c47b0-5ec8-41e6-8bdb-7aae7d594593")
                .into(podcast2);
        Glide.with(Podcast_Activity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Podcast%2F512.jpg?alt=media&token=9b37502f-81f0-4405-b3b1-793a3dbb5cbf")
                .into(podcast3);
        Glide.with(Podcast_Activity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Podcast%2FNaval.jfif?alt=media&token=5171625f-1b4e-4e8d-a4cb-5e452341c499")
                .into(podcast4);
        Glide.with(Podcast_Activity.this)
                .load("https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Podcast%2FLetsRead.jfif?alt=media&token=1ff2f18e-5227-4f61-a0f3-55a0f57b9ed9")
                .into(podcast5);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_View:
               /* progressBar.setVisibility(View.VISIBLE);*/
                Intent myIntent = new Intent(this, Player.class);
                myIntent.putExtra("link", "https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Podcast%2Frogan-experience-juice-lili.jpg?alt=media&token=c1aa39e4-d78e-4c04-a00b-0451dcf30b4d");
                myIntent.putExtra("title", "Joe Rogan Experience With Elon Musk ");
                myIntent.putExtra("author", "Joe Rogan");
                myIntent.putExtra("content", "Joseph James Rogan is an American comedian, podcaster, and UFC color commentator. He is also a former actor and television presenter. Rogan began his career in comedy in August 1988 in the Boston area. \n" +
                        "Episode Description:\n" +
                        "Elon Musk is a business magnate, designer, and engineer. His portfolio of businesses include Tesla, Inc., SpaceX, Neuralink, and many others.");
                startActivity(myIntent);
                break;
            case R.id.main_View2:
                /* progressBar.setVisibility(View.VISIBLE);*/
                 myIntent = new Intent(this, Player.class);
                myIntent.putExtra("link", "https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Podcast%2Fcasefile_icon_1.jpg?alt=media&token=2f3c47b0-5ec8-41e6-8bdb-7aae7d594593");
                myIntent.putExtra("title", "Jennifer Pan");
                myIntent.putExtra("author", "CASEFILE");
                myIntent.putExtra("content", "Casefile True Crime Podcast, or simply Casefile, is an Australian crime podcast that first aired in January 2016 and is hosted by an Australian man who remains anonymous. The podcast is released on a Sunday (EST) for three consecutive weeks, with a break on the fourth week. The series deals with solved or cold criminal cases, often related to well-known murders and serial crimes. Many early episodes relate to Australian cases (e.g. Port Arthur or the Snowtown murders), although notable crimes from the UK and the USA are increasingly featured, and well-known cases from other countries have also been included. Unlike a number of similar podcasts, the series is scripted and narrative, relying primarily on original police or mass-media documents, eyewitness accounts, and interview or public announcement recordings.Larger and more-complex cases have received multiple-week serialised broadcasts, and case updates to previously aired cases are also provided from time to time. The series has been well received, and has won a number of awards since its debut. \n" +
                        "Episode Description:\n" +
                        "On November 8th, 2010, just after 9.30pm; 25-year-old Jennifer Pan was in her bedroom. She had her TV on and was chatting on the phone while getting ready for bed. She could hear movement downstairs and voices she didn’t recognise.\n" +
                        "\n" +
                        "There were people in the house…");
                startActivity(myIntent);
                break;
            case R.id.main_View3:
                /* progressBar.setVisibility(View.VISIBLE);*/
                 myIntent = new Intent(this, Player.class);
                myIntent.putExtra("link", "https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Podcast%2F512.jpg?alt=media&token=9b37502f-81f0-4405-b3b1-793a3dbb5cbf");
                myIntent.putExtra("title", "Jay Shetty On How To Think Like A Monk & Live Like A Superstar");
                myIntent.putExtra("author", "The Ranveer Show");
                myIntent.putExtra("content", "Ranveer Allahbadia aka BeerBiceps brings you #TheRanveerShow. Every episode has been designed to bring you some kind of value add. Life is a never ending self improvement game - whether it's health, career guidance, lifestyle advice or just plain old inspiration... Each episode will charge you up in some way. We deep dive into some of the world's most intelligent, most successful minds in order to mine out the diamonds they've created over the course of their lives. Bollywood stars, athletes, entrepreneurs and all kinds of motivational human beings - featured on India's smartest podcast. \n" +
                        "Episode Description:\n" +
                        "Jay Shetty is a life coach and one of the most influential motivational speakers on social media today. Also a host of the number one health podcast worldwide ‘On Purpose with Jay Shetty’, Jay recently became an author and published, ‘Think like a monk’ which went on to become a best seller.\n" +
                        "\n" +
                        "Born in the United Kingdom, Jay was like any other man until a monk changed his life. He lived in an Ashram in India and learned lessons unknown to him previously. Since then his purpose changed. His life became all about sharing the wisdom he absorbed in his years spent studying.\n" +
                        "\n" +
                        "Catch Jay talking about his monk life, meditation, relationships, his social media hacks, his lessons from the Bhagavad Gita and much more only on The Ranveer Show.");
                startActivity(myIntent);
                break;
            case R.id.main_View4:
                /* progressBar.setVisibility(View.VISIBLE);*/
                myIntent = new Intent(this, Player.class);
                myIntent.putExtra("link", "https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Podcast%2FNaval.jfif?alt=media&token=5171625f-1b4e-4e8d-a4cb-5e452341c499");
                myIntent.putExtra("title", "How to Get Rich");
                myIntent.putExtra("author", "Naval");
                myIntent.putExtra("content", "Naval Ravikant is an Indian-American entrepreneur and investor. He is the co-founder, chairman and former CEO of AngelList. He has invested early-stage in over 200 companies including Uber, FourSquare, Twitter, Wish.com, Poshmark, Postmates, Thumbtack, Notion, SnapLogic, Opendoor, Clubhouse, Stack Overflow, OpenDNS, Yammer, and Clearview AI, with over 70 total exits and more than 10 Unicorn companies. \n" +
                        "Episode Description:\n" +
                        " How to Get Rich.");
                startActivity(myIntent);
                break;
            case R.id.main_View5:
                /* progressBar.setVisibility(View.VISIBLE);*/
                myIntent = new Intent(this, Player.class);
                myIntent.putExtra("link", "https://firebasestorage.googleapis.com/v0/b/book-project-d2ab5.appspot.com/o/Podcast%2FLetsRead.jfif?alt=media&token=1ff2f18e-5227-4f61-a0f3-55a0f57b9ed9");
                myIntent.putExtra("title", "12 True Scary 911 Call Stories ft. Urmaker");
                myIntent.putExtra("author", "Lets Read!");
                myIntent.putExtra("content", "The Lets Read Podcast centers around narrating True Scary Experiences from real people, just like yourself. Ranging from creepy stalkers to paranormal encounters with the other side. My goal is to lull you into beautiful nightmares. This Podcast updates every other Tuesday at 12pm EST! Catch all the new stories, Mon/Wed/Friday at 7pm EST on my YouTube channel, Lets Read!\n \n" +
                        "Episode Description:\n" +
                        "*N.A*");
                startActivity(myIntent);
                break;
        }
    }
}