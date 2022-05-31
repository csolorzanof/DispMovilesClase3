package net.csolorzano.clase3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetalleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetalleFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private val txtElemento : TextView?
        get() = view?.findViewById(R.id.txtElemento)

    private val txtSimbolo : TextView?
        get() = view?.findViewById(R.id.txtSimbolo)

    private val txtPeso : TextView?
        get() = view?.findViewById(R.id.txtPeso)

    fun setDatosElemento(elementoId : Int){
        when(elementoId){
            R.id.opcHidro -> {
                txtElemento?.text = getString(R.string.header, getString(R.string.hidro))
                txtSimbolo?.text = getString(R.string.simbolo, "H")
                txtPeso?.text = getString(R.string.peso, "1.00784")
            }
            R.id.opcHelio -> {
                txtElemento?.text = getString(R.string.header, getString(R.string.helio))
                txtSimbolo?.text = getString(R.string.simbolo, "He")
                txtPeso?.text = getString(R.string.peso, "4.002")
            }
            R.id.opcLitio -> {
                txtElemento?.text = getString(R.string.header, getString(R.string.litio))
                txtSimbolo?.text = getString(R.string.simbolo, "Li")
                txtPeso?.text = getString(R.string.peso, "6.941")
            }
            R.id.opcBerilio -> {
                txtElemento?.text = getString(R.string.header, getString(R.string.ber))
                txtSimbolo?.text = getString(R.string.simbolo, "Be")
                txtPeso?.text = getString(R.string.peso, "9.0121")
            }
            R.id.opcBoro -> {
                txtElemento?.text = getString(R.string.header, getString(R.string.boro))
                txtSimbolo?.text = getString(R.string.simbolo, "B")
                txtPeso?.text = getString(R.string.peso, "10.811")
            }
            R.id.opcCarbono -> {
                txtElemento?.text = getString(R.string.header, getString(R.string.carbono))
                txtSimbolo?.text = getString(R.string.simbolo, "C")
                txtPeso?.text = getString(R.string.peso, "12.0107")
            }
            R.id.opcNitro -> {
                txtElemento?.text = getString(R.string.header, getString(R.string.nitro))
                txtSimbolo?.text = getString(R.string.simbolo, "N")
                txtPeso?.text = getString(R.string.peso, "14.0067")
            }
            R.id.opcOxi -> {
                txtElemento?.text = getString(R.string.header, getString(R.string.oxi))
                txtSimbolo?.text = getString(R.string.simbolo, "O")
                txtPeso?.text = getString(R.string.peso, "15.994")
            }
            R.id.opcFluor -> {
                txtElemento?.text = getString(R.string.header, getString(R.string.fluor))
                txtSimbolo?.text = getString(R.string.simbolo, "F")
                txtPeso?.text = getString(R.string.peso, "18.9984")
            }
            R.id.opcNeo -> {
                txtElemento?.text = getString(R.string.header, getString(R.string.neon))
                txtSimbolo?.text = getString(R.string.simbolo, "Ne")
                txtPeso?.text = getString(R.string.peso, "20.1797")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val idElemento = arguments?.getInt(MainActivity.LLAVE_ID_ELEMENTO, 0) ?: 0
        setDatosElemento(idElemento)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DetalleFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(idElemento: Int) =
            DetalleFragment().apply {
                arguments = Bundle().apply {
                    putInt(MainActivity.LLAVE_ID_ELEMENTO, idElemento)
                }
            }
    }
}