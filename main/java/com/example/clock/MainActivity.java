package com.example.clock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ConstraintLayout sydney = findViewById(R.id.sydney);
        ImageView sydneyPic = sydney.findViewById(R.id.imageView);
        sydneyPic.setImageResource(R.drawable.sydney);
        TextView sydneyText = sydney.findViewById(R.id.textView);
        sydneyText.setText("Sydney");
        sydneyText.setTextColor(Color.parseColor("#FFA500"));
        sydney.setBackgroundColor(Color.parseColor("#FF000000"));

        final ConstraintLayout newyork = findViewById(R.id.newyork);
        ImageView newyorkPic = newyork.findViewById(R.id.imageView);
        newyorkPic.setImageResource(R.drawable.newyork);
        TextView newYorkText = newyork.findViewById(R.id.textView);
        newYorkText.setText("New York");
        newYorkText.setTextColor(Color.parseColor("#FFA500"));
        newyork.setBackgroundColor(Color.parseColor("#FF696969"));

        final ConstraintLayout shanghai = findViewById(R.id.shanghai);
        ImageView shanghaiPic = shanghai.findViewById(R.id.imageView);
        shanghaiPic.setImageResource(R.drawable.shanghai);
        TextView shanghaiText = shanghai.findViewById(R.id.textView);
        shanghaiText.setText("Shanghai");
        shanghaiText.setTextColor(Color.parseColor("#FFA500"));
        shanghai.setBackgroundColor(Color.parseColor("#FF000000"));

        final ConstraintLayout london = findViewById(R.id.london);
        ImageView londonPic = london.findViewById(R.id.imageView);
        londonPic.setImageResource(R.drawable.london);
        TextView londonText = london.findViewById(R.id.textView);
        londonText.setText("London");
        londonText.setTextColor(Color.parseColor("#FFA500"));
        london.setBackgroundColor(Color.parseColor("#FF696969"));

        final ConstraintLayout tokyo = findViewById(R.id.tokyo);
        ImageView tokyoPic = tokyo.findViewById(R.id.imageView);
        tokyoPic.setImageResource(R.drawable.tokyotower);
        TextView tokyoText = tokyo.findViewById(R.id.textView);
        tokyoText.setText("Tokyo");
        tokyoText.setTextColor(Color.parseColor("#FFA500"));
        tokyo.setBackgroundColor(Color.parseColor("#FF000000"));

        final Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView sydneyTime = sydney.findViewById(R.id.textView2);
                String sydneyTime1 = getTime24("Australia/Sydney");
                sydneyTime.setText(sydneyTime1);
                sydneyTime.setTextColor(Color.parseColor("#FF7F50"));

                TextView newYorkTime = newyork.findViewById(R.id.textView2);
                String newYorkTime1 = getTime24("America/New_York");
                newYorkTime.setText(newYorkTime1);
                newYorkTime.setTextColor(Color.parseColor("#FF7F50"));

                TextView shanghaiTime = shanghai.findViewById(R.id.textView2);
                String shanghaiTime1 = getTime24("Asia/Shanghai");
                shanghaiTime.setText(shanghaiTime1);
                shanghaiTime.setTextColor(Color.parseColor("#FF7F50"));

                TextView londonTime = london.findViewById(R.id.textView2);
                String londonTime1 = getTime24("Europe/London");
                londonTime.setText(londonTime1);
                londonTime.setTextColor(Color.parseColor("#FF7F50"));

                TextView tokyoTime = tokyo.findViewById(R.id.textView2);
                String tokyoTime1 = getTime24("Asia/Tokyo");
                tokyoTime.setText(tokyoTime1);
                tokyoTime.setTextColor(Color.parseColor("#FF7F50"));
            }
        });
        final Button button1 = findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView sydneyTime = sydney.findViewById(R.id.textView2);
                String sydneyTime1 = getTime12("Australia/Sydney");
                sydneyTime.setText(sydneyTime1);
                sydneyTime.setTextColor(Color.parseColor("#FF7F50"));

                TextView newYorkTime = newyork.findViewById(R.id.textView2);
                String newYorkTime1 = getTime12("America/New_York");
                newYorkTime.setText(newYorkTime1);
                newYorkTime.setTextColor(Color.parseColor("#FF7F50"));

                TextView shanghaiTime = shanghai.findViewById(R.id.textView2);
                String shanghaiTime1 = getTime12("Asia/Shanghai");
                shanghaiTime.setText(shanghaiTime1);
                shanghaiTime.setTextColor(Color.parseColor("#FF7F50"));

                TextView londonTime = london.findViewById(R.id.textView2);
                String londonTime1 = getTime12("Europe/London");
                londonTime.setText(londonTime1);
                londonTime.setTextColor(Color.parseColor("#FF7F50"));

                TextView tokyoTime = tokyo.findViewById(R.id.textView2);
                String tokyoTime1 = getTime12("Asia/Tokyo");
                tokyoTime.setText(tokyoTime1);
                tokyoTime.setTextColor(Color.parseColor("#FF7F50"));
            }
        });

    }
        public String getTime24 (String timezone){
            TimeZone tz = TimeZone.getTimeZone(timezone);
            Calendar c = Calendar.getInstance(tz);
            String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":" + String.format("%02d", c.get(Calendar.MINUTE)) + " " + System.lineSeparator() + c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1);
            return time;
        }
        public String getTime12 (String timezone){
            TimeZone tz = TimeZone.getTimeZone(timezone);
            Calendar c = Calendar.getInstance(tz);
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
            sdf.setTimeZone(tz);
            String time = sdf.format(new Date()) + System.lineSeparator() + c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1);
            return time;
        }
}


