package cn.edu.gdmec.android.uiwidgettest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    声明变量
    private Button button;

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        button = (Button) findViewById ( R.id.button );

        editText = (EditText) findViewById ( R.id.edit_text );

        button.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                //在此处添加逻辑
                String inputText = editText.getText ().toString ();
                Toast.makeText ( MainActivity.this, inputText, Toast.LENGTH_SHORT ).show ();
            }
        } );

    }
}
