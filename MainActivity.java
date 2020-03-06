package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1;
    String [] items={"CSE","ISE","MECH","EEE"};
    String name,regno,dept;
    Spinner s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.e1);
        ed2=(EditText)findViewById(R.id.e2);
        b1= (Button) findViewById(R.id.button);
        s= (Spinner) findViewById(R.id.sp);
        ArrayAdapter adapter=
                new ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item,items);
        s.setAdapter(adapter);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name=ed1.getText().toString();
                regno=ed2.getText().toString();
                dept=s.getSelectedItem().toString();

                Intent i = new Intent(MainActivity.this,second.class);
                i.putExtra("name_key", name);
                i.putExtra("reg_key",regno);
                i.putExtra("dept_key", dept);
                startActivity(i);
            }
        });


    }
}
