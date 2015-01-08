package pl.zielony.materialsamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nineoldandroids.animation.Animator;

import pl.zielony.material.animation.AnimUtils;
import pl.zielony.material.animation.DefaultAnimatorListener;

/**
 * Created by Marcin on 2014-12-15.
 */
public class AnimationsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);

        final View fabLayout = findViewById(R.id.fabLayout);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fabLayout.getVisibility()!=View.VISIBLE){
                    fabLayout.setVisibility(View.VISIBLE);
                }else {
                    fabLayout.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
