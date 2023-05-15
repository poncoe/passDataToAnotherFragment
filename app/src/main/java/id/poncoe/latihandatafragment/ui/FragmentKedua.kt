package id.poncoe.latihandatafragment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import id.poncoe.latihandatafragment.FragmentKeduaArgs
import id.poncoe.latihandatafragment.MainViewModel
import id.poncoe.latihandatafragment.databinding.FragmentKeduaBinding

class FragmentKedua : Fragment() {
    private lateinit var binding: FragmentKeduaBinding
    val args: FragmentKeduaArgs by navArgs()

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentKeduaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val passDataFromFragmentPertama = args.passdataNama
        binding.passData.text = passDataFromFragmentPertama
    }
}