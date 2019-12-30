package com.faraaf.tictacdev.bottomsheet;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.faraaf.tictacdev.bottomsheet.fragment_dialog.BottomSheetFragmentActivity;

public class MainActivity extends AppCompatActivity {
    Button bottomSheetsCoordinatorLayout, bottomSheetsDialogFragment;

    // https://medium.com/better-programming/bottom-sheet-android-340703e114d2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind();
        clickEvents();
    }

    private void bind() {
        bottomSheetsCoordinatorLayout = findViewById(R.id.bottomSheetsButton);
        bottomSheetsDialogFragment = findViewById(R.id.bottomSheetsDialogFragmentButton);
    }

    private void clickEvents() {

        bottomSheetsCoordinatorLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BottomSheetActivity.class);
                startActivity(intent);
            }
        });

        bottomSheetsDialogFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BottomSheetFragmentActivity.class);
                startActivity(intent);
            }
        });


    }

}
