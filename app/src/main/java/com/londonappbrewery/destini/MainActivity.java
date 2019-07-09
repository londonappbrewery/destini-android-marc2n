package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStory;
    private Button mButtonUp;
    private Button mButtonDown;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = findViewById(R.id.storyTextView);
        mButtonUp = findViewById(R.id.buttonTop);
        mButtonDown = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("BUTTON_TOP", "the Button has been clicked!");
                if (mStoryIndex == 1 || mStoryIndex == 2){
                    mStory.setText(R.string.T3_Story);
                    mButtonUp.setText(R.string.T3_Ans1);
                    mButtonDown.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if(mStoryIndex == 3){
                    mStory.setText(R.string.T6_End);
                    mButtonUp.setVisibility(View.GONE);
                    mButtonDown.setVisibility(View.GONE);
                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("BUTTON_BOTTOM", "the Button has been clicked");
                if(mStoryIndex == 1){
                    mStory.setText(R.string.T2_Story);
                    mButtonUp.setText(R.string.T2_Ans1);
                    mButtonDown.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }else if (mStoryIndex == 2){
                    mStory.setText(R.string.T4_End);
                    mButtonDown.setVisibility(View.GONE);
                    mButtonUp.setVisibility(View.GONE);
                } else if (mStoryIndex == 3){
                    mStory.setText(R.string.T5_End);
                    mButtonUp.setVisibility(View.GONE);
                    mButtonDown.setVisibility(View.GONE);
                }

            }
        });

    }
}
