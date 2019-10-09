package com.example.mobileprogramming;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentActivity extends AppCompatActivity {
    Button btnSatuFragment, btnDuaFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        btnSatuFragment = findViewById(R.id.btnFragment1);
        btnDuaFragment = findViewById(R.id.btnFragment2) ;

        btnSatuFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new SatuFragment());

            }
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction FragmentTransaction = fm.beginTransaction();
        FragmentTransaction.replace(R.id.frameLayout, fragment);
        FragmentTransaction.commit ();
    }
}
