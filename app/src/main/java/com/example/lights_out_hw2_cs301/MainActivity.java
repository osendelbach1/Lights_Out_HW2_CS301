package com.example.lights_out_hw2_cs301;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.SurfaceView;
import android.os.Bundle;
import java.util.Random;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button[] gameBoard = new Button[25]; //game board that holds 25 button indexes
    //button declaration
    private TextView txtV;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;
    private Button button21;
    private Button button22;
    private Button button23;
    private Button button24;
    private Button reset; // reset button to scramble the board again
    public Boolean[] blackOrWhite = new Boolean[25]; // lets you know if the button tile is black or white


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        //implementing the onClick listener for every button
        (Button button : gameBoard)
        {
            button.setOnClickListener(this);
        }
        reset.setOnClickListener(this);
        gameBoardStart();//starts game
    }

    private void gameBoardStart()
    {
        Random rand = new Random();
        for(int i = 0; i < 25; i++)
        {
            blackOrWhite[i] = rand.nextBoolean();
        }

        for(int i = 0; i<25; i++)
        {
            if(blackOrWhite[i] == true)
            {
                gameBoard[i].setBackgroundColor(Color.WHITE);
            }
            else
            {
                gameBoard[i].setBackgroundColor(Color.BLACK);
            }

        }
    }
    //methods below change the surrounding tile color from the initial tile you're currently on
    public boolean gameOverConditions()
    {
        int counter = 0;
        for(int i = 0; i < 25; i++)
        {
            if(blackOrWhite[i] == true)
            {
                counter++;
            }
        }
        if(counter == 25)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void switchRightSide(int x)
    {
        for(int i = 4; i < 25; i+= 5)
        {
            if(x == i)
            {
                return;
            }
        }
        x++;
        if(blackOrWhite[x] == true)
        {
            blackOrWhite[x] = false;
        }
        else if(!blackOrWhite[x])
        {
            blackOrWhite[x] = true;
        }
    }
    public void switchLeftSide(int x)
    {
        for(int i = 0; i < 25; i += 5)
        {
            if(x == i)
            {
                return;
            }
        }
        else if(!blackOrWhite[x])
        {
        blackOrWhite[x] = true;
        }
    }

    public void switchAbove(int x)
    {
        for(int i = 0; i < 5; i++)
        {
            if(x == i)
            {
                return;
            }
        }
        x -= 5;
        if(blackOrWhite[x]==true)
        {
            blackOrWhite[x] = false;
        }
        else if(!blackOrWhite[x])
        {
            blackOrWhite[x] = true;
        }
    }

    public void switchBelow(int x)
    {
        for(int i = 20; i < 25; i++)
        {
            if(x == i)
            {
                return;
            }
        }
        x += 5;
        if(blackOrWhite[x] == true)
        {
            blackOrWhite[x] = false;
        }
        else if(!blackOrWhite[x])
        {
            blackOrWhite[x] = true;
        }
    }




    @Override
    public void onClick(View view)
    {
        int x;

        if(view.getId() == R.id.buttonO) //sets the methods to each button for switching the surrounding area
        {
            x = 0;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button1)
        {
            x = 1;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button2)
        {
            x = 2;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button3)
        {
            x = 3;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button4)
        {
            x = 4;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button5)
        {
            x = 5;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button6)
        {
            x = 6;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button7)
        {
            x = 7;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button8)
        {
            x = 8;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button9)
        {
            x = 9;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button10)
        {
            x = 10;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button11)
        {
            x = 11;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button12)
        {
            x = 12;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button13)
        {
            x = 13;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button14)
        {
            x = 14;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button15)
        {
            x = 15;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button16)
        {
            x = 16;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button17)
        {
            x = 17;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button18)
        {
            x = 18;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button19)
        {
            x = 19;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button20)
        {
            x = 20;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button21)
        {
            x = 21;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button22)
        {
            x = 22;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button23)
        {
            x = 23;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.button24)
        {
            x = 24;
            switchLeftSide(x);
            switchAbove(x);
            switchRightSide(x);
            switchBelow(x);

            if(blackOrWhite[x] == true)
            {
                blackOrWhite[x] = false;
            }
            else if(blackOrWhite[x] == false)
            {
                blackOrWhite[x] = true;
            }
        }
        else if(view.getId() == R.id.reset)
        {
            gameBoardStart();
        }

        for(int i = 0; i < 25; i++)
        {
            if(blackOrWhite[i])
            {
                gameBoard[i].setBackgroundColor(Color.WHITE);
            }
            else
            {
                gameBoard[i].setBackgroundColor(Color.BLACK);
            }
        }
        if(gameOverConditions())
        {
            txtV.setText("You win! Good Job you get a cookie");
        }

    }
}

