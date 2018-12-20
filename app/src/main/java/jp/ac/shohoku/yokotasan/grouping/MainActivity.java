package jp.ac.shohoku.yokotasan.grouping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private  TextView countText;
private  Button plus1Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       plus1Button = (Button) findViewById(R.id.button);

        countText =  (TextView) findViewById(R.id.textView);

        plus1Button.setOnClickListener(new View.OnClickListener()

        {

            int num = Integer.parseInt(countText.getText().toString());

            public void onClick (View view){
                num = num + 1;

               countText.setText(String.valueOf(num));
            }
        });
    }


}
