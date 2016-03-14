package com.example.chimawarade.androidservic;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.MalformedURLException;
import java.net.URL;

public class pdfDownActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_down);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditText f1   = (EditText)findViewById(R.id.editText);
        EditText f2   = (EditText)findViewById(R.id.editText2);
        EditText f3   = (EditText)findViewById(R.id.editText3);
        EditText f4   = (EditText)findViewById(R.id.editText4);
        EditText f5   = (EditText)findViewById(R.id.editText5);

        f1.setText("https://www.cisco.com/web/about/ac79/docs/innov/IoE.pdf");
        f2.setText("http://www.cisco.com/web/about/ac79/docs/innov/IoE_Economy.pdf");
        f3.setText("http://www.cisco.com/web/strategy/docs/gov/everything-for-cities.pdf");
        f4.setText("http://www.cisco.com/web/offer/gist_ty2_asset/Cisco_2014_ASR.pdf");
        f5.setText("http://www.cisco.com/web/offer/emear/38586/images/Presentations/P3.pdf");
       //<---------------------------------------------------------------

                Button strt = (Button) findViewById(R.id.button3);
                strt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getBaseContext(), MyService.class);
                        try {
                            URL[] urls = new URL[]{
                                    new URL("https://www.cisco.com/web/about/ac79/docs/innov/IoE.pdf"),
                                    new URL("http://www.cisco.com/web/about/ac79/docs/innov/IoE_Economy.pdf"),
                                    new URL("http://www.cisco.com/web/strategy/docs/gov/everything-for-cities.pdf"),
                                    new URL("http://www.cisco.com/web/offer/gist_ty2_asset/Cisco_2014_ASR.pdf"),
                                    new URL("http://www.cisco.com/web/offer/emear/38586/images/Presentations/P3.pdf")};
                            intent.putExtra("URLs", urls);


                        } catch (MalformedURLException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        startService(intent);
                    }
                });


//>-------------------------------------------------------------------------------------------------
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
