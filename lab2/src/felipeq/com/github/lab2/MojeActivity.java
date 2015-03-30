package felipeq.com.github.lab2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

/**
 * Created by Filip on 2015-03-30.
 */
public class MojeActivity extends Activity {
    File photoFile = getExternalCacheDir();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obrazek);


    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Wcisnąłeś wstecz!", Toast.LENGTH_SHORT).show();
        super.onBackPressed(); //nie propaguj przycisku back
    }

    public void ZdjecieClick(View view) {
        Intent imageCaptureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        imageCaptureIntent.putExtra(MediaStore.EXTRA_OUTPUT,
                Uri.fromFile(photoFile));
        startActivity(imageCaptureIntent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent
            data) {
        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                Bitmap bmp = BitmapFactory.decodeFile("path/to/file");
                (ImageView) (R.id.imageView)
                //Aby utworzyć bitmapę z pliku należy posłużyć się metodą statyczną klasy BitmapFactory:

            }
        }
    }

}
