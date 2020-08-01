package com.iamstmvasan.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button restart , one , two , three , four , five , six , seven , eight , nine;
    private ImageView winImage;
    private Toolbar toolbar;

    private int button_Click = 0;
    private boolean gameIsRun = true , same = false;
    private String[][] array = new String[3][3];
    private String str;
    private boolean b1 = true , b2 = true ,b3 = true ,b4 = true ,b5 = true ,b6 = true ,b7 = true ,b8 = true ,b9 = true ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Tic Tac Toe");

        toolbar.setTitleTextColor(Color.WHITE);
        textView = findViewById(R.id.textView);
        restart = findViewById(R.id.restart);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        winImage = findViewById(R.id.win_img);

        setArray();

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one.setBackgroundResource(R.drawable.btn);
                two.setBackgroundResource(R.drawable.btn);
                three.setBackgroundResource(R.drawable.btn);
                four.setBackgroundResource(R.drawable.btn);
                five.setBackgroundResource(R.drawable.btn);
                six.setBackgroundResource(R.drawable.btn);
                seven.setBackgroundResource(R.drawable.btn);
                eight.setBackgroundResource(R.drawable.btn);
                nine.setBackgroundResource(R.drawable.btn);
                restart.setVisibility(View.INVISIBLE);
                winImage.setVisibility(View.INVISIBLE);
                textView.setText("\"X\" Turn");
                gameIsRun = true;
                button_Click = 0;
                same = false;
                setArray();

                b1 = true;
                b2 = true;
                b3 = true;
                b4 = true;
                b5 = true;
                b6 = true;
                b7 = true;
                b8 = true;
                b9 = true ;
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart.setVisibility(View.VISIBLE);
                if(gameIsRun) {
                    if(b1) {
                        b1 = false;
                        //String str;
                        button_Click++;
                        if (button_Click % 2 != 0) {
                            str = "X";
                            textView.setText("\"O\" turn");
                            one.setBackgroundResource(R.drawable.xblack);
                        }
                        else {
                            str = "O";
                            textView.setText("\"X\" turn");
                            one.setBackgroundResource(R.drawable.oblack);
                        }

                        //one.setText(str);
                        array[0][0] = str;
                        if (button_Click >= 5) {
                            horizontal(0, 0, str);
                            vertical(0, 0, str);
                            left_cross(0, 0, str);
                        }
                        if(button_Click == 9 && same == false)
                            winning("Match is Tie !");
                    }
                    else
                        Toast.makeText(MainActivity.this, "Already Placed ...", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Click Restart Button...", Toast.LENGTH_SHORT).show();
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart.setVisibility(View.VISIBLE);
                if(gameIsRun) {
                    if (b2) {
                        b2 = false;
                        //String str;
                        button_Click++;
                        if (button_Click % 2 != 0) {
                            str = "X";
                            textView.setText("\"O\" turn");
                            two.setBackgroundResource(R.drawable.xblack);
                        }
                        else {
                            str = "O";
                            textView.setText("\"X\" turn");
                            two.setBackgroundResource(R.drawable.oblack);
                        }
                        //two.setText(str);
                        array[0][1] = str;
                        if (button_Click >= 5) {
                            horizontal(0, 0, str);
                            vertical(0, 1, str);
                        }
                        if(button_Click == 9 && same == false)
                            winning("Match is Tie !");
                    }
                    else
                        Toast.makeText(MainActivity.this, "Already Placed ...", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Click Restart Button...", Toast.LENGTH_SHORT).show();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart.setVisibility(View.VISIBLE);
                if(gameIsRun) {
                    if (b3) {
                        b3 = false;
                        //String str;
                        button_Click++;
                        if (button_Click % 2 != 0) {
                            str = "X";
                            textView.setText("\"O\" turn");
                            three.setBackgroundResource(R.drawable.xblack);
                        }
                        else {
                            str = "O";
                            textView.setText("\"X\" turn");
                            three.setBackgroundResource(R.drawable.oblack);
                        }
                        //three.setText(str);
                        array[0][2] = str;
                        if (button_Click >= 5) {
                            horizontal(0, 0, str);
                            vertical(0, 2, str);
                            right_cross(0, 2, str);
                        }
                        if(button_Click == 9 && same == false)
                            winning("Match is Tie !");
                    }
                    else
                        Toast.makeText(MainActivity.this, "Already Placed ...", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Click Restart Button...", Toast.LENGTH_SHORT).show();
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart.setVisibility(View.VISIBLE);
                if(gameIsRun) {
                    if (b4) {
                        b4 = false;
                        //String str;
                        button_Click++;
                        if (button_Click % 2 != 0) {
                            str = "X";
                            textView.setText("\"O\" turn");
                            four.setBackgroundResource(R.drawable.xblack);
                        }
                        else {
                            str = "O";
                            textView.setText("\"X\" turn");
                            four.setBackgroundResource(R.drawable.oblack);
                        }

                        //four.setText(str);
                        array[1][0] = str;
                        if (button_Click >= 5) {
                            horizontal(1, 0, str);
                            vertical(0, 0, str);
                        }
                        if(button_Click == 9 && same == false)
                            winning("Match is Tie !");
                    }
                    else
                        Toast.makeText(MainActivity.this, "Already Placed ...", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Click Restart Button...", Toast.LENGTH_SHORT).show();
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart.setVisibility(View.VISIBLE);
                if(gameIsRun) {
                    if (b5) {
                        b5 = false;
                        //String str;
                        button_Click++;
                        if (button_Click % 2 != 0) {
                            str = "X";
                            textView.setText("\"O\" turn");
                            five.setBackgroundResource(R.drawable.xblack);
                        }
                        else {
                            str = "O";
                            textView.setText("\"X\" turn");
                            five.setBackgroundResource(R.drawable.oblack);
                        }

                        //five.setText(str);
                        array[1][1] = str;
                        if (button_Click >= 5) {
                            horizontal(1, 0, str);
                            vertical(0, 1, str);
                            right_cross(0, 2, str);
                            left_cross(0, 0, str);
                        }
                        if(button_Click == 9 && same == false)
                            winning("Match is Tie !");
                    }
                    else
                        Toast.makeText(MainActivity.this, "Already Placed ...", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Click Restart Button...", Toast.LENGTH_SHORT).show();
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart.setVisibility(View.VISIBLE);
                if(gameIsRun) {
                    if (b6) {
                        //String str;
                        b6 = false;
                        button_Click++;
                        if (button_Click % 2 != 0) {
                            str = "X";
                            textView.setText("\"O\" turn");
                            six.setBackgroundResource(R.drawable.xblack);
                        }
                        else {
                            str = "O";
                            textView.setText("\"X\" turn");
                            six.setBackgroundResource(R.drawable.oblack);
                        }

                        //six.setText(str);
                        array[1][2] = str;
                        if (button_Click >= 5) {
                            horizontal(1, 0, str);
                            vertical(0, 2, str);

                        }
                        if(button_Click == 9 && same == false)
                            winning("Match is Tie !");
                    }
                    else
                        Toast.makeText(MainActivity.this, "Already Placed ...", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Click Restart Button...", Toast.LENGTH_SHORT).show();
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart.setVisibility(View.VISIBLE);
                if(gameIsRun) {
                    if (b7) {
                        b7 = false;
                        //String str;
                        button_Click++;
                        if (button_Click % 2 != 0) {
                            str = "X";
                            textView.setText("\"O\" turn");
                            seven.setBackgroundResource(R.drawable.xblack);
                        }
                        else {
                            str = "O";
                            textView.setText("\"X\" turn");
                            seven.setBackgroundResource(R.drawable.oblack);
                        }

                        //seven.setText(str);
                        array[2][0] = str;
                        if (button_Click >= 5) {
                            horizontal(2, 0, str);
                            vertical(0, 0, str);
                            right_cross(0, 2, str);
                        }
                        if(button_Click == 9 && same == false)
                            winning("Match is Tie !");
                    }
                    else
                        Toast.makeText(MainActivity.this, "Already Placed ...", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Click Restart Button...", Toast.LENGTH_SHORT).show();
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart.setVisibility(View.VISIBLE);
                if(gameIsRun) {
                    if (b8) {
                        b8 = false;
                        button_Click++;
                        if (button_Click % 2 != 0) {
                            str = "X";
                            textView.setText("\"O\" turn");
                            eight.setBackgroundResource(R.drawable.xblack);
                        }
                        else {
                            str = "O";
                            textView.setText("\"X\" turn");
                            eight.setBackgroundResource(R.drawable.oblack);
                        }

                        //eight.setText(str);
                        array[2][1] = str;
                        if (button_Click >= 5) {
                            horizontal(2, 0, str);
                            vertical(0, 1, str);

                        }
                        if(button_Click == 9 && same == false)
                            winning("Match is Tie !");
                    }
                    else
                        Toast.makeText(MainActivity.this, "Already Placed ...", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Click Restart Button...", Toast.LENGTH_SHORT).show();
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart.setVisibility(View.VISIBLE);
                if(gameIsRun) {
                    if (b9) {
                        b9 = false;
                        //String str;
                        button_Click++;
                        if (button_Click % 2 != 0) {
                            str = "X";
                            textView.setText("\"O\" turn");
                            nine.setBackgroundResource(R.drawable.xblack);
                        }
                        else {
                            str = "O";
                            textView.setText("\"X\" turn");
                            nine.setBackgroundResource(R.drawable.oblack);
                        }

                        //nine.setText(str);
                        array[2][2] = str;
                        if (button_Click >= 5) {
                            horizontal(2, 0, str);
                            vertical(0, 2, str);
                            left_cross(0, 0, str);

                        }
                        if(button_Click == 9 && same == false)
                            winning("Match is Tie !");
                    }
                    else
                        Toast.makeText(MainActivity.this, "Already Placed ...", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Click Restart Button...", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void horizontal(int row , int column , String str){
        if(array[row][column++].equalsIgnoreCase(str) && array[row][column++].equalsIgnoreCase(str) && array[row][column++].equalsIgnoreCase(str)) {
            same = true;
            if (str.equalsIgnoreCase("X")) {

                if (row == 0) {
                one.setBackgroundResource(R.drawable.xgreen);
                two.setBackgroundResource(R.drawable.xgreen);
                three.setBackgroundResource(R.drawable.xgreen);
                }
                else if (row == 1) {
                four.setBackgroundResource(R.drawable.xgreen);
                five.setBackgroundResource(R.drawable.xgreen);
                six.setBackgroundResource(R.drawable.xgreen);
                } else if (row == 2) {
                seven.setBackgroundResource(R.drawable.xgreen);
                eight.setBackgroundResource(R.drawable.xgreen);
                nine.setBackgroundResource(R.drawable.xgreen);
                }
            }
            else {
                if (row == 0) {
                    one.setBackgroundResource(R.drawable.ogreen);
                    two.setBackgroundResource(R.drawable.ogreen);
                    three.setBackgroundResource(R.drawable.ogreen);
                }
                else if (row == 1) {
                    four.setBackgroundResource(R.drawable.ogreen);
                    five.setBackgroundResource(R.drawable.ogreen);
                    six.setBackgroundResource(R.drawable.ogreen);
                } else if (row == 2) {
                    seven.setBackgroundResource(R.drawable.ogreen);
                    eight.setBackgroundResource(R.drawable.ogreen);
                    nine.setBackgroundResource(R.drawable.ogreen);
                }
            }
            winning("\""+str+"\""+" Won the game!");
        }
    }
    public void vertical(int row , int column , String str){
        if(array[row++][column].equalsIgnoreCase(str) && array[row++][column].equalsIgnoreCase(str) && array[row++][column].equalsIgnoreCase(str)){
            same = true;
            if(str.equalsIgnoreCase("X")) {
                if (column == 0) {
                    one.setBackgroundResource(R.drawable.xgreen);
                    four.setBackgroundResource(R.drawable.xgreen);
                    seven.setBackgroundResource(R.drawable.xgreen);
                } else if (column == 1) {
                    two.setBackgroundResource(R.drawable.xgreen);
                    five.setBackgroundResource(R.drawable.xgreen);
                    eight.setBackgroundResource(R.drawable.xgreen);
                } else if (column == 2) {
                    three.setBackgroundResource(R.drawable.xgreen);
                    six.setBackgroundResource(R.drawable.xgreen);
                    nine.setBackgroundResource(R.drawable.xgreen);
                }
            }
            else{
                if (column == 0) {
                    one.setBackgroundResource(R.drawable.ogreen);
                    four.setBackgroundResource(R.drawable.ogreen);
                    seven.setBackgroundResource(R.drawable.ogreen);
                } else if (column == 1) {
                    two.setBackgroundResource(R.drawable.ogreen);
                    five.setBackgroundResource(R.drawable.ogreen);
                    eight.setBackgroundResource(R.drawable.ogreen);
                } else if (column == 2) {
                    three.setBackgroundResource(R.drawable.ogreen);
                    six.setBackgroundResource(R.drawable.ogreen);
                    nine.setBackgroundResource(R.drawable.ogreen);
                }
            }
            winning("\""+str+"\""+" Won the game!");
        }
    }
    public void left_cross(int row , int column , String str){
        if(array[row++][column++].equalsIgnoreCase(str) && array[row++][column++].equalsIgnoreCase(str) && array[row++][column++].equalsIgnoreCase(str)) {
            same = true;
            if(str.equalsIgnoreCase("X")) {
                one.setBackgroundResource(R.drawable.xgreen);
                five.setBackgroundResource(R.drawable.xgreen);
                nine.setBackgroundResource(R.drawable.xgreen);
            }
            else {
                one.setBackgroundResource(R.drawable.ogreen);
                five.setBackgroundResource(R.drawable.ogreen);
                nine.setBackgroundResource(R.drawable.ogreen);
            }
            winning("\""+str+"\""+" Won the game!");
        }
    }
    public void right_cross(int row , int column , String str){
        if(array[row++][column--].equalsIgnoreCase(str) && array[row++][column--].equalsIgnoreCase(str) && array[row++][column--].equalsIgnoreCase(str)) {
            same = true;
            if(str.equalsIgnoreCase("X")) {
                three.setBackgroundResource(R.drawable.xgreen);
                five.setBackgroundResource(R.drawable.xgreen);
                seven.setBackgroundResource(R.drawable.xgreen);
            }
            else{
                three.setBackgroundResource(R.drawable.ogreen);
                five.setBackgroundResource(R.drawable.ogreen);
                seven.setBackgroundResource(R.drawable.ogreen);
            }
            winning("\""+str+"\""+" Won the game!");
        }
    }
    public void winning(String player){
        gameIsRun = false;
        textView.setText(player);
        winImage.setVisibility(View.VISIBLE);
    }
    public void setArray(){
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                array[i][j] = "";
    }
}
