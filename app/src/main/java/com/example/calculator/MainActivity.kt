package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.botaosomar.setOnClickListener {calcular()}
    }

    fun calcular(){
        val numero1DoLayout = binding.digitaNumeros1.text.toString().toDouble()
        val numero2DoLayout = binding.digitaNumeros2.text.toString().toDouble()
        val operacaoSelecionada = binding.radiogroup1.checkedRadioButtonId
        val resultado = when (operacaoSelecionada){
            R.id.opcaoSoma -> Calculadora().Somar(numero1DoLayout, numero2DoLayout)
            else -> Calculadora().Dividir(numero1DoLayout, numero2DoLayout)
        }
        binding.mostraResultado.text = resultado.toString()
    }

    class Calculadora {
        fun Somar(N1: Double, N2: Double): Double {
            val soma = N1 + N2
            return (soma)
        }

        fun Dividir(N1: Double, N2: Double): Double {
            val dividir = N1 + N2
            return (dividir)
        }
    }

}