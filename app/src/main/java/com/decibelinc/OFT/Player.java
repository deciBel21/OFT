package com.decibelinc.OFT;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.util.TimerTask;

public class Player extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer mediaPlayer;
    ImageView playButton;
    ImageView mainImage;
    ImageView Repeat;
    ImageView Refresh;
    SeekBar PositionScrubber;
    TextView startTime;
    TextView endTime;
    TextView Title;
    TextView Author;
    TextView Contnet;
    public boolean isPlaying=true;
    public boolean isLooping=false;
    Intent intent;
    String link;
    String title;
    String author;
   String ContentDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        mainImage=(ImageView)findViewById(R.id.mainImage);
        playButton=(ImageView)findViewById(R.id.playButtton);
        Repeat=(ImageView)findViewById(R.id.LoopButton);
        Refresh=(ImageView)findViewById(R.id.ResetButton);
        PositionScrubber=(SeekBar)findViewById(R.id.seekBarScrubber);
        Title=(TextView)findViewById(R.id.title);
        Author=(TextView)findViewById(R.id.artist);
        Contnet=(TextView)findViewById(R.id.Contentdescription);
        startTime=(TextView)findViewById(R.id.startTime);
        endTime=(TextView)findViewById(R.id.endTime);
        playButton.setOnClickListener(this);
        Repeat.setOnClickListener(this);
        Refresh.setOnClickListener(this);
        intent=getIntent();
        link=intent.getStringExtra("link");
        title=intent.getStringExtra("title");
        author=intent.getStringExtra("author");
        ContentDescription=intent.getStringExtra("content");
        LoadMainImage();

    }


    private void LoadMainImage() {
        Glide.with(Player.this)
                .load(link)
                .into(mainImage);
        Title.setText(title);
        Author.setText(author);
        Contnet.setText(ContentDescription);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.playButtton:
             if (isPlaying==true){
               showDialogue();
               playButton.setImageResource(R.drawable.ic_baseline_pause_circle_filled_24);
               isPlaying=false;
             }else
             {
                 showDialogue();
                 playButton.setImageResource(R.drawable.ic_baseline_play_circle_filled_24);
                 isPlaying=true;
             }
               break;
            case R.id.LoopButton:
                if (isLooping==false){
                    Repeat.setImageResource(R.drawable.ic_baseline_repeat_one_24);
                    isLooping=true;
                }else {
                    Repeat.setImageResource(R.drawable.ic_baseline_repeat_24);
                    isLooping=false;
                }
                break;
            case R.id.ResetButton:
                showDialogue();
                break;
        }
    }

    private void showDialogue() {
          final AlertDialog.Builder alert= new AlertDialog.Builder(Player.this);
                View mview=getLayoutInflater().inflate(R.layout.update_message_temporary,null);
                alert.setView(mview);
                final AlertDialog alertDialog=alert.create();
                alertDialog.setCanceledOnTouchOutside(true);
                alertDialog.show();
    }
}