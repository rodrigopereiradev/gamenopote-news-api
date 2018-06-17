package br.com.gamenopote.gamenopotenewsapi.domains;

public enum UserType {

    AUTHOR("author"), VIP("vip"), ORDINARY_USER("ordinary_user ");

    private String userTypeValue;

    UserType(String userTypeValue) {
        this.userTypeValue = userTypeValue;
    }
}
