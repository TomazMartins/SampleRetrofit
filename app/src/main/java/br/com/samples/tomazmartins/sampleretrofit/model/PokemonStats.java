package br.com.samples.tomazmartins.sampleretrofit.model;


import com.google.gson.annotations.SerializedName;

class PokemonStats {
    @SerializedName( "stat" ) private Stat mStat;
    @SerializedName( "effort" ) private int mEffort;
    @SerializedName( "base_stat" ) private int mBaseStat;


    public Stat getStat() {
        return mStat;
    }

    public void setStat( Stat stat ) {
        this.mStat = stat;
    }

    public int getEffort() {
        return mEffort;
    }

    public void setEffort( int effort ) {
        this.mEffort = effort;
    }

    public int getBaseStat() {
        return mBaseStat;
    }

    public void setBaseStat( int baseStat ) {
        this.mBaseStat = baseStat;
    }

    @Override
    public String toString() {
        return new String( this.getStat().toString() );
    }
}
