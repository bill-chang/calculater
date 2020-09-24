package tw.org.iii.bill.interviewwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnIncrease;
    private Button btnLess;
    private Button btnMult;
    private Button btnExcept;
    private TextView tv;
    private TextView tv2;
    private Button btnAC;
    private Button btnResult;
    private Button btnDot;
    private final char Add='+';
    private final char Less='-';
    private final char Multi='*';
    private final char Division='/';
    private final char Equ=0;
    private double val1=Double.NaN;
    private double val2;
    private char Action;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpViews();


    }

    private void setUpViews(){
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnIncrease=(Button)findViewById(R.id.btnIncrease);
        btnLess=(Button)findViewById(R.id.btnLess);
        btnMult=(Button)findViewById(R.id.btnMult);
        btnExcept=(Button)findViewById(R.id.btnExcept);

        btnResult=(Button)findViewById(R.id.btnResult);
        btnAC=(Button)findViewById(R.id.btnAC);
        tv=(TextView)findViewById(R.id.tv);
        tv2=(TextView)findViewById(R.id.tv2);



    }
    private void compute(){
        if(!Double.isNaN(val1)){
            val2=Double.parseDouble(tv.getText().toString());

            switch (Action){
                case Add:
                    val1=val1+val2;
                    break;
                case Less:
                    val1=val1-val2;
                    break;
                case Multi:
                    val1=val1*val2;
                    break;
                case Division:
                    val1=val1/val2;
                    break;
                case Equ:
                    break;
            }
        }
        else{
            val1=Double.parseDouble(tv.getText().toString());
        }
    }

    public void number1(View view) {
        tv.setText(tv.getText().toString()+"1");
    }

    public void number2(View view) {
        tv.setText(tv.getText().toString()+"2");
    }

    public void number3(View view) {
        tv.setText(tv.getText().toString()+"3");
    }

    public void number4(View view) {
        tv.setText(tv.getText().toString()+"4");
    }

    public void number5(View view) {
        tv.setText(tv.getText().toString()+"5");
    }

    public void number6(View view) {
        tv.setText(tv.getText().toString()+"6");
    }

    public void number7(View view) {
        tv.setText(tv.getText().toString()+"7");
    }

    public void number8(View view) {
        tv.setText(tv.getText().toString()+"8");
    }

    public void number9(View view) {
        tv.setText(tv.getText().toString()+"9");
    }

    public void number0(View view) {
        tv.setText(tv.getText().toString()+"0");
    }

    public void numberAC(View view) {
        if(tv.getText().length()>0){
            CharSequence name=tv.getText().toString();
            tv.setText(name.subSequence(0,name.length()-1));

        } else{
         val1=Double.NaN;
         val2=Double.NaN;
         tv.setText(null);
         tv2.setText(null);
        }
    }



    public void numberIncrease(View view) {
        compute();
        Action=Add;
        tv2.setText(String.valueOf(val1)+"+");
        tv.setText(null);

    }

    public void numberLess(View view) {
        compute();
        Action=Less;
        tv2.setText(String.valueOf(val1)+"-");
        tv.setText(null);
    }

    public void numberExcept(View view) {
        compute();
        Action=Division;
        tv2.setText(String.valueOf(val1)+"/");
        tv.setText(null);
    }

    public void numberMult(View view) {
        compute();
        Action=Multi;
        tv2.setText(String.valueOf(val1)+"*");
        tv.setText(null);
    }

    public void numberResult(View view) {
        compute();
        Action=Equ;
        tv2.setText(tv2.getText().toString()+String.valueOf(val2)+"="+String.valueOf(val1));
        tv.setText(String.valueOf(val1));
    }
}