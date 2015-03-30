package felipeq.com.github.lab2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


    }

    public void ZdjecieClick(View view) {
        Intent mojeActivityIntent = new Intent(this, MojeActivity.class);
        startActivity(mojeActivityIntent);
    }
}
