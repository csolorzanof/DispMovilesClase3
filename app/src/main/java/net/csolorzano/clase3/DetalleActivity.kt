package net.csolorzano.clase3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetalleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)


    }

    override fun onStart() {
        super.onStart()
        val idElemento = intent.extras?.getInt(MainActivity.LLAVE_ID_ELEMENTO,0) ?: 0

        val frgDetalle = supportFragmentManager
            .findFragmentById(R.id.frgDetalleActividad) as DetalleFragment
        frgDetalle.setDatosElemento(idElemento)
    }
}