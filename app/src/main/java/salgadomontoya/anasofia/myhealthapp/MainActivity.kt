package salgadomontoya.anasofia.myhealthapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peso: EditText= findViewById(R.id.weight) as EditText
        val altura: EditText= findViewById(R.id.height) as EditText
        val calcular: Button= findViewById(R.id.calculate) as Button
        val imc: TextView= findViewById(R.id.imc) as TextView
        val range: TextView= findViewById(R.id.range) as TextView

        calcular.setOnClickListener(){

            var p:Float= peso.text.toString().toFloat()
            var a: Float= altura.text.toString().toFloat()

            var imc2: Float= (p/(a*a))

            imc.setText(""+ imc2)

            if(imc2 < 18.5){
                range.setBackgroundResource(R.color.greenish)
                range.setText("Debajo de tu peso")
            }
            if(imc2 >=18.5 && imc2 <= 24.9 ){

                range.setBackgroundResource(R.color.green)
                range.setText("Saludable")
            }
            if(imc2 >=25 && imc2 <=29.9){

                range.setBackgroundResource(R.color.yellow)
                range.setText("Sobrepeso")
            }
            if(imc2 >=30 && imc2 <39.9){

                range.setBackgroundResource(R.color.orange)
                range.setText("Obesidad")
            }
            if(imc2 >=40){

                range.setBackgroundResource(R.color.red)
                range.setText("Obesidad mòrbida")
            }

        }



    }
}
