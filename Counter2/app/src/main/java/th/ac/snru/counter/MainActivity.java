package th.ac.snru.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x = 0;
    final int MAX = 10;
    final int MIN = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);
        Button increaseButton = findViewById(R.id.increaseButton);
        Button decreaseButton = findViewById(R.id.decreaseButton);

       increaseButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                x++;
                /*if (x > MAX){
                    x = MAX;
                }*/

                if (x > MAX){
                    x = MIN;
                }

                textView.setText(Integer.toString(x));
            }
        });

        decreaseButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                x--;
                /*if (x < MIN){
                    x = MIN;
                }*/

                if (x < MIN){
                    x = MAX;
                }

                textView.setText(Integer.toString(x));
            }
        });
    } // End onCreate
} // End activity class
