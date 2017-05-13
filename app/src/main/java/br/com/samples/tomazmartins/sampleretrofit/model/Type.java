package br.com.samples.tomazmartins.sampleretrofit.model;


import com.google.gson.annotations.SerializedName;

class Type {
    @SerializedName( "mId" ) private int mId;
    @SerializedName( "mName" ) private String mName;


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

    @Override
    public String toString() {
        return new String( this.getName() );
    }
}
