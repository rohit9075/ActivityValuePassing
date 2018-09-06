package rohit.com.activityvaluepassing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity  {

    TextView mFirstNameIntent, mFirstNameBundle;
    TextView mLastNameIntent, mLastNameBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);



        mFirstNameIntent = findViewById(R.id.first_name_result_intent);
        mLastNameIntent =  findViewById(R.id.last_name_result_intent);


        mFirstNameBundle = findViewById(R.id.first_name_result_bundle);
        mLastNameBundle =  findViewById(R.id.last_name_result_bundle);

        Bundle mResultBundle = getIntent().getExtras();

        if (mResultBundle != null){

            mFirstNameIntent.setText(mResultBundle.getString("FnameBundle"));
            mLastNameIntent.setText(mResultBundle.getString("LnameBundle"));


        }


        mFirstNameBundle.setText(getIntent().getStringExtra("Fname"));
        mLastNameBundle.setText(getIntent().getStringExtra("Lname"));

    }
}
