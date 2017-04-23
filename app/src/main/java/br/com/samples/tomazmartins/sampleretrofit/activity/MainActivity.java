package br.com.samples.tomazmartins.sampleretrofit.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.samples.tomazmartins.sampleretrofit.R;

public class MainActivity extends AppCompatActivity {
    final private String REST_API = "http://pokeapi.co/api/v2/";


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
}
