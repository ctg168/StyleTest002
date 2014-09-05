package com.jet2006.styletest002;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MyActivity extends Activity {

    TextView tvSwitchTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ThemeUtil.onActivityCreateSetTheme(this);
        setContentView(R.layout.fontstyle_example);

        tvSwitchTheme = (TextView) findViewById(R.id.tvSwitchTheme);

        tvSwitchTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SwitchTheme();
            }
        });
    }

    private void SwitchTheme() {
        ThemeUtil.changeTheme(this);
    }

}
