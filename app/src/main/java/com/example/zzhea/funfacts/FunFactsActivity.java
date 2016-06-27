package com.example.zzhea.funfacts;

import android.content.DialogInterface;
import android.graphics.Color;
import android.nfc.tech.TagTechnology;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook mFactBook = new FactBook();
    private ColorBook mColorBook = new ColorBook();
    // Declare our View variables
    private TextView mFactTextView;
    private Button  mShowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the Views from the layout to the corresponding variables

        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int newColor = mColorBook.getColor();
                String fact = mFactBook.getFact();

                mRelativeLayout.setBackgroundColor(newColor);
                mShowFactButton.setTextColor(newColor);
                // Update the screen with our dynamic fact
                mFactTextView.setText(fact);

            }
        };

        mShowFactButton.setOnClickListener(listener);

        // Toast.makeText(FunFactsActivity.this, "Yay! Our Activity was created!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We're logging from the OnCreate() method");
    }
}
