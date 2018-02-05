package ca.ualberta.jquist_subbook;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Bundle b = getIntent().getExtras();
        int key = b.getInt("key");

        Button saveButton = findViewById(R.id.saveB);

        final SubList subscriptions = new SubList();
        final Subscription subscription;

        if(key != -1) {
            subscription = new Subscription();
        }
        else {
            subscription = new Subscription();
        }

        final EditText nameText = findViewById(R.id.nameText);
        final EditText dateText = findViewById(R.id.startDate);
        final EditText costText = findViewById(R.id.costText);
        final EditText commText = findViewById(R.id.commentText);


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean end = true;
                subscription.setName(nameText.getText().toString());
                DateFormat format = new SimpleDateFormat("DD-MM-YYYY", Locale.CANADA);
                try {
                    subscription.setStart(format.parse(dateText.getText().toString()));
                } catch (ParseException e) {
                    Snackbar warning = Snackbar.make(findViewById(R.id.editLayout), "Invalid date", Snackbar.LENGTH_SHORT);
                    warning.show();
                    end = false;
                }
                subscription.setCost(Double.parseDouble(costText.getText().toString()));
                subscription.setComment(commText.getText().toString());
                subscriptions.addSub(subscription);
                if(end) {
                    finish();
                }
            }
        });

        Button delButton = findViewById(R.id.delB);
        delButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
