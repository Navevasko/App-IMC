package br.senai.sp.jandira.imc20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.round
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criando as instancias das views
        //Para que possam ser manipuladas em kotlin
        val editTextPeso = findViewById<EditText>(R.id.edit_peso)
        val editTextAltura = findViewById<EditText>(R.id.edit_altura)
        val textViewResultado = findViewById<TextView>(R.id.view_resultado)
        val ButtonCalcular = findViewById<Button>(R.id.button_calcular)

        //Adicionando um evento de click no botão
        ButtonCalcular.setOnClickListener {

            if (editTextAltura.text.isEmpty()) {
                editTextAltura.error = "Preencha esse campo"
            }
            else if (editTextPeso.text.isEmpty()) {
                editTextPeso.error = "Preencha esse campo"
            }
            else {
                var peso = editTextPeso.text.toString().toDouble()
                var altura = editTextAltura.text.toString().toDouble()
                val imc = peso / (altura * altura)

                textViewResultado.text = String.format("%.1f", imc)
            }
        }

    }
}