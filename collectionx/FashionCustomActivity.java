package com.example.collectionx;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class FashionCustomActivity extends AppCompatActivity {

    //declaring
    ImageView imageView;
    Button Cam, Gal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fashion_custom);
        TextView name = findViewById(R.id.nameTextFash);
        String username = "Username not set";

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            username = extras.getString("username");
        }
        imageView=findViewById(R.id.ImageViewFash);
        Cam = findViewById(R.id.btn_camera_fash);
        Gal = findViewById(R.id.btn_gallery_fash);
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA)== PackageManager.PERMISSION_DENIED);
        ActivityCompat.requestPermissions(FashionCustomActivity.this,new String[] {Manifest.permission.CAMERA},0);
}
    public void pick_from_camera(View view){
        Intent takepicture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(takepicture, 0);
}
    public void pick_from_gallery(View view){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(pickPhoto,1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 0:
                if (resultCode==RESULT_OK){
                    Bundle extras=data.getExtras();
                    Bitmap imageBitmap =(Bitmap) extras.get("data");
                    imageView.setImageBitmap(imageBitmap);
                }
                break;
            case 1:
                if (resultCode==RESULT_OK){
                    Uri selectedImage = data.getData();
                    imageView.setImageURI(selectedImage);
                }
                break;
        }
    }
}

