package com.example.admin.sss7;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class MainActivity extends AppCompatActivity {

    Button btn0;
    EditText edit1;
    EditText edit2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        //vibrator.vibrate(3000);
        ImageView pray = (ImageView)findViewById(R.id.gif_image);
        GlideDrawableImageViewTarget gifImage =new GlideDrawableImageViewTarget(pray);
        Glide.with(this).load(R.drawable.ppray).into(gifImage);
        setTitle("flies catch");



        btn0 = (Button)findViewById(R.id.btn0);
        edit1=(EditText)findViewById(R.id.edit1);
        edit2 =(EditText)findViewById(R.id.edit2);






        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edit1.getText().toString();
                String str2 = edit2.getText().toString();
                if (edit1.getText().toString().length() == 0) {
                    Toast toast =Toast.makeText(getApplicationContext(), "아이디를 입력하세요!", Toast.LENGTH_LONG);
                    ViewGroup group = (ViewGroup) toast.getView();

                    TextView messageTextView = (TextView) group.getChildAt(0);

                    messageTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 15);
                    messageTextView.setTextColor(Color.GRAY);
                    toast.show();;
                } else {
                    Intent intent = new Intent(MainActivity.this, MainActivity1.class);
                    startActivity(intent);

                }
            }
        });

    }
}
