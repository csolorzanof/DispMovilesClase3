package net.csolorzano.clase3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentContainerView

interface ElementoListener{
    fun onSelected(id: Int)
}

class MainActivity : AppCompatActivity(), ElementoListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            findViewById<FragmentContainerView>(R.id.frgContenedor)?.let { layout ->
                val frgLista = ListaFragment()
                supportFragmentManager.beginTransaction()
                    .add(layout.id, frgLista)
                    .commit()
            }
        }
    }

    override fun onSelected(id: Int) {
        findViewById<FragmentContainerView>(R.id.frgContenedor)
            ?.let { layout ->
                val frgDetalle = DetalleFragment.newInstance(id)
                supportFragmentManager.beginTransaction()
                    .replace(layout.id, frgDetalle)
                    .addToBackStack(null)
                    .commit()
            }
    }

    companion object{
        public const val LLAVE_ID_ELEMENTO = "LLAVE_ID_ELEMENTO"
    }
}