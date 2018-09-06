package rohit.com.activityvaluepassing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity  {

    TextView mFiresName;
    TextView mLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);



        mFiresName = findViewById(R.id.first_name_result);
        mLastName =  findViewById(R.id.last_name_result);

        Bundle mResultBundle = getIntent().getExtras();

        mFiresName.setText(mResultBundle.getString("Fname"));
        mLastName.setText(mResultBundle.getString("Lname"));

    }
}
