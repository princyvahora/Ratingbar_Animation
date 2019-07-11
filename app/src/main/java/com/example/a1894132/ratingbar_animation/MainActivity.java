package com.example.a1894132.ratingbar_animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


 //   RatingBar rt;

    ImageView img_round;

    TextView txt_rate;

RotateAnimation animation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //    rt = findViewById(R.id.ratbar_star);
       // txt_rate = findViewById(R.id.txt_rate);

    //   rt.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
          // @Override
        //   public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

               img_round = findViewById(R.id.img_anim);
             //  txt_rate.setText("MyRates: "+rt.getRating());
/*
               View v = img_round;


              ObjectAnimator animation = ObjectAnimator.ofFloat(v, "rotationY",0.0f,360f);

               animation.setDuration(3000);
               animation.setRepeatCount(ValueAnimator.INFINITE);
               animation.setInterpolator(new AccelerateDecelerateInterpolator());
               animation.start();*/

              Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotation);
                      animation.setDuration(3000);
              img_round.setAnimation(animation);
           }
   //    });

    //}
}
