package com.example.listtutorial;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;




public class MainActivity extends AppCompatActivity {

    Button 한식;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        한식 = (Button)findViewById (R.id.한식);
        한식.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, hansik.class);
                startActivity (intent);
            }
        });
    }




}