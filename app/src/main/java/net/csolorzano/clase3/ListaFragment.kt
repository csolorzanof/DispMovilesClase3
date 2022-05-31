package net.csolorzano.clase3

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.lang.RuntimeException

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListaFragment : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var escucha: ElementoListener

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is ElementoListener){
            escucha = context
        }else{
            throw RuntimeException("Debe implementar ElementoListener")
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
        return inflater.inflate(R.layout.fragment_lista, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ListaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ListaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listaElementos = listOf<View>(
            view.findViewById(R.id.opcHidro),
            view.findViewById(R.id.opcNeo),
            view.findViewById(R.id.opcFluor),
            view.findViewById(R.id.opcOxi),
            view.findViewById(R.id.opcNitro),
            view.findViewById(R.id.opcCarbono),
            view.findViewById(R.id.opcBerilio),
            view.findViewById(R.id.opcLitio),
            view.findViewById(R.id.opcHelio),
            view.findViewById(R.id.opcBoro)
        )

        listaElementos.forEach{
            it.setOnClickListener(this)
        }
    }

    override fun onClick(p0: View?) {
        p0?.let { elemento ->
            escucha.onSelected(elemento.id)
        }
    }
}