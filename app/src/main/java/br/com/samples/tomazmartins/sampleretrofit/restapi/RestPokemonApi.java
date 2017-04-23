package br.com.samples.tomazmartins.sampleretrofit.restapi;


import br.com.samples.tomazmartins.sampleretrofit.model.Pokemon;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

public interface RestPokemonApi {
    @GET( "pokemon/{pokemon_id}" )
    Call<Pokemon> getPokemon( @Path( "pokemon_id" ) int pokemonId );
}
