package com.example.android.dogbreedsquiz;

import android.content.res.TypedArray;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int points = 0;

    /**
     *
     * doggo from afgan hound array is displayed
     * points are displayed
     *
     */


    public void nextDoggoClick (View view) {

        changePictureToRandomAfganHound();
        displayPoints(points);

    }

    /**
     *
     * when adfrican chart button is clicked the dog picture changes to a random picture from irish_terrier array
     * when the button is clicked you get one more points and the points are updated
     *
     */
    public void afganHoundButtonClick(View view) {

        points += 1;
        changePictureToRandomIrishTerrier();
        displayPoints(points);

    }

    /**
     *
     * when adfrican chart button is clicked the dog picture changes to a random picture from afgan_hound array
     * when the button is clicked you get one more points and the points are updated
     *
     */

    public void irishTerrierButtonClick (View view) {

        points += 1;
        changePictureToRandomAfganHound();
        displayPoints(points);

    }

    /**
     *
     * method to change picture to random Afgan Hound;
     *
     */

    public void changePictureToRandomAfganHound() {

        ImageView doggoImageView = (ImageView) findViewById(R.id.doggoImageView);

        final TypedArray imgs = getResources().obtainTypedArray(R.array.afghan_hound);
        final Random rand = new Random();
        final int rndInt = rand.nextInt(imgs.length());
        final int resID = imgs.getResourceId(rndInt, 0);

        doggoImageView.setImageResource(resID);
    }
    /**
     *
     * method to change picture to random Irish Terrier
     *
     */

    public void changePictureToRandomIrishTerrier() {

        ImageView doggoImageView = (ImageView) findViewById(R.id.doggoImageView);

        final TypedArray imgs = getResources().obtainTypedArray(R.array.irish_terrier);
        final Random rand = new Random();
        final int rndInt = rand.nextInt(imgs.length());
        final int resID = imgs.getResourceId(rndInt, 0);

        doggoImageView.setImageResource(resID);
    }
    /**
     *
     * method to update the number of points;
     *
     */

    public void displayPoints (int points) {
        TextView scoreView = (TextView) findViewById(R.id.pointsNumber);
        scoreView.setText(String.valueOf(points));
    }




}