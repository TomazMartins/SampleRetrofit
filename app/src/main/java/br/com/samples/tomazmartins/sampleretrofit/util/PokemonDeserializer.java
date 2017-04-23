package br.com.samples.tomazmartins.sampleretrofit.util;


import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

import br.com.samples.tomazmartins.sampleretrofit.model.Pokemon;

public class PokemonDeserializer implements JsonDeserializer<Object> {

    @Override
    public Object deserialize( JsonElement json, Type typeOfT, JsonDeserializationContext context ) throws JsonParseException {
        JsonElement pokemon = json.getAsJsonObject();

        if( json.getAsJsonObject().get( "pokemon" ) != null ) {
            pokemon = json.getAsJsonObject().get( "pokemon" );
        }

        return new Gson().fromJson( pokemon, Pokemon.class );
    }
}
