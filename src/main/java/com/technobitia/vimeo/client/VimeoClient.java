package com.technobitia.vimeo.client;

import static com.google.common.base.Preconditions.checkNotNull;
import com.technobitia.vimeo.credentials.VimeoCredentials;

public class VimeoClient {
    private VimeoCredentials credentials;

    public VimeoClient(VimeoCredentials credentials) {
        checkNotNull(credentials);
    }
}
