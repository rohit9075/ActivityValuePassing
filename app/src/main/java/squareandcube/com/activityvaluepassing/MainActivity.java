package squareandcube.com.activityvaluepassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mFirstName , mLastName;
    Button mSendData;
    String mFname , mLname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstName = findViewById(R.id.first_name);
        mLastName = findViewById(R.id.last_name);
        mSendData = findViewById( R.id.send_data);

        mFirstName.setOnClickListener(this);
        mLastName.setOnClickListener(this);
        mSendData.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent mResultIntent = new Intent(getApplicationContext() , ResultActivity.class);
        Bundle mBundle = new Bundle();


        if (v.getId() == R.id.send_data) {
            String mFname, mLname;

            mFname = mFirstName.getText().toString();
            mLname = mLastName.getText().toString();

//Inserts a String value into the mapping of this Bundle

            mBundle.putString("Fname" , mFname);
            mBundle.putString("Lname" , mLname);

//Add the bundle to the intent.

            mResultIntent.putExtras(mBundle);

            startActivity(mResultIntent);




        }
    }
}
