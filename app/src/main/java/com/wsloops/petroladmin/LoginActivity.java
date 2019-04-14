package com.wsloops.petroladmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;

import com.wsloops.petroladmin.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding mBinding;
    private ProgressDialog mProgressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        mProgressDialog = new ProgressDialog(this);
        setSupportActionBar(mBinding.toolbar);

        getSupportActionBar().setTitle("Login");

        mBinding.loginButton.setOnClickListener(this::onLoginButtonClicked);

    }

    void onLoginButtonClicked(View view){
        mProgressDialog.setMessage("Verifying Number........");
        //mProgressDialog.setCancelable(false);
        mProgressDialog.show();



    }
}
