package mx.edu.utez.conhlabv2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class Fragment_Reloj : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_reloj,container,false)
        val reloj = view.findViewById<LinearLayout>(R.id.f_reloj)
        return view
    }
}