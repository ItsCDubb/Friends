package com.example.friends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText friendsName;
    EditText friendsNumber;
    Button   createContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        friendsName = findViewById(R.id.friends_name);
        friendsNumber = findViewById(R.id.friends_number);
        createContact = findViewById(R.id.create_contact);
        createContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Contact", "Create Contact was clicked");
            }
        });

    }
}
