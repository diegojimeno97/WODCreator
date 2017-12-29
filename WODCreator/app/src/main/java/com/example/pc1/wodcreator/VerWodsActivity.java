package com.example.pc1.wodcreator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by PC1 on 12/12/2017.
 */

public class VerWodsActivity extends AppCompatActivity {
    @Override
    protected void
    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

// Check whether this activity was created before
        if(savedInstanceState == null) {
// Create a fragment
            VerWodsFragment fragment = new VerWodsFragment();
            getFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, fragment, fragment.getClass().getSimpleName())
                    .commit();
        }
    }
}