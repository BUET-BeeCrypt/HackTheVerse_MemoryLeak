package com.engliplan.telelabclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button connectBTButton;
    private Client client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Bluetooth bluetooth = Bluetooth.getInstance();
        bluetooth.setContext(this);
        connectBTButton = (Button) findViewById(R.id.connectBTButton);
        connectBTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ConnectBTActivity.class);
                startActivity(intent);
            }
        });

        client=Client.getInstance();
        client.addOnCommandReceivedListener(new Client.OnCommandRecievedListener() {
            @Override
            public void onCommandRecieved(String command) {
                String step = command.split(" ")[1];
                String signalStep;
                switch (step) {
                    case "+":
                        signalStep = "-1";
                        break;
                    case "-":
                        signalStep = "1";
                        break;
                    default:
                        signalStep = "0";
                }
                bluetooth.sendSignal(signalStep);
                Toast.makeText(MainActivity.this,step,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError(String error) {
                Toast.makeText(MainActivity.this,error,Toast.LENGTH_LONG).show();
            }
        });
    }
}