package com.technobitia.vimeo.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.technobitia.vimeo.credentials.VimeoCredentials;

@RunWith(MockitoJUnitRunner.class)
public class VimeoClientTest {
    
    @Mock
    private VimeoCredentials credentialsMock;
    
    @InjectMocks
    private VimeoClient vimeoClient;

    @Test(expected=NullPointerException.class)
    public void whenCreatingClient_givenNullCredentials_thenThrowNPE() {  
        vimeoClient = new VimeoClient(null); 
    }  
}
