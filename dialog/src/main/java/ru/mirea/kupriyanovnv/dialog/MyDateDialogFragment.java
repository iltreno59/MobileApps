package ru.mirea.kupriyanovnv.dialog;

import android.app.DatePickerDialog;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyDateDialogFragment extends DatePickerDialog {
    public MyDateDialogFragment(@NonNull Context context, @Nullable OnDateSetListener listener, int year, int monthOfYear, int dayOfMonth) {
        super(context, listener, year, monthOfYear, dayOfMonth);
    }
}
