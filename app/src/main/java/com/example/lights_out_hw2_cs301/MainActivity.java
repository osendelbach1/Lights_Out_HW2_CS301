package com.example.lights_out_hw2_cs301;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.SurfaceView;
import android.os.Bundle;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button declaration
        public Button[] gameBoard = new Button[25]; //game board that holds 25 button indexes
        TextView txtV = null;
        Button button0 = null;
        Button button1 = null;
        Button button2 = null;
        Button button3 = null;
        Button button4 = null;
        Button button5 = null;
        Button button6 = null;
        Button button7 = null;
        Button button8 = null;
        Button button9 = null;
        Button button10 = null;
        Button button11 = null;
        Button button12 = null;
        Button button13 = null;
        Button button14 = null;
        Button button15 = null;
        Button button16 = null;
        Button button17 = null;
        Button button18 = null;
        Button button19 = null;
        Button button20 = null;
        Button button21 = null;
        Button button22 = null;
        Button button23 = null;
        Button button24 = null;
        Button reset = null; // reset button to scramble the board again
        public Boolean[] blackOrWhite = new Boolean[25]; // lets you know if the button tile is black or white



    }

    @Override
    public void onClick(View view) {

        //setting each button assigned to a the board via index and ID
        reset = findViewById(R.id.reset);
        txtV = findViewById(R.id.textView);
        gameBoard[0] = findViewById(R.id.button0);
        gameBoard[1] = findViewById(R.id.button1);
        gameBoard[2] = findViewById(R.id.button2);
        gameBoard[3] = findViewById(R.id.button3);
        gameBoard[4] = findViewById(R.id.button4);
        gameBoard[5] = findViewById(R.id.button5);
        gameBoard[6] = findViewById(R.id.button6);
        gameBoard[7] = findViewById(R.id.button7);
        gameBoard[8] = findViewById(R.id.button8);
        gameBoard[9] = findViewById(R.id.button9);
        gameBoard[10] = findViewById(R.id.button10);
        gameBoard[11] = findViewById(R.id.button11);
        gameBoard[12] = findViewById(R.id.button12);
        gameBoard[13] = findViewById(R.id.button13);
        gameBoard[14] = findViewById(R.id.button14);
        gameBoard[15] = findViewById(R.id.button15);
        gameBoard[16] = findViewById(R.id.button16);
        gameBoard[17] = findViewById(R.id.button17);
        gameBoard[18] = findViewById(R.id.button18);
        gameBoard[19] = findViewById(R.id.button19);
        gameBoard[20] = findViewById(R.id.button20);
        gameBoard[21] = findViewById(R.id.button21);
        gameBoard[22] = findViewById(R.id.button22);
        gameBoard[23] = findViewById(R.id.button23);
        gameBoard[24] = findViewById(R.id.button24);

        //implimenting the onClick listener for every button
        (Button button: gameBoard)
        {
            gameBoard.setOnClickListener(this);
        }
        reset.setOnClickListener(this);
        gameBoardStart();//starts game
    }
}