import androidx.lifecycle.LiveData
import com.sthapit.srijeetsthapit_mapd711_assignment4.entities.Admin

class AdminRepository(private val adminDao: AdminDao) {
    suspend fun registerAdmin(admin: Admin) {
        adminDao.registerAdmin(admin)
    }

    suspend fun getAdmin(email: String, password: String): LiveData<Admin?> {
        return adminDao.getAdmin(email, password)
    }
}
