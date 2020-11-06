package com.example.sounds;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView uno_1,uno_2,uno_3,uno_4,dos_1,dos_2,dos_3,dos_4,tres_1,tres_2,tres_3,tres_4,cuatro_1,cuatro_2,cuatro_3,cuatro_4,cinco_1,cinco_2,cinco_3,cinco_4,seis_1,seis_2,seis_3,seis_4,siete_1,siete_2,siete_3,siete_4;
    MediaPlayer mPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uno_1 = findViewById(R.id.one_one);
        uno_2 = findViewById(R.id.one_two);
        uno_3 = findViewById(R.id.one_three);
        uno_4 = findViewById(R.id.one_four);
        dos_1 = findViewById(R.id.two_one);
        dos_2 = findViewById(R.id.two_two);
        dos_3 = findViewById(R.id.two_three);
        dos_4 = findViewById(R.id.two_four);
        tres_1 = findViewById(R.id.three_one);
        tres_2 = findViewById(R.id.three_two);
        tres_3 = findViewById(R.id.three_three);
        tres_4 = findViewById(R.id.three_four);
        cuatro_1 = findViewById(R.id.four_one);
        cuatro_2 = findViewById(R.id.four_two);
        cuatro_3 = findViewById(R.id.four_three);
        cuatro_4 = findViewById(R.id.four_four);
        cinco_1 = findViewById(R.id.five_one);
        cinco_2 = findViewById(R.id.five_two);
        cinco_3 = findViewById(R.id.five_three);
        cinco_4 = findViewById(R.id.five_four);
        seis_1 = findViewById(R.id.six_one);
        seis_2 = findViewById(R.id.six_two);
        seis_3 = findViewById(R.id.six_three);
        seis_4 = findViewById(R.id.six_four);
        siete_1 = findViewById(R.id.seven_one);
        siete_2 = findViewById(R.id.seven_two);
        siete_3 = findViewById(R.id.seven_three);
        siete_4 = findViewById(R.id.seven_four);
    }
    public void reproducir(View a){
        System.out.println(a.getId());
        System.out.println(uno_1.getId());

        if(mPlayer!=null && mPlayer.isPlaying())
            mPlayer.stop();

        if(a.getId()==uno_1.getId())
            mPlayer= MediaPlayer.create(this,R.raw.ding_dong_bing_bong);
        else if(a.getId()==uno_2.getId())
            mPlayer= MediaPlayer.create(this,R.raw.beeping_noice);
        else if(a.getId()==uno_3.getId())
            mPlayer= MediaPlayer.create(this,R.raw.fast_beeping_noise);
        else if(a.getId()==uno_4.getId())
            mPlayer= MediaPlayer.create(this,R.raw.even_faster_beeping_noise);
        else if(a.getId()==dos_1.getId())
            mPlayer= MediaPlayer.create(this,R.raw.new_present);
        else if(a.getId()==dos_2.getId())
            mPlayer= MediaPlayer.create(this,R.raw.chapter_completed);
        else if(a.getId()==dos_3.getId())
            mPlayer= MediaPlayer.create(this,R.raw.handbook);
        else if(a.getId()==dos_4.getId())
            mPlayer= MediaPlayer.create(this,R.raw.free_time);
        else if(a.getId()==tres_1.getId())
            mPlayer= MediaPlayer.create(this,R.raw.the_lift);
        else if(a.getId()==tres_2.getId())
            mPlayer= MediaPlayer.create(this,R.raw.time_for_punishment);
        else if(a.getId()==tres_3.getId())
            mPlayer= MediaPlayer.create(this,R.raw.press_strat);
        else if(a.getId()==tres_4.getId())
            mPlayer= MediaPlayer.create(this,R.raw.option_selected);
        else if(a.getId()==cuatro_1.getId())
            mPlayer= MediaPlayer.create(this,R.raw.previous_option);
        else if(a.getId()==cuatro_2.getId())
            mPlayer= MediaPlayer.create(this,R.raw.question_mark);
        else if(a.getId()==cuatro_3.getId())
            mPlayer= MediaPlayer.create(this,R.raw.curso);
        else if(a.getId()==cuatro_4.getId())
            mPlayer= MediaPlayer.create(this,R.raw.notice_observing);
        else if(a.getId()==cinco_1.getId())
            mPlayer= MediaPlayer.create(this,R.raw.the_verdict);
        else if(a.getId()==cinco_2.getId())
            mPlayer= MediaPlayer.create(this,R.raw.locked_door);
        else if(a.getId()==cinco_3.getId())
            mPlayer= MediaPlayer.create(this,R.raw.purchasing_new_content);
        else if(a.getId()==cinco_4.getId())
            mPlayer= MediaPlayer.create(this,R.raw.reaction);
        else if(a.getId()==seis_1.getId())
            mPlayer= MediaPlayer.create(this,R.raw.reaction_select);
        else if(a.getId()==seis_2.getId())
            mPlayer= MediaPlayer.create(this,R.raw.obteined_truth_batle);
        else if(a.getId()==seis_3.getId())
            mPlayer= MediaPlayer.create(this,R.raw.monokuma_morning_anouncement);
        else if(a.getId()==seis_4.getId())
            mPlayer= MediaPlayer.create(this,R.raw.wrong_truth_bullet);
        else if(a.getId()==siete_1.getId())
            mPlayer= MediaPlayer.create(this,R.raw.slow_heartbeat);
        else if(a.getId()==siete_2.getId())
            mPlayer= MediaPlayer.create(this,R.raw.fast_heartbeat);
        else if(a.getId()==siete_3.getId())
            mPlayer= MediaPlayer.create(this,R.raw.ran_out_of_time);
        else if(a.getId()==siete_4.getId())
            mPlayer= MediaPlayer.create(this,R.raw.correct_answer);

        mPlayer.start();
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}