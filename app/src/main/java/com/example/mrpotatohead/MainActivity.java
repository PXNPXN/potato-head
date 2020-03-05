package com.example.mrpotatohead;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity  {
    private ImageView mImageView1;
    private ImageView mImageView2;
    private ImageView mImageView3;
    private ImageView mImageView4;
    private ImageView mImageView5;
    private ImageView mImageView6;
    private ImageView mImageView7;
    private ImageView mImageView8;
    private ImageView mImageView9;
    private ImageView mImageView10;


    private CheckBox mCheckBox1;
    private CheckBox mCheckBox2;
    private CheckBox mCheckBox3;
    private CheckBox mCheckBox4;
    private CheckBox mCheckBox5;
    private CheckBox mCheckBox6;
    private CheckBox mCheckBox7;
    private CheckBox mCheckBox8;
    private CheckBox mCheckBox9;
    private CheckBox mCheckBox10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        event();

    }



    private void init() {
        mImageView1=(ImageView)findViewById(R.id.iv_hat);
        mImageView2=(ImageView)findViewById(R.id.iv_ears);
        mImageView3=(ImageView)findViewById(R.id.iv_eyebrows);
        mImageView4=(ImageView)findViewById(R.id.iv_eyes);
        mImageView5=(ImageView)findViewById(R.id.iv_nose);
        mImageView6=(ImageView)findViewById(R.id.iv_mouth);
        mImageView7=(ImageView)findViewById(R.id.iv_mustache);
        mImageView8=(ImageView)findViewById(R.id.iv_arms);
        mImageView9=(ImageView)findViewById(R.id.iv_shoes);
        mImageView10=(ImageView)findViewById(R.id.iv_glasses);

        mCheckBox1=(CheckBox)findViewById(R.id.cb_arms);
        mCheckBox2=(CheckBox)findViewById(R.id.cb_ears);
        mCheckBox3=(CheckBox)findViewById(R.id.cb_eyebrows);
        mCheckBox4=(CheckBox)findViewById(R.id.cb_eyes);
        mCheckBox5=(CheckBox)findViewById(R.id.cb_hat);
        mCheckBox6=(CheckBox)findViewById(R.id.cb_mouth);
        mCheckBox7=(CheckBox)findViewById(R.id.cb_mustache);
        mCheckBox8=(CheckBox)findViewById(R.id.cb_shoes);
        mCheckBox9=(CheckBox)findViewById(R.id.cb_glasses);
        mCheckBox10=(CheckBox)findViewById(R.id.cb_nose);
    }

    private void event() {
        mCheckBox1.setOnCheckedChangeListener(new arms());
        mCheckBox2.setOnCheckedChangeListener(new ears());
        mCheckBox3.setOnCheckedChangeListener(new eyebrows());
        mCheckBox4.setOnCheckedChangeListener(new eyes());
        mCheckBox5.setOnCheckedChangeListener(new hat());
        mCheckBox6.setOnCheckedChangeListener(new mouth());
        mCheckBox7.setOnCheckedChangeListener(new mustache());
        mCheckBox8.setOnCheckedChangeListener(new shoes());
        mCheckBox9.setOnCheckedChangeListener(new glasses());
        mCheckBox10.setOnCheckedChangeListener(new nose());
    }

    private class arms implements CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(CompoundButton button, boolean isChecked) {
            if (mCheckBox1.isChecked()) {
                mImageView8.setVisibility(View.VISIBLE);
            }
            else{
                mImageView8.setVisibility(View.INVISIBLE);
            }

        }
    }

    private class ears implements CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(CompoundButton button, boolean isChecked) {
            if (mCheckBox2.isChecked()) {
                mImageView2.setVisibility(View.VISIBLE);
            }
            else{
                mImageView2.setVisibility(View.INVISIBLE);
            }

        }
    }

    private class eyebrows implements CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(CompoundButton button, boolean isChecked) {
            if (mCheckBox3.isChecked()) {
                mImageView3.setVisibility(View.VISIBLE);
            }
            else{
                mImageView3.setVisibility(View.INVISIBLE);
            }

        }
    }

    private class eyes implements CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(CompoundButton button, boolean isChecked) {
            if (mCheckBox4.isChecked()) {
                mImageView4.setVisibility(View.VISIBLE);
            }
            else{
                mImageView4.setVisibility(View.INVISIBLE);
            }

        }
    }


    private class hat implements CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(CompoundButton button, boolean isChecked) {
            if (mCheckBox5.isChecked()) {
                mImageView1.setVisibility(View.VISIBLE);
            }
            else{
                mImageView1.setVisibility(View.INVISIBLE);
            }

        }
    }

    private class mouth implements CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(CompoundButton button, boolean isChecked) {
            if (mCheckBox6.isChecked()) {
                mImageView6.setVisibility(View.VISIBLE);
            }
            else{
                mImageView6.setVisibility(View.INVISIBLE);
            }

        }
    }

    private class mustache implements CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(CompoundButton button, boolean isChecked) {
            if (mCheckBox7.isChecked()) {
                mImageView7.setVisibility(View.VISIBLE);
            }
            else{
                mImageView7.setVisibility(View.INVISIBLE);
            }

        }
    }

    private class shoes implements CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(CompoundButton button, boolean isChecked) {
            if (mCheckBox8.isChecked()) {
                mImageView9.setVisibility(View.VISIBLE);
            }
            else{
                mImageView9.setVisibility(View.INVISIBLE);
            }

        }
    }

    private class glasses implements CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(CompoundButton button, boolean isChecked) {
            if (mCheckBox9.isChecked()) {
                mImageView10.setVisibility(View.VISIBLE);
            }
            else{
                mImageView10.setVisibility(View.INVISIBLE);
            }

        }
    }

    private class nose implements CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(CompoundButton button, boolean isChecked) {
            if (mCheckBox10.isChecked()) {
                mImageView5.setVisibility(View.VISIBLE);
            }
            else{
                mImageView5.setVisibility(View.INVISIBLE);
            }

        }
    }


}
