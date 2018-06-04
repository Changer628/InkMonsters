package com.shelfspace.michael.inkmonsters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableRow;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Scoring extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring);
        String myJson=inputStreamToString(this.getResources().openRawResource(R.raw.cards));
        final Character myModel = new Gson().fromJson(myJson, Character.class);
        //Log.d("test", myModel.cards.get(1).name);
        final ImageButton[] buttonList = new ImageButton[myModel.cards.size()];

        final TotalScore totalScore = new TotalScore();
        //ArrayList<ImageButton> buttonList = new ArrayList<ImageButton>();

        for (int i = 0; i < myModel.cards.size(); i++) {
            //Log.d("test", myModel.cards.get(i).name);
            String buttonID = "";
            if (i == 0) {
                buttonID = "imageButton";
            }else{
                buttonID = "imageButton" + (i + 1);
            }
            ////Log.d("test", buttonID);
            int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
            ////Log.d("test", String.valueOf(resID));
            buttonList[i] = ((ImageButton) findViewById(resID));

            final int finalI = i;
            buttonList[i].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Code here executes on main thread after user presses button
                    //Intent intent = new Intent(v.getContext(), Scoring.class);
                    //startActivity(intent);
                    if (totalScore.checkName(myModel.cards.get(finalI).name) == false){
                        totalScore.addName(myModel.cards.get(finalI).name);
                        totalScore.addBaseValue(myModel.cards.get(finalI).baseValue);
                        //Log.d("test", String.valueOf(myModel.cards.get(finalI).baseValue));
                        totalScore.addColour(myModel.cards.get(finalI).color);
                        if(myModel.cards.get(finalI).attributes != null){
                            totalScore.addAttributes(myModel.cards.get(finalI).attributes);
                        }
                        buttonList[finalI].setBackground(getDrawable(R.drawable.border));
                    }else{
                        totalScore.subName(myModel.cards.get(finalI).name);
                        totalScore.subBaseValue(myModel.cards.get(finalI).baseValue);
                        totalScore.subColour(myModel.cards.get(finalI).color);
                        if(myModel.cards.get(finalI).attributes != null){
                            totalScore.subAttributes(myModel.cards.get(finalI).attributes);
                        }
                        //buttonList[finalI].setBackground(getDrawable(R.drawable.border));
                        buttonList[finalI].setBackgroundResource(0);
                    }

                    TextView tv = (TextView)findViewById(R.id.textView3);
                    tv.setText("Score: " + totalScore.getTotalScore());
                }
            });
        }
    }

    public String inputStreamToString(InputStream inputStream) {
        try {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes, 0, bytes.length);
            String json = new String(bytes);
            return json;
        } catch (IOException e) {
            return null;
        }
    }

}
