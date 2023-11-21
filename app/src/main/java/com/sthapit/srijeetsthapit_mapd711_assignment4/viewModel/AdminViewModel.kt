import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sthapit.srijeetsthapit_mapd711_assignment4.entities.Admin
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AdminViewModel(private val repository: AdminRepository) : ViewModel() {

    // For coroutines
    private val viewModelScope = CoroutineScope(Dispatchers.IO)

    fun registerAdmin(admin: Admin) {
        viewModelScope.launch {
            repository.registerAdmin(admin)
        }
    }

//    fun getAdmin(email: String, password: String): LiveData<Admin?> {
//        val liveData = MutableLiveData<Admin?>()
//        viewModelScope.launch {
//            liveData.postValue(repository.getAdmin(email, password))
//        }
//        return liveData
//    }
}