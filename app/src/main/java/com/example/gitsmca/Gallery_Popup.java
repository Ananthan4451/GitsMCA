package com.example.gitsmca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Gallery_Popup extends AppCompatActivity {
ImageView iv_GalleryPopup;
String imageid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery__popup);
        iv_GalleryPopup=findViewById(R.id.iv_GalleryPopup);


        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        if(b!=null)
        {
            imageid =(String) b.get("imageid");

        }

        if(imageid.equals("7")){
            iv_GalleryPopup.setImageResource(R.drawable.b);
        }else if(imageid.equals("8")) {
            iv_GalleryPopup.setImageResource(R.drawable.c);
        }else if(imageid.equals("11")) {
            iv_GalleryPopup.setImageResource(R.drawable.ssd);
        }else if(imageid.equals("12")) {
            iv_GalleryPopup.setImageResource(R.drawable.sse);
        }else if(imageid.equals("9")) {
            iv_GalleryPopup.setImageResource(R.drawable.a);
        }else if(imageid.equals("10")) {
            iv_GalleryPopup.setImageResource(R.drawable.d);
        }
    }
}
