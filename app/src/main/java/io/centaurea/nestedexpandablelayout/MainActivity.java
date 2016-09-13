package io.centaurea.nestedexpandablelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.aakira.expandablelayout.ExpandableLinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.outer_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ExpandableLinearLayout)findViewById(R.id.outer_layout)).toggle();
            }
        });


        findViewById(R.id.inner_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ExpandableLinearLayout)findViewById(R.id.inner_layout)).toggle();
            }
        });
    }
}
