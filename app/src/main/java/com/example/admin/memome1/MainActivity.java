package com.example.admin.memome1;

import android.content.Context;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    WebView web;
    TextView txtcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.button);
        txtcode=(TextView)findViewById(R.id.textView);
        web = (WebView) findViewById(R.id.webView);

        web.addJavascriptInterface(new MyJavaScriptInterface(),"HTMLOUT");

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                //bt1.setText("aaa");
                web.loadData(
                    "<html>" +
                    "<body><br>Hello, world!</body>" +
                    "</html>",

                    "text/html", "UTF-8");

            }
        });



        /* динамически view

        TextView text = new TextView(this);
        text.set
        text.setText("aaa");
        LinearLayout lLayout = new LinearLayout(this);
        lLayout.addView(text);

        setContentView(lLayout);

         */

        /* включение экрана
        PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
        PowerManager.WakeLock wakeLock = pm.newWakeLock(PowerManager.FULL_WAKE_LOCK
                | PowerManager.ACQUIRE_CAUSES_WAKEUP
                //| PowerManager.
                | PowerManager.ON_AFTER_RELEASE, "MyWakeLock");
        wakeLock.acquire();

        */

    }
    class MyJavaScriptInterface
    {
        @SuppressWarnings("unused")
        public void showHTML(String html)
        {

            txtcode.setText(html);
        }
    }
}
