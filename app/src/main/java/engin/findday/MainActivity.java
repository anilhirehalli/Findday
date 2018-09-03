package engin.findday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

import static android.R.id.input;

public class MainActivity extends AppCompatActivity {

    Button but_ton;
    EditText da_te;
    TextView txtView,textView1;
    int a, b=0, e, g, i, j, k, l, m, n, o, p, q, r;
    int c = 0, f = 0, h = 0;
    String a1;
    char[] d = new char[11];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        but_ton = (Button) findViewById(R.id.but_ton);
        da_te = (EditText) findViewById(R.id.da_te);
        txtView = (TextView) findViewById(R.id.txtView);
        textView1 = (TextView) findViewById(R.id.textView1);
        but_ton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a1 = da_te.getText().toString();
                b=a1.length();
                textView1.setText(a1);

                //txtView.setText(b);
               if(b==10)
                {

                    d[0]=a1.charAt(0);
                    d[1]=a1.charAt(1);
                    d[2]=a1.charAt(2);
                    d[3]=a1.charAt(3);
                    d[4]=a1.charAt(4);
                    d[5]=a1.charAt(5);
                    d[6]=a1.charAt(6);
                    d[7]=a1.charAt(7);
                    d[8]=a1.charAt(8);
                    d[9]=a1.charAt(9);

                    third();
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this, error.class);
                    startActivity(intent);
                    finish();



                }
            }
        });


    }

            public void third()
            {
                for(a=0;a<10;a++)
                {
                    if(d[a]!='/')
                    {

                        c=((c*10)+d[a]);
                        c=c-48;

                    }
                    else
                    {

                        break;
                    }
                }
                fourth();
            }
            public void fourth()
            {
                for(e=(a+1);e<10;e++)
                {
                    if(d[e]!='/')
                    { f=((f*10)+d[e]);
                        f=f-48;
                    }
                    else
                    {

                        break;
                    }
                }
            fifth();
            }
            public void fifth()
            {
                for(g=(e+1);g<10;g++)
                {
                    h=((h*10)+d[g]);
                    h=h-48;

                }
                sixth();
            }
            public void sixth()
            {
                i=((d[8]-48)*10)+(d[9]-48);
                if((((i%4)==0)&&(f==2)&&(c<=29))||(((i%4)!=0)&&(f==2)&&(c<=28))||(((f==1)||(f==3)||(f==5)||(f==7)||(f==8)||(f==10)||(f==12))&&(c<=31))||(((f==4)||(f==6)||(f==9)||(f==11))&&(c<=30)))
                {
                    seventh();


                }
		 /*else if(((i%4)!=0)&&(f==2)&&(c<=28))
		 {
			System.out.println("Correct febraray");
		 }
		else if(((f==1)||(f==3)||(f==5)||(f==7)||(f==8)||(f==10)||(f==12))&&(c<=31))
		{
			System.out.println("Correct months");
		}
    else if(((f==4)||(f==6)||(f==9)||(f==11))&&(c<=30))
		{
			System.out.println("Correct year");
		}*/

                else
                {
                    Intent intent = new Intent(MainActivity.this, error.class);
                    startActivity(intent);
                    finish();
                }
            }
            public void seventh()
            {
                l=(i-1);
                if((h%400)==0)
                {
                    j=0;
                }
                else if((h%400)>300)
                {
                    j=1;

                }
                else if((h%400)>200)
                {
                    j=2;

                }
                else if((h%400)>100)
                {
                    j=3;

                }
                else if((h%400)<100)
                {
                    j=0;
                }
                eigth();
            }
            public void eigth()
            {

                k=(l%4);
                m=l-k;
                n=(m/4);
                o=(l-n);
                p=n*2;
                q=p+j+o+c;
                q=(q%7);

                switch(f)
                {
                    case 1: r=0;
                        break;
                    case 2: r=3;
                        break;
                    case 3: r=3;
                        break;
                    case 4: r=6;
                        break;
                    case 5: r=8;
                        break;
                    case 6: r=11;
                        break;
                    case 7: r=13;
                        break;
                    case 8: r=16;
                        break;
                    case 9: r=19;
                        break;
                    case 10: r=21;
                        break;
                    case 11: r=24;
                        break;
                    case 12: r=26;
                        break;

                }
                q=q+r;
                q=(q%7);
                nine();
            }

            public void nine()
            {
                switch(q)
                {
                    case 0:Intent intent = new Intent(MainActivity.this, sunday.class);
                        startActivity(intent);
                        finish();
                        break;
                    case 1: Intent intent1 = new Intent(MainActivity.this, monday.class);
                        startActivity(intent1);
                        finish();
                        break;
                    case 2: Intent intent2 = new Intent(MainActivity.this, tuesday.class);
                        startActivity(intent2);
                        finish();
                        break;
                    case 3: Intent intent3 = new Intent(MainActivity.this, wednesday.class);
                        startActivity(intent3);
                        finish();
                        break;
                    case 4: Intent intent4 = new Intent(MainActivity.this, thrusday.class);
                        startActivity(intent4);
                        finish();
                        break;
                    case 5: Intent intent5 = new Intent(MainActivity.this, friday.class);
                        startActivity(intent5);
                        finish();
                        break;
                    case 6: Intent intent6 = new Intent(MainActivity.this, saturday.class);
                        startActivity(intent6);
                        finish();
                        break;

                }
            }
        }





