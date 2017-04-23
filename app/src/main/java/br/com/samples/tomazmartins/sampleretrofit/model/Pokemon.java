package br.com.samples.tomazmartins.sampleretrofit.model;


import com.google.gson.annotations.SerializedName;

public class Pokemon {
    @SerializedName( "id" ) private int mId;
    @SerializedName( "name" ) private String mName;
    @SerializedName( "based_experience" ) private int mBaseExperience;
    @SerializedName( "height" ) private int mHeight;
    @SerializedName( "is_default" ) private boolean mIsDefault;
    @SerializedName( "order" ) private int mOrder;
    @SerializedName( "weight" ) private int mWeight;
    @SerializedName( "abilities" ) private List<PokemonAbility> mAbilities;
    @SerializedName( "stats" ) private List<PokemonStats> mStats;
    @SerializedName( "types" ) private List<PokemonType> mTypes;


    public int getId() {
        return mId;
    }

    public void setId( int id ) {
        this.mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName( String name ) {
        this.mName = name;
    }

    public int getBaseExperience() {
        return mBaseExperience;
    }

    public void setBaseExperience( int baseExperience ) {
        this.mBaseExperience = baseExperience;
    }

    public int getHeight() {
        return mHeight;
    }

    public void setHeight( int height ) {
        this.mHeight = height;
    }

    public boolean getIsDefault() {
        return mIsDefault;
    }

    public void setIsDefault( boolean isDefault ) {
        mIsDefault = isDefault;
    }

    public int getOrder() {
        return mOrder;
    }

    public void setOrder( int order ) {
        this.mOrder = order;
    }

    public int getWeight() {
        return mWeight;
    }

    public void setWeight( int weight ) {
        this.mWeight = weight;
    }

    public List<PokemonAbility> getAbilities() {
        return mAbilities;
    }

    public void setAbilities( List<PokemonAbility> abilities ) {
        this.mAbilities = abilities;
    }

    public List<PokemonStats> getStats() {
        return mStats;
    }

    public void setStats( List<PokemonStats> stats ) {
        this.mStats = stats;
    }

    public List<PokemonType> getTypes() {
        return mTypes;
    }

    public void setTypes( List<PokemonType> types ) {
        this.mTypes = types;
    }
}
