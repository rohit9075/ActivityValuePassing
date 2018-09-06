package rohit.com.activityvaluepassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mFirstName , mLastName;
    Button mSendDataUsingBundle, mSendDataUsingIntnet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstName = findViewById(R.id.first_name);
        mLastName = findViewById(R.id.last_name);
        mSendDataUsingBundle = findViewById( R.id.send_data_using_bundle);
        mSendDataUsingIntnet = findViewById( R.id.send_data_using_intent);

        mSendDataUsingIntnet.setOnClickListener(this);
        mSendDataUsingBundle.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case  R.id.send_data_using_bundle:
                sendUsingBundle();
                break;
            case R.id.send_data_using_intent:
                usignIntent();
                break;
        }

    }

    /**
     * method to send data to activity using intent
     */

    private void usignIntent() {
        Intent mResultIntent = new Intent(getApplicationContext() , ResultActivity.class);

        String mFname, mLname;

        mFname = mFirstName.getText().toString();
        mLname = mLastName.getText().toString();

//Inserts a String value into the mapping of this Bundle

        mResultIntent.putExtra("Fname" , mFname);
        mResultIntent.putExtra("Lname" , mLname);

//Add the bundle to the intent.

        startActivity(mResultIntent);
    }


    /**
     * method to send data using bundle
     */
    private void sendUsingBundle() {
        Intent mResultIntent = new Intent(getApplicationContext() , ResultActivity.class);
        Bundle mBundle = new Bundle();

        String mFname, mLname;

        mFname = mFirstName.getText().toString();
        mLname = mLastName.getText().toString();

//Inserts a String value into the mapping of this Bundle

        mBundle.putString("FnameBundle" , mFname);
        mBundle.putString("LnameBundle" , mLname);

//Add the bundle to the intent.

        mResultIntent.putExtras(mBundle);
        startActivity(mResultIntent);
    }
}
