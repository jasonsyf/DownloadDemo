package com.jason_syf.downloaddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;
import com.jason_syf.downloaddemo.download.DownLoadUtil;

public class MainActivity extends AppCompatActivity {
    private String m360SafeUrl =
            "http://msoftdl.360.cn/mobile/shouji360/360safesis/198227/360MobileSafe_7.7.3.1016.apk";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatButton btn_download = (AppCompatButton) findViewById(R.id.btn_download);
//        DownLoadUtil.insrance.registerReceiver(this, DownloadCompleteReceiver.class);
        btn_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点击了下载按钮", Toast.LENGTH_SHORT).show();
//                此处放在需要监听安装的逻辑上，比如后台提供的接口检查版本号与最新的不一致，调用此方法
                DownLoadUtil.insrance.startInstall(MainActivity.this, m360SafeUrl);
            }
        });
    }
}
