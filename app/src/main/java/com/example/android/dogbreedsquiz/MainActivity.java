package com.example.android.dogbreedsquiz;

import android.content.res.TypedArray;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;



public class MainActivity extends AppCompatActivity {

    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGame(View view) {

        // Create a new list of dogs

        List<Dog> dogs = new ArrayList<>();

        // Create new dogs to add to the list
        Dog afgan_houd_1 = new Dog(R.drawable.afgan_hound_1, 1, "afgan_houd");
        Dog afgan_houd_2 = new Dog(R.drawable.afgan_hound_2, 2, "afgan_houd");
        Dog afgan_houd_3 = new Dog(R.drawable.afgan_hound_3, 3, "afgan_houd");
        Dog afgan_houd_4 = new Dog(R.drawable.afgan_hound_4, 4, "afgan_houd");
        Dog afgan_houd_5 = new Dog(R.drawable.afgan_hound_5, 5, "afgan_houd");
        Dog afgan_houd_6 = new Dog(R.drawable.afgan_hound_6, 6, "afgan_houd");
        Dog afgan_houd_7 = new Dog(R.drawable.afgan_hound_7, 7, "afgan_houd");

        Dog irish_terrier_1 = new Dog(R.drawable.irish_terrier_1, 8, "irish_terrier");
        Dog irish_terrier_2 = new Dog(R.drawable.irish_terrier_2, 9, "irish_terrier");
        Dog irish_terrier_3 = new Dog(R.drawable.irish_terrier_3, 10, "irish_terrier");
        Dog irish_terrier_4 = new Dog(R.drawable.irish_terrier_4, 11, "irish_terrier");
        Dog irish_terrier_5 = new Dog(R.drawable.irish_terrier_5, 12, "irish_terrier");
        Dog irish_terrier_6 = new Dog(R.drawable.irish_terrier_6, 13, "irish_terrier");
        Dog irish_terrier_7 = new Dog(R.drawable.irish_terrier_7, 14, "irish_terrier");



        // Create and add further new dogs as needed

        dogs.add(afgan_houd_1);
        dogs.add(afgan_houd_2);
        dogs.add(afgan_houd_3);
        dogs.add(afgan_houd_4);
        dogs.add(afgan_houd_5);
        dogs.add(afgan_houd_6);
        dogs.add(afgan_houd_7);
        dogs.add(irish_terrier_1);
        dogs.add(irish_terrier_2);
        dogs.add(irish_terrier_3);
        dogs.add(irish_terrier_4);
        dogs.add(irish_terrier_5);
        dogs.add(irish_terrier_6);
        dogs.add(irish_terrier_7);


        // Pass in a random number in place of 0, between 0 and the .size() of the array -1

        Collections.shuffle(dogs);

        String currentDogBreed = dogs.get(3).getDogBreed();
        int currentDogImageId = dogs.get(3).getDogImageId();

        Log.v("MainActivity", currentDogBreed);

        ImageView doggoImageView = (ImageView) findViewById(R.id.doggoImageView);


        doggoImageView.setImageResource(currentDogImageId);


    }


    public void displayPoints(int points) {
        TextView scoreView = (TextView) findViewById(R.id.pointsNumber);
        scoreView.setText(String.valueOf(points));
    }


}




    /**
     *
     * doggo from afgan hound array is displayed
     * points are displayed
     *
     */

/**

    /**
     *
     * method to change picture to random Irish Terrier
     *
     */

/**

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

