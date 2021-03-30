package com.berin.sayitahminoyunodev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var puan = 100
        val randomSayi = Random.nextInt(1,101)
        mesaj.text = "Lütfen Bir Sayı Giriniz"
        skorView.text = "Skorunuz:"

        tahminButton.setOnClickListener {

            val kullanicitahmini = tahmin.text.toString().toInt()
            if(randomSayi==kullanicitahmini){
                mesaj.text = "Tebrikler bildiniz Skorunuz: " + puan.toString()
                skorView.text = " "
                puanView.text = " "
                tahmin.isEnabled = false
            }
            else{
                puan--
                if(randomSayi>kullanicitahmini){
                    mesaj.text = "Daha büyük bir sayı dene " //+ randomSayi.toString()
                    puanView.text = puan.toString()
                }
                else{
                    mesaj.text = "Daha küçük bir sayı dene " //+ randomSayi.toString()
                    puanView.text = puan.toString()
                }
            }





        }


    }
}