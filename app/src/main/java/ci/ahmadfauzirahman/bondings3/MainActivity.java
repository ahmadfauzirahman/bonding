package ci.ahmadfauzirahman.bondings3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import ci.ahmadfauzirahman.bondings3.diary.DiaryActivity;
import ci.ahmadfauzirahman.bondings3.kehamilan.KehamilanActivity;
import ci.ahmadfauzirahman.bondings3.musik.MusikActivity;
import ci.ahmadfauzirahman.bondings3.group.GroupChatActivity;
import ci.ahmadfauzirahman.bondings3.settings.SettingsActivity;
import ci.ahmadfauzirahman.bondings3.tips.TipsKehamilanActivity;

public class MainActivity extends AppCompatActivity {

    CardView kehamilanKu, tipsKehamilanku, diary, musik, groupChat, settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kehamilanKu = findViewById(R.id.kehamilanKu);
        tipsKehamilanku = findViewById(R.id.tipsKehamilanku);
        diary = findViewById(R.id.diary);
        musik = findViewById(R.id.musik);
        groupChat = findViewById(R.id.groupChat);
        settings = findViewById(R.id.settings);

        kehamilanKu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), KehamilanActivity.class));
            }
        });
        tipsKehamilanku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), TipsKehamilanActivity.class));
            }
        });
        diary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DiaryActivity.class));
            }
        });
        musik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MusikActivity.class));
            }
        });
        groupChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), GroupChatActivity.class));
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
            }
        });
    }
}