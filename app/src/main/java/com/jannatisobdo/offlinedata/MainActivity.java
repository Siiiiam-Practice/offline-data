package com.jannatisobdo.offlinedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data  data = new data();
        TextView text = findViewById(R.id.text);

        JSONArray jsonArray = data.jsonArray;

        for (int i = 0; i < jsonArray.length(); i++) {
            try {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String title = jsonObject.getString("title");
                text.append(title + "\n \n");
                Log.d("AAAAAAA", title);

            } catch (JSONException e) {
                throw new RuntimeException(e);
            }

        }
    }
}