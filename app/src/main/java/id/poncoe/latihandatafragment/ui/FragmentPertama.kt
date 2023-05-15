package id.poncoe.latihandatafragment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import id.poncoe.latihandatafragment.FragmentPertamaDirections
import id.poncoe.latihandatafragment.MainViewModel
import id.poncoe.latihandatafragment.R
import id.poncoe.latihandatafragment.databinding.FragmentPertamaBinding

class FragmentPertama : Fragment() {
    private lateinit var binding: FragmentPertamaBinding

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPertamaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonGo.setOnClickListener { passDataToFragmentKedua() }
    }

    private fun isInputEmpty(input: String): Boolean {
        return input.isBlank()
    }

    private fun passDataToFragmentKedua(){
        val nama = binding.inputNama.text.toString()

        if (isInputEmpty(nama)){
            Toast.makeText(context, R.string.input_kosong, Toast.LENGTH_LONG).show()
        } else {
            val passData = FragmentPertamaDirections.actionFragmentPertamaToFragmentKedua(nama)
            findNavController().navigate(passData)
        }
    }
}