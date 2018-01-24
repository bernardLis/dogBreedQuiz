package com.example.android.dogbreedsquiz;

/**
 * Created by berna on 24-Jan-18.
 * its the dog class
 */

public class Dog {
    private int mDogImageId;
    private int mSecondImageId;
    private String mDogBreed;

    public Dog(int dogImageId, int secondImageId, String dogBreed){
        mDogImageId = dogImageId;
        mSecondImageId = secondImageId;
        mDogBreed = dogBreed;
    }

    public int getDogImageId(){
        return mDogImageId;
    }

    public int getSecondImageId(){
        return mSecondImageId;
    }

    public String getDogBreed(){
        return mDogBreed;
    }


}
