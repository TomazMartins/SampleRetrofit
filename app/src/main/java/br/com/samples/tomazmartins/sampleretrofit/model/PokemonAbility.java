package br.com.samples.tomazmartins.sampleretrofit.model;


import com.google.gson.annotations.SerializedName;

class PokemonAbility {
    @SerializedName( "is_hidden" ) private boolean mIsHidden;
    @SerializedName( "slot" ) private int mSlot;
    @SerializedName( "ability" ) private Ability mAbility;

    public boolean isHidden() {
        return mIsHidden;
    }

    public void setHidden( boolean hidden ) {
        mIsHidden = hidden;
    }

    public int getSlot() {
        return mSlot;
    }

    public void setSlot( int slot ) {
        this.mSlot = slot;
    }

    public Ability getAbility() {
        return mAbility;
    }

    public void setAbility( Ability ability ) {
        this.mAbility = ability;
    }
}
