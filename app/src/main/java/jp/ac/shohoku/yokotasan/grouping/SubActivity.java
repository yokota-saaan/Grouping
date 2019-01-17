package jp.ac.shohoku.yokotasan.grouping;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    int member =0;
    private TextView MemberText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        member = intent.getIntExtra("Member", 0);
        MemberText =(TextView) findViewById(R.id.textView);
        MemberText.setText(String.valueOf(member));
    }
}
