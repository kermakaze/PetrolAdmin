package com.wsloops.petroladmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

import com.wsloops.petroladmin.databinding.ActivityRestockBinding;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RestockActivity extends AppCompatActivity {

    private ActivityRestockBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_restock);

        mBinding.dateEditText.setOnClickListener(this::onDateClicked);
    }

    void onDateClicked(View view){
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Date d = new Date(year,month, dayOfMonth);
                DateFormat date = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);

                mBinding.dateEditText.setText(date.format(d));
            }
        }, 2019, 3, 21);
        datePickerDialog.show();
    }
}
