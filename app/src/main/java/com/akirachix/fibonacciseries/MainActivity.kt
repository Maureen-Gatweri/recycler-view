package com.akirachix.fibonacciseries

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.fibonacciseries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fibNumb=fibonums(100)
        binding.rvNumbers.layoutManager=GridLayoutManager(this,4)
        val numAdapter=FiboSeries(fibNumb)
        binding.rvNumbers.adapter=numAdapter










        }
    fun fibonums(x:Int):List<Int>{
        val numb= mutableListOf(0,1)
        while (numb.size<100){
            numb.add(numb[numb.lastIndex]+numb[numb.lastIndex -1])

            }
        return  numb
    }
    }
