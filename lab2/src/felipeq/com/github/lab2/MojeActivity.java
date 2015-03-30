package felipeq.com.github.lab2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Toast;

/**
 * Created by Filip on 2015-03-30.
 */
public class MojeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent imageCaptureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        File photoFile;
//        imageCaptureIntent.putExtra(MediaStore.EXTRA_OUTPUT,
//                Uri.fromFile(photoFile));
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Wcisnąłeś wstecz!", Toast.LENGTH_SHORT).show();
        super.onBackPressed(); //nie propaguj przycisku back
    }
}
