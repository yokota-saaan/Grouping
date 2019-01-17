package jp.ac.shohoku.yokotasan.grouping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private  TextView GText;
private  TextView MText;
private  ImageButton Blueplus;
private ImageButton Blueminus;
private  ImageButton Pinkplus;
private ImageButton Pinkminus;
private ImageButton Wakeru;
private int group = 0;
private int member = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 人数入力
         */

        Blueplus = (ImageButton) findViewById(R.id.Bplus);
       Blueminus =(ImageButton) findViewById(R.id.Bminus);

       MText =  (TextView) findViewById(R.id.textView);

       member = Integer.parseInt(MText.getText().toString());

       Blueplus.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view){
                if(member < 20) {
                    member = member + 1;
                    MText.setText(String.valueOf(member));
                }
            }
        });

       Blueminus.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view){
                if(member > 0) {
                    member = member - 1;
                    MText.setText(String.valueOf(member));
                }
            }
        });

        /**
         * ここからはグループ数入力
         */

        Pinkplus = (ImageButton) findViewById(R.id.Pplus);
        Pinkminus =(ImageButton) findViewById(R.id.Pminus);

        GText =  (TextView) findViewById(R.id.textView2);

        group = Integer.parseInt(GText.getText().toString());

        Pinkplus.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view){
                if(group < 10) {
                    group = group + 1;
                    GText.setText(String.valueOf(group));
                }
            }
        });

        Pinkminus.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view){
                if(group > 0) {
                    group = group - 1;
                    GText.setText(String.valueOf(group));
                }
            }
        });

        Wakeru = (ImageButton) findViewById(R.id.wakeru);
        Wakeru.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("Member", member);
                intent.putExtra("Group", group);
                startActivity(intent);
            }
        });
    }

}


