package org.ababup1192.bmichecker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    private EditText editTextHeight;
    private EditText editTextWeight;
    private Button buttonResult;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        editTextWeight = (EditText) findViewById(R.id.editTextWeight);
        buttonResult = (Button) findViewById(R.id.buttonResult);
        textViewResult = (TextView) findViewById(R.id.textViewResult);

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isDefinedWeightAndHeight()) {
                    float height = Float.valueOf(editTextHeight.getText().toString());
                    float weight = Float.valueOf(editTextWeight.getText().toString());

                    BMI bmi = new BMI(height, weight);
                    textViewResult.setText("BMI: " + bmi.getBMI());
                } else {
                    textViewResult.setText("身長か体重が空です!");
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean isDefinedWeightAndHeight() {
        String heightText = editTextHeight.getText().toString();
        String wightText = editTextWeight.getText().toString();

        return !heightText.isEmpty() && !wightText.isEmpty();
    }
}
