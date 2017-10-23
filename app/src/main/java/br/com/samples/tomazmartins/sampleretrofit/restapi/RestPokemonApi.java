package br.com.samples.tomazmartins.sampleretrofit.restapi;


import br.com.samples.tomazmartins.sampleretrofit.model.Pokemon;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RestPokemonApi {
    @GET( "pokemon/{id}" )
    Call<Pokemon> getPokemon( @Path( "id" ) int id );
}
