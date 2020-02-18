package com.example.year22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage (View view) {EditText message = (EditText)findViewById(R.id.message);
        Toast.makeText (this, "Sending message " + message.getText().toString(),
                Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,Display_Message.class);
        intent.putExtra("MESSAGE",message.getText().toString());
        startActivity(intent);
        message.setText("");
    }

}
