package jp.ac.shohoku.yokotasan.grouping;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SubActivity extends AppCompatActivity {
    int memberS = 0;
    int groupS = 0;
    int sagyou = 0;
    private TextView MemberText;
    int[] arrayM = {};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Intent intent = getIntent();
        memberS = intent.getIntExtra("Member", 0);
        MemberText =(TextView) findViewById(R.id.textView);
        MemberText.setText(String.valueOf(memberS));
        groupS = intent.getIntExtra("Group", 0);
        for (int i=0; i <= memberS; ++i) arrayM[i] = i;
        shuffle(arrayM);
        sagyou = memberS/groupS;
        System.out.printf(Arrays.toString(arrayM));


    }

    public static void shuffle(int[] array) {
        // 配列が空か１要素ならシャッフルしようがないのので、そのままreturn
        if (array.length <= 1) {
            return;
        }
        // Fisher–Yates shuffle
        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // 要素入れ替え(swap)
            int tmp = array[index];
            array[index] = array[i];
            array[i] = tmp;
        }
    }


}

