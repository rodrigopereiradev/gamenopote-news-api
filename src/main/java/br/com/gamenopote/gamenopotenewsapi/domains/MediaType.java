package br.com.gamenopote.gamenopotenewsapi.domains;

public enum MediaType {

    VIDEO("video"), IMAGE("image");

    private String mediaTypeValue;

    MediaType(String mediaTypeValue) {
        this.mediaTypeValue = mediaTypeValue;
    }

}
