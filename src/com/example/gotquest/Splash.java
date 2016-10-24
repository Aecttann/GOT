package com.example.gotquest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
 
public class Splash extends Activity
{
    /** Не лапать этот класс даже под страхом смерти,
     *  бо по 3,143дЕ пойдёт и сплэш и ещё шо-нибудь. 
     * */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        Thread logoTimer = new Thread()
        {
            public void run()
            {
                try
                {
                    int logoTimer = 0;
                    while(logoTimer < 1500)
                    {
                        sleep(50);
                        logoTimer = logoTimer +100;
                    };
                    startActivity(new Intent("com.tutorial.CLEARSCREEN"));
                } 
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    finish();
                }
            }
        };
        logoTimer.start();
    }
}