package com.projects.cristianzapata.ejerciciospref;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.email1);
        SharedPreferences pref = getSharedPreferences("datos", Context.MODE_PRIVATE);
        editText.setText(pref.getString("mail",""));
    }

    public void ejecutar (View v){
        SharedPreferences preferencias = getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString("mail",editText.getText().toString());
        editor.commit();
        finish();
    }
}
