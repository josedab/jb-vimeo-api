package com.technobitia.vimeo.credentials;

public class VimeoCredentials {

    private static final String DEFAULT_TOKEN_TYPE = "bearer";

    private final String token;
    private final String tokenType;

    private VimeoCredentials(Builder credentialsBuilder) {
        this.token = credentialsBuilder.token;
        this.tokenType = credentialsBuilder.tokenType;
    }

    public String getToken() {
        return token;
    }

    public String getTokenType() {
        return tokenType;
    }

    public static class Builder {
        private final String token;
        private String tokenType = DEFAULT_TOKEN_TYPE;

        public Builder(String token) {
            this.token = token;
        }

        public Builder withTokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }

        public VimeoCredentials build() {
            return new VimeoCredentials(this);
        }
    }
}
