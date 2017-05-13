package br.com.samples.tomazmartins.sampleretrofit.model;


import com.google.gson.annotations.SerializedName;

class PokemonType {
    @SerializedName( "slot" ) private int mSlot;
    @SerializedName( "type" ) private Type mType;


    public int getSlot() {
        return mSlot;
    }

    public void setSlot( int slot ) {
        this.mSlot = slot;
    }

    public Type getType() {
        return mType;
    }

    public void setType( Type type ) {
        this.mType = type;
    }

    @Override
    public String toString() {
        return new String( this.getType().toString() );
    }
}
