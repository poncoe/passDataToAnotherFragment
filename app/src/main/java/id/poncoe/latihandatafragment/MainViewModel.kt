package id.poncoe.latihandatafragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.poncoe.latihandatafragment.model.DataModel

class MainViewModel : ViewModel() {
    private val passingData = MutableLiveData<DataModel?>()

    fun getPassingData(): LiveData<DataModel?> = passingData

    fun dataPassing(data: String) {
        val data = data
        passingData.value = DataModel(data)
    }
}