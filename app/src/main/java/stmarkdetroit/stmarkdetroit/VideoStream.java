package stmarkdetroit.stmarkdetroit;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;


public class VideoStream extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_stream);
        VideoView stream = (VideoView) findViewById(R.id.stream);
        String LINK = "http://techslides.com/demos/sample-videos/small.mp4";
        MediaController mc = new MediaController(this);
        mc.setAnchorView(stream);
        mc.setMediaPlayer(stream);
        stream.setMediaController(mc);
        stream.setVideoURI(Uri.parse(LINK));
        stream.start();
        stream.canPause();
        stream.canSeekBackward();
        stream.canSeekForward();
        stream.getBufferPercentage();
        stream.getCurrentPosition();
        stream.setClickable(true);
        stream.resume();
        stream.seekTo(stream.getCurrentPosition() + 10000);
        mc.setClickable(true);
        mc.setAnchorView(stream);
        stream.forceLayout();
        stream.requestFocus();
        mc.requestFocus();



    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_video_stream, menu);
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
}
