package com.example.lab2_ph34899;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Button;


public class Bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        TextView txtresult = findViewById(R.id.txtresult);
        EditText edtName = findViewById(R.id.edtName);
        EditText edtID = findViewById(R.id.edtID);
        EditText edtAge = findViewById(R.id.edtAge);
        RadioButton rdoNam = findViewById(R.id.rdoNam);
        RadioButton rdoNu = findViewById(R.id.rdoNu);
        CheckBox chkFootBall = findViewById(R.id.chkFootball);
        CheckBox chkGame = findViewById(R.id.chkGame);
        Button btnLuu = findViewById(R.id.btnLuu);

        txtresult.setMaxLines(5);

        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String id = edtID.getText().toString();
                String age = edtAge.getText().toString();

                String gioiTinh = "Chua lua chon gioi tinh";

                if (rdoNam.isChecked()) {
                    gioiTinh = "Nam";
                } else if (rdoNu.isChecked()) {
                    gioiTinh = "Nu";
                }

                String soThich = "Khong thich gi ca";

                if (chkFootBall.isChecked() && chkGame.isChecked()) {
                    soThich = "Da bong va choi game";
                }
                else if (chkFootBall.isChecked()) {
                    soThich = chkFootBall.getText().toString();
                }
                else if (chkGame.isChecked()) {
                    soThich = chkGame.getText().toString();
                }

                txtresult.setText("Toi ten" + name + "\n"
                        + "MSSV: " + id + "\n"
                        + "Tuoi: " + age + "\n"
                        + "Gioi tinh: " + gioiTinh +
                        "\n" + "So thich: " + soThich);

            }
        });
    }
}