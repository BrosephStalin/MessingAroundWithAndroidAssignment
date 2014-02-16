package com.example.untitled;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import org.w3c.dom.Text;

public class MyActivity extends Activity
{
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(messageToGermanyListener);
    }

    private View.OnClickListener messageToGermanyListener = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            EditText t = (EditText) findViewById(R.id.editText);
            String s = t.getText().toString();
            s = "I HAVE A MESSAGE FOR GERMANY: " + s;
            Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
        }
    };

}
