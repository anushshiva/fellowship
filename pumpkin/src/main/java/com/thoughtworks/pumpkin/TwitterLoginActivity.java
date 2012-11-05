package com.thoughtworks.pumpkin;

import android.os.Bundle;
import com.thoughtworks.pumpkin.helper.OAuthClient;

public class TwitterLoginActivity extends OAuthLoginActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.client = OAuthClient.TWITTER;
        super.onCreate(savedInstanceState);
    }
}
