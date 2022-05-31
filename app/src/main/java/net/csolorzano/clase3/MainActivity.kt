package net.csolorzano.clase3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

interface ElementoListener{
    fun onSelected(id: Int)
}

class MainActivity : AppCompatActivity(), ElementoListener {

    var esPanelDual: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        esPanelDual = findViewById<View>(R.id.frgDetalle) != null
    }

    override fun onSelected(id: Int) {
        if(esPanelDual){
            val frgDetalle = supportFragmentManager
                .findFragmentById(R.id.frgDetalle) as DetalleFragment
            frgDetalle.setDatosElemento(id)
        }else{
            val intDetalle = Intent(this, DetalleActivity::class.java).apply {
                putExtra(LLAVE_ID_ELEMENTO, id)
            }
            startActivity(intDetalle)
        }
    }

    companion object{
        public const val LLAVE_ID_ELEMENTO = "LLAVE_ID_ELEMENTO"
    }
}