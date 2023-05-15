package id.poncoe.latihandatafragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.poncoe.latihandatafragment.databinding.FragmentKeduaBinding

class FragmentKedua : Fragment() {
    private lateinit var binding: FragmentKeduaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKeduaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.passData.text = "Berhasil"
    }
}