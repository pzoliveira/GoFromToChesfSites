package com.example.gofromtochesfsites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    // Declarations
    Spinner spinnerTo;
    ChesfSites destinationSelected;
    Button btGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializations
        spinnerTo = (Spinner) findViewById(R.id.spinnerTo);
        btGo = (Button) findViewById(R.id.btGo);
        destinationSelected = ChesfSites.SE_Cotegipe;

        ArrayAdapter<ChesfSites> sitesToArrayAdapter = new ArrayAdapter<>(this, R.layout.spinner_to, ChesfSites.values());
        sitesToArrayAdapter.setDropDownViewResource(R.layout.spinner_to);
        spinnerTo.setAdapter(sitesToArrayAdapter);
        spinnerTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                destinationSelected = (ChesfSites) parent.getItemAtPosition(position);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        btGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String placeToGo = "google.navigation:q=" + destinationSelected.getCoordinates();
                Uri gmmIntentUri = Uri.parse(placeToGo);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });



    }

}