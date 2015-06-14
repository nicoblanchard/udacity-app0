package com.example.brucewayne.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Portfolio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        Button Streamer= (Button) findViewById(R.id.spotifyStreamer);
        Streamer.setOnClickListener(listener);
        Button scoresApp= (Button) findViewById(R.id.scoresApp);
        scoresApp.setOnClickListener(listener);
        Button libraryApp= (Button) findViewById(R.id.libraryApp);
        libraryApp.setOnClickListener(listener);
        Button buildItBigger= (Button) findViewById(R.id.buildItBigger);
        buildItBigger.setOnClickListener(listener);
        Button BaconReader= (Button) findViewById(R.id.baconReader);
        BaconReader.setOnClickListener(listener);
        Button Capstone= (Button) findViewById(R.id.capStone);
        Capstone.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    public void sendToast(CharSequence cs){
        Context context=getApplicationContext();
        CharSequence text="This button will launch : "+cs;
        int duration= Toast.LENGTH_SHORT;

        Toast toast=Toast.makeText(context,text, duration);
        toast.show();
    }

    View.OnClickListener listener= new View.OnClickListener(){
        public void onClick(View v){
          switch(v.getId()){
              case R.id.baconReader:
                  sendToast("Bacon Reader");
                  break;
              case R.id.buildItBigger:
                  sendToast("Build It Bigger");
                  break;
              case R.id.capStone:
                  sendToast("CapStone");
                  break;
              case R.id.libraryApp:
                  sendToast("Library App");
                  break;
              case R.id.scoresApp:
                  sendToast("Scores App");
                  break;
              case R.id.spotifyStreamer:
                  sendToast("Spotify Streamer");
                  break;
            }
        }
   };

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
}
