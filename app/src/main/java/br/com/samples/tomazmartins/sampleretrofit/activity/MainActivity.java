package br.com.samples.tomazmartins.sampleretrofit.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.samples.tomazmartins.sampleretrofit.R;
import br.com.samples.tomazmartins.sampleretrofit.model.Pokemon;
import br.com.samples.tomazmartins.sampleretrofit.restapi.RestPokemonApi;
import br.com.samples.tomazmartins.sampleretrofit.util.PokemonDeserializer;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

import static android.text.Html.fromHtml;

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
            public void onResponse( Response<Pokemon> response, Retrofit retrofit ) {
                Pokemon pokemon = response.body();

                if( pokemon != null ) {
                    txv_pokemon_data.setText( pokemon.toString() );
                }
            }

            @Override
            public void onFailure( Throwable t ) {
                Log.i( "PROBLEM", "There are a problem when receive the data..." );
            }
        } );
    }
}
