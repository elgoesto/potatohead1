package com.example.justovanderwerf.justovdwerf_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ButtonShoes(View view){

        View ima = findViewById(R.id.shoes);
        if (ima.getVisibility() == View.VISIBLE) {
            ima.setVisibility(View.INVISIBLE);
        }
        else{
            ima.setVisibility(View.VISIBLE);
        }
    }

    public void ButtonEyes(View view){

        View ima = findViewById(R.id.eyes);
        if (ima.getVisibility() == View.VISIBLE) {
            ima.setVisibility(View.INVISIBLE);
        }
        else{
            ima.setVisibility(View.VISIBLE);
        }
    }
    public void ButtonMustache(View view){

        View ima = findViewById(R.id.mustache);
        if (ima.getVisibility() == View.VISIBLE) {
            ima.setVisibility(View.INVISIBLE);
        }
        else{
            ima.setVisibility(View.VISIBLE);
        }
    }
    public void ButtonEyebrows(View view){

        View ima = findViewById(R.id.eyebrows);
        if (ima.getVisibility() == View.VISIBLE) {
            ima.setVisibility(View.INVISIBLE);
        }
        else{
            ima.setVisibility(View.VISIBLE);
        }
    }
    public void ButtonArms(View view){

        View ima = findViewById(R.id.arms);
        if (ima.getVisibility() == View.VISIBLE) {
            ima.setVisibility(View.INVISIBLE);
        }
        else{
            ima.setVisibility(View.VISIBLE);
        }
    }
    public void ButtonNose(View view){

        View ima = findViewById(R.id.nose);
        if (ima.getVisibility() == View.VISIBLE) {
            ima.setVisibility(View.INVISIBLE);
        }
        else{
            ima.setVisibility(View.VISIBLE);
        }
    }
    public void ButtonEars(View view){

        View ima = findViewById(R.id.ears);
        if (ima.getVisibility() == View.VISIBLE) {
            ima.setVisibility(View.INVISIBLE);
        }
        else{
            ima.setVisibility(View.VISIBLE);
        }
    }
    public void ButtonGlasses(View view){

        View ima = findViewById(R.id.glasses);
        if (ima.getVisibility() == View.VISIBLE) {
            ima.setVisibility(View.INVISIBLE);
        }
        else{
            ima.setVisibility(View.VISIBLE);
        }
    }
    public void ButtonHat(View view){

        View ima = findViewById(R.id.hat);
        if (ima.getVisibility() == View.VISIBLE) {
            ima.setVisibility(View.INVISIBLE);
        }
        else{
            ima.setVisibility(View.VISIBLE);
        }
    }
    public void ButtonMouth(View view){

        View ima = findViewById(R.id.mouth);
        if (ima.getVisibility() == View.VISIBLE) {
            ima.setVisibility(View.INVISIBLE);
        }
        else{
            ima.setVisibility(View.VISIBLE);
        }
    }

    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        View armss = findViewById(R.id.arms);
        View mouth = findViewById(R.id.mouth);
        View hat = findViewById(R.id.hat);
        View mustache = findViewById(R.id.mustache);
        View shoes = findViewById(R.id.shoes);
        View nose = findViewById(R.id.nose);
        View glasses = findViewById(R.id.glasses);
        View eyes = findViewById(R.id.eyes);
        View eyebrows = findViewById(R.id.eyebrows);
        View ears = findViewById(R.id.ears);

        outState.putInt("arms", armss.getVisibility());
        outState.putInt("mouth", mouth.getVisibility());
        outState.putInt("hat", hat.getVisibility());
        outState.putInt("mustache", mustache.getVisibility());
        outState.putInt("shoes", shoes.getVisibility());
        outState.putInt("nose", nose.getVisibility());
        outState.putInt("glasses", glasses.getVisibility());
        outState.putInt("eyes", eyes.getVisibility());
        outState.putInt("eyebrows", eyebrows.getVisibility());
        outState.putInt("ears", ears.getVisibility());



    }
    public void onRestoreInstanceState(Bundle inState){
        super.onRestoreInstanceState(inState);

        View armss = findViewById(R.id.arms);
        View mouth = findViewById(R.id.mouth);
        View hat = findViewById(R.id.hat);
        View mustache = findViewById(R.id.mustache);
        View shoes = findViewById(R.id.shoes);
        View nose = findViewById(R.id.nose);
        View glasses = findViewById(R.id.glasses);
        View eyes = findViewById(R.id.eyes);
        View eyebrows = findViewById(R.id.eyebrows);
        View ears = findViewById(R.id.ears);

        Integer a = inState.getInt("arms");
        Log.d("VISIBILITY", "restorearms: " + a);
        Integer b = inState.getInt("mouth");
        Log.d("VISIBILITY", "restoremouth: " + b);
        Integer c = inState.getInt("hat");
        Integer d = inState.getInt("mustache");
        Integer e = inState.getInt("shoes");
        Integer f = inState.getInt("nose");
        Integer g = inState.getInt("glasses");
        Integer h = inState.getInt("eyes");
        Integer i = inState.getInt("eyebrows");
        Integer j = inState.getInt("ears");

        armss.setVisibility(a);
        mouth.setVisibility(b);
        hat.setVisibility(c);
        mustache.setVisibility(d);
        shoes.setVisibility(e);
        nose.setVisibility(f);
        glasses.setVisibility(g);
        eyes.setVisibility(h);
        eyebrows.setVisibility(i);
        ears.setVisibility(j);





    }
}
