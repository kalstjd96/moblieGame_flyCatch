package com.example.admin.sss7;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class SubActivity extends AppCompatActivity {
    private float xPos;         // position(x)
    private float yPos;         // position(y)
    private int xVel;           // velocity(x)
    private int yVel;           // velocity(y)

    Timer timer;
    TimerTask timerTask;
    Button btn;
    ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7,imageView8,imageView9,imageView10,imageView11,imageView12,imageView13,imageView14,imageView15,imageView16;

    TextView tv, tv1;
    Integer count = 0,    time =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fly);




        final Animation animTrans = AnimationUtils.loadAnimation(this, R.anim.anim);
        final Animation animTrans1 = AnimationUtils.loadAnimation(this, R.anim.anim1);
        final Animation animTrans2 = AnimationUtils.loadAnimation(this, R.anim.anim2);
        final Animation animTrans3 = AnimationUtils.loadAnimation(this, R.anim.anim3);
        final Animation animTrans4 = AnimationUtils.loadAnimation(this, R.anim.anim4);
        final Animation animTrans5 = AnimationUtils.loadAnimation(this, R.anim.anim5);
        final Animation animTrans6 = AnimationUtils.loadAnimation(this, R.anim.anim6);
        final Animation animTrans7 = AnimationUtils.loadAnimation(this, R.anim.anim7);
        final Animation btnani = AnimationUtils.loadAnimation(this, R.anim.btn);
        imageView = (ImageView) findViewById(R.id.img);
        imageView1 = (ImageView) findViewById(R.id.img1);
        imageView2 = (ImageView) findViewById(R.id.img2);
        imageView3 = (ImageView) findViewById(R.id.img3);
        imageView4 = (ImageView) findViewById(R.id.img4);
        imageView5 = (ImageView) findViewById(R.id.img5);
        imageView6 = (ImageView) findViewById(R.id.img6);
        imageView7 = (ImageView) findViewById(R.id.img7);
        imageView8 = (ImageView) findViewById(R.id.img8);
        imageView9 = (ImageView) findViewById(R.id.img9);
        imageView10 = (ImageView) findViewById(R.id.img10);
        imageView11 = (ImageView) findViewById(R.id.img11);
        imageView12 = (ImageView) findViewById(R.id.img12);
        imageView13 = (ImageView) findViewById(R.id.img13);
        imageView14 = (ImageView) findViewById(R.id.img14);
        imageView15 = (ImageView) findViewById(R.id.img15);
        imageView16 = (ImageView) findViewById(R.id.img16);

        btn = (Button) findViewById(R.id.btn);
        btn.setAnimation(btnani);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
                int xOffset = (int) (Math.random() * display.getWidth());
                int yOffset = (int) (Math.random() * display.getHeight());
                imageView.setTranslationX(xOffset);
                imageView.setTranslationY(yOffset);
                imageView.setClickable(true);
                imageView.setVisibility(View.VISIBLE);

                imageView2.setTranslationX(xOffset);
                imageView2.setTranslationY(yOffset);
                imageView2.setClickable(true);
                imageView2.setVisibility(View.VISIBLE);

                imageView3.setTranslationX(xOffset);
                imageView3.setTranslationY(yOffset);
                imageView3.setClickable(true);
                imageView3.setVisibility(View.VISIBLE);

                imageView4.setTranslationX(xOffset);
                imageView4.setTranslationY(yOffset);
                imageView4.setClickable(true);
                imageView4.setVisibility(View.VISIBLE);

                imageView5.setTranslationX(xOffset);
                imageView5.setTranslationY(yOffset);
                imageView5.setClickable(true);
                imageView5.setVisibility(View.VISIBLE);

                imageView6.setTranslationX(xOffset);
                imageView6.setTranslationY(yOffset);
                imageView6.setClickable(true);
                imageView6.setVisibility(View.VISIBLE);

                imageView7.setTranslationX(xOffset);
                imageView7.setTranslationY(yOffset);
                imageView7.setClickable(true);
                imageView7.setVisibility(View.VISIBLE);


                imageView9.setTranslationX(xOffset);
                imageView9.setTranslationY(yOffset);
                imageView9.setClickable(true);
                imageView9.setVisibility(View.VISIBLE);


                imageView10.setTranslationX(xOffset);
                imageView10.setTranslationY(yOffset);
                imageView10.setClickable(true);
                imageView10.setVisibility(View.VISIBLE);


                imageView11.setTranslationX(xOffset);
                imageView11.setTranslationY(yOffset);
                imageView11.setClickable(true);
                imageView11.setVisibility(View.VISIBLE);


                imageView12.setTranslationX(xOffset);
                imageView12.setTranslationY(yOffset);
                imageView12.setClickable(true);
                imageView12.setVisibility(View.VISIBLE);


                imageView13.setTranslationX(xOffset);
                imageView13.setTranslationY(yOffset);
                imageView13.setClickable(true);
                imageView13.setVisibility(View.VISIBLE);


                imageView14.setTranslationX(xOffset);
                imageView14.setTranslationY(yOffset);
                imageView14.setClickable(true);
                imageView14.setVisibility(View.VISIBLE);


                imageView15.setTranslationX(xOffset);
                imageView15.setTranslationY(yOffset);
                imageView15.setClickable(true);
                imageView15.setVisibility(View.VISIBLE);


                imageView16.setTranslationX(xOffset);
                imageView16.setTranslationY(yOffset);
                imageView16.setClickable(true);
                imageView16.setVisibility(View.VISIBLE);


                imageView.startAnimation(animTrans);
                imageView1.startAnimation(animTrans1);
                imageView2.startAnimation(animTrans2);
                imageView3.startAnimation(animTrans3);
                imageView4.startAnimation(animTrans4);
                imageView5.startAnimation(animTrans5);
                imageView6.startAnimation(animTrans6);
                imageView7.startAnimation(animTrans7);
                imageView9.startAnimation(animTrans1);
                imageView10.startAnimation(animTrans5);
                imageView11.startAnimation(animTrans3);
                imageView12.startAnimation(animTrans2);
                imageView13.startAnimation(animTrans4);
                imageView14.startAnimation(animTrans6);
                imageView15.startAnimation(animTrans7);
                imageView16.startAnimation(animTrans1);




            }
        });
        tv = (TextView) findViewById(R.id.tv);
        tv1 = (TextView) findViewById(R.id.tv1);


      /*  imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                count += 10;
                tv.setText("점수 :" + count.toString());
                imageView.setClickable(false);
                imageView.setVisibility(View.INVISIBLE);
                return false;
            }
        });

        imageView1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                count += 10;
                tv.setText("점수 :" + count.toString());
                imageView1.setClickable(false);
                imageView1.setVisibility(View.INVISIBLE);
                return false;
            }
        });

        imageView2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                count += 10;
                tv.setText("점수 :" + count.toString());
                imageView2.setClickable(false);
                imageView2.setVisibility(View.INVISIBLE);
                return false;
            }
        });

        imageView3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                count += 10;
                tv.setText("점수 :" + count.toString());
                imageView3.setClickable(false);
                imageView3.setVisibility(View.INVISIBLE);
                return false;
            }
        });

        imageView4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                count += 10;
                tv.setText("점수 :" + count.toString());
                imageView4.setClickable(false);
                imageView4.setVisibility(View.INVISIBLE);
                return false;
            }
        });

        imageView5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                count += 10;
                tv.setText("점수 :" + count.toString());
                imageView5.setClickable(false);
                imageView5.setVisibility(View.INVISIBLE);
                return false;
            }
        });

        imageView6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                count += 10;
                tv.setText("점수 :" + count.toString());
                imageView6.setClickable(false);
                imageView6.setVisibility(View.INVISIBLE);
                return false;
            }
        });

        imageView7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                count += 10;
                tv.setText("점수 :" + count.toString());
                imageView7.setClickable(false);
                imageView7.setVisibility(View.INVISIBLE);
                return false;
            }
        });*/





        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count +=10;
                tv.setText("점수 :"+count.toString());
                imageView.setClickable(false);
                imageView.setVisibility(View.INVISIBLE);
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count +=10;
                tv.setText("점수 :"+count.toString());
                imageView1.setClickable(false);
                imageView1.setVisibility(View.INVISIBLE);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count +=10;
                tv.setText("점수 :"+count.toString());
                imageView2.setClickable(false);
                imageView2.setVisibility(View.INVISIBLE);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count +=10;
                tv.setText("점수 :"+count.toString());
                imageView3.setClickable(false);
                imageView3.setVisibility(View.INVISIBLE);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count +=10;
                tv.setText("점수 :"+count.toString());
                imageView4.setClickable(false);
                imageView4.setVisibility(View.INVISIBLE);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count +=10;
                tv.setText("점수 :"+count.toString());
                imageView5.setClickable(false);
                imageView5.setVisibility(View.INVISIBLE);
            }
        });




        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count +=10;
                tv.setText("점수 :"+count.toString());
                imageView6.setClickable(false);
                imageView6.setVisibility(View.INVISIBLE);
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count +=10;
                tv.setText("점수 :"+count.toString());
                imageView7.setClickable(false);
                imageView7.setVisibility(View.INVISIBLE);
            }
        });



        Thread thread = new Thread() {



            @Override
            public void run() {
                while (!isInterrupted()) {

                    runOnUiThread(new Runnable() {


                        @Override
                        public void run() {
                            tv1.setText("경과시간:" + time.toString() + " ");
                            time += 1;
                            timer = new Timer(true);
                            timerTask = new TimerTask() {
                                @Override
                                public void run() {
                                    if(time>25||count>=300){
                                        Intent intent = new Intent(SubActivity.this, Sub1Activity.class);
                                        intent.putExtra("str",count);
                                        startActivity(intent);  //게임에서 받은 점수를 sub1에게 보내는 코드
                                        android.os.Process.killProcess(android.os.Process.myPid()); //90초뒤 프로세스 아웃
                                    }

                                }

                            };
                            timer.schedule(timerTask,11000);



                        }
                    });
                    try {
                        Thread.sleep(1000); // 1000 ms = 1초
                        // 스레드를 1초동안 잠들게 함
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } // while
            } // run()
        }; // new Thread() { };
        thread.start();


        RelativeLayout ll = (RelativeLayout) findViewById(R.id.rl);
        ll.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        count +=10;
                        tv.setText("점수 :"+count.toString());
                        imageView8.setX(event.getX()-30);
                        imageView8.setY(event.getY()-30);
                        imageView8.setVisibility(View.VISIBLE);
                        break;

                    case MotionEvent.ACTION_UP :
                        imageView8.setVisibility(View.INVISIBLE);
                        break;
                }
                return true;
            }
        });

    }




}