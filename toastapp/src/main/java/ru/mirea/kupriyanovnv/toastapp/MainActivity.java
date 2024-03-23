package ru.mirea.kupriyanovnv.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View view){
        editText = findViewById(R.id.editText);
        int symCount = editText.getText().length();
        Toast toast = Toast.makeText(getApplicationContext(), "СТУДЕНТ No 19 ГРУППА БСБО-05-22 Количество символов - " + symCount, Toast.LENGTH_SHORT);
        toast.show();
    }
}