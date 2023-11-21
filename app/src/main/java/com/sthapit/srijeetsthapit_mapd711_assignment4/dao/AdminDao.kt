import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.sthapit.srijeetsthapit_mapd711_assignment4.entities.Admin

@Dao
interface AdminDao {
    @Insert
    suspend fun registerAdmin(admin: Admin)

    @Query("SELECT * FROM admins WHERE email = :email AND password = :password")
    fun getAdmin(email: String, password: String): LiveData<Admin?>
}