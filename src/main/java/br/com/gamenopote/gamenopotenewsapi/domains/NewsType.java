package br.com.gamenopote.gamenopotenewsapi.domains;

public enum NewsType {

    NEWS("new"), REVIEW("review"), ARTICLE("article");

    private String newsTypeValue;

    NewsType(String newsTypeValue) {
        this.newsTypeValue = newsTypeValue;
    }

}
