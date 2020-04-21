package com.rk.t;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button B_1_IDJAVA, B_2_IDJAVA;
    LayoutInflater LI;
    View SusunanToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B_1_IDJAVA = findViewById(R.id.B_1_IDXML);
        B_2_IDJAVA = findViewById(R.id.B_2_IDXML);
        LI = getLayoutInflater();
        SusunanToast = LI.inflate(R.layout.custom_layout, (ViewGroup) findViewById(R.id.RelativeLayout1_IDXML));
    }

    public void Pijitan_B_1_IDXML(View Tampil) {
        Toast.makeText(this, "Hai, Saya Adalah Rizky Khapidsyah.", Toast.LENGTH_SHORT).show();
    }

    public void Pijitan_B_2_IDXML(View Tampil) {
        Toast T = Toast.makeText(this, "Toast:Gravity.TOP", Toast.LENGTH_SHORT);
        T.setGravity(Gravity.CENTER, 0, 0);
        T.setView(SusunanToast);
        T.show();
    }

}
