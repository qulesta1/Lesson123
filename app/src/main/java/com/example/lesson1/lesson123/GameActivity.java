package com.example.lesson1.lesson123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    ImageView imageView;
    Button btnImage1, btnImage2, btnImage3;
    Button btnOne,btnTwo,btnThree;

    boolean ilone,mark,bezos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
            initialization();
            listeners();

        }
        private void initialization(){
            imageView = findViewById(R.id.im_image);
            btnOne = findViewById(R.id.btn_one);
            btnTwo = findViewById(R.id.btn_two);
            btnThree = findViewById(R.id.btn_three);
            btnImage1 = findViewById(R.id.btn_image1);
            btnImage2 = findViewById(R.id.btn_image2);
            btnImage3 = findViewById(R.id.btn_image3);
        }


        public void changeImage(View view){
            switch (view.getId()){
                case R.id.btn_image1:
                    imageView.setImageResource(R.drawable.ilon);
                    ilone = true;
                    mark = false;
                    bezos = false;
                    break;
                case R.id.btn_image2:
                    imageView.setImageResource(R.drawable.mark);
                    ilone = false;
                    mark = true;
                    bezos = false;
                    break;
                case R.id.btn_image3:
                    imageView.setImageResource(R.drawable.bezos);
                    ilone = false;
                    mark = false;
                    bezos = true;
                    break;
            }
        }

    private void listeners(){
        btnOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
             //   Toast.makeText(GameActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                if (ilone){
                    Toast.makeText(GameActivity.this, "верно",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(GameActivity.this, "НЕ верно", Toast.LENGTH_SHORT).show();
                }
            }
        });
            btnTwo.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                 //  Toast.makeText(GameActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                    if (mark) {
                        Toast.makeText(GameActivity.this, "верно", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(GameActivity.this, "НЕ верно", Toast.LENGTH_SHORT).show();

                    }
                }
            });
        btnThree.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
             //  Toast.makeText(GameActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                if (bezos) {
                    Toast.makeText(GameActivity.this, "верно", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(GameActivity.this, "НЕ верно", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}