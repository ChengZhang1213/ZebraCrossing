package com.chengzhang.zebracrossing.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.chengzhang.zebracrossing.app.zcrossing.activity.CaptureActivity;

public class MainActivity extends Activity {
    public static final int SUCCESS_GET_ZCROSSING_INFO = 12;//成功获取到了二维码信息
    private TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_scan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this, CaptureActivity.class), SUCCESS_GET_ZCROSSING_INFO);
            }
        });
        tv_result = (TextView) findViewById(R.id.tv_result);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       switch (requestCode){
           case SUCCESS_GET_ZCROSSING_INFO:
               String string = null;
               if(resultCode == RESULT_OK && data !=null){
                   byte[] result = data.getByteArrayExtra("result");
                   tv_result.setText(new String(result));

               }
               break;
           default:break;
       }
       // super.onActivityResult(requestCode, resultCode, data);
    }
}
