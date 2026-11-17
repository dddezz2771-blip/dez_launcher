package com.dez.launcher;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btn = new Button(this);
        btn.setText("ЗАПУСТИТЬ MINECRAFT");
        btn.setOnClickListener(v -> {
            Intent i = getPackageManager().getLaunchIntentForPackage("com.mojang.minecraftpe");
            if (i != null) startActivity(i);
            else Toast.makeText(this, "Minecraft не установлен", Toast.LENGTH_SHORT).show();
        });
        setContentView(btn);
    }
}
