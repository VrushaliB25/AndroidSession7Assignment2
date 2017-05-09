package example.com.androidsession7assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.provider.ContactsContract;



public class MainActivity extends AppCompatActivity {
    Button phonecontacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phonecontacts = (Button) findViewById(R.id.phonecontacts);

        phonecontacts.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);      //To display the details use ACTION_VIEW action
                intent.setData(ContactsContract.Contacts.CONTENT_URI);    //specify the contact with a content: URI as the intent data.
                startActivity(intent);

            }

        });
    }
}
