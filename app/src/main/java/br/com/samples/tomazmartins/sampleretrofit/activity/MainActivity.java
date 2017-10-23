package br.com.samples.tomazmartins.sampleretrofit.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.samples.tomazmartins.sampleretrofit.R;
import br.com.samples.tomazmartins.sampleretrofit.model.Pokemon;
import br.com.samples.tomazmartins.sampleretrofit.restapi.RestPokemonApi;
import br.com.samples.tomazmartins.sampleretrofit.util.PokemonDeserializer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    final private String REST_API = "http://pokeapi.co/api/v2/";

    private TextView txv_pokemon_data;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        txv_pokemon_data = (TextView) findViewById( R.id.txv_pokemon_data );
    }

    @Override
    protected void onResume() {
        super.onResume();

        Gson gson = new GsonBuilder()
                .registerTypeAdapter( Pokemon.class, new PokemonDeserializer() )
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( REST_API )
                .addConverterFactory( GsonConverterFactory.create( gson ) )
                .build();

        RestPokemonApi pokemonApi = retrofit.create( RestPokemonApi.class );

        Call<Pokemon> call = pokemonApi.getPokemon( 1 );
        call.enqueue( new Callback<Pokemon>() {
            @Override
            public void onResponse( Call<Pokemon> call, Response<Pokemon> response ) {
                Pokemon pokemon = response.body();

                if( pokemon != null ) {
                    txv_pokemon_data.setText( pokemon.toString() );
                }
            }

            @Override
            public void onFailure( Call<Pokemon> call, Throwable t ) {
                Log.i( "PROBLEM", "There are a problem when receive the data..." );
            }
        } );
    }
}
