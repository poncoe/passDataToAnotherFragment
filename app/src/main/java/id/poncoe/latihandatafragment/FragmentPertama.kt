package id.poncoe.latihandatafragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.poncoe.latihandatafragment.databinding.FragmentPertamaBinding

class FragmentPertama : Fragment() {
    private lateinit var binding: FragmentPertamaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPertamaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonGo.setOnClickListener { passDataToFragmentKedua() }
    }

    fun passDataToFragmentKedua(){
        binding.inputNama.text.toString()
    }
}