package com.abhishek_car;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText make, year, color, price, size;
    TextView ans;
    Button cc, cd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        make= findViewById(R.id.make);
        year= findViewById(R.id.year);
        color= findViewById(R.id.color);
        price= findViewById(R.id.price);
        size= findViewById(R.id.size);
        ans= findViewById(R.id.ans);

        cc= findViewById(R.id.cc);
        cd= findViewById(R.id.cd);

        final int[] count = new int[1];
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count[0] = count[0] +1;

                ans.setText(ans.getText()+"The is Vehicle No. "+count[0]+"");
                ans.setText(ans.getText()+" Manufacturer: " +make.getText()+" Current Value: "+price.getText()+ " Effective engine Size: "+size.getText());
                make.setText(null);
                year.setText(null);
                color.setText(null);
                price.setText(null);
                size.setText(null);
            }
        });
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count[0] = count[0] +1;

                ans.setText(ans.getText()+"The is Vehicle No. "+count[0]+"");
                ans.setText(ans.getText()+" Manufacturer: " +make.getText()+" Current Value: "+price.getText()+ " Effective engine Size: "+size.getText());
                make.setText(null);
                year.setText(null);
                color.setText(null);
                price.setText(null);
                size.setText(null);
    }

});

        }
        }