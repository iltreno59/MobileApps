package ru.mirea.kupriyanovnv.snackbarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSnackClick(View view){
        Snackbar snackbar = Snackbar.make(view, "Это Snackbar!", Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}