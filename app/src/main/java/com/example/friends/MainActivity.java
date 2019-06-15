package com.example.friends;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText friendsName;
    EditText friendsNumber;
    Button   createContact;
    ListView contactInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = this;

        final ContactsManager contactsManager = new ContactsManager();

        contactInfo   = findViewById(R.id.contact_info);
        friendsName   = findViewById(R.id.friends_name);
        friendsNumber = findViewById(R.id.friends_number);
        createContact = findViewById(R.id.create_contact);
        createContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Contact", "Create Contact was clicked");
                contactsManager.createContact(friendsName.getText().toString(), friendsNumber.getText().toString());
                TextView textView = new TextView(context);
                textView.setText(friendsName.getText().toString() + " " + friendsNumber.getText().toString());
                contactInfo.addView(textView);


            }
        });

    }
}
