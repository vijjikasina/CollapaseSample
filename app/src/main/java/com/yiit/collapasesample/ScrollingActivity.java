package com.yiit.collapasesample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class ScrollingActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView iv_image1, iv_image2, iv_image3, iv_image4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        iv_image1 = findViewById(R.id.iv_image1);
        iv_image2 = findViewById(R.id.iv_image2);
        iv_image3 = findViewById(R.id.iv_image3);
        iv_image4 = findViewById(R.id.iv_image4);

        iv_image1.setOnClickListener(this);
        iv_image2.setOnClickListener(this);
        iv_image3.setOnClickListener(this);
        iv_image4.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.iv_image1:
                Toast.makeText(this, "Image1", Toast.LENGTH_LONG).show();
                break;
            case R.id.iv_image2:
                Toast.makeText(this, "Image2", Toast.LENGTH_LONG).show();
                break;
            case R.id.iv_image3:
                Toast.makeText(this, "Image3", Toast.LENGTH_LONG).show();
                break;
            case R.id.iv_image4:
                Toast.makeText(this, "Image4", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
